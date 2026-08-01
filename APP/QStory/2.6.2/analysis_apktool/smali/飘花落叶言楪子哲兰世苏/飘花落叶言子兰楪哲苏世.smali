.class public final L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪哲苏世;
.super L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲苏世楪;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:J

.field public static final 飘花落叶言子楪世哲苏兰:[B

.field public static final 飘花落叶言子楪世苏兰哲:L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪哲苏世;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪哲苏世;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪哲苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪哲苏世;

    .line 7
    .line 8
    const-string v0, "[Integer"

    .line 9
    .line 10
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)[B

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sput-object v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪哲苏世;->飘花落叶言子楪世哲苏兰:[B

    .line 15
    .line 16
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    sput-wide v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪哲苏世;->飘花落叶言子楪世哲兰苏:J

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p1, p2, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世兰苏楪哲(Ljava/lang/Object;Ljava/lang/reflect/Type;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    sget-object p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪哲苏世;->飘花落叶言子楪世哲苏兰:[B

    .line 14
    .line 15
    sget-wide p3, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰楪哲苏世;->飘花落叶言子楪世哲兰苏:J

    .line 16
    .line 17
    invoke-virtual {p1, p3, p4, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏哲兰(J[B)V

    .line 18
    .line 19
    .line 20
    :cond_1
    sget-object p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 21
    .line 22
    iget-wide p3, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 23
    .line 24
    and-long/2addr p3, p5

    .line 25
    const-wide/16 p5, 0x0

    .line 26
    .line 27
    cmp-long p0, p3, p5

    .line 28
    .line 29
    const/4 p3, 0x0

    .line 30
    if-eqz p0, :cond_2

    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    move p0, p3

    .line 35
    :goto_0
    check-cast p2, [Ljava/lang/Integer;

    .line 36
    .line 37
    array-length p4, p2

    .line 38
    invoke-virtual {p1, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰世楪(I)V

    .line 39
    .line 40
    .line 41
    array-length p4, p2

    .line 42
    :goto_1
    if-ge p3, p4, :cond_5

    .line 43
    .line 44
    aget-object p5, p2, p3

    .line 45
    .line 46
    if-nez p5, :cond_3

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_3
    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result p5

    .line 56
    if-eqz p0, :cond_4

    .line 57
    .line 58
    invoke-virtual {p1, p5}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子苏哲兰世(I)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_4
    invoke-virtual {p1, p5}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪苏哲世(I)V

    .line 63
    .line 64
    .line 65
    :goto_2
    add-int/lit8 p3, p3, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_5
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    if-nez p2, :cond_1

    .line 2
    .line 3
    sget-object p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 4
    .line 5
    iget-wide p2, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 6
    .line 7
    sget-object p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullListAsEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 8
    .line 9
    iget-wide p4, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 10
    .line 11
    or-long/2addr p2, p4

    .line 12
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲世苏兰(J)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰楪世()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世哲苏兰()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    sget-object p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 30
    .line 31
    iget-wide p3, p0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 32
    .line 33
    and-long/2addr p3, p5

    .line 34
    const-wide/16 p5, 0x0

    .line 35
    .line 36
    cmp-long p0, p3, p5

    .line 37
    .line 38
    const/4 p3, 0x0

    .line 39
    if-eqz p0, :cond_2

    .line 40
    .line 41
    const/4 p0, 0x1

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move p0, p3

    .line 44
    :goto_0
    check-cast p2, [Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子苏哲兰楪世()V

    .line 47
    .line 48
    .line 49
    :goto_1
    array-length p4, p2

    .line 50
    if-ge p3, p4, :cond_6

    .line 51
    .line 52
    if-eqz p3, :cond_3

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世苏楪兰()V

    .line 55
    .line 56
    .line 57
    :cond_3
    aget-object p4, p2, p3

    .line 58
    .line 59
    if-nez p4, :cond_4

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result p4

    .line 69
    if-eqz p0, :cond_5

    .line 70
    .line 71
    invoke-virtual {p1, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子苏哲兰世(I)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_5
    invoke-virtual {p1, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪苏哲世(I)V

    .line 76
    .line 77
    .line 78
    :goto_2
    add-int/lit8 p3, p3, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世哲苏兰()V

    .line 82
    .line 83
    .line 84
    return-void
.end method
