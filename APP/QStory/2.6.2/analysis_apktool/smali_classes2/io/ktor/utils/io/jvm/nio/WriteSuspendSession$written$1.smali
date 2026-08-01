.class final Lio/ktor/utils/io/jvm/nio/WriteSuspendSession$written$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.utils.io.jvm.nio.WriteSuspendSession"
    f = "WriteSuspendSession.kt"
    l = {
        0x1e,
        0x20
    }
    m = "written"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lio/ktor/utils/io/jvm/nio/飘花落叶言子楪世苏哲兰;


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/jvm/nio/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/utils/io/jvm/nio/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/utils/io/jvm/nio/WriteSuspendSession$written$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSession$written$1;->this$0:Lio/ktor/utils/io/jvm/nio/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iput-object p1, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSession$written$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSession$written$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSession$written$1;->label:I

    .line 9
    .line 10
    iget-object v1, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSession$written$1;->this$0:Lio/ktor/utils/io/jvm/nio/飘花落叶言子楪世苏哲兰;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sub-int/2addr p1, v0

    .line 16
    iput p1, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSession$written$1;->label:I

    .line 17
    .line 18
    iget-object v0, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSession$written$1;->result:Ljava/lang/Object;

    .line 19
    .line 20
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    if-eq p1, v2, :cond_1

    .line 27
    .line 28
    const/4 p0, 0x2

    .line 29
    if-ne p1, p0, :cond_0

    .line 30
    .line 31
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 38
    .line 39
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v1

    .line 43
    :cond_1
    iget-object p0, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSession$written$1;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Lio/ktor/utils/io/jvm/nio/飘花落叶言子楪世苏哲兰;

    .line 46
    .line 47
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    throw v1

    .line 54
    :cond_2
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    throw v1
.end method
