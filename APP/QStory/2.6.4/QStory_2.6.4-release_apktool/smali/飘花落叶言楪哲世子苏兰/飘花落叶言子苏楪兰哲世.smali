.class public L飘花落叶言楪哲世子苏兰/飘花落叶言子苏楪兰哲世;
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
    .locals 2

    .line 1
    check-cast p2, Ljava/lang/Number;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲()L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Number;->shortValue()S

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    int-to-long v0, p0

    .line 14
    invoke-virtual {p1, v0, v1}, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子世兰哲楪苏(J)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;
    .locals 3

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
    :try_start_0
    invoke-virtual {p1}, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲苏楪兰()I

    .line 15
    .line 16
    .line 17
    move-result p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    const v0, 0xffff

    .line 19
    .line 20
    .line 21
    if-gt p0, v0, :cond_1

    .line 22
    .line 23
    const/16 v0, -0x8000

    .line 24
    .line 25
    if-lt p0, v0, :cond_1

    .line 26
    .line 27
    int-to-short p0, p0

    .line 28
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_1
    new-instance v0, Lcom/google/gson/JsonSyntaxException;

    .line 34
    .line 35
    const-string v1, "Lossy conversion from "

    .line 36
    .line 37
    const-string v2, " to short; at path "

    .line 38
    .line 39
    invoke-static {p0, v1, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const/4 v1, 0x1

    .line 44
    invoke-virtual {p1, v1}, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世(Z)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-direct {v0, p0}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v0

    .line 59
    :catch_0
    move-exception p0

    .line 60
    new-instance p1, Lcom/google/gson/JsonSyntaxException;

    .line 61
    .line 62
    invoke-direct {p1, p0}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    throw p1
.end method
