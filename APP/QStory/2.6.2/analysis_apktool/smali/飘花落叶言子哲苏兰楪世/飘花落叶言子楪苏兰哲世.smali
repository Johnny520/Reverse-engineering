.class public final L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏世兰哲;
.implements L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲兰苏世;
.implements L飘花落叶言楪世哲兰苏子/飘花落叶言子楪苏世哲兰;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Landroid/content/Context;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Landroid/content/Context;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 14
    iput p2, p0, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:I

    iput-object p1, p0, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Landroid/content/Context;

    .line 2
    .line 3
    const-string v0, "connectivity"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Landroid/net/ConnectivityManager;

    .line 10
    .line 11
    return-object p0
.end method

.method public 飘花落叶言子楪世苏哲兰(L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;)V
    .locals 8

    .line 1
    new-instance v7, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    const-string v0, "EmojiCompatInitializer"

    .line 4
    .line 5
    invoke-direct {v7, v0}, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 9
    .line 10
    new-instance v6, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 11
    .line 12
    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x1

    .line 17
    const-wide/16 v3, 0xf

    .line 18
    .line 19
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 20
    .line 21
    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;

    .line 29
    .line 30
    const/16 v2, 0xa

    .line 31
    .line 32
    invoke-direct {v1, p0, p1, v0, v2}, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public 飘花落叶言子苏楪世兰哲(L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰哲世苏;)L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲兰世苏;
    .locals 3

    .line 1
    iget v0, p0, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const-class v1, Ljava/lang/Integer;

    .line 4
    .line 5
    iget-object v2, p0, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Landroid/content/Context;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世苏兰哲;

    .line 11
    .line 12
    const-class v0, Ljava/io/InputStream;

    .line 13
    .line 14
    invoke-virtual {p1, v1, v0}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Class;)L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲兰世苏;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {p0, v2, p1}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世苏兰哲;-><init>(Landroid/content/Context;L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲兰世苏;)V

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    new-instance p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世苏兰哲;

    .line 23
    .line 24
    const-class v0, Landroid/content/res/AssetFileDescriptor;

    .line 25
    .line 26
    invoke-virtual {p1, v1, v0}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Class;)L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲兰世苏;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {p0, v2, p1}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世苏兰哲;-><init>(Landroid/content/Context;L飘花落叶言楪世子哲兰苏/飘花落叶言子楪哲兰世苏;)V

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_1
    new-instance p0, L飘花落叶言楪世子兰苏哲/飘花落叶言子楪世苏兰哲;

    .line 35
    .line 36
    const/4 p1, 0x2

    .line 37
    invoke-direct {p0, v2, p1}, L飘花落叶言楪世子兰苏哲/飘花落叶言子楪世苏兰哲;-><init>(Landroid/content/Context;I)V

    .line 38
    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_2
    new-instance p1, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世苏兰哲;

    .line 42
    .line 43
    invoke-direct {p1, v2, p0}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世苏兰哲;-><init>(Landroid/content/Context;L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰哲世;)V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :pswitch_3
    new-instance p1, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世苏兰哲;

    .line 48
    .line 49
    invoke-direct {p1, v2, p0}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世苏兰哲;-><init>(Landroid/content/Context;L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰哲世;)V

    .line 50
    .line 51
    .line 52
    return-object p1

    .line 53
    :pswitch_4
    new-instance p1, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世苏兰哲;

    .line 54
    .line 55
    invoke-direct {p1, v2, p0}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世苏兰哲;-><init>(Landroid/content/Context;L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰哲世;)V

    .line 56
    .line 57
    .line 58
    return-object p1

    .line 59
    :pswitch_5
    new-instance p0, L飘花落叶言楪世子兰苏哲/飘花落叶言子楪世苏兰哲;

    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    invoke-direct {p0, v2, p1}, L飘花落叶言楪世子兰苏哲/飘花落叶言子楪世苏兰哲;-><init>(Landroid/content/Context;I)V

    .line 63
    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_6
    new-instance p0, L飘花落叶言楪世子兰苏哲/飘花落叶言子楪世苏兰哲;

    .line 67
    .line 68
    const/4 p1, 0x0

    .line 69
    invoke-direct {p0, v2, p1}, L飘花落叶言楪世子兰苏哲/飘花落叶言子楪世苏兰哲;-><init>(Landroid/content/Context;I)V

    .line 70
    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
