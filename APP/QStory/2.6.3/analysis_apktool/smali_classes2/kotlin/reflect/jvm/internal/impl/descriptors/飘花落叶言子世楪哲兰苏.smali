.class public final Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子世楪哲兰苏;
.super L飘花落叶言世楪子苏兰哲/飘花落叶言子楪苏哲兰世;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪兰哲世苏:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪兰哲苏世:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪苏兰哲世;

.field public final 飘花落叶言子楪兰苏哲世:Z


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏兰世哲;Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪世兰苏哲;Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;ZI)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪苏世哲兰:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子世哲楪兰苏;

    .line 5
    .line 6
    invoke-direct {p0, p1, p2, p3, v0}, L飘花落叶言世楪子苏兰哲/飘花落叶言子楪苏哲兰世;-><init>(Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏兰世哲;Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪苏哲世兰;Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子世哲楪苏兰;)V

    .line 7
    .line 8
    .line 9
    iput-boolean p4, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰苏哲世:Z

    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    invoke-static {p2, p5}, Landroidx/window/area/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏哲兰楪(II)L飘花落叶言世子兰楪苏哲/飘花落叶言子楪苏世哲兰;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    new-instance p3, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/16 p4, 0xa

    .line 19
    .line 20
    invoke-static {p2, p4}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子哲楪苏世兰(Ljava/lang/Iterable;I)I

    .line 21
    .line 22
    .line 23
    move-result p4

    .line 24
    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世兰哲苏;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    :goto_0
    move-object p4, p2

    .line 32
    check-cast p4, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世苏哲兰;

    .line 33
    .line 34
    iget-boolean p5, p4, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:Z

    .line 35
    .line 36
    if-eqz p5, :cond_0

    .line 37
    .line 38
    invoke-virtual {p4}, L飘花落叶言世子兰楪苏哲/飘花落叶言子楪世苏哲兰;->nextInt()I

    .line 39
    .line 40
    .line 41
    move-result p4

    .line 42
    sget-object p5, Lkotlin/reflect/jvm/internal/impl/types/Variance;->INVARIANT:Lkotlin/reflect/jvm/internal/impl/types/Variance;

    .line 43
    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v1, "T"

    .line 47
    .line 48
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {p0, p5, v0, p4, p1}, L飘花落叶言世楪子苏兰哲/飘花落叶言子世哲苏兰楪;->飘花落叶言子哲苏世楪兰(L飘花落叶言世楪子苏兰哲/飘花落叶言子楪世苏兰哲;Lkotlin/reflect/jvm/internal/impl/types/Variance;Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;ILkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏兰世哲;)L飘花落叶言世楪子苏兰哲/飘花落叶言子世哲苏兰楪;

    .line 63
    .line 64
    .line 65
    move-result-object p4

    .line 66
    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    iput-object p3, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰哲世苏:Ljava/util/ArrayList;

    .line 71
    .line 72
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪苏兰哲世;

    .line 73
    .line 74
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲(Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪苏世哲兰;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    sget p4, Lkotlin/reflect/jvm/internal/impl/resolve/descriptorUtil/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:I

    .line 79
    .line 80
    invoke-static {p0}, L飘花落叶言世楪兰子哲苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪苏哲世兰;)Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲苏世;

    .line 81
    .line 82
    .line 83
    move-result-object p4

    .line 84
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-interface {p4}, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲苏兰()L飘花落叶言世子兰苏哲楪/飘花落叶言子楪苏世兰哲;

    .line 88
    .line 89
    .line 90
    move-result-object p4

    .line 91
    invoke-virtual {p4}, L飘花落叶言世子兰苏哲楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲()Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪兰哲苏;

    .line 92
    .line 93
    .line 94
    move-result-object p4

    .line 95
    invoke-static {p4}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲苏兰楪(Ljava/lang/Object;)Ljava/util/Set;

    .line 96
    .line 97
    .line 98
    move-result-object p4

    .line 99
    check-cast p4, Ljava/util/Collection;

    .line 100
    .line 101
    invoke-direct {p2, p0, p3, p4, p1}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪苏兰哲世;-><init>(L飘花落叶言世楪子苏兰哲/飘花落叶言子世楪苏哲兰;Ljava/util/List;Ljava/util/Collection;Lkotlin/reflect/jvm/internal/impl/storage/飘花落叶言子楪苏兰世哲;)V

    .line 102
    .line 103
    .line 104
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰哲苏世:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪苏兰哲世;

    .line 105
    .line 106
    return-void
.end method


# virtual methods
.method public final getAnnotations()L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世子兰哲苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子兰哲苏楪/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getVisibility()Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪哲世苏兰;
    .locals 0

    .line 1
    sget-object p0, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪哲世苏兰;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final isExternal()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final isInline()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "class "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, L飘花落叶言世楪子苏兰哲/飘花落叶言子楪世苏兰哲;->getName()Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪苏世哲兰;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p0, " (not found)"

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final bridge synthetic 飘花落叶言子世楪兰哲苏()L飘花落叶言世苏子楪哲兰/飘花落叶言子楪哲世兰苏;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世苏子楪哲兰/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏子楪哲兰/飘花落叶言子楪哲世苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰哲苏()Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世哲兰苏楪;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰哲苏世:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲()Ljava/util/Collection;
    .locals 0

    .line 1
    sget-object p0, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪兰苏世哲()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final 飘花落叶言子楪哲世兰苏()Lkotlin/reflect/jvm/internal/impl/descriptors/Modality;
    .locals 0

    .line 1
    sget-object p0, Lkotlin/reflect/jvm/internal/impl/descriptors/Modality;->FINAL:Lkotlin/reflect/jvm/internal/impl/descriptors/Modality;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪哲苏世兰()Lkotlin/reflect/jvm/internal/impl/descriptors/ClassKind;
    .locals 0

    .line 1
    sget-object p0, Lkotlin/reflect/jvm/internal/impl/descriptors/ClassKind;->CLASS:Lkotlin/reflect/jvm/internal/impl/descriptors/ClassKind;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世哲兰()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰苏哲世:Z

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子苏世兰哲楪()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final 飘花落叶言子苏世兰楪哲()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final 飘花落叶言子苏兰楪世哲()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final 飘花落叶言子苏哲世兰楪()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰哲世苏:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子苏哲世楪兰()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final 飘花落叶言子苏哲兰世楪()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final 飘花落叶言子苏楪世兰哲()L飘花落叶言世楪子苏兰哲/飘花落叶言子楪苏哲世兰;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final 飘花落叶言子苏楪世哲兰(Lkotlin/reflect/jvm/internal/impl/types/checker/飘花落叶言子楪苏世哲兰;)L飘花落叶言世苏子楪哲兰/飘花落叶言子楪哲世兰苏;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世苏子楪哲兰/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏子楪哲兰/飘花落叶言子楪哲世苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子苏楪哲世兰()Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子世哲兰楪苏;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method
