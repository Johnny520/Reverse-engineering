.class public final L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世苏楪兰;
.super L飘花落叶言世苏兰哲子楪/飘花落叶言子世哲楪兰苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世苏楪兰;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世苏楪兰;

    .line 2
    .line 3
    const-class v1, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世楪兰苏;

    .line 4
    .line 5
    sget-object v2, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, L飘花落叶言世苏兰哲子楪/飘花落叶言子世哲楪兰苏;-><init>(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世苏楪兰;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;)L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰苏哲(L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;)L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const-string p1, "message"

    .line 9
    .line 10
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲楪兰苏世;->Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言子哲楪兰世苏;

    .line 17
    .line 18
    invoke-virtual {p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲楪兰世苏;->serializer()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    const-string p1, "method"

    .line 26
    .line 27
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏兰世楪;->Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏兰楪世;

    .line 34
    .line 35
    invoke-virtual {p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏兰楪世;->serializer()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_1
    const-string p1, "id"

    .line 43
    .line 44
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_2

    .line 49
    .line 50
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏楪兰世;

    .line 51
    .line 52
    invoke-virtual {p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏楪兰世;->serializer()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_2
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世兰苏楪;->Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世兰楪苏;

    .line 60
    .line 61
    invoke-virtual {p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲世兰楪苏;->serializer()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 66
    .line 67
    return-object p0
.end method
