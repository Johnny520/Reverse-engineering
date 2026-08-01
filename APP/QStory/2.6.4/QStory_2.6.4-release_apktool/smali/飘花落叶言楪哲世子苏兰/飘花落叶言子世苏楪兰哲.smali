.class public L飘花落叶言楪哲世子苏兰/飘花落叶言子世苏楪兰哲;
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
    check-cast p2, Ljava/lang/Character;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :goto_0
    invoke-virtual {p1, p0}, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪兰哲世(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
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
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x1

    .line 23
    if-ne v0, v1, :cond_1

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    new-instance v0, Lcom/google/gson/JsonSyntaxException;

    .line 36
    .line 37
    const-string v2, "Expecting character, got: "

    .line 38
    .line 39
    const-string v3, "; at "

    .line 40
    .line 41
    invoke-static {v2, p0, v3}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p1, v1}, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世(Z)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-direct {v0, p0}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v0
.end method
