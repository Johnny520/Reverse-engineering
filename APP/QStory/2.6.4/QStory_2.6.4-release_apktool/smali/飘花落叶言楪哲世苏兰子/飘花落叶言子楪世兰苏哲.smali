.class public final L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世兰苏哲;
.super L飘花落叶言楪哲世子苏兰/飘花落叶言子楪苏世哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, L飘花落叶言楪哲世子苏兰/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Ljava/util/Date;)Ljava/util/Date;
    .locals 2

    .line 1
    iget p0, p0, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/sql/Timestamp;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-direct {p0, v0, v1}, Ljava/sql/Timestamp;-><init>(J)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    new-instance p0, Ljava/sql/Date;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-direct {p0, v0, v1}, Ljava/sql/Date;-><init>(J)V

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
