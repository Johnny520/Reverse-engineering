.class public final synthetic L飘花落叶言世苏兰哲子楪/飘花落叶言子苏楪兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪苏哲兰世:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 9
    .line 10
    invoke-interface {v0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, [L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 15
    .line 16
    invoke-static {p0, v0}, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰苏哲(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;[L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :pswitch_0
    iget-object p0, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲子楪/飘花落叶言子世楪哲兰苏;

    .line 26
    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    invoke-interface {p0}, L飘花落叶言世苏兰哲子楪/飘花落叶言子世楪哲兰苏;->typeParametersSerializers()[L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    new-instance v0, Ljava/util/ArrayList;

    .line 36
    .line 37
    array-length v1, p0

    .line 38
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    .line 40
    .line 41
    array-length v1, p0

    .line 42
    const/4 v2, 0x0

    .line 43
    :goto_0
    if-ge v2, v1, :cond_1

    .line 44
    .line 45
    aget-object v3, p0, v2

    .line 46
    .line 47
    invoke-interface {v3}, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;->getDescriptor()L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const/4 v0, 0x0

    .line 58
    :cond_1
    invoke-static {v0}, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰(Ljava/util/List;)[L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :pswitch_1
    iget-object p0, p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲子楪/飘花落叶言子世楪哲兰苏;

    .line 64
    .line 65
    if-eqz p0, :cond_2

    .line 66
    .line 67
    invoke-interface {p0}, L飘花落叶言世苏兰哲子楪/飘花落叶言子世楪哲兰苏;->childSerializers()[L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    if-nez p0, :cond_3

    .line 72
    .line 73
    :cond_2
    sget-object p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏兰哲:[L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 74
    .line 75
    :cond_3
    return-object p0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
