.class public final L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏世兰哲;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(ILjava/util/List;)V
    .locals 0

    .line 1
    iput p1, p0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p2, p0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final isEmpty()Z
    .locals 2

    .line 1
    iget v0, p0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    return v1

    .line 10
    :pswitch_0
    check-cast p0, Ljava/util/List;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏世兰哲;

    .line 36
    .line 37
    invoke-interface {v0}, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏世兰哲;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    :goto_0
    const/4 v1, 0x1

    .line 45
    :goto_1
    return v1

    .line 46
    :pswitch_1
    check-cast p0, Ljava/util/List;

    .line 47
    .line 48
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    return p0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget v0, p0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    check-cast p0, Ljava/util/List;

    .line 16
    .line 17
    invoke-static {p0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世楪兰苏(Ljava/lang/Iterable;)Lkotlin/collections/飘花落叶言子楪哲苏世兰;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    sget-object v0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏兰世哲;

    .line 22
    .line 23
    invoke-static {p0, v0}, Lkotlin/sequences/飘花落叶言子楪哲世苏兰;->飘花落叶言子苏兰世楪哲(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlin/sequences/飘花落叶言子楪苏世哲兰;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    new-instance v0, Lkotlin/sequences/飘花落叶言子楪世兰苏哲;

    .line 28
    .line 29
    invoke-direct {v0, p0}, Lkotlin/sequences/飘花落叶言子楪世兰苏哲;-><init>(Lkotlin/sequences/飘花落叶言子楪苏世哲兰;)V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_1
    check-cast p0, Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/util/List;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子世哲苏兰楪(Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;)L飘花落叶言世子兰哲苏楪/飘花落叶言子楪世苏兰哲;
    .locals 3

    .line 1
    iget v0, p0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast v2, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 13
    .line 14
    invoke-virtual {p1, v2}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    sget-object v1, L飘花落叶言世楪哲子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世楪哲子苏兰/飘花落叶言子楪世哲兰苏;

    .line 21
    .line 22
    :cond_0
    return-object v1

    .line 23
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    check-cast v2, Ljava/util/List;

    .line 27
    .line 28
    invoke-static {v2}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世楪兰苏(Ljava/lang/Iterable;)Lkotlin/collections/飘花落叶言子楪哲苏世兰;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子世楪兰哲苏;

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    invoke-direct {v0, p1, v2}, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子世楪兰哲苏;-><init>(Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;I)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v0}, Lkotlin/sequences/飘花落叶言子楪哲世苏兰;->飘花落叶言子哲楪苏兰世(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Lkotlin/sequences/飘花落叶言子楪世兰哲苏;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    new-instance p1, Lkotlin/sequences/飘花落叶言子楪世兰苏哲;

    .line 43
    .line 44
    invoke-direct {p1, p0}, Lkotlin/sequences/飘花落叶言子楪世兰苏哲;-><init>(Lkotlin/sequences/飘花落叶言子楪世兰哲苏;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lkotlin/sequences/飘花落叶言子楪世兰苏哲;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-nez p0, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {p1}, Lkotlin/sequences/飘花落叶言子楪世兰苏哲;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    :goto_0
    check-cast v1, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪世苏兰哲;

    .line 59
    .line 60
    return-object v1

    .line 61
    :pswitch_1
    invoke-static {p0, p1}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏世兰哲;Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;)L飘花落叶言世子兰哲苏楪/飘花落叶言子楪世苏兰哲;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子世哲苏楪兰(Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;)Z
    .locals 1

    .line 1
    iget v0, p0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏世兰哲;Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ljava/util/List;

    .line 17
    .line 18
    invoke-static {p0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世楪兰苏(Ljava/lang/Iterable;)Lkotlin/collections/飘花落叶言子楪哲苏世兰;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    iget-object p0, p0, Lkotlin/collections/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Ljava/lang/Iterable;

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏世兰哲;

    .line 41
    .line 42
    invoke-interface {v0, p1}, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子世哲苏楪兰(Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    const/4 p0, 0x1

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const/4 p0, 0x0

    .line 51
    :goto_0
    return p0

    .line 52
    :pswitch_1
    invoke-static {p0, p1}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏世兰哲;Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
