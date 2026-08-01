.class public final Lkotlin/reflect/jvm/internal/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世兰楪;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;

.field public final 飘花落叶言子楪哲苏兰世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# direct methods
.method public constructor <init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;I)V
    .locals 0

    .line 1
    packed-switch p2, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 8
    .line 9
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 21
    .line 22
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public 飘花落叶言子哲世楪苏兰(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;)L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    new-instance v2, L飘花落叶言世苏兰哲子楪/飘花落叶言子楪苏哲兰世;

    .line 14
    .line 15
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 16
    .line 17
    invoke-interface {p0, p1}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 22
    .line 23
    invoke-direct {v2, p0}, L飘花落叶言世苏兰哲子楪/飘花落叶言子楪苏哲兰世;-><init>(L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-nez p0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v2, p0

    .line 34
    :cond_1
    :goto_0
    check-cast v2, L飘花落叶言世苏兰哲子楪/飘花落叶言子楪苏哲兰世;

    .line 35
    .line 36
    iget-object p0, v2, L飘花落叶言世苏兰哲子楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 37
    .line 38
    return-object p0
.end method

.method public 飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 13
    .line 14
    invoke-interface {p0, p1}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    return-object p1

    .line 26
    :cond_1
    return-object v1
.end method
