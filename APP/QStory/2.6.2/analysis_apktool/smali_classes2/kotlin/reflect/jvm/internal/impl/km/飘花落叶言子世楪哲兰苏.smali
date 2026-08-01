.class public final Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世楪哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪世哲兰苏:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

.field public 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:I

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 12
    .line 13
    new-instance p1, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 20
    .line 21
    new-instance p1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲兰苏:Ljava/util/ArrayList;

    .line 27
    .line 28
    sget-object p1, L飘花落叶言世楪苏子哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世楪苏子哲兰/飘花落叶言子楪世哲兰苏;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {}, L飘花落叶言世楪苏子哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    .line 38
    .line 39
    const/16 v1, 0xa

    .line 40
    .line 41
    invoke-static {p1, v1}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏(Ljava/lang/Iterable;I)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, L飘花落叶言世楪苏子哲兰/飘花落叶言子楪世兰苏哲;

    .line 63
    .line 64
    check-cast v1, L飘花落叶言世楪苏子兰哲/飘花落叶言子楪世哲兰苏;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    new-instance v1, L飘花落叶言世楪苏子兰哲/飘花落叶言子楪世苏兰哲;

    .line 70
    .line 71
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

    .line 79
    .line 80
    return-void
.end method
