.class public final Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪兰世哲苏;
.super L飘花落叶言世楪子苏兰哲/飘花落叶言子楪世哲苏兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子世楪哲兰苏:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪世苏哲兰;

.field public final 飘花落叶言子世楪哲苏兰:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeParameter;

.field public final 飘花落叶言子世楪苏兰哲:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeParameter;I)V
    .locals 10

    .line 1
    iget-object v0, p1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    iget-object v2, v0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    iget-object v3, p1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪苏哲世兰;

    .line 6
    .line 7
    iget-object v0, p1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世楪哲兰子苏/飘花落叶言子楪苏世哲兰;

    .line 8
    .line 9
    invoke-virtual {p2}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeParameter;->getName()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v0, v1}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世(L飘花落叶言世楪哲兰子苏/飘花落叶言子楪苏世哲兰;I)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-virtual {p2}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeParameter;->getVariance()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeParameter$Variance;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    sget-object v1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲苏兰:[I

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    aget v0, v1, v0

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    if-eq v0, v1, :cond_2

    .line 34
    .line 35
    const/4 v1, 0x2

    .line 36
    if-eq v0, v1, :cond_1

    .line 37
    .line 38
    const/4 v1, 0x3

    .line 39
    if-ne v0, v1, :cond_0

    .line 40
    .line 41
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/Variance;->INVARIANT:Lkotlin/reflect/jvm/internal/impl/types/Variance;

    .line 42
    .line 43
    :goto_0
    move-object v6, v0

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    throw p0

    .line 50
    :cond_1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/Variance;->OUT_VARIANCE:Lkotlin/reflect/jvm/internal/impl/types/Variance;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/Variance;->IN_VARIANCE:Lkotlin/reflect/jvm/internal/impl/types/Variance;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :goto_1
    invoke-virtual {p2}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeParameter;->getReified()Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    sget-object v9, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪哲兰苏世:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子世哲楪兰苏;

    .line 61
    .line 62
    sget-object v4, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子兰哲苏楪/飘花落叶言子楪世兰哲苏;

    .line 63
    .line 64
    move-object v1, p0

    .line 65
    move v8, p3

    .line 66
    invoke-direct/range {v1 .. v9}, L飘花落叶言世楪子苏兰哲/飘花落叶言子楪世哲苏兰;-><init>(Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏兰世哲;Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪苏哲世兰;L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏世兰哲;Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;Lkotlin/reflect/jvm/internal/impl/types/Variance;ZILkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子世哲楪兰苏;)V

    .line 67
    .line 68
    .line 69
    iput-object p1, v1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏兰哲:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;

    .line 70
    .line 71
    iput-object p2, v1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪哲苏兰:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeParameter;

    .line 72
    .line 73
    new-instance p0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪世苏哲兰;

    .line 74
    .line 75
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪世兰苏哲;

    .line 76
    .line 77
    const/4 p2, 0x4

    .line 78
    invoke-direct {p1, v1, p2}, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/Object;I)V

    .line 79
    .line 80
    .line 81
    invoke-direct {p0, v2, p1}, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪世苏哲兰;-><init>(Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏兰世哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 82
    .line 83
    .line 84
    iput-object p0, v1, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪哲兰苏:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪世苏哲兰;

    .line 85
    .line 86
    return-void
.end method


# virtual methods
.method public final getAnnotations()L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪哲兰苏:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子哲苏楪世兰()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪苏兰哲:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;

    .line 2
    .line 3
    iget-object v1, v0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:L飘花落叶言世兰子哲苏楪/飘花落叶言子楪苏哲兰世;

    .line 4
    .line 5
    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪哲苏兰:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeParameter;

    .line 6
    .line 7
    invoke-static {v2, v1}, L飘花落叶言世楪哲兰子苏/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$TypeParameter;L飘花落叶言世兰子哲苏楪/飘花落叶言子楪苏哲兰世;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/resolve/descriptorUtil/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪苏哲世兰;)L飘花落叶言世子兰苏哲楪/飘花落叶言子楪苏世兰哲;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, L飘花落叶言世子兰苏哲楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏世兰()Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏楪世兰哲(Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_0
    iget-object p0, v0, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世兰哲:Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子世苏楪兰哲;

    .line 31
    .line 32
    new-instance v0, Ljava/util/ArrayList;

    .line 33
    .line 34
    const/16 v2, 0xa

    .line 35
    .line 36
    invoke-static {v1, v2}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子哲楪苏世兰(Ljava/lang/Iterable;I)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_1

    .line 52
    .line 53
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;

    .line 58
    .line 59
    invoke-virtual {p0, v2}, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪苏世哲兰(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Type;)Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪苏兰哲;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    return-object v0
.end method
