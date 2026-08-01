.class public final synthetic L飘花落叶言世哲苏子楪兰/飘花落叶言子楪苏哲兰世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Ljava/util/List;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;Ljava/util/List;I)V
    .locals 0

    .line 1
    iput p3, p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p2, p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object p0, p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-ne v0, v3, :cond_0

    .line 16
    .line 17
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {p0}, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-object v1

    .line 27
    :pswitch_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-ne v0, v3, :cond_1

    .line 32
    .line 33
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {p0}, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-object v1

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
