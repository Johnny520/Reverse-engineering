.class public final Lre;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/mr/elaris/w;->e(Landroid/view/View;)Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/mr/elaris/HookEntry;->topActivity()Landroid/app/Activity;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :cond_0
    const-string v0, "local voice entry target miss activity="

    .line 12
    .line 13
    if-nez p0, :cond_1

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    :try_start_0
    sget-object v1, Li5;->v:Ljava/lang/ClassLoader;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 22
    .line 23
    .line 24
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    const/4 v1, 0x0

    .line 27
    :goto_0
    if-nez v1, :cond_3

    .line 28
    .line 29
    :try_start_2
    const-string p1, "\u672a\u83b7\u53d6\u5230 QQ \u8fd0\u884c\u73af\u5883"

    .line 30
    .line 31
    invoke-static {p0, p1}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catchall_1
    move-exception p1

    .line 36
    goto :goto_1

    .line 37
    :cond_3
    invoke-static {v1}, Lcom/mr/elaris/w;->P(Ljava/lang/ClassLoader;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p0, p1}, Lcom/mr/elaris/w;->q(Landroid/app/Activity;Landroid/view/View;)Lpd;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-nez p1, :cond_4

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string p1, "\u672a\u8bc6\u522b\u5f53\u524d\u804a\u5929"

    .line 62
    .line 63
    invoke-static {p0, p1}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_4
    invoke-static {p0, v1, p1}, Lcom/mr/elaris/w;->O0(Landroid/app/Activity;Ljava/lang/ClassLoader;Lpd;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :goto_1
    const-string v0, "\u65e0\u6cd5\u6253\u5f00\u8bed\u97f3\u6587\u4ef6\u5217\u8868"

    .line 72
    .line 73
    invoke-static {p0, v0}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    new-instance p0, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string v0, "local voice direct picker failed: "

    .line 79
    .line 80
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method
