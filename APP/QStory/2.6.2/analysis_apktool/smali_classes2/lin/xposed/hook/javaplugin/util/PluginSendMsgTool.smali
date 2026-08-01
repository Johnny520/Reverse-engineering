.class public Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;
    }
.end annotation


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

.method public static createContact(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Llin/xposed/hook/util/qq/QQSessionUtils$QQNT;->getFriendContact(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-static {p0}, Llin/xposed/hook/util/qq/QQSessionUtils$QQNT;->getGroupContact(Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_3

    .line 28
    .line 29
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    invoke-static {p1}, Llin/xposed/hook/util/qq/QQFriendTool;->isFriend(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-static {p1}, Llin/xposed/hook/util/qq/QQSessionUtils$QQNT;->getFriendContact(Ljava/lang/String;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_2
    invoke-static {p1}, Llin/xposed/hook/util/qq/QQEnvTool;->getUidFromUin(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {p0, v0}, Llin/xposed/hook/util/qq/QQSessionUtils$QQNT;->prepareTroopMemberStrangerTempChat(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/16 p0, 0x64

    .line 54
    .line 55
    invoke-static {p1}, Llin/xposed/hook/util/qq/QQEnvTool;->getUidFromUin(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {p0, p1}, Llin/xposed/hook/util/qq/QQSessionUtils$QQNT;->getContact(ILjava/lang/String;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :cond_3
    const/4 p0, 0x0

    .line 65
    return-object p0
.end method

.method public static getChatType()I
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Llin/xposed/hook/util/qq/QQSessionUtils;->getCurrentContact()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-wide v1, -0x36a50b3c051405a7L    # -2.4045658460918466E45

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 15
    .line 16
    invoke-static {v2, v1, v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    return v0

    .line 27
    :catch_0
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method public static getCurrentFriendUin()Ljava/lang/String;
    .locals 6

    .line 1
    const-wide v0, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    :try_start_0
    invoke-static {}, Llin/xposed/hook/util/qq/QQSessionUtils;->getCurrentContact()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    const-wide v4, -0x36a50b3c051405a7L    # -2.4045658460918466E45

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 21
    .line 22
    invoke-static {v5, v4, v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-ne v4, v2, :cond_0

    .line 33
    .line 34
    const-wide v4, -0x36a52339051405a7L    # -2.3962071500308007E45

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    const-class v5, Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v5, v4, v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v3}, Llin/xposed/hook/util/qq/QQEnvTool;->getUinFromUid(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0

    .line 56
    :catch_0
    move-exception v3

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    return-object v0

    .line 63
    :goto_0
    const-wide v4, -0x36a54f81051405a7L    # -2.3807773863851376E45

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    sget-object v5, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-static {v4, v5, v3, v2}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 79
    .line 80
    .line 81
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    return-object v0
.end method

.method public static getCurrentGroupUin()Ljava/lang/String;
    .locals 6

    .line 1
    const-wide v0, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    :try_start_0
    invoke-static {}, Llin/xposed/hook/util/qq/QQSessionUtils;->getCurrentContact()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    const-wide v4, -0x36a50b3c051405a7L    # -2.4045658460918466E45

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 21
    .line 22
    invoke-static {v5, v4, v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-ne v4, v2, :cond_0

    .line 33
    .line 34
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0

    .line 39
    :catch_0
    move-exception v3

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const-wide v4, -0x36a52339051405a7L    # -2.3962071500308007E45

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    const-class v5, Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v5, v4, v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    return-object v3

    .line 59
    :goto_0
    const-wide v4, -0x36a54f81051405a7L    # -2.3807773863851376E45

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    sget-object v5, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-static {v4, v5, v3, v2}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    return-object v0
.end method

.method public static parseCompoundMessages(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool;->split(Ljava/lang/String;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_5

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;

    .line 25
    .line 26
    invoke-static {v1}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->飘花落叶言子楪世哲苏兰(Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    invoke-static {v1}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->飘花落叶言子楪世苏哲兰(Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v1}, Llin/xposed/hook/util/qq/CreateElement;->createTextElement(Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-static {v1}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->飘花落叶言子楪世哲苏兰(Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    const/4 v3, 0x1

    .line 49
    if-ne v2, v3, :cond_0

    .line 50
    .line 51
    invoke-static {v1}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->飘花落叶言子楪世苏兰哲(Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const-wide v3, -0x36a54f74051405a7L    # -2.3807950810682175E45

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_2

    .line 69
    .line 70
    invoke-static {v1}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->飘花落叶言子楪世苏哲兰(Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {v1}, Llin/xposed/hook/util/qq/CreateElement;->createPicElement(Ljava/lang/String;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    invoke-static {v1}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->飘花落叶言子楪世苏兰哲(Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    const-wide v3, -0x36a54f73051405a7L    # -2.3807964421976852E45

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_0

    .line 100
    .line 101
    invoke-static {v1}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->飘花落叶言子楪世苏哲兰(Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    const-wide v2, -0x36a50776051405a7L    # -2.405880697157629E45

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eqz v2, :cond_3

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_3
    invoke-static {v1}, Llin/xposed/hook/util/qq/QQEnvTool;->getUidFromUin(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    :goto_1
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-eqz v2, :cond_4

    .line 130
    .line 131
    const-wide v1, -0x36a54f78051405a7L    # -2.3807896365503468E45

    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-static {v1}, Llin/xposed/hook/util/qq/CreateElement;->createTextElement(Ljava/lang/String;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    goto/16 :goto_0

    .line 148
    .line 149
    :cond_4
    invoke-static {p0, v1}, Llin/xposed/hook/util/qq/CreateElement;->createAtTextElement(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :cond_5
    return-object v0
.end method

.method public static split(Ljava/lang/String;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;",
            ">;"
        }
    .end annotation

    .line 1
    const-wide v0, -0x36a54f66051405a7L    # -2.380814136880765E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    move v3, v2

    .line 25
    :goto_0
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    invoke-virtual {p0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    const/4 v6, 0x1

    .line 44
    add-int/2addr v4, v6

    .line 45
    add-int/lit8 v7, v5, -0x1

    .line 46
    .line 47
    invoke-virtual {p0, v4, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-nez v7, :cond_0

    .line 56
    .line 57
    new-instance v7, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;

    .line 58
    .line 59
    invoke-direct {v7, v2}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-static {v7, v2}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->飘花落叶言子楪世兰哲苏(Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {v7, v3}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->飘花落叶言子楪世哲兰苏(Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    :cond_0
    const-wide v7, -0x36a52827051405a7L    # -2.3944894046425838E45

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v4, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    const/4 v7, -0x1

    .line 85
    if-eq v3, v7, :cond_1

    .line 86
    .line 87
    new-instance v7, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;

    .line 88
    .line 89
    invoke-direct {v7, v2}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-static {v7, v6}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->飘花落叶言子楪世兰哲苏(Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    invoke-static {v7, v6}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->飘花落叶言子楪世兰苏哲(Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    add-int/lit8 v3, v3, 0x1

    .line 103
    .line 104
    invoke-virtual {v4, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-static {v7, v3}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->飘花落叶言子楪世哲兰苏(Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_1
    new-instance v3, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;

    .line 116
    .line 117
    invoke-direct {v3, v2}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;-><init>(I)V

    .line 118
    .line 119
    .line 120
    invoke-static {v3, v2}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->飘花落叶言子楪世兰哲苏(Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;I)V

    .line 121
    .line 122
    .line 123
    new-instance v6, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    const-wide v7, -0x36a54f5c051405a7L    # -2.380827748175442E45

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    invoke-static {v7, v8, v6, v4}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰哲世苏(JLjava/lang/StringBuilder;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    const-wide v7, -0x36a53b70051405a7L    # -2.387769508460629E45

    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-static {v3, v4}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->飘花落叶言子楪世哲兰苏(Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    :goto_1
    move v3, v5

    .line 159
    goto/16 :goto_0

    .line 160
    .line 161
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-ge v3, v0, :cond_3

    .line 166
    .line 167
    new-instance v0, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;

    .line 168
    .line 169
    invoke-direct {v0, v2}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;-><init>(I)V

    .line 170
    .line 171
    .line 172
    invoke-static {v0, v2}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->飘花落叶言子楪世兰哲苏(Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-static {v0, p0}, Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;->飘花落叶言子楪世哲兰苏(Llin/xposed/hook/javaplugin/util/PluginSendMsgTool$FindResult;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    :cond_3
    return-object v1
.end method
