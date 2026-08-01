.class final Lio/ktor/server/engine/BaseApplicationResponse$respondWriteChannelContent$1;
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
    c = "io.ktor.server.engine.BaseApplicationResponse"
    f = "BaseApplicationResponse.kt"
    l = {
        0xad,
        0xb1
    }
    m = "respondWriteChannelContent$suspendImpl"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lio/ktor/server/engine/飘花落叶言子楪苏世哲兰;


# direct methods
.method public constructor <init>(Lio/ktor/server/engine/飘花落叶言子楪苏世哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/server/engine/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u54f2\u5170;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/server/engine/BaseApplicationResponse$respondWriteChannelContent$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/server/engine/BaseApplicationResponse$respondWriteChannelContent$1;->this$0:Lio/ktor/server/engine/飘花落叶言子楪苏世哲兰;

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
    .locals 1

    .line 1
    iput-object p1, p0, Lio/ktor/server/engine/BaseApplicationResponse$respondWriteChannelContent$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lio/ktor/server/engine/BaseApplicationResponse$respondWriteChannelContent$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lio/ktor/server/engine/BaseApplicationResponse$respondWriteChannelContent$1;->label:I

    .line 9
    .line 10
    iget-object p1, p0, Lio/ktor/server/engine/BaseApplicationResponse$respondWriteChannelContent$1;->this$0:Lio/ktor/server/engine/飘花落叶言子楪苏世哲兰;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0, p0}, Lio/ktor/server/engine/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Lio/ktor/server/engine/飘花落叶言子楪苏世哲兰;Lio/ktor/http/content/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
