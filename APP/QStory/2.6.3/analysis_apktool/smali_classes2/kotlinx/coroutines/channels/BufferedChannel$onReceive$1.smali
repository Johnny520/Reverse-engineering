.class final synthetic Lkotlinx/coroutines/channels/BufferedChannel$onReceive$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

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
.field public static final INSTANCE:Lkotlinx/coroutines/channels/BufferedChannel$onReceive$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lkotlinx/coroutines/channels/BufferedChannel$onReceive$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlinx/coroutines/channels/BufferedChannel$onReceive$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlinx/coroutines/channels/BufferedChannel$onReceive$1;->INSTANCE:Lkotlinx/coroutines/channels/BufferedChannel$onReceive$1;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const-string v4, "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v1, 0x3

    .line 5
    const-class v2, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 6
    .line 7
    const-string v3, "registerSelectForReceive"

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

    .line 1
    check-cast p1, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    check-cast p2, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lkotlinx/coroutines/channels/BufferedChannel$onReceive$1;->invoke(Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;Lkotlinx/coroutines/selects/飘花落叶言子楪世兰哲苏;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 9
    .line 10
    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;Lkotlinx/coroutines/selects/飘花落叶言子楪世兰哲苏;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
            "Lkotlinx/coroutines/selects/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 11
    sget-object p0, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 12
    invoke-virtual {p1, p2}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子世哲苏楪兰(Lkotlinx/coroutines/selects/飘花落叶言子楪世兰哲苏;)V

    return-void
.end method
