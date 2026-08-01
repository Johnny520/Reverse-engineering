.class final synthetic Lkotlinx/coroutines/JobSupport$onAwaitInternal$2;
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
.field public static final INSTANCE:Lkotlinx/coroutines/JobSupport$onAwaitInternal$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lkotlinx/coroutines/JobSupport$onAwaitInternal$2;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlinx/coroutines/JobSupport$onAwaitInternal$2;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlinx/coroutines/JobSupport$onAwaitInternal$2;->INSTANCE:Lkotlinx/coroutines/JobSupport$onAwaitInternal$2;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const-string v4, "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v1, 0x3

    .line 5
    const-class v2, Lkotlinx/coroutines/飘花落叶言子苏兰楪世哲;

    .line 6
    .line 7
    const-string v3, "onAwaitInternalProcessResFunc"

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

    .line 16
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子苏兰楪世哲;

    invoke-virtual {p0, p1, p2, p3}, Lkotlinx/coroutines/JobSupport$onAwaitInternal$2;->invoke(Lkotlinx/coroutines/飘花落叶言子苏兰楪世哲;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/飘花落叶言子苏兰楪世哲;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, Lkotlinx/coroutines/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪哲苏兰世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    instance-of p0, p3, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;

    .line 7
    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    return-object p3

    .line 11
    :cond_0
    check-cast p3, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;

    .line 12
    .line 13
    iget-object p0, p3, Lkotlinx/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/Throwable;

    .line 14
    .line 15
    throw p0
.end method
