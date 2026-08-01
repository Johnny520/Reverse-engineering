.class final enum Lcom/google/gson/ToNumberPolicy$3;
.super Lcom/google/gson/ToNumberPolicy;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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

.method private parseAsDouble(Ljava/lang/String;L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏哲兰;)Ljava/lang/Number;
    .locals 5

    .line 1
    const-string p0, "; at path "

    .line 2
    .line 3
    const-string v0, "JSON forbids NaN and infinities: "

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    :try_start_0
    invoke-static {p1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v2}, Ljava/lang/Double;->isInfinite()Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Double;->isNaN()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception v0

    .line 24
    goto :goto_2

    .line 25
    :cond_0
    :goto_0
    iget-object v3, p2, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Lcom/google/gson/Strictness;

    .line 26
    .line 27
    sget-object v4, Lcom/google/gson/Strictness;->LENIENT:Lcom/google/gson/Strictness;

    .line 28
    .line 29
    if-ne v3, v4, :cond_1

    .line 30
    .line 31
    move v3, v1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/4 v3, 0x0

    .line 34
    :goto_1
    if-eqz v3, :cond_3

    .line 35
    .line 36
    :cond_2
    return-object v2

    .line 37
    :cond_3
    new-instance v3, Lcom/google/gson/stream/MalformedJsonException;

    .line 38
    .line 39
    new-instance v4, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, v1}, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世(Z)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-direct {v3, v0}, Lcom/google/gson/stream/MalformedJsonException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    :goto_2
    new-instance v2, Lcom/google/gson/JsonParseException;

    .line 66
    .line 67
    const-string v3, "Cannot parse "

    .line 68
    .line 69
    invoke-static {v3, p1, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p2, v1}, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世(Z)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-direct {v2, p0, v0}, Lcom/google/gson/JsonParseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    throw v2
.end method


# virtual methods
.method public readNumber(L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏哲兰;)Ljava/lang/Number;
    .locals 3

    .line 1
    invoke-virtual {p1}, L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏兰世楪哲()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x2e

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ltz v1, :cond_0

    .line 12
    .line 13
    invoke-direct {p0, v0, p1}, Lcom/google/gson/ToNumberPolicy$3;->parseAsDouble(Ljava/lang/String;L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏哲兰;)Ljava/lang/Number;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    :try_start_0
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 23
    .line 24
    .line 25
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    return-object p0

    .line 27
    :catch_0
    invoke-direct {p0, v0, p1}, Lcom/google/gson/ToNumberPolicy$3;->parseAsDouble(Ljava/lang/String;L飘花落叶言楪哲世兰苏子/飘花落叶言子楪世苏哲兰;)Ljava/lang/Number;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method
