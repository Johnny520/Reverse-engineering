.class public abstract Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子苏世楪哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Z

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p2, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public 飘花落叶言子楪世哲苏兰()Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子苏世楪哲兰;
    .locals 0

    .line 1
    return-object p0
.end method

.method public 飘花落叶言子楪世苏兰哲()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public 飘花落叶言子楪世苏哲兰(Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子苏世楪哲兰;)Ljava/lang/Integer;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    .line 5
    .line 6
    if-ne p0, p1, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    .line 15
    .line 16
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Ljava/lang/Integer;

    .line 27
    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    sub-int/2addr p0, p1

    .line 48
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 54
    return-object p0
.end method
