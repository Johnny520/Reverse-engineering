.class public Llin/xposed/hook/util/qq/QQMsgService;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llin/xposed/hook/util/qq/QQMsgService$IGetMultiMsgCallback;,
        Llin/xposed/hook/util/qq/QQMsgService$IMsgOperateCallback;
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

.method public static deleteMsg(Ljava/lang/Object;Ljava/util/ArrayList;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    if-nez p1, :cond_1

    .line 5
    .line 6
    :goto_0
    return-void

    .line 7
    :cond_1
    const/16 v0, 0x3ac

    .line 8
    .line 9
    invoke-static {v0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/16 v1, 0x267

    .line 14
    .line 15
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/16 v2, 0x7c

    .line 20
    .line 21
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/16 v3, 0x7f

    .line 30
    .line 31
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-static {v4}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const-class v5, Ljava/util/ArrayList;

    .line 40
    .line 41
    filled-new-array {v2, v5, v4}, [Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    sget-object v4, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏哲兰;

    .line 46
    .line 47
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-static {v3}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    new-instance v5, Llin/xposed/hook/util/qq/QQMsgService$1;

    .line 60
    .line 61
    invoke-direct {v5}, Llin/xposed/hook/util/qq/QQMsgService$1;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-static {v4, v3, v5}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    filled-new-array {p0, p1, v3}, [Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {v0, v1, v2, p0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public static getMsgsByMsgId(Ljava/lang/Object;Ljava/util/ArrayList;Llin/xposed/hook/util/qq/QQMsgService$IMsgOperateCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Long;",
            ">;",
            "Llin/xposed/hook/util/qq/QQMsgService$IMsgOperateCallback;",
            ")V"
        }
    .end annotation

    .line 1
    const/16 v0, 0x3ac

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x3af

    .line 8
    .line 9
    :try_start_0
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    const/16 v3, 0x7c

    .line 16
    .line 17
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-static {v3}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const-class v4, Ljava/util/ArrayList;

    .line 26
    .line 27
    const/16 v5, 0x3b0

    .line 28
    .line 29
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-static {v6}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    filled-new-array {v3, v4, v6}, [Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    sget-object v4, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏哲兰;

    .line 42
    .line 43
    invoke-static {v5}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-static {v5}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    new-instance v6, Lbsh/飘花落叶言子楪苏哲兰世;

    .line 56
    .line 57
    const/4 v7, 0x1

    .line 58
    invoke-direct {v6, p2, v7}, Lbsh/飘花落叶言子楪苏哲兰世;-><init>(Ljava/lang/Object;I)V

    .line 59
    .line 60
    .line 61
    invoke-static {v4, v5, v6}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    filled-new-array {p0, p1, p2}, [Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {v0, v1, v2, v3, p0}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :catch_0
    move-exception p0

    .line 74
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public static getMultiMsg(Ljava/lang/Object;IILlin/xposed/hook/util/qq/QQMsgService$IGetMultiMsgCallback;)V
    .locals 6

    .line 1
    invoke-static {}, Llin/xposed/hook/util/qq/QQServiceTool;->getMsgServiceOfKernel()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/16 v2, 0x3ad

    .line 10
    .line 11
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iput-object v2, v1, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:Ljava/lang/String;

    .line 16
    .line 17
    const/16 v2, 0x7c

    .line 18
    .line 19
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/16 v3, 0x3ae

    .line 28
    .line 29
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-static {v4}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 38
    .line 39
    filled-new-array {v2, v5, v5, v4}, [Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v1, v2}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Class;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    sget-object v2, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏哲兰;

    .line 55
    .line 56
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-static {v3}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    new-instance v4, Llin/xposed/hook/util/qq/QQMsgService$3;

    .line 69
    .line 70
    invoke-direct {v4, p3}, Llin/xposed/hook/util/qq/QQMsgService$3;-><init>(Llin/xposed/hook/util/qq/QQMsgService$IGetMultiMsgCallback;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v2, v3, v4}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    filled-new-array {p0, p1, p2, p3}, [Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {v1, v0, p0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method private static synthetic lambda$getMsgsByMsgId$1(Llin/xposed/hook/util/qq/QQMsgService$IMsgOperateCallback;Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 p1, 0x0

    .line 2
    aget-object p1, p3, p1

    .line 3
    .line 4
    check-cast p1, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/4 p2, 0x1

    .line 11
    aget-object p2, p3, p2

    .line 12
    .line 13
    check-cast p2, Ljava/lang/String;

    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    aget-object p3, p3, v0

    .line 17
    .line 18
    check-cast p3, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-interface {p0, p1, p2, p3}, Llin/xposed/hook/util/qq/QQMsgService$IMsgOperateCallback;->onResult(ILjava/lang/String;Ljava/util/ArrayList;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method private static lambda$recallMsg$0(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Long;)V
    .locals 5

    .line 1
    const/16 v0, 0x3b1

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x7c

    .line 8
    .line 9
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/16 v2, 0x7f

    .line 18
    .line 19
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-static {v3}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 28
    .line 29
    filled-new-array {v1, v4, v3}, [Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    sget-object v3, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏哲兰;

    .line 34
    .line 35
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    new-instance v4, Llin/xposed/hook/util/qq/QQMsgService$2;

    .line 48
    .line 49
    invoke-direct {v4}, Llin/xposed/hook/util/qq/QQMsgService$2;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-static {v3, v2, v4}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    filled-new-array {p1, p2, v2}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {p0, v0, v1, p1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public static recallMsg(Ljava/lang/Object;J)V
    .locals 1

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    invoke-static {p0, v0}, Llin/xposed/hook/util/qq/QQMsgService;->recallMsg(Ljava/lang/Object;Ljava/util/ArrayList;)V

    return-void
.end method

.method public static recallMsg(Ljava/lang/Object;Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    if-nez p1, :cond_1

    .line 5
    .line 6
    :goto_0
    return-void

    .line 7
    :cond_1
    const/16 v0, 0x3ac

    .line 8
    .line 9
    invoke-static {v0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世哲兰苏;

    .line 14
    .line 15
    const/4 v2, 0x4

    .line 16
    invoke-direct {v1, v0, v2, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->forEach(Ljava/util/function/Consumer;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Long;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Llin/xposed/hook/util/qq/QQMsgService;->lambda$recallMsg$0(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Long;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Llin/xposed/hook/util/qq/QQMsgService$IMsgOperateCallback;Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Llin/xposed/hook/util/qq/QQMsgService;->lambda$getMsgsByMsgId$1(Llin/xposed/hook/util/qq/QQMsgService$IMsgOperateCallback;Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
