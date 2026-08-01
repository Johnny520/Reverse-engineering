.class public final L飘花落叶言世子楪兰苏哲/飘花落叶言子苏楪兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世兰楪哲;

.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言子苏楪兰哲世;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏楪兰哲世;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言子苏楪兰哲世;

    .line 7
    .line 8
    const-string v0, "io.modelcontextprotocol.kotlin.sdk.ErrorCode"

    .line 9
    .line 10
    sget-object v1, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰苏哲世:L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世哲兰苏;

    .line 11
    .line 12
    invoke-static {v0, v1}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世哲兰苏;)L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世兰楪哲;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世兰楪哲;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final deserialize(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-interface {p1}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪苏兰哲()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {}, Lio/modelcontextprotocol/kotlin/sdk/ErrorCode$Defined;->getEntries()Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    move-object v1, v0

    .line 24
    check-cast v1, Lio/modelcontextprotocol/kotlin/sdk/ErrorCode$Defined;

    .line 25
    .line 26
    invoke-virtual {v1}, Lio/modelcontextprotocol/kotlin/sdk/ErrorCode$Defined;->getCode()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-ne v1, p0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    :goto_0
    check-cast v0, Lio/modelcontextprotocol/kotlin/sdk/ErrorCode$Defined;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_2
    new-instance p1, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏楪哲兰世;

    .line 40
    .line 41
    invoke-direct {p1, p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏楪哲兰世;-><init>(I)V

    .line 42
    .line 43
    .line 44
    return-object p1
.end method

.method public final getDescriptor()L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲子楪/飘花落叶言子苏世兰楪哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏楪兰世哲;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p2}, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏楪兰世哲;->getCode()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    invoke-interface {p1, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子世兰哲楪苏(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
