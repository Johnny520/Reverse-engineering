.class public final synthetic L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世哲苏:L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;

    .line 10
    .line 11
    const-wide v2, -0x36a50923051405a7L    # -2.4052967726159928E45

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v2, 0x0

    .line 21
    new-array v2, v2, [Ljava/lang/Object;

    .line 22
    .line 23
    invoke-static {p0, v0, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Llin/xposed/hook/util/qq/QQMessageUtils;->getMsgRecordMd5UrlMap(Ljava/lang/Object;)Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-static {p0}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏(Ljava/util/Map;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    return-object v1

    .line 42
    :pswitch_0
    sget-object v0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世哲苏:L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;

    .line 43
    .line 44
    sget-object v0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ExecutorService;

    .line 45
    .line 46
    invoke-static {p0}, Llin/xposed/hook/util/qq/QQMessageUtils;->getMsgRecordMd5UrlMap(Ljava/lang/Object;)Ljava/util/Map;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const-wide v2, -0x36a5febb051405a7L    # -2.3197198407237798E45

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-static {p0}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏(Ljava/util/Map;)V

    .line 62
    .line 63
    .line 64
    return-object v1

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
