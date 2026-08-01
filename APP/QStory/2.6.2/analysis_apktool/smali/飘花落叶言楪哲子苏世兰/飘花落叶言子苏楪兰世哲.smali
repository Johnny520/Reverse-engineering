.class public L飘花落叶言楪哲子苏世兰/飘花落叶言子苏楪兰世哲;
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
    invoke-virtual {p2}, Ljava/lang/Number;->byteValue()B

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    int-to-long v0, p0

    .line 14
    invoke-virtual {p1, v0, v1}, L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪哲兰苏(J)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;
    .locals 3

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
    invoke-virtual {p1}, L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世()I

    .line 15
    .line 16
    .line 17
    move-result p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    const/16 v0, 0xff

    .line 19
    .line 20
    if-gt p0, v0, :cond_1

    .line 21
    .line 22
    const/16 v0, -0x80

    .line 23
    .line 24
    if-lt p0, v0, :cond_1

    .line 25
    .line 26
    int-to-byte p0, p0

    .line 27
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_1
    new-instance v0, Lcom/google/gson/JsonSyntaxException;

    .line 33
    .line 34
    const-string v1, "Lossy conversion from "

    .line 35
    .line 36
    const-string v2, " to byte; at path "

    .line 37
    .line 38
    invoke-static {p0, v1, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const/4 v1, 0x1

    .line 43
    invoke-virtual {p1, v1}, L飘花落叶言楪哲世子兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰哲世(Z)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-direct {v0, p0}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :catch_0
    move-exception p0

    .line 59
    new-instance p1, Lcom/google/gson/JsonSyntaxException;

    .line 60
    .line 61
    invoke-direct {p1, p0}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    throw p1
.end method
