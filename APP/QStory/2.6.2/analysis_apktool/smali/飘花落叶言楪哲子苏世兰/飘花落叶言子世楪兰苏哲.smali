.class public L飘花落叶言楪哲子苏世兰/飘花落叶言子世楪兰苏哲;
.super Lcom/google/gson/飘花落叶言子楪哲苏兰世;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
    .locals 2

    .line 1
    check-cast p2, Ljava/lang/Number;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世苏兰()L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-virtual {p1, v0, v1}, L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪哲兰苏(J)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p1}, L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世兰苏楪哲()Lcom/google/gson/stream/JsonToken;

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
    invoke-virtual {p1}, L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏兰楪哲()V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :cond_0
    :try_start_0
    invoke-virtual {p1}, L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪哲兰苏()J

    .line 15
    .line 16
    .line 17
    move-result-wide p0

    .line 18
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    return-object p0

    .line 23
    :catch_0
    move-exception p0

    .line 24
    new-instance p1, Lcom/google/gson/JsonSyntaxException;

    .line 25
    .line 26
    invoke-direct {p1, p0}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    throw p1
.end method
