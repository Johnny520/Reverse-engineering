.class final synthetic Lkotlinx/coroutines/channels/LazyActorCoroutine$onSend$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lkotlinx/coroutines/channels/LazyActorCoroutine$onSend$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lkotlinx/coroutines/channels/LazyActorCoroutine$onSend$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlinx/coroutines/channels/LazyActorCoroutine$onSend$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlinx/coroutines/channels/LazyActorCoroutine$onSend$1;->INSTANCE:Lkotlinx/coroutines/channels/LazyActorCoroutine$onSend$1;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const-string v4, "onSendRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v1, 0x3

    .line 5
    const-class v2, Lkotlinx/coroutines/channels/飘花落叶言子楪哲兰世苏;

    .line 6
    .line 7
    const-string v3, "onSendRegFunction"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 41
    check-cast p1, Lkotlinx/coroutines/channels/飘花落叶言子楪哲兰世苏;

    check-cast p2, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰哲苏;

    invoke-virtual {p0, p1, p2, p3}, Lkotlinx/coroutines/channels/LazyActorCoroutine$onSend$1;->invoke(Lkotlinx/coroutines/channels/飘花落叶言子楪哲兰世苏;Lkotlinx/coroutines/selects/飘花落叶言子楪世兰哲苏;Ljava/lang/Object;)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/channels/飘花落叶言子楪哲兰世苏;Lkotlinx/coroutines/selects/飘花落叶言子楪世兰哲苏;Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;",
            "Lkotlinx/coroutines/selects/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    sget p0, Lkotlinx/coroutines/channels/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰苏哲世:I

    .line 2
    .line 3
    invoke-virtual {p1}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏哲楪兰世()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p1, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏世哲:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 12
    .line 13
    sget-object v1, Lkotlinx/coroutines/channels/BufferedChannel$onSend$1;->INSTANCE:Lkotlinx/coroutines/channels/BufferedChannel$onSend$1;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x3

    .line 19
    invoke-static {v2, v1}, Lkotlin/jvm/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object v3, Lkotlinx/coroutines/channels/BufferedChannel$onSend$2;->INSTANCE:Lkotlinx/coroutines/channels/BufferedChannel$onSend$2;

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {v2, v3}, Lkotlin/jvm/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, p0, v1, v3}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;-><init>(Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;)V

    .line 31
    .line 32
    .line 33
    iget-object p0, v0, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;

    .line 36
    .line 37
    invoke-interface {p0, p1, p2, p3}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    return-void
.end method
