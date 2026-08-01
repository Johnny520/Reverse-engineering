.class public final Lcom/google/protobuf/飘花落叶言世子哲楪苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public 飘花落叶言子楪哲兰世苏:Ljava/util/Iterator;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 10
    const/4 v0, 0x1

    iput v0, p0, Lcom/google/protobuf/飘花落叶言世子哲楪苏兰;->飘花落叶言子楪哲苏兰世:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/Iterator;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/google/protobuf/飘花落叶言世子哲楪苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言世子哲楪苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/Iterator;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言世子哲楪苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世子哲楪苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/Iterator;

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_0
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世子哲楪苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/Iterator;

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言世子哲楪苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世子哲楪苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/Iterator;

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/lang/String;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_0
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世子哲楪苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/Iterator;

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/util/Map$Entry;

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    instance-of v0, v0, Lcom/google/protobuf/飘花落叶言世子哲楪兰苏;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    new-instance v0, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;

    .line 32
    .line 33
    invoke-direct {v0, p0}, Lcom/google/protobuf/飘花落叶言世子苏兰哲楪;-><init>(Ljava/util/Map$Entry;)V

    .line 34
    .line 35
    .line 36
    move-object p0, v0

    .line 37
    :cond_0
    return-object p0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/protobuf/飘花落叶言世子哲楪苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 9
    .line 10
    .line 11
    throw p0

    .line 12
    :pswitch_0
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世子哲楪苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/Iterator;

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
