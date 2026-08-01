.class public final Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世哲苏兰楪;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

.field public 飘花落叶言子楪世哲兰苏:Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世苏兰哲楪;

.field public 飘花落叶言子楪世哲苏兰:Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世苏兰哲楪;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/String;

.field public 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏哲兰:I

    .line 8
    .line 9
    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

    .line 18
    .line 19
    sget-object p0, L飘花落叶言世楪苏子哲兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世楪苏子哲兰/飘花落叶言子楪世哲兰苏;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {}, L飘花落叶言世楪苏子哲兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance p1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, L飘花落叶言世楪苏子哲兰/飘花落叶言子楪世兰苏哲;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    return-void
.end method
