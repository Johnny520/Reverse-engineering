.class public L飘花落叶言楪哲世子苏兰/飘花落叶言子苏楪哲世兰;
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
    check-cast p2, Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲()L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-virtual {p1}, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏哲兰楪世()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲()V

    .line 13
    .line 14
    .line 15
    iget-object p0, p1, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Ljava/io/Writer;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    const-string p1, "true"

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const-string p1, "false"

    .line 27
    .line 28
    :goto_0
    invoke-virtual {p0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :goto_1
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;
    .locals 1

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
    sget-object v0, Lcom/google/gson/stream/JsonToken;->STRING:Lcom/google/gson/stream/JsonToken;

    .line 15
    .line 16
    if-ne p0, v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏兰世楪哲()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_1
    invoke-virtual {p1}, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏兰哲楪()Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method
