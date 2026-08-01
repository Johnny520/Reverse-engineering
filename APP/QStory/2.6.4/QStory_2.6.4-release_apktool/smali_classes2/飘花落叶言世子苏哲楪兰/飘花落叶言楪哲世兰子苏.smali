.class public final L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲世兰子苏;
.super L飘花落叶言世哲子苏兰楪/飘花落叶言子楪苏哲兰世;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲世兰子苏;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲世兰子苏;

    .line 2
    .line 3
    const-class v1, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲世苏兰子;

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
    invoke-direct {v0, v1}, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪苏哲兰世;-><init>(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲世兰子苏;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲世兰子苏;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(L飘花落叶言世哲子苏兰楪/飘花落叶言子楪哲世苏兰;)L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, L飘花落叶言世哲子苏兰楪/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲(L飘花落叶言世哲子苏兰楪/飘花落叶言子楪哲世苏兰;)L飘花落叶言世哲子苏兰楪/飘花落叶言子世楪哲兰苏;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const-string p1, "text"

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
    sget-object p0, L飘花落叶言世子苏哲楪兰/飘花落叶言世子哲苏楪兰;->Companion:L飘花落叶言世子苏哲楪兰/飘花落叶言世子哲楪兰苏;

    .line 17
    .line 18
    invoke-virtual {p0}, L飘花落叶言世子苏哲楪兰/飘花落叶言世子哲楪兰苏;->serializer()L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    const-string p1, "blob"

    .line 26
    .line 27
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    sget-object p0, L飘花落叶言世子苏哲楪兰/飘花落叶言子楪世哲苏兰;->Companion:L飘花落叶言世子苏哲楪兰/飘花落叶言子楪世苏兰哲;

    .line 34
    .line 35
    invoke-virtual {p0}, L飘花落叶言世子苏哲楪兰/飘花落叶言子楪世苏兰哲;->serializer()L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_1
    sget-object p0, L飘花落叶言世子苏哲楪兰/飘花落叶言世楪哲苏子兰;->Companion:L飘花落叶言世子苏哲楪兰/飘花落叶言世楪哲子兰苏;

    .line 43
    .line 44
    invoke-virtual {p0}, L飘花落叶言世子苏哲楪兰/飘花落叶言世楪哲子兰苏;->serializer()L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;

    .line 49
    .line 50
    return-object p0
.end method
