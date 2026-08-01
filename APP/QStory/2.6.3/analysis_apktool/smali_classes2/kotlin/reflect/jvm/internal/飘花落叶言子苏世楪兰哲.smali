.class public final Lkotlin/reflect/jvm/internal/飘花落叶言子苏世楪兰哲;
.super L飘花落叶言世兰苏哲楪子/飘花落叶言子楪苏世哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v0, Lkotlin/reflect/jvm/internal/飘花落叶言子楪苏兰世哲;

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/飘花落叶言子楪苏兰世哲;-><init>(I)V

    .line 18
    .line 19
    .line 20
    array-length v1, p1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    array-length v1, p1

    .line 25
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    array-length v1, p1

    .line 30
    const/4 v2, 0x1

    .line 31
    if-le v1, v2, :cond_1

    .line 32
    .line 33
    invoke-static {p1, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲()Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v4, Lkotlin/reflect/jvm/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子世苏楪哲兰:Lkotlin/reflect/jvm/internal/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    const/16 v5, 0x18

    .line 4
    .line 5
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 6
    .line 7
    const-string v1, ""

    .line 8
    .line 9
    const-string v2, "<init>("

    .line 10
    .line 11
    const-string v3, ")V"

    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲兰楪苏世(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
