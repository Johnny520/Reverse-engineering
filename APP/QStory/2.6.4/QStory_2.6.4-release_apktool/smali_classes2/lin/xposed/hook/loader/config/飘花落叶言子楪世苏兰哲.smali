.class public abstract Llin/xposed/hook/loader/config/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static 飘花落叶言子楪世苏哲兰:Ljava/util/Map;


# direct methods
.method public static 飘花落叶言子楪世哲兰苏(L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;)V
    .locals 3

    .line 1
    invoke-static {}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    sget-object v0, Llin/xposed/hook/loader/config/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    new-instance v0, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Llin/xposed/hook/loader/config/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    .line 18
    .line 19
    :cond_1
    sget-object v0, L飘花落叶言世兰子楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;

    .line 40
    .line 41
    instance-of v2, v1, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;

    .line 42
    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    move-object v2, v1

    .line 46
    check-cast v2, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;

    .line 47
    .line 48
    invoke-virtual {v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;->getItemPath()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v1}, Llin/xposed/hook/loader/config/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Llin/xposed/hook/loader/config/HookItemConfig;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget-object v2, v2, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Llin/xposed/hook/loader/config/HookItemConfig;->setEnabled(Ljava/lang/Boolean;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    if-eqz p0, :cond_4

    .line 63
    .line 64
    invoke-virtual {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世哲苏兰;->getItemPath()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-static {p0}, Llin/xposed/hook/loader/config/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Llin/xposed/hook/loader/config/HookItemConfig;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-virtual {p0, v0}, Llin/xposed/hook/loader/config/HookItemConfig;->setBypassDefaultLoad(Ljava/lang/Boolean;)V

    .line 75
    .line 76
    .line 77
    :cond_4
    sget-object p0, Llin/xposed/hook/loader/config/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    .line 78
    .line 79
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {}, Llin/xposed/hook/loader/config/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    const/4 v1, 0x0

    .line 88
    invoke-static {v0, p0, v1}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世哲楪兰(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public static 飘花落叶言子楪世哲苏兰()V
    .locals 4

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-static {}, Llin/xposed/hook/loader/config/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-static {v1}, Llin/xposed/hook/loader/config/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;)V

    .line 18
    .line 19
    .line 20
    const/16 v0, 0x2fa

    .line 21
    .line 22
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    :try_start_0
    invoke-static {}, Llin/xposed/hook/loader/config/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子世兰楪苏哲(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v2, Llin/xposed/hook/loader/config/飘花落叶言子楪世苏哲兰;

    .line 38
    .line 39
    invoke-direct {v2}, Llin/xposed/hook/loader/config/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 40
    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    new-array v3, v3, [Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 44
    .line 45
    invoke-static {v0, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Lcom/alibaba/fastjson2/飘花落叶言子哲苏兰世楪;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Ljava/util/Map;

    .line 50
    .line 51
    sput-object v0, Llin/xposed/hook/loader/config/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    if-nez v0, :cond_1

    .line 60
    .line 61
    sget-object v0, L飘花落叶言世兰子楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    new-instance v1, Lbsh/classpath/飘花落叶言子楪世哲苏兰;

    .line 68
    .line 69
    const/4 v2, 0x1

    .line 70
    invoke-direct {v1, v2}, Lbsh/classpath/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v0, v1}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :catch_0
    move-exception v0

    .line 78
    goto :goto_0

    .line 79
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 80
    .line 81
    const/16 v2, 0x2fb

    .line 82
    .line 83
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 91
    :goto_0
    invoke-static {v1}, Llin/xposed/hook/loader/config/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Exception;)V

    .line 95
    .line 96
    .line 97
    new-instance v1, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    const/16 v2, 0x2fc

    .line 103
    .line 104
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-static {v0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Llin/xposed/hook/loader/config/HookItemConfig;
    .locals 3

    .line 1
    sget-object v0, Llin/xposed/hook/loader/config/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    .line 2
    .line 3
    new-instance v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Llin/xposed/hook/loader/config/HookItemConfig;

    .line 15
    .line 16
    return-object p0
.end method

.method public static 飘花落叶言子楪世苏哲兰()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x2f9

    .line 14
    .line 15
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0
.end method
