.class final synthetic Lkotlinx/coroutines/JobSupport$onAwaitInternal$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;"
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
.field public static final INSTANCE:Lkotlinx/coroutines/JobSupport$onAwaitInternal$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lkotlinx/coroutines/JobSupport$onAwaitInternal$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlinx/coroutines/JobSupport$onAwaitInternal$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlinx/coroutines/JobSupport$onAwaitInternal$1;->INSTANCE:Lkotlinx/coroutines/JobSupport$onAwaitInternal$1;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const-string v4, "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v1, 0x3

    .line 5
    const-class v2, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;

    .line 6
    .line 7
    const-string v3, "onAwaitInternalRegFunc"

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

    .line 43
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;

    check-cast p2, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰哲苏;

    invoke-virtual {p0, p1, p2, p3}, Lkotlinx/coroutines/JobSupport$onAwaitInternal$1;->invoke(Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;Lkotlinx/coroutines/selects/飘花落叶言子楪世兰哲苏;Ljava/lang/Object;)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;Lkotlinx/coroutines/selects/飘花落叶言子楪世兰哲苏;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u4e16\u5170\u696a;",
            "Lkotlinx/coroutines/selects/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    sget-object p0, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪哲苏兰世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    :cond_0
    invoke-virtual {p1}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子苏世楪哲兰()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of p3, p0, Lkotlinx/coroutines/飘花落叶言子苏楪哲世兰;

    .line 8
    .line 9
    if-nez p3, :cond_2

    .line 10
    .line 11
    instance-of p1, p0, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    invoke-static {p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世苏兰哲楪(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    invoke-interface {p2, p0}, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_2
    invoke-virtual {p1, p0}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子哲楪世苏兰(Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-ltz p0, :cond_0

    .line 29
    .line 30
    new-instance p0, Lkotlinx/coroutines/飘花落叶言子苏哲楪兰世;

    .line 31
    .line 32
    invoke-direct {p0, p1, p2}, Lkotlinx/coroutines/飘花落叶言子苏哲楪兰世;-><init>(Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;Lkotlinx/coroutines/selects/飘花落叶言子楪世兰哲苏;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p1, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏哲世(Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;Lkotlinx/coroutines/飘花落叶言子苏世哲兰楪;)Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {p2, p0}, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method
