.class public final Lkotlin/reflect/jvm/internal/飘花落叶言楪子哲兰世苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:Lkotlin/reflect/jvm/internal/飘花落叶言楪子哲兰世苏;


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Lkotlin/reflect/jvm/internal/飘花落叶言楪子哲兰世苏;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/Map;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lkotlin/reflect/jvm/internal/飘花落叶言楪子哲兰世苏;

    .line 2
    .line 3
    sget-object v1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/collections/飘花落叶言子楪兰哲苏世;->飘花落叶言子苏兰楪哲世()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子哲兰世苏;-><init>(Ljava/util/List;Ljava/util/Map;Lkotlin/reflect/jvm/internal/飘花落叶言楪子哲兰世苏;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lkotlin/reflect/jvm/internal/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪世哲兰苏:Lkotlin/reflect/jvm/internal/飘花落叶言楪子哲兰世苏;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/Map;Lkotlin/reflect/jvm/internal/飘花落叶言楪子哲兰世苏;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪世苏兰哲:Ljava/util/Map;

    .line 7
    .line 8
    iput-object p3, p0, Lkotlin/reflect/jvm/internal/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪世哲苏兰:Lkotlin/reflect/jvm/internal/飘花落叶言楪子哲兰世苏;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(I)Lkotlin/jvm/internal/飘花落叶言子楪苏世兰哲;
    .locals 2

    .line 1
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪世苏兰哲:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lkotlin/jvm/internal/飘花落叶言子楪苏世兰哲;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪世哲苏兰:Lkotlin/reflect/jvm/internal/飘花落叶言楪子哲兰世苏;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子哲兰世苏;->飘花落叶言子楪世苏哲兰(I)Lkotlin/jvm/internal/飘花落叶言子楪苏世兰哲;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return-object p0

    .line 26
    :cond_1
    return-object v0
.end method
