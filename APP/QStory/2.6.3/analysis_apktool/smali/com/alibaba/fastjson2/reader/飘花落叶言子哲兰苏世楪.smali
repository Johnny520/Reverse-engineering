.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰苏世楪;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:J

.field public static final 飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰苏世楪;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰苏世楪;

    .line 2
    .line 3
    const-class v1, [Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰苏世楪;

    .line 9
    .line 10
    const-string v0, "[Integer"

    .line 11
    .line 12
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    sput-wide v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世哲兰苏:J

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 1

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
    if-eqz p0, :cond_5

    .line 14
    .line 15
    const/16 p0, 0x10

    .line 16
    .line 17
    new-array p0, p0, [Ljava/lang/Integer;

    .line 18
    .line 19
    const/4 p3, 0x0

    .line 20
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪世苏兰()Z

    .line 21
    .line 22
    .line 23
    move-result p4

    .line 24
    if-nez p4, :cond_4

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世兰哲楪()Z

    .line 27
    .line 28
    .line 29
    move-result p4

    .line 30
    if-nez p4, :cond_3

    .line 31
    .line 32
    add-int/lit8 p4, p3, 0x1

    .line 33
    .line 34
    array-length p5, p0

    .line 35
    sub-int p5, p4, p5

    .line 36
    .line 37
    if-lez p5, :cond_2

    .line 38
    .line 39
    array-length p5, p0

    .line 40
    shr-int/lit8 v0, p5, 0x1

    .line 41
    .line 42
    add-int/2addr p5, v0

    .line 43
    sub-int v0, p5, p4

    .line 44
    .line 45
    if-gez v0, :cond_1

    .line 46
    .line 47
    move p5, p4

    .line 48
    :cond_1
    invoke-static {p0, p5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, [Ljava/lang/Integer;

    .line 53
    .line 54
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏哲兰()Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object p5

    .line 58
    aput-object p5, p0, p3

    .line 59
    .line 60
    move p3, p4

    .line 61
    goto :goto_0

    .line 62
    :cond_3
    const-string p0, "input end"

    .line 63
    .line 64
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object p2

    .line 72
    :cond_4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪苏世兰()Z

    .line 73
    .line 74
    .line 75
    invoke-static {p0, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :cond_5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰世楪()Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-eqz p0, :cond_7

    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result p3

    .line 94
    if-eqz p3, :cond_6

    .line 95
    .line 96
    :goto_1
    return-object p2

    .line 97
    :cond_6
    const-string p3, "not support input "

    .line 98
    .line 99
    invoke-virtual {p3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return-object p2

    .line 111
    :cond_7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲世楪兰()Z

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    if-eqz p0, :cond_8

    .line 116
    .line 117
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏哲兰()Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    filled-new-array {p0}, [Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0

    .line 126
    :cond_8
    const-string p0, "TODO"

    .line 127
    .line 128
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-object p2
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/util/Collection;J)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    new-array p0, p0, [Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 p2, 0x0

    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    if-eqz p3, :cond_3

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    const/4 v0, 0x0

    .line 23
    if-nez p3, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    instance-of v1, p3, Ljava/lang/Number;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    check-cast p3, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const-class v3, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {v1, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏兰世哲(Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    invoke-interface {v1, p3}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    move-object v0, p3

    .line 62
    check-cast v0, Ljava/lang/Integer;

    .line 63
    .line 64
    :goto_1
    add-int/lit8 p3, p2, 0x1

    .line 65
    .line 66
    aput-object v0, p0, p2

    .line 67
    .line 68
    move p2, p3

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    const-string p1, "can not cast to Integer "

    .line 73
    .line 74
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {p3, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-object v0

    .line 85
    :cond_3
    return-object p0
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
    sget-wide v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世哲兰苏:J

    .line 15
    .line 16
    cmp-long p0, p3, v0

    .line 17
    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    sget-wide v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪世苏哲;->飘花落叶言子楪世兰苏哲:J

    .line 21
    .line 22
    cmp-long p0, p3, v0

    .line 23
    .line 24
    if-nez p0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string p3, "not support type "

    .line 30
    .line 31
    invoke-direct {p0, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世兰楪哲苏()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object p2

    .line 53
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世兰子哲()I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    const/4 p3, -0x1

    .line 58
    if-ne p0, p3, :cond_2

    .line 59
    .line 60
    return-object p2

    .line 61
    :cond_2
    new-array p2, p0, [Ljava/lang/Integer;

    .line 62
    .line 63
    const/4 p3, 0x0

    .line 64
    :goto_1
    if-ge p3, p0, :cond_3

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏哲兰()Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object p4

    .line 70
    aput-object p4, p2, p3

    .line 71
    .line 72
    add-int/lit8 p3, p3, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    return-object p2
.end method
