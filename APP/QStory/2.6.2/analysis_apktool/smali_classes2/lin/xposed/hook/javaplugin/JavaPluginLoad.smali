.class public Llin/xposed/hook/javaplugin/JavaPluginLoad;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static showOnlinePluginDialog(Landroid/content/Context;)V
    .locals 3

    .line 1
    const-wide v0, -0x36a53ce3051405a7L    # -2.3872645294281184E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->setDOWNLOAD_DIR(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-wide v1, -0x36a53cea051405a7L    # -2.3872550015218446E45

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->setINSTALL_DIR(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->setUSER_UIN(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentAccountNickName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, Ltop/suzhelan/plugin/sdk/online/net/PluginSdkConfig;->setUSER_NICKNAME(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance v0, Lcom/bumptech/glide/load/engine/飘花落叶言子楪哲世苏兰;

    .line 52
    .line 53
    check-cast p0, Landroid/app/Activity;

    .line 54
    .line 55
    const/4 v1, 0x5

    .line 56
    invoke-direct {v0, p0, v1}, Lcom/bumptech/glide/load/engine/飘花落叶言子楪哲世苏兰;-><init>(Landroid/app/Activity;I)V

    .line 57
    .line 58
    .line 59
    iget-object p0, v0, Lcom/bumptech/glide/load/engine/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;

    .line 62
    .line 63
    new-instance v1, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世兰哲苏;

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    invoke-direct {v1, v0, v2}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世兰哲苏;-><init>(Lcom/bumptech/glide/load/engine/飘花落叶言子楪哲世苏兰;B)V

    .line 67
    .line 68
    .line 69
    iput-object v1, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世哲兰苏楪:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰世哲;

    .line 70
    .line 71
    iget-object v1, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子苏楪世哲兰:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰世哲苏;

    .line 72
    .line 73
    if-nez v1, :cond_0

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    new-instance v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏兰世;

    .line 77
    .line 78
    invoke-direct {v1, p0, v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏兰世;-><init>(L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;I)V

    .line 79
    .line 80
    .line 81
    invoke-static {v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲(Ljava/lang/Runnable;)V

    .line 82
    .line 83
    .line 84
    :goto_0
    new-instance v1, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世兰苏哲;

    .line 85
    .line 86
    const/4 v2, 0x4

    .line 87
    invoke-direct {v1, v0, v2}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/Object;I)V

    .line 88
    .line 89
    .line 90
    iput-object v1, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世兰哲楪苏:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏世兰哲;

    .line 91
    .line 92
    iget-boolean v0, p0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏兰哲:Z

    .line 93
    .line 94
    if-eqz v0, :cond_1

    .line 95
    .line 96
    iget-object v0, p0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世兰哲苏楪:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;

    .line 97
    .line 98
    invoke-virtual {v1, v0}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;)V

    .line 99
    .line 100
    .line 101
    :cond_1
    invoke-virtual {p0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世哲苏兰楪()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :catch_0
    move-exception p0

    .line 106
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    const-wide v0, -0x36a53cfd051405a7L    # -2.3872291400619586E45

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    sget-object v1, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    const/4 v2, 0x1

    .line 125
    invoke-static {v0, v1, p0, v2}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method public static showPluginDialog(Landroid/content/Context;)V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Llin/xposed/hook/javaplugin/dialog/PluginDialog;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Llin/xposed/hook/javaplugin/dialog/PluginDialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catch_0
    move-exception p0

    .line 11
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    const-wide v0, -0x36a53cfd051405a7L    # -2.3872291400619586E45

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-object v1, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-static {v0, v1, p0, v2}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
