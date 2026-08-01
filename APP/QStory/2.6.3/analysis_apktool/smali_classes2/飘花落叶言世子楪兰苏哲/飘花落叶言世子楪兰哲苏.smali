.class public final L飘花落叶言世子楪兰苏哲/飘花落叶言世子楪兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世兰楪哲;

.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言世子楪兰哲苏;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言世子楪兰苏哲/飘花落叶言世子楪兰哲苏;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言世子楪兰哲苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言世子楪兰哲苏;

    .line 7
    .line 8
    const-string v0, "io.modelcontextprotocol.kotlin.sdk.StopReason"

    .line 9
    .line 10
    sget-object v1, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏哲兰:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世哲兰苏;

    .line 11
    .line 12
    invoke-static {v0, v1}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世哲兰苏;)L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世兰楪哲;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言世子楪兰哲苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世兰楪哲;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final deserialize(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-interface {p1}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰苏哲()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p1, L飘花落叶言世子楪兰苏哲/飘花落叶言世子楪哲兰苏;->INSTANCE:L飘花落叶言世子楪兰苏哲/飘花落叶言世子楪哲兰苏;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string v0, "stopSequence"

    .line 11
    .line 12
    invoke-static {p0, v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    sget-object p1, L飘花落叶言世子楪兰苏哲/飘花落叶言楪兰哲苏世子;->INSTANCE:L飘花落叶言世子楪兰苏哲/飘花落叶言楪兰哲苏世子;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const-string v0, "maxTokens"

    .line 25
    .line 26
    invoke-static {p0, v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_1
    sget-object p1, L飘花落叶言世子楪兰苏哲/飘花落叶言楪兰哲苏子世;->INSTANCE:L飘花落叶言世子楪兰苏哲/飘花落叶言楪兰哲苏子世;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const-string v0, "endTurn"

    .line 39
    .line 40
    invoke-static {p0, v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance p1, L飘花落叶言世子楪兰苏哲/飘花落叶言世子楪哲苏兰;

    .line 51
    .line 52
    invoke-direct {p1, p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言世子楪哲苏兰;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object p1
.end method

.method public final getDescriptor()L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言世子楪兰哲苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世兰楪哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, L飘花落叶言世子楪兰苏哲/飘花落叶言世子楪兰苏哲;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p2}, L飘花落叶言世子楪兰苏哲/飘花落叶言世子楪兰苏哲;->getValue()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子苏世哲兰楪(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
