.class public final Lkotlinx/coroutines/飘花落叶言子哲世兰苏楪;
.super Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/飘花落叶言子哲世兰苏楪;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lkotlinx/coroutines/飘花落叶言子哲世兰苏楪;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlinx/coroutines/飘花落叶言子楪兰哲世苏;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlinx/coroutines/飘花落叶言子哲世兰苏楪;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/飘花落叶言子哲世兰苏楪;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Dispatchers.Unconfined"

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    sget-object p0, Lkotlinx/coroutines/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/飘花落叶言子苏世哲兰楪;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkotlinx/coroutines/飘花落叶言子哲苏世兰楪;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lkotlinx/coroutines/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪哲苏兰世:Z

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p0, "Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls."

    .line 16
    .line 17
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
