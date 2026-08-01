.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世楪苏兰;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:J

.field public static final 飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世楪苏兰;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    const-class v1, [Z

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世楪苏兰;

    .line 9
    .line 10
    const-string v0, "[Z"

    .line 11
    .line 12
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    sput-wide v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲兰苏:J

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲苏楪世()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 p2, 0x0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪世兰苏()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_4

    .line 14
    .line 15
    const/16 p0, 0x10

    .line 16
    .line 17
    new-array p0, p0, [Z

    .line 18
    .line 19
    const/4 p2, 0x0

    .line 20
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪世苏兰()Z

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    if-nez p3, :cond_3

    .line 25
    .line 26
    add-int/lit8 p3, p2, 0x1

    .line 27
    .line 28
    array-length p4, p0

    .line 29
    sub-int p4, p3, p4

    .line 30
    .line 31
    if-lez p4, :cond_2

    .line 32
    .line 33
    array-length p4, p0

    .line 34
    shr-int/lit8 p5, p4, 0x1

    .line 35
    .line 36
    add-int/2addr p4, p5

    .line 37
    sub-int p5, p4, p3

    .line 38
    .line 39
    if-gez p5, :cond_1

    .line 40
    .line 41
    move p4, p3

    .line 42
    :cond_1
    invoke-static {p0, p4}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲楪苏()Z

    .line 47
    .line 48
    .line 49
    move-result p4

    .line 50
    aput-boolean p4, p0, p2

    .line 51
    .line 52
    move p2, p3

    .line 53
    goto :goto_0

    .line 54
    :cond_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪苏世兰()Z

    .line 55
    .line 56
    .line 57
    invoke-static {p0, p2}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :cond_4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰世楪()Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_6

    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result p3

    .line 76
    if-eqz p3, :cond_5

    .line 77
    .line 78
    :goto_1
    return-object p2

    .line 79
    :cond_5
    const-string p3, "not support input "

    .line 80
    .line 81
    invoke-virtual {p3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-object p2

    .line 93
    :cond_6
    const-string p0, "TODO"

    .line 94
    .line 95
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-object p2
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 2

    .line 1
    const/16 p0, -0x6e

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪兰世苏(B)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 p2, 0x0

    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子世兰哲()J

    .line 11
    .line 12
    .line 13
    move-result-wide p3

    .line 14
    sget-wide v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲兰苏:J

    .line 15
    .line 16
    cmp-long p0, p3, v0

    .line 17
    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string p0, "not support autoType : "

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世兰苏楪哲()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object p2

    .line 31
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世兰子哲()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    const/4 p3, -0x1

    .line 36
    if-ne p0, p3, :cond_2

    .line 37
    .line 38
    return-object p2

    .line 39
    :cond_2
    new-array p2, p0, [Z

    .line 40
    .line 41
    const/4 p3, 0x0

    .line 42
    :goto_1
    if-ge p3, p0, :cond_3

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲楪苏()Z

    .line 45
    .line 46
    .line 47
    move-result p4

    .line 48
    aput-boolean p4, p2, p3

    .line 49
    .line 50
    add-int/lit8 p3, p3, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    return-object p2
.end method
