.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世兰苏楪;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:J

.field public static final 飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世兰苏楪;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世兰苏楪;

    .line 2
    .line 3
    const-class v1, Ljava/util/Currency;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世兰苏楪;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世兰苏楪;

    .line 9
    .line 10
    const-string v0, "Currency"

    .line 11
    .line 12
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    sput-wide v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世兰苏楪;->飘花落叶言子楪世哲兰苏:J

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲世兰楪()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    new-instance p0, Lcom/alibaba/fastjson2/JSONObject;

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 10
    .line 11
    .line 12
    const-wide/16 p2, 0x0

    .line 13
    .line 14
    invoke-virtual {p1, p0, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲兰子苏(Ljava/util/Map;J)V

    .line 15
    .line 16
    .line 17
    const-string p1, "currency"

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    const-string p1, "currencyCode"

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :cond_1
    :goto_0
    if-eqz p1, :cond_3

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-static {p1}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 51
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏楪哲兰世()B

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 p2, -0x6e

    .line 6
    .line 7
    const/4 p3, 0x0

    .line 8
    if-ne p0, p2, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子世兰哲()J

    .line 14
    .line 15
    .line 16
    move-result-wide p4

    .line 17
    sget-wide v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世兰苏楪;->飘花落叶言子楪世哲兰苏:J

    .line 18
    .line 19
    cmp-long p0, p4, v0

    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    const-wide v0, -0x6d16400c6daed9eeL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    cmp-long p0, p4, v0

    .line 29
    .line 30
    if-nez p0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string p2, "currency not support input autoTypeClass "

    .line 36
    .line 37
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世兰苏楪哲()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object p3

    .line 59
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-eqz p0, :cond_3

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    invoke-static {p0}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :cond_3
    :goto_1
    return-object p3
.end method
