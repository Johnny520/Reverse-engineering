.class public final Lkotlin/reflect/jvm/internal/飘花落叶言子苏世楪兰哲;
.super L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x5

    .line 5
    invoke-direct {p0, v0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v0, Lkotlin/reflect/jvm/internal/飘花落叶言子楪苏兰世哲;

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/飘花落叶言子楪苏兰世哲;-><init>(I)V

    .line 19
    .line 20
    .line 21
    array-length v1, p1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    array-length v1, p1

    .line 26
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    array-length v1, p1

    .line 31
    const/4 v2, 0x1

    .line 32
    if-le v1, v2, :cond_1

    .line 33
    .line 34
    invoke-static {p1, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰()Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v4, Lkotlin/reflect/jvm/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子世苏楪哲兰:Lkotlin/reflect/jvm/internal/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    const/16 v5, 0x18

    .line 4
    .line 5
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

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
    invoke-static/range {v0 .. v5}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世楪苏兰(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
