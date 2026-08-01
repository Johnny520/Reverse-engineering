.class public L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏兰世哲;
.super L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static 飘花落叶言子楪世兰哲苏(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 8

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
    const/16 v7, 0x60

    .line 25
    .line 26
    if-lt v2, v3, :cond_0

    .line 27
    .line 28
    const-class v2, Ljava/lang/String;

    .line 29
    .line 30
    filled-new-array {v6, v5, v4, v5, v2}, [Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    filled-new-array {p0, v1, v3, v0, v4}, [Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0, v2, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子世兰楪哲苏([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    filled-new-array {v6, v5, v4, v5}, [Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    filled-new-array {p0, v1, v3, v0}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0, v2, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子世兰楪哲苏([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    .line 68
    .line 69
    new-instance v2, L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;

    .line 70
    .line 71
    const/16 v3, 0x1b

    .line 72
    .line 73
    invoke-direct {v2, v3}, L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 74
    .line 75
    .line 76
    invoke-static {p1, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Class;L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰苏哲;)[Ljava/lang/reflect/Method;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 85
    .line 86
    .line 87
    new-instance p1, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;

    .line 88
    .line 89
    invoke-direct {p1, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-static {p1}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->sort(Ljava/util/Comparator;)V

    .line 97
    .line 98
    .line 99
    sget-object p1, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏哲兰;

    .line 100
    .line 101
    const/16 v2, 0x50

    .line 102
    .line 103
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-static {v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    new-instance v3, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世兰哲苏;

    .line 116
    .line 117
    invoke-direct {v3, p0}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世兰哲苏;-><init>(Landroid/content/Context;)V

    .line 118
    .line 119
    .line 120
    invoke-static {p1, v2, v3}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    const/4 p1, 0x0

    .line 125
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    check-cast p1, Ljava/lang/reflect/Method;

    .line 130
    .line 131
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-virtual {p1, v0, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    return-object v0
.end method

.method public static 飘花落叶言子楪苏世哲兰(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 8

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
    const/16 v7, 0x5f

    .line 25
    .line 26
    if-lt v2, v3, :cond_0

    .line 27
    .line 28
    const-class v2, Ljava/lang/String;

    .line 29
    .line 30
    filled-new-array {v6, v5, v4, v5, v2}, [Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    filled-new-array {p0, v1, v3, v0, v4}, [Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0, v2, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子世兰楪哲苏([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    filled-new-array {v6, v5, v4, v5}, [Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    filled-new-array {p0, v1, v3, v0}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0, v2, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子世兰楪哲苏([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    .line 68
    .line 69
    new-instance v2, Lio/ktor/client/plugins/api/飘花落叶言子楪世苏兰哲;

    .line 70
    .line 71
    const/16 v3, 0x1b

    .line 72
    .line 73
    invoke-direct {v2, v3}, Lio/ktor/client/plugins/api/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 74
    .line 75
    .line 76
    invoke-static {p1, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Class;L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰苏哲;)[Ljava/lang/reflect/Method;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 85
    .line 86
    .line 87
    new-instance p1, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;

    .line 88
    .line 89
    invoke-direct {p1, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-static {p1}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->sort(Ljava/util/Comparator;)V

    .line 97
    .line 98
    .line 99
    sget-object p1, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏哲兰;

    .line 100
    .line 101
    const/16 v2, 0x50

    .line 102
    .line 103
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-static {v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    new-instance v3, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏世兰哲;

    .line 116
    .line 117
    invoke-direct {v3, p0}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏世兰哲;-><init>(Landroid/content/Context;)V

    .line 118
    .line 119
    .line 120
    invoke-static {p1, v2, v3}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    const/4 p1, 0x0

    .line 125
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    check-cast p1, Ljava/lang/reflect/Method;

    .line 130
    .line 131
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-virtual {p1, v0, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
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
    const/16 v1, 0x5c

    .line 6
    .line 7
    :try_start_0
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏哲兰;

    .line 16
    .line 17
    const/16 v3, 0x1c

    .line 18
    .line 19
    invoke-direct {v2, v3}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/16 v3, 0x5d

    .line 23
    .line 24
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const-class v4, Landroid/os/Bundle;

    .line 29
    .line 30
    filled-new-array {v4, v2}, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-static {v1, v3, v5}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    const/16 p0, 0x5e

    .line 38
    .line 39
    :try_start_1
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const-class p1, Landroid/view/LayoutInflater;

    .line 44
    .line 45
    const-class v0, Landroid/view/ViewGroup;

    .line 46
    .line 47
    filled-new-array {p1, v0, v4, v2}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {v1, p0, p1}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catch_0
    const/16 v1, 0x5b

    .line 56
    .line 57
    const/16 v2, 0x13

    .line 58
    .line 59
    :try_start_2
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    filled-new-array {p1}, [Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    const/4 v4, 0x0

    .line 68
    invoke-static {v1, v4, v0, v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    new-instance v3, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;

    .line 73
    .line 74
    invoke-direct {v3, p0, v2}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;I)V

    .line 75
    .line 76
    .line 77
    invoke-static {v1, v3}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 78
    .line 79
    .line 80
    :catch_1
    sget v1, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:I

    .line 81
    .line 82
    const/16 v3, 0x3002

    .line 83
    .line 84
    if-lt v1, v3, :cond_0

    .line 85
    .line 86
    const/16 v1, 0x5a

    .line 87
    .line 88
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-static {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    iget-object v3, v1, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 101
    .line 102
    iput-object v0, v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 103
    .line 104
    filled-new-array {p1}, [Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iput-object p1, v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 109
    .line 110
    invoke-virtual {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    new-instance v0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;

    .line 115
    .line 116
    invoke-direct {v0, p0, v2}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;I)V

    .line 117
    .line 118
    .line 119
    invoke-static {p1, v0}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_0
    const/16 v3, 0x1fdc

    .line 124
    .line 125
    if-lt v1, v3, :cond_1

    .line 126
    .line 127
    const/16 v1, 0x59

    .line 128
    .line 129
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-static {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-static {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    iget-object v3, v1, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 142
    .line 143
    iput-object v0, v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 144
    .line 145
    filled-new-array {p1}, [Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    iput-object p1, v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 150
    .line 151
    invoke-virtual {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    new-instance v0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;

    .line 156
    .line 157
    invoke-direct {v0, p0, v2}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;I)V

    .line 158
    .line 159
    .line 160
    invoke-static {p1, v0}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 161
    .line 162
    .line 163
    :catch_2
    :cond_1
    :goto_0
    return-void
.end method
