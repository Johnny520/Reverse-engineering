.class public final Ln4;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# virtual methods
.method public final beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 2

    .line 1
    const/4 p0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    move-object v0, p0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 7
    .line 8
    :goto_0
    if-eqz v0, :cond_1

    .line 9
    .line 10
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sput-object v1, Ls4;->j:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    :cond_1
    sget-object v0, Ls4;->m:Ljava/lang/ref/WeakReference;

    .line 18
    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    move-object v0, p0

    .line 22
    goto :goto_1

    .line 23
    :cond_2
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Landroid/view/View;

    .line 28
    .line 29
    :goto_1
    if-eqz v0, :cond_3

    .line 30
    .line 31
    const-string v1, "send_delegate"

    .line 32
    .line 33
    invoke-static {v0, v1}, Lj4;->x(Landroid/view/View;Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    invoke-virtual {p1, p0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_3
    return-void
.end method
