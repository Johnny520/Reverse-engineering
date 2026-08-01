.class public final Lorg/apache/commons/lang3/time/飘花落叶言子楪苏哲兰世;
.super Lorg/apache/commons/lang3/time/飘花落叶言子楪哲世兰苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lorg/apache/commons/lang3/time/飘花落叶言子楪哲世兰苏;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(Lorg/apache/commons/lang3/time/FastDateParser;I)I
    .locals 2

    .line 1
    iget p0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const/16 p0, 0xc

    .line 9
    .line 10
    if-ne p2, p0, :cond_0

    .line 11
    .line 12
    move p2, v1

    .line 13
    :cond_0
    return p2

    .line 14
    :pswitch_0
    const/16 p0, 0x18

    .line 15
    .line 16
    if-ne p2, p0, :cond_1

    .line 17
    .line 18
    move p2, v1

    .line 19
    :cond_1
    return p2

    .line 20
    :pswitch_1
    const/4 p0, 0x7

    .line 21
    if-ne p2, p0, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    add-int/2addr v0, p2

    .line 25
    :goto_0
    return v0

    .line 26
    :pswitch_2
    sub-int/2addr p2, v0

    .line 27
    return p2

    .line 28
    :pswitch_3
    const/16 p0, 0x64

    .line 29
    .line 30
    if-ge p2, p0, :cond_3

    .line 31
    .line 32
    invoke-static {p1, p2}, Lorg/apache/commons/lang3/time/FastDateParser;->access$700(Lorg/apache/commons/lang3/time/FastDateParser;I)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    :cond_3
    return p2

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
