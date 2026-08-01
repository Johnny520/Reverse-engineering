.class public final Lio/ktor/server/routing/飘花落叶言子楪苏世兰哲;
.super Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Ljava/lang/String;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/ktor/server/routing/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lio/ktor/server/routing/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-ge p0, p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/16 v0, 0x2f

    .line 20
    .line 21
    if-eq p1, v0, :cond_0

    .line 22
    .line 23
    add-int/lit8 p0, p0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string p0, "Multisegment prefix is not supported"

    .line 27
    .line 28
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    throw p0

    .line 33
    :cond_1
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lio/ktor/server/routing/飘花落叶言子楪苏世兰哲;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lio/ktor/server/routing/飘花落叶言子楪苏世兰哲;

    .line 10
    .line 11
    iget-object v0, p0, Lio/ktor/server/routing/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, Lio/ktor/server/routing/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object p0, p0, Lio/ktor/server/routing/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 23
    .line 24
    iget-object p1, p1, Lio/ktor/server/routing/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    :goto_0
    const/4 p0, 0x0

    .line 33
    return p0

    .line 34
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 35
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lio/ktor/server/routing/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, Lio/ktor/server/routing/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "{...}"

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪哲世兰苏(Lio/ktor/server/routing/飘花落叶言子世楪苏哲兰;I)Lio/ktor/server/routing/飘花落叶言子楪哲世兰苏;
    .locals 6

    .line 1
    iget-object p1, p1, Lio/ktor/server/routing/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, Lio/ktor/server/routing/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-lez v1, :cond_1

    .line 11
    .line 12
    invoke-static {p2, p1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲苏兰楪世(ILjava/util/List;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-static {v1, v0, v2}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪哲世兰(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    :cond_0
    sget-object p0, Lio/ktor/server/routing/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Lio/ktor/server/routing/飘花落叶言子楪苏兰哲世;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    iget-object p0, p0, Lio/ktor/server/routing/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    sget-object p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰世苏哲;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    sget-object p0, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰世哲子苏/飘花落叶言子楪哲世兰苏;

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-static {p2, p1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世苏兰楪(ILjava/util/List;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    new-instance v3, Ljava/util/ArrayList;

    .line 50
    .line 51
    const/16 v4, 0xa

    .line 52
    .line 53
    invoke-static {v1, v4}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子哲楪苏世兰(Ljava/lang/Iterable;I)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_5

    .line 69
    .line 70
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    add-int/lit8 v5, v2, 0x1

    .line 75
    .line 76
    if-ltz v2, :cond_4

    .line 77
    .line 78
    check-cast v4, Ljava/lang/String;

    .line 79
    .line 80
    if-nez v2, :cond_3

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    invoke-static {v2, v4}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏世楪兰哲(ILjava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    :cond_3
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move v2, v5

    .line 94
    goto :goto_0

    .line 95
    :cond_4
    invoke-static {}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏兰哲世楪()V

    .line 96
    .line 97
    .line 98
    const/4 p0, 0x0

    .line 99
    throw p0

    .line 100
    :cond_5
    new-instance v0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏哲楪兰;

    .line 101
    .line 102
    invoke-direct {v0, p0, v3}, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏哲楪兰;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 103
    .line 104
    .line 105
    move-object p0, v0

    .line 106
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-ge p2, v0, :cond_6

    .line 111
    .line 112
    const-wide v0, 0x3fb999999999999aL    # 0.1

    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_6
    const-wide v0, 0x3fc999999999999aL    # 0.2

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    :goto_2
    new-instance v2, Lio/ktor/server/routing/飘花落叶言子楪哲世苏兰;

    .line 124
    .line 125
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    sub-int/2addr p1, p2

    .line 130
    invoke-direct {v2, v0, v1, p0, p1}, Lio/ktor/server/routing/飘花落叶言子楪哲世苏兰;-><init>(DL飘花落叶言楪兰世哲子苏/飘花落叶言子世楪兰苏哲;I)V

    .line 131
    .line 132
    .line 133
    return-object v2
.end method
