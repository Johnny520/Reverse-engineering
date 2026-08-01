.class public final L飘花落叶言世子兰楪哲苏/飘花落叶言子楪哲兰苏世;
.super L飘花落叶言世子兰楪哲苏/飘花落叶言子楪哲苏世兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世哲兰苏;


# instance fields
.field public final 飘花落叶言子楪苏世兰哲:Ljava/lang/Object;

.field public final 飘花落叶言子楪苏世哲兰:Z


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;ZLjava/lang/Object;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    array-length v1, v0

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-gt v1, v3, :cond_0

    .line 12
    .line 13
    new-array v0, v2, [Ljava/lang/reflect/Type;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    array-length v1, v0

    .line 17
    invoke-static {v0, v3, v1}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子世哲楪兰苏([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    check-cast v0, [Ljava/lang/reflect/Type;

    .line 22
    .line 23
    invoke-direct {p0, p1, v2, v0}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪哲苏世兰;-><init>(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;)V

    .line 24
    .line 25
    .line 26
    iput-boolean p2, p0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 27
    .line 28
    iput-object p3, p0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世兰哲:Ljava/lang/Object;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰([Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-direct {v0, v1}, Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世兰哲:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, v0, Landroidx/compose/ui/graphics/vector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    new-array v0, v0, [Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-virtual {p0, v0, p1}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method
