.class public final Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪苏世兰哲;
.super Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲世兰苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪兰苏哲世:Landroidx/core/view/飘花落叶言子楪世兰哲苏;


# direct methods
.method public constructor <init>(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏哲兰;Landroidx/core/view/飘花落叶言子楪世兰哲苏;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1, p2, p3}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲世兰苏;-><init>(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏哲兰;Landroidx/core/view/飘花落叶言子楪世兰哲苏;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏哲世:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 14
    .line 15
    invoke-interface {p3}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;->getKind()L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    instance-of p0, p0, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世哲苏兰;

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-interface {p3}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p3}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;->getKind()L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance p2, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string p3, "The serializer of one of type "

    .line 35
    .line 36
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p0, " should be using generic polymorphic serializer, but got "

    .line 43
    .line 44
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const/16 p0, 0x2e

    .line 51
    .line 52
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1
.end method


# virtual methods
.method public final 飘花落叶言子哲楪世兰苏(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;I)J
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_1

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    if-ne p2, p0, :cond_0

    .line 8
    .line 9
    invoke-static {p1, p2}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰哲世(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;I)J

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    return-wide p0

    .line 14
    :cond_0
    new-instance p0, Lkotlinx/serialization/SerializationException;

    .line 15
    .line 16
    const-string v0, "Unsupported index: "

    .line 17
    .line 18
    const-string v1, " in a oneOf type "

    .line 19
    .line 20
    invoke-static {p2, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-interface {p1}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p1, ", which should be using generic polymorphic serializer"

    .line 32
    .line 33
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {p0, p1}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p0

    .line 44
    :cond_1
    const-wide/16 p0, 0x4c2d

    .line 45
    .line 46
    return-wide p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪兰苏世哲:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance v0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪世兰哲苏;

    .line 14
    .line 15
    iget-object v1, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪兰世苏哲:L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏哲兰;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏哲世:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1, p0, p1}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲世兰苏;-><init>(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏哲兰;Landroidx/core/view/飘花落叶言子楪世兰哲苏;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p1}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    const/4 v1, 0x1

    .line 33
    const/4 v2, 0x0

    .line 34
    const-string v3, "Implementation of oneOf type "

    .line 35
    .line 36
    if-ne p0, v1, :cond_4

    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(I)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    new-instance v1, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    instance-of v5, v4, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏兰哲;

    .line 63
    .line 64
    if-eqz v5, :cond_1

    .line 65
    .line 66
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    invoke-static {v1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰世苏哲楪(Ljava/util/List;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏兰哲;

    .line 75
    .line 76
    if-eqz p0, :cond_3

    .line 77
    .line 78
    return-object v0

    .line 79
    :cond_3
    invoke-interface {p1}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    const-string p1, " should have @ProtoNumber annotation"

    .line 84
    .line 85
    invoke-static {p0, v3, p1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    return-object v2

    .line 89
    :cond_4
    invoke-interface {p1}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    const-string v0, " should contain only 1 element, but get "

    .line 94
    .line 95
    invoke-interface {p1}, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲()I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-static {p1, p0, v0, v3}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-object v2
.end method

.method public final 飘花落叶言子楪哲苏世兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/core/view/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪哲苏兰世:I

    .line 5
    .line 6
    if-ltz v0, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/core/view/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, [J

    .line 11
    .line 12
    add-int/lit8 v2, v0, -0x1

    .line 13
    .line 14
    iput v2, p0, Landroidx/core/view/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪哲苏兰世:I

    .line 15
    .line 16
    aget-wide v0, v1, v0

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-static {p1, v2}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰哲世(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;I)J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    const-wide/32 v4, 0x7fffffff

    .line 24
    .line 25
    .line 26
    and-long/2addr v2, v4

    .line 27
    long-to-int p1, v2

    .line 28
    const-wide v2, 0xfffffff00000000L

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr v0, v2

    .line 34
    int-to-long v2, p1

    .line 35
    or-long/2addr v0, v2

    .line 36
    invoke-virtual {p0, v0, v1}, Landroidx/core/view/飘花落叶言子苏哲世楪兰;->飘花落叶言子苏兰楪世哲(J)V

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_0
    new-instance p0, Lkotlinx/serialization/SerializationException;

    .line 41
    .line 42
    const-string p1, "No tag in stack for requested element"

    .line 43
    .line 44
    invoke-direct {p0, p1}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p0
.end method

.method public final 飘花落叶言子苏兰哲世楪(JLjava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x4c2d

    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-super {p0, p1, p2, p3}, Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子苏兰哲世楪(JLjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method
