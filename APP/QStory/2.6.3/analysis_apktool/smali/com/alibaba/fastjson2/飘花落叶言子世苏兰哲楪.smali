.class public final Lcom/alibaba/fastjson2/飘花落叶言子世苏兰哲楪;
.super Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪苏世兰哲:Ljava/lang/String;

.field public final 飘花落叶言子楪苏兰世哲:I

.field public final 飘花落叶言子楪苏兰哲世:Z

.field public final 飘花落叶言子楪苏哲世兰:Ljava/lang/String;

.field public final 飘花落叶言子楪苏哲兰世:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;-><init>(Ljava/lang/String;J)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏世兰哲:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p5, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲世兰:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p6, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲兰世:[Ljava/lang/String;

    .line 9
    .line 10
    iput-boolean p7, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏兰哲世:Z

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    if-eqz p4, :cond_0

    .line 14
    .line 15
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move p2, p1

    .line 21
    :goto_0
    if-eqz p5, :cond_1

    .line 22
    .line 23
    invoke-virtual {p5}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    add-int/2addr p2, p3

    .line 28
    :cond_1
    if-eqz p6, :cond_2

    .line 29
    .line 30
    array-length p3, p6

    .line 31
    :goto_1
    if-ge p1, p3, :cond_2

    .line 32
    .line 33
    aget-object p4, p6, p1

    .line 34
    .line 35
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result p4

    .line 39
    add-int/2addr p2, p4

    .line 40
    add-int/lit8 p1, p1, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    iput p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏兰世哲:I

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    instance-of v0, p1, Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏兰世哲:I

    .line 14
    .line 15
    iget-boolean v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏兰哲世:Z

    .line 16
    .line 17
    if-ge v0, v2, :cond_1

    .line 18
    .line 19
    return v3

    .line 20
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏世兰哲:Ljava/lang/String;

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    return v3

    .line 31
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    goto :goto_0

    .line 36
    :cond_3
    move v0, v1

    .line 37
    :goto_0
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲兰世:[Ljava/lang/String;

    .line 38
    .line 39
    if-eqz v2, :cond_5

    .line 40
    .line 41
    array-length v4, v2

    .line 42
    :goto_1
    if-ge v1, v4, :cond_5

    .line 43
    .line 44
    aget-object v5, v2, v1

    .line 45
    .line 46
    invoke-virtual {p1, v5, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const/4 v6, -0x1

    .line 51
    if-ne v0, v6, :cond_4

    .line 52
    .line 53
    return v3

    .line 54
    :cond_4
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    add-int/2addr v0, v5

    .line 59
    add-int/lit8 v1, v1, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_5
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲世兰:Ljava/lang/String;

    .line 63
    .line 64
    if-eqz p0, :cond_6

    .line 65
    .line 66
    invoke-virtual {p1, p0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-nez p0, :cond_6

    .line 71
    .line 72
    return v3

    .line 73
    :cond_6
    xor-int/lit8 p0, v3, 0x1

    .line 74
    .line 75
    return p0
.end method
