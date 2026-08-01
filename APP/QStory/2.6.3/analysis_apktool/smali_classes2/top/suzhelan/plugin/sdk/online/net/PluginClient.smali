.class public final Ltop/suzhelan/plugin/sdk/online/net/PluginClient;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Ltop/suzhelan/plugin/sdk/online/net/PluginClient;",
        "",
        "<init>",
        "()V",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u54f2\u5170;",
        "getOkHttpClient",
        "()L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u54f2\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u54f2\u5170;",
        "Ltop/suzhelan/plugin/sdk/online/net/ApiService;",
        "getApiService",
        "()Ltop/suzhelan/plugin/sdk/online/net/ApiService;",
        "online-plugin-sdk_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Ltop/suzhelan/plugin/sdk/online/net/PluginClient;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ltop/suzhelan/plugin/sdk/online/net/PluginClient;

    .line 2
    .line 3
    invoke-direct {v0}, Ltop/suzhelan/plugin/sdk/online/net/PluginClient;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ltop/suzhelan/plugin/sdk/online/net/PluginClient;->INSTANCE:Ltop/suzhelan/plugin/sdk/online/net/PluginClient;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final getApiService()Ltop/suzhelan/plugin/sdk/online/net/ApiService;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/gson/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/gson/飘花落叶言子楪苏世哲兰;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    invoke-direct {v1, v0}, L飘花落叶言苏楪子兰世哲/飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/gson/飘花落叶言子楪苏世哲兰;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 12
    .line 13
    const/16 v2, 0x13

    .line 14
    .line 15
    invoke-direct {v0, v2}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;-><init>(I)V

    .line 16
    .line 17
    .line 18
    const-string v2, "https://plugin.suzhelan.top/api/plugin/"

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子世楪哲兰苏(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sget-object v2, Ltop/suzhelan/plugin/sdk/online/net/PluginClient;->INSTANCE:Ltop/suzhelan/plugin/sdk/online/net/PluginClient;

    .line 24
    .line 25
    invoke-direct {v2}, Ltop/suzhelan/plugin/sdk/online/net/PluginClient;->getOkHttpClient()L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪苏哲兰;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v3, "client == null"

    .line 30
    .line 31
    invoke-static {v2, v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    iput-object v2, v0, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 35
    .line 36
    iget-object v2, v0, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子世楪兰苏哲()Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-class v1, Ltop/suzhelan/plugin/sdk/online/net/ApiService;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    check-cast v0, Ltop/suzhelan/plugin/sdk/online/net/ApiService;

    .line 57
    .line 58
    return-object v0
.end method

.method private final getOkHttpClient()L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪苏哲兰;
    .locals 4

    .line 1
    new-instance p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    invoke-direct {p0}, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰哲苏世;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ltop/suzhelan/plugin/sdk/online/net/HeaderInterceptor;

    .line 7
    .line 8
    invoke-direct {v0}, Ltop/suzhelan/plugin/sdk/online/net/HeaderInterceptor;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    new-instance v0, Ltop/suzhelan/plugin/sdk/online/net/HttpLogInterceptor;

    .line 17
    .line 18
    invoke-direct {v0}, Ltop/suzhelan/plugin/sdk/online/net/HttpLogInterceptor;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const-wide/16 v1, 0x3c

    .line 30
    .line 31
    invoke-static {v1, v2, v0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(JLjava/util/concurrent/TimeUnit;)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    iput v3, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰哲世苏:I

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v2, v0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(JLjava/util/concurrent/TimeUnit;)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    iput v3, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰哲苏世;->飘花落叶言子世楪苏哲兰:I

    .line 45
    .line 46
    invoke-static {v1, v2, v0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(JLjava/util/concurrent/TimeUnit;)I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    iput v3, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰哲苏世;->飘花落叶言子世楪苏兰哲:I

    .line 51
    .line 52
    invoke-static {v1, v2, v0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(JLjava/util/concurrent/TimeUnit;)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iput v0, p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰哲苏世:I

    .line 57
    .line 58
    new-instance v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪苏哲兰;

    .line 59
    .line 60
    invoke-direct {v0, p0}, L飘花落叶言世兰子哲苏楪/飘花落叶言子世楪苏哲兰;-><init>(L飘花落叶言世兰子哲苏楪/飘花落叶言子楪兰哲苏世;)V

    .line 61
    .line 62
    .line 63
    return-object v0
.end method
