.class public L飘花落叶言楪哲世子苏兰/飘花落叶言子世苏哲兰楪;
.super Lcom/google/gson/飘花落叶言子楪哲苏世兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
.method public final 飘花落叶言子楪世哲苏兰(L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏兰哲;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/math/BigDecimal;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪哲世兰(Ljava/lang/Number;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p1}, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏兰哲世楪()Lcom/google/gson/stream/JsonToken;

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
    invoke-virtual {p1}, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏哲世楪兰()V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-virtual {p1}, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏兰世楪哲()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :try_start_0
    invoke-static {p0}, Lcom/google/gson/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)Ljava/math/BigDecimal;

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
    move-exception v0

    .line 24
    new-instance v1, Lcom/google/gson/JsonSyntaxException;

    .line 25
    .line 26
    const-string v2, "Failed parsing \'"

    .line 27
    .line 28
    const-string v3, "\' as BigDecimal; at path "

    .line 29
    .line 30
    invoke-static {v2, p0, v3}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const/4 v2, 0x1

    .line 35
    invoke-virtual {p1, v2}, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世(Z)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-direct {v1, p0, v0}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    throw v1
.end method
