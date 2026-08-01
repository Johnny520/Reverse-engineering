.class public final synthetic Llin/xposed/hook/util/qq/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/CompletableFuture;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/CompletableFuture;I)V
    .locals 0

    .line 1
    iput p2, p0, Llin/xposed/hook/util/qq/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Llin/xposed/hook/util/qq/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/CompletableFuture;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Llin/xposed/hook/util/qq/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Llin/xposed/hook/util/qq/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/CompletableFuture;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget p1, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    aget-object p1, p3, p1

    .line 12
    .line 13
    check-cast p1, Ljava/lang/String;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {p1}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CompletableFuture;->complete(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 34
    return-object p0

    .line 35
    :pswitch_0
    invoke-static {p0, p1, p2, p3}, Llin/xposed/hook/util/qq/Hook_cookie;->飘花落叶言子楪世苏哲兰(Ljava/util/concurrent/CompletableFuture;Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
