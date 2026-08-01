.class public final Lkotlin/collections/builders/飘花落叶言子楪苏哲世兰;
.super Lkotlin/collections/飘花落叶言子楪苏哲世兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:Lkotlin/collections/builders/MapBuilder;


# direct methods
.method public constructor <init>(Lkotlin/collections/builders/MapBuilder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlin/collections/builders/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lkotlin/collections/builders/MapBuilder;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 7
    .line 8
    .line 9
    throw p0
.end method

.method public final clear()V
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/collections/builders/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lkotlin/collections/builders/MapBuilder;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/collections/builders/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lkotlin/collections/builders/MapBuilder;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lkotlin/collections/builders/MapBuilder;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getSize()I
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/collections/builders/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lkotlin/collections/builders/MapBuilder;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final isEmpty()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/collections/builders/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lkotlin/collections/builders/MapBuilder;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/collections/builders/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lkotlin/collections/builders/MapBuilder;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkotlin/collections/builders/MapBuilder;->keysIterator$kotlin_stdlib()Lkotlin/collections/builders/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/collections/builders/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lkotlin/collections/builders/MapBuilder;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lkotlin/collections/builders/MapBuilder;->removeKey$kotlin_stdlib(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkotlin/collections/builders/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lkotlin/collections/builders/MapBuilder;

    .line 5
    .line 6
    invoke-virtual {v0}, Lkotlin/collections/builders/MapBuilder;->checkIsMutable$kotlin_stdlib()V

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkotlin/collections/builders/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Lkotlin/collections/builders/MapBuilder;

    .line 5
    .line 6
    invoke-virtual {v0}, Lkotlin/collections/builders/MapBuilder;->checkIsMutable$kotlin_stdlib()V

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method
