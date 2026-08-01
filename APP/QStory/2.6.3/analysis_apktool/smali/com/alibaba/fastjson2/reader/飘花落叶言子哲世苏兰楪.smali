.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世苏兰楪;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世兰苏哲:J

.field public static final 飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世苏兰楪;


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Ljava/util/function/Function;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世苏兰楪;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世苏兰楪;-><init>(Ljava/util/function/Function;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世苏兰楪;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世苏兰楪;

    .line 8
    .line 9
    const-string v0, "[C"

    .line 10
    .line 11
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sput-wide v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世苏兰楪;->飘花落叶言子楪世兰苏哲:J

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Ljava/util/function/Function;)V
    .locals 1

    .line 1
    const-class v0, [C

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;-><init>(Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世苏兰楪;->飘花落叶言子楪世哲苏兰:Ljava/util/function/Function;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲苏楪世()Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 p3, 0x0

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    return-object p3

    .line 9
    :cond_0
    iget-char p2, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 10
    .line 11
    const/16 p4, 0x22

    .line 12
    .line 13
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世苏兰楪;->飘花落叶言子楪世哲苏兰:Ljava/util/function/Function;

    .line 14
    .line 15
    if-ne p2, p4, :cond_2

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    invoke-interface {p0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_1
    return-object p1

    .line 33
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪世兰苏()Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_9

    .line 38
    .line 39
    const/16 p2, 0x10

    .line 40
    .line 41
    new-array p2, p2, [C

    .line 42
    .line 43
    const/4 p3, 0x0

    .line 44
    move p4, p3

    .line 45
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪世苏兰()Z

    .line 46
    .line 47
    .line 48
    move-result p5

    .line 49
    if-nez p5, :cond_7

    .line 50
    .line 51
    add-int/lit8 p5, p4, 0x1

    .line 52
    .line 53
    array-length v0, p2

    .line 54
    sub-int v0, p5, v0

    .line 55
    .line 56
    if-lez v0, :cond_4

    .line 57
    .line 58
    array-length v0, p2

    .line 59
    shr-int/lit8 v1, v0, 0x1

    .line 60
    .line 61
    add-int/2addr v0, v1

    .line 62
    sub-int v1, v0, p5

    .line 63
    .line 64
    if-gez v1, :cond_3

    .line 65
    .line 66
    move v0, p5

    .line 67
    :cond_3
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([CI)[C

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    :cond_4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲楪兰世()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_5

    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    int-to-char v0, v0

    .line 82
    aput-char v0, p2, p4

    .line 83
    .line 84
    :goto_1
    move p4, p5

    .line 85
    goto :goto_0

    .line 86
    :cond_5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-nez v0, :cond_6

    .line 91
    .line 92
    move v0, p3

    .line 93
    goto :goto_2

    .line 94
    :cond_6
    invoke-virtual {v0, p3}, Ljava/lang/String;->charAt(I)C

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    :goto_2
    aput-char v0, p2, p4

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪苏世兰()Z

    .line 102
    .line 103
    .line 104
    invoke-static {p2, p4}, Ljava/util/Arrays;->copyOf([CI)[C

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-eqz p0, :cond_8

    .line 109
    .line 110
    invoke-interface {p0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0

    .line 115
    :cond_8
    return-object p1

    .line 116
    :cond_9
    const-string p0, "TODO"

    .line 117
    .line 118
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return-object p3
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 2

    .line 1
    const/16 p2, -0x6e

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪兰世苏(B)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 p3, 0x0

    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子世兰哲()J

    .line 11
    .line 12
    .line 13
    move-result-wide p4

    .line 14
    sget-wide v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世苏兰楪;->飘花落叶言子楪世兰苏哲:J

    .line 15
    .line 16
    cmp-long p2, p4, v0

    .line 17
    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string p0, "not support autoType : "

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世兰楪哲苏()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object p3

    .line 31
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰世楪()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_2

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世兰子哲()I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    const/4 p4, -0x1

    .line 51
    if-ne p2, p4, :cond_3

    .line 52
    .line 53
    return-object p3

    .line 54
    :cond_3
    new-array p3, p2, [C

    .line 55
    .line 56
    const/4 p4, 0x0

    .line 57
    move p5, p4

    .line 58
    :goto_1
    if-ge p5, p2, :cond_5

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲楪兰世()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    int-to-char v0, v0

    .line 71
    aput-char v0, p3, p5

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0, p4}, Ljava/lang/String;->charAt(I)C

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    aput-char v0, p3, p5

    .line 83
    .line 84
    :goto_2
    add-int/lit8 p5, p5, 0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_5
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世苏兰楪;->飘花落叶言子楪世哲苏兰:Ljava/util/function/Function;

    .line 88
    .line 89
    if-eqz p0, :cond_6

    .line 90
    .line 91
    invoke-interface {p0, p3}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    :cond_6
    return-object p3
.end method
