.class public final synthetic L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰哲楪苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic 飘花落叶言子楪世哲苏兰:Ljava/util/List;

.field public final synthetic 飘花落叶言子楪世苏兰哲:Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;Ljava/util/List;I)V
    .locals 0

    .line 1
    iput p3, p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏兰哲:Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;

    .line 4
    .line 5
    iput-object p2, p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世哲苏兰:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object v4, p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世哲苏兰:Ljava/util/List;

    .line 7
    .line 8
    iget-object p0, p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏兰哲:Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ne v0, v3, :cond_0

    .line 18
    .line 19
    iget-object p0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰哲苏楪;

    .line 22
    .line 23
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {p0, v0}, L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪苏哲兰世(L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰哲苏楪;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-object v1

    .line 33
    :pswitch_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-ne v0, v3, :cond_1

    .line 38
    .line 39
    iget-object p0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰哲苏楪;

    .line 42
    .line 43
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {p0, v0}, L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪苏哲兰世(L飘花落叶言世哲苏子楪兰/飘花落叶言子世兰哲苏楪;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-object v1

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
