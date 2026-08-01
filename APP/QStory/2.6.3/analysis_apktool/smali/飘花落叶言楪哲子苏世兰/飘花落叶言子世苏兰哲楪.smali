.class public L飘花落叶言楪哲子苏世兰/飘花落叶言子世苏兰哲楪;
.super Lcom/google/gson/飘花落叶言子楪哲苏兰世;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏兰哲;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/google/gson/internal/LazilyParsedNumber;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪哲苏兰(Ljava/lang/Number;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p1}, L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世兰楪哲苏()Lcom/google/gson/stream/JsonToken;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lcom/google/gson/stream/JsonToken;->NULL:Lcom/google/gson/stream/JsonToken;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪兰哲()V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance p0, Lcom/google/gson/internal/LazilyParsedNumber;

    .line 15
    .line 16
    invoke-virtual {p1}, L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲苏兰楪()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {p0, p1}, Lcom/google/gson/internal/LazilyParsedNumber;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method
