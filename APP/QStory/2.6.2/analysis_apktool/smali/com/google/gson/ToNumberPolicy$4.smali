.class final enum Lcom/google/gson/ToNumberPolicy$4;
.super Lcom/google/gson/ToNumberPolicy;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/gson/ToNumberPolicy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/google/gson/ToNumberPolicy;-><init>(Ljava/lang/String;ILcom/google/gson/ToNumberPolicy$1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public bridge synthetic readNumber(L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏哲兰;)Ljava/lang/Number;
    .locals 0

    .line 37
    invoke-virtual {p0, p1}, Lcom/google/gson/ToNumberPolicy$4;->readNumber(L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏哲兰;)Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0
.end method

.method public readNumber(L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏哲兰;)Ljava/math/BigDecimal;
    .locals 4

    .line 1
    invoke-virtual {p1}, L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲兰楪苏()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :try_start_0
    invoke-static {p0}, Lcom/google/gson/internal/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p0

    .line 10
    :catch_0
    move-exception v0

    .line 11
    new-instance v1, Lcom/google/gson/JsonParseException;

    .line 12
    .line 13
    const-string v2, "Cannot parse "

    .line 14
    .line 15
    const-string v3, "; at path "

    .line 16
    .line 17
    invoke-static {v2, p0, v3}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-virtual {p1, v2}, L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰哲世(Z)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v1, p0, v0}, Lcom/google/gson/JsonParseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    throw v1
.end method
