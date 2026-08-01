.class public final Ltop/suzhelan/qstory/loader/CoreLoader;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method public static collectHookItemException(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    check-cast p0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    invoke-virtual {p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->getExceptionCollectionToolInstance()L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0, p1}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static getHookItems()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5170\u82cf\u696a\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static isEnabled(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public static isLoadedByDefault(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    invoke-virtual {p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->isLoadedByDefault()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static isMethodCacheReady()Z
    .locals 1

    .line 1
    invoke-static {}, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public static isSwitchHookItem(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p0, p0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    return p0
.end method

.method public static loadHookItemConfig()V
    .locals 0

    .line 1
    invoke-static {}, Llin/xposed/hook/loader/config/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static scanMethodCache()V
    .locals 7

    .line 1
    sget-object v0, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    const-wide v1, -0x36a54d1c051405a7L    # -2.3816117587488278E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-wide v2, -0x36a52db0051405a7L    # -2.392560684186876E45

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v0, v1, v2}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sget-object v1, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;

    .line 50
    .line 51
    instance-of v3, v2, L飘花落叶言世兰子楪苏哲/飘花落叶言子楪世苏哲兰;

    .line 52
    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    move-object v3, v2

    .line 56
    check-cast v3, L飘花落叶言世兰子楪苏哲/飘花落叶言子楪世苏哲兰;

    .line 57
    .line 58
    :try_start_0
    invoke-virtual {v2}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->getItemPath()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson2/JSONObject;->containsKey(Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-nez v4, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    invoke-virtual {v2}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->getItemPath()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    new-instance v5, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;

    .line 78
    .line 79
    const/4 v6, 0x2

    .line 80
    invoke-direct {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v5, v4}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/JSONObject;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v3, v5}, L飘花落叶言世兰子楪苏哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :catch_0
    move-exception v3

    .line 91
    invoke-virtual {v2}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->getExceptionCollectionToolInstance()L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v2, v3}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    return-void
.end method

.method public static startLoadHook(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    invoke-virtual {p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->startLoadHook()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
