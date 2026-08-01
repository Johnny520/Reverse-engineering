.class public final synthetic Lio/ktor/server/cio/backend/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lio/ktor/server/cio/backend/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Lio/ktor/server/cio/backend/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lio/ktor/server/cio/backend/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Lio/ktor/server/cio/backend/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/Throwable;

    .line 11
    .line 12
    invoke-virtual {p0}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->close()V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    check-cast p0, Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;

    .line 19
    .line 20
    check-cast p1, Ljava/lang/Throwable;

    .line 21
    .line 22
    invoke-static {p0, p1}, Lio/ktor/server/cio/backend/HttpServerKt$httpServer$acceptJob$1;->飘花落叶言子楪世苏兰哲(Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;Ljava/lang/Throwable;)Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
