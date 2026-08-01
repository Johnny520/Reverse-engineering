.class public final synthetic Lio/ktor/http/cio/飘花落叶言子楪苏世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;I)V
    .locals 0

    .line 1
    iput p2, p0, Lio/ktor/http/cio/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Lio/ktor/http/cio/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;

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
    .locals 2

    .line 1
    iget v0, p0, Lio/ktor/http/cio/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Lio/ktor/http/cio/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;

    .line 15
    .line 16
    iget-object p0, p0, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:[I

    .line 17
    .line 18
    add-int/lit8 v1, p1, 0x4

    .line 19
    .line 20
    aget v1, p0, v1

    .line 21
    .line 22
    add-int/lit8 p1, p1, 0x5

    .line 23
    .line 24
    aget p0, p0, p1

    .line 25
    .line 26
    invoke-virtual {v0, v1, p0}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;->subSequence(II)Ljava/lang/CharSequence;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    add-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    iget p0, p0, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:I

    .line 34
    .line 35
    if-lt p1, p0, :cond_0

    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :goto_0
    return-object p0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
