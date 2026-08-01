.class public final Lio/ktor/util/pipeline/飘花落叶言子楪苏哲兰世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世苏兰哲;
.implements Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;


# static fields
.field public static final 飘花落叶言子楪哲苏兰世:Lio/ktor/util/pipeline/飘花落叶言子楪苏哲兰世;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/ktor/util/pipeline/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/ktor/util/pipeline/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:Lio/ktor/util/pipeline/飘花落叶言子楪苏哲兰世;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getCallerFrame()L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世苏兰哲;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 1
    sget-object p0, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 2
    .line 3
    return-object p0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string p1, "Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method
