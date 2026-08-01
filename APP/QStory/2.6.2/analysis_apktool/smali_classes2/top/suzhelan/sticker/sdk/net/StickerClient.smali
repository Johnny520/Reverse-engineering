.class public final Ltop/suzhelan/sticker/sdk/net/StickerClient;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Ltop/suzhelan/sticker/sdk/net/StickerClient;",
        "",
        "<init>",
        "()V",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u696a\u5b50\u82cf\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u54f2\u5170;",
        "getOkHttpClient",
        "()L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u696a\u5b50\u82cf\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u54f2\u5170;",
        "Ltop/suzhelan/sticker/sdk/net/StickerApiService;",
        "getApiService",
        "()Ltop/suzhelan/sticker/sdk/net/StickerApiService;",
        "online-sticker-sdk_release"
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
.field public static final INSTANCE:Ltop/suzhelan/sticker/sdk/net/StickerClient;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ltop/suzhelan/sticker/sdk/net/StickerClient;

    .line 2
    .line 3
    invoke-direct {v0}, Ltop/suzhelan/sticker/sdk/net/StickerClient;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ltop/suzhelan/sticker/sdk/net/StickerClient;->INSTANCE:Ltop/suzhelan/sticker/sdk/net/StickerClient;

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

.method public static final getApiService()Ltop/suzhelan/sticker/sdk/net/StickerApiService;
    .locals 3

    .line 1
    new-instance v0, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "https://sticker.suzhelan.top/api/v1/"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Ltop/suzhelan/sticker/sdk/net/StickerClient;->INSTANCE:Ltop/suzhelan/sticker/sdk/net/StickerClient;

    .line 14
    .line 15
    invoke-direct {v1}, Ltop/suzhelan/sticker/sdk/net/StickerClient;->getOkHttpClient()L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "client == null"

    .line 20
    .line 21
    invoke-static {v1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    iput-object v1, v0, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 25
    .line 26
    new-instance v1, Lcom/google/gson/飘花落叶言子楪苏世哲兰;

    .line 27
    .line 28
    invoke-direct {v1}, Lcom/google/gson/飘花落叶言子楪苏世哲兰;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v2, L飘花落叶言苏楪子兰哲世/飘花落叶言子楪世苏哲兰;

    .line 32
    .line 33
    invoke-direct {v2, v1}, L飘花落叶言苏楪子兰哲世/飘花落叶言子楪世苏哲兰;-><init>(Lcom/google/gson/飘花落叶言子楪苏世哲兰;)V

    .line 34
    .line 35
    .line 36
    iget-object v1, v0, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子世楪哲兰苏()Landroidx/appcompat/widget/飘花落叶言子世楪苏哲兰;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-class v1, Ltop/suzhelan/sticker/sdk/net/StickerApiService;

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
    check-cast v0, Ltop/suzhelan/sticker/sdk/net/StickerApiService;

    .line 57
    .line 58
    return-object v0
.end method

.method private final getOkHttpClient()L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;
    .locals 4

    .line 1
    new-instance p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    invoke-direct {p0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ltop/suzhelan/sticker/sdk/net/HeaderInterceptor;

    .line 7
    .line 8
    invoke-direct {v0}, Ltop/suzhelan/sticker/sdk/net/HeaderInterceptor;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const-wide/16 v1, 0x3c

    .line 22
    .line 23
    invoke-static {v1, v2, v0}, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(JLjava/util/concurrent/TimeUnit;)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    iput v3, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰哲世苏:I

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {v1, v2, v0}, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(JLjava/util/concurrent/TimeUnit;)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    iput v3, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;->飘花落叶言子世楪苏哲兰:I

    .line 37
    .line 38
    invoke-static {v1, v2, v0}, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(JLjava/util/concurrent/TimeUnit;)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    iput v3, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;->飘花落叶言子世楪苏兰哲:I

    .line 43
    .line 44
    invoke-static {v1, v2, v0}, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(JLjava/util/concurrent/TimeUnit;)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iput v0, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰哲苏世:I

    .line 49
    .line 50
    new-instance v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;

    .line 51
    .line 52
    invoke-direct {v0, p0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;-><init>(L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰哲苏世;)V

    .line 53
    .line 54
    .line 55
    return-object v0
.end method
