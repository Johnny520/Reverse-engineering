.class public final L飘花落叶言世楪哲兰子苏/飘花落叶言子楪哲苏兰世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Ljava/util/LinkedHashMap;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世楪哲兰子苏/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰()L飘花落叶言世楪哲兰子苏/飘花落叶言子楪哲苏兰世;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言世楪哲兰子苏/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Lkotlin/collections/飘花落叶言子世楪苏兰哲;->飘花落叶言子世哲楪兰苏(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/lang/Iterable;

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/util/Map$Entry;

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, L飘花落叶言世楪哲兰子苏/飘花落叶言子楪世兰哲苏;

    .line 47
    .line 48
    iget-object v4, v1, L飘花落叶言世楪哲兰子苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/impl/load/java/typeEnhancement/NullabilityQualifier;

    .line 49
    .line 50
    iget-object v5, v1, L飘花落叶言世楪哲兰子苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/jvm/internal/impl/load/java/typeEnhancement/MutabilityQualifier;

    .line 51
    .line 52
    iget-boolean v6, v1, L飘花落叶言世楪哲兰子苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:Z

    .line 53
    .line 54
    new-instance v3, L飘花落叶言世楪哲兰子苏/飘花落叶言子楪世兰哲苏;

    .line 55
    .line 56
    const/4 v7, 0x1

    .line 57
    const/4 v8, 0x1

    .line 58
    invoke-direct/range {v3 .. v8}, L飘花落叶言世楪哲兰子苏/飘花落叶言子楪世兰哲苏;-><init>(Lkotlin/reflect/jvm/internal/impl/load/java/typeEnhancement/NullabilityQualifier;Lkotlin/reflect/jvm/internal/impl/load/java/typeEnhancement/MutabilityQualifier;ZZZ)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    new-instance p0, L飘花落叶言世楪哲兰子苏/飘花落叶言子楪哲苏兰世;

    .line 66
    .line 67
    invoke-direct {p0, v0}, L飘花落叶言世楪哲兰子苏/飘花落叶言子楪哲苏兰世;-><init>(Ljava/util/LinkedHashMap;)V

    .line 68
    .line 69
    .line 70
    return-object p0
.end method
