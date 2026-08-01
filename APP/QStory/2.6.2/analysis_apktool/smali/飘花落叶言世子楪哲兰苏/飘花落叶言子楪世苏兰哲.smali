.class public final L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世苏兰哲;
.super L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪兰苏世哲:I

.field public final 飘花落叶言子楪兰苏哲世:I


# direct methods
.method public synthetic constructor <init>(III)V
    .locals 0

    .line 1
    iput p3, p0, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 4
    .line 5
    .line 6
    iput p2, p0, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:I

    .line 2
    .line 3
    iget p0, p0, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    invoke-static {p0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 9
    .line 10
    .line 11
    sget-object p0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 20
    .line 21
    .line 22
    sget-object p0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 23
    .line 24
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:I

    .line 2
    .line 3
    iget p0, p0, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世:I

    .line 4
    .line 5
    const-string v1, "Check failed."

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-ne v0, p0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->isDirect()Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-static {v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    return-void

    .line 36
    :pswitch_0
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-ne v0, p0, :cond_3

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->isDirect()Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-nez p0, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    invoke-static {v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    invoke-static {v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :goto_1
    return-void

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
