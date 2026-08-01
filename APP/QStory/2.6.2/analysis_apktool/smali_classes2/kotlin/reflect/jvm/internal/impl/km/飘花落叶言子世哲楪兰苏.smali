.class public final Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世哲楪兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪世哲兰苏:Lkotlin/reflect/jvm/internal/impl/km/KmVariance;

.field public final 飘花落叶言子楪世哲苏兰:I

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/String;

.field public 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public constructor <init>(ILjava/lang/String;ILkotlin/reflect/jvm/internal/impl/km/KmVariance;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:I

    .line 11
    .line 12
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 13
    .line 14
    iput p3, p0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世哲苏兰:I

    .line 15
    .line 16
    iput-object p4, p0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世哲兰苏:Lkotlin/reflect/jvm/internal/impl/km/KmVariance;

    .line 17
    .line 18
    new-instance p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    const/4 p2, 0x1

    .line 21
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

    .line 25
    .line 26
    sget-object p1, L飘花落叶言世楪苏子哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世楪苏子哲兰/飘花落叶言子楪世哲兰苏;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {}, L飘花落叶言世楪苏子哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    new-instance p2, Ljava/util/ArrayList;

    .line 36
    .line 37
    const/16 p3, 0xa

    .line 38
    .line 39
    invoke-static {p1, p3}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏(Ljava/lang/Iterable;I)I

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result p3

    .line 54
    if-eqz p3, :cond_0

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    check-cast p3, L飘花落叶言世楪苏子哲兰/飘花落叶言子楪世兰苏哲;

    .line 61
    .line 62
    check-cast p3, L飘花落叶言世楪苏子兰哲/飘花落叶言子楪世哲兰苏;

    .line 63
    .line 64
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-instance p3, L飘花落叶言世楪苏子兰哲/飘花落叶言子楪苏世兰哲;

    .line 68
    .line 69
    invoke-direct {p3}, L飘花落叶言世楪苏子兰哲/飘花落叶言子楪苏世兰哲;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世兰哲苏:Ljava/util/ArrayList;

    .line 77
    .line 78
    return-void
.end method
