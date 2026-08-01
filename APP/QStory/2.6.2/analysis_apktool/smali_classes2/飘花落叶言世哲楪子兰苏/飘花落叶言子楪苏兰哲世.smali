.class public L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏兰哲世;
.super L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static 飘花落叶言子楪世兰哲苏(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 9

    .line 1
    const v0, 0x240800b5

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/16 v1, 0x520c

    .line 9
    .line 10
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget v2, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:I

    .line 15
    .line 16
    const/16 v3, 0x2832

    .line 17
    .line 18
    const-class v4, Ljava/lang/CharSequence;

    .line 19
    .line 20
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 21
    .line 22
    const-class v6, Landroid/content/Context;

    .line 23
    .line 24
    const-wide v7, -0x36a50e75051405a7L    # -2.4034429142810075E45

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    if-lt v2, v3, :cond_0

    .line 30
    .line 31
    const-class v2, Ljava/lang/String;

    .line 32
    .line 33
    filled-new-array {v6, v5, v4, v5, v2}, [Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    filled-new-array {p0, v1, v3, v0, v4}, [Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0, v2, p1}, L飘花落叶言世兰哲子楪苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子世兰楪苏哲([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    filled-new-array {v6, v5, v4, v5}, [Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    filled-new-array {p0, v1, v3, v0}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0, v2, p1}, L飘花落叶言世兰哲子楪苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子世兰楪苏哲([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    .line 71
    .line 72
    new-instance v2, L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;

    .line 73
    .line 74
    const/16 v3, 0x1b

    .line 75
    .line 76
    invoke-direct {v2, v3}, L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-static {p1, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Class;L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰苏哲;)[Ljava/lang/reflect/Method;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 88
    .line 89
    .line 90
    new-instance p1, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;

    .line 91
    .line 92
    invoke-direct {p1, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;-><init>(I)V

    .line 93
    .line 94
    .line 95
    invoke-static {p1}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->sort(Ljava/util/Comparator;)V

    .line 100
    .line 101
    .line 102
    sget-object p1, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏哲兰;

    .line 103
    .line 104
    const-wide v2, -0x36a5003b051405a7L    # -2.4084001478023117E45

    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-static {v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    new-instance v3, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏世哲兰;

    .line 122
    .line 123
    invoke-direct {v3, p0}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏世哲兰;-><init>(Landroid/content/Context;)V

    .line 124
    .line 125
    .line 126
    invoke-static {p1, v2, v3}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    const/4 p1, 0x0

    .line 131
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    check-cast p1, Ljava/lang/reflect/Method;

    .line 136
    .line 137
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {p1, v0, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    return-object v0
.end method

.method public static 飘花落叶言子楪苏世哲兰(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 9

    .line 1
    const v0, 0x24080168

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/16 v1, 0x520b

    .line 9
    .line 10
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget v2, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:I

    .line 15
    .line 16
    const/16 v3, 0x2832

    .line 17
    .line 18
    const-class v4, Ljava/lang/CharSequence;

    .line 19
    .line 20
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 21
    .line 22
    const-class v6, Landroid/content/Context;

    .line 23
    .line 24
    const-wide v7, -0x36a50e8e051405a7L    # -2.4034088860443154E45

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    if-lt v2, v3, :cond_0

    .line 30
    .line 31
    const-class v2, Ljava/lang/String;

    .line 32
    .line 33
    filled-new-array {v6, v5, v4, v5, v2}, [Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    filled-new-array {p0, v1, v3, v0, v4}, [Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0, v2, p1}, L飘花落叶言世兰哲子楪苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子世兰楪苏哲([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    filled-new-array {v6, v5, v4, v5}, [Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    filled-new-array {p0, v1, v3, v0}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0, v2, p1}, L飘花落叶言世兰哲子楪苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子世兰楪苏哲([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    .line 71
    .line 72
    new-instance v2, Lio/ktor/client/plugins/api/飘花落叶言子楪世苏兰哲;

    .line 73
    .line 74
    const/16 v3, 0x1b

    .line 75
    .line 76
    invoke-direct {v2, v3}, Lio/ktor/client/plugins/api/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-static {p1, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Class;L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰苏哲;)[Ljava/lang/reflect/Method;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 88
    .line 89
    .line 90
    new-instance p1, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;

    .line 91
    .line 92
    invoke-direct {p1, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;-><init>(I)V

    .line 93
    .line 94
    .line 95
    invoke-static {p1}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->sort(Ljava/util/Comparator;)V

    .line 100
    .line 101
    .line 102
    sget-object p1, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏哲兰;

    .line 103
    .line 104
    const-wide v2, -0x36a5003b051405a7L    # -2.4084001478023117E45

    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-static {v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    new-instance v3, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏哲世兰;

    .line 122
    .line 123
    invoke-direct {v3, p0}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏哲世兰;-><init>(Landroid/content/Context;)V

    .line 124
    .line 125
    .line 126
    invoke-static {p1, v2, v3}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    const/4 p1, 0x0

    .line 131
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    check-cast p1, Ljava/lang/reflect/Method;

    .line 136
    .line 137
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {p1, v0, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    return-object v0
.end method


# virtual methods
.method public final isLoadedByDefault()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 6

    .line 1
    const-class p1, Landroid/content/Context;

    .line 2
    .line 3
    const-class v0, Ljava/util/List;

    .line 4
    .line 5
    const-wide v1, -0x36a50edd051405a7L    # -2.4033013568163684E45

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏哲兰;

    .line 19
    .line 20
    const/16 v3, 0x1c

    .line 21
    .line 22
    invoke-direct {v2, v3}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 23
    .line 24
    .line 25
    const-wide v3, -0x36a50e94051405a7L    # -2.4034007192675093E45

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const-class v4, Landroid/os/Bundle;

    .line 35
    .line 36
    filled-new-array {v4, v2}, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-static {v1, v3, v5}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    const-wide p0, -0x36a50e9f051405a7L    # -2.4033857468433648E45

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    :try_start_1
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const-class p1, Landroid/view/LayoutInflater;

    .line 53
    .line 54
    const-class v0, Landroid/view/ViewGroup;

    .line 55
    .line 56
    filled-new-array {p1, v0, v4, v2}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {v1, p0, p1}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catch_0
    const-wide v1, -0x36a50f19051405a7L    # -2.4032196890483074E45

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    const/16 v3, 0x13

    .line 70
    .line 71
    :try_start_2
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    filled-new-array {p1}, [Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    const/4 v4, 0x0

    .line 80
    invoke-static {v1, v4, v0, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    new-instance v2, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;

    .line 85
    .line 86
    invoke-direct {v2, p0, v3}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;I)V

    .line 87
    .line 88
    .line 89
    invoke-static {v1, v2}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 90
    .line 91
    .line 92
    :catch_1
    sget v1, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:I

    .line 93
    .line 94
    const/16 v2, 0x3002

    .line 95
    .line 96
    if-lt v1, v2, :cond_0

    .line 97
    .line 98
    const-wide v1, -0x36a50f3d051405a7L    # -2.4031706883874707E45

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-static {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-static {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    iget-object v2, v1, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 116
    .line 117
    iput-object v0, v2, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 118
    .line 119
    filled-new-array {p1}, [Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    iput-object p1, v2, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 124
    .line 125
    invoke-virtual {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    new-instance v0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;

    .line 130
    .line 131
    invoke-direct {v0, p0, v3}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;I)V

    .line 132
    .line 133
    .line 134
    invoke-static {p1, v0}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_0
    const/16 v2, 0x1fdc

    .line 139
    .line 140
    if-lt v1, v2, :cond_1

    .line 141
    .line 142
    const-wide v1, -0x36a50f7a051405a7L    # -2.403087659489942E45

    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-static {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-static {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    iget-object v2, v1, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 160
    .line 161
    iput-object v0, v2, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 162
    .line 163
    filled-new-array {p1}, [Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    iput-object p1, v2, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 168
    .line 169
    invoke-virtual {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    new-instance v0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;

    .line 174
    .line 175
    invoke-direct {v0, p0, v3}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;I)V

    .line 176
    .line 177
    .line 178
    invoke-static {p1, v0}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 179
    .line 180
    .line 181
    :catch_2
    :cond_1
    :goto_0
    return-void
.end method
