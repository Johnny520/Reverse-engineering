.class public final Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;


# static fields
.field public static final 飘花落叶言子楪世兰哲苏:J

.field public static final 飘花落叶言子楪世兰苏哲:J


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:Ljava/util/function/BiFunction;

.field public final 飘花落叶言子楪世哲苏兰:Ljava/lang/reflect/Type;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Type;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "left"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sput-wide v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:J

    .line 8
    .line 9
    const-string v0, "right"

    .line 10
    .line 11
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sput-wide v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:J

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V
    .locals 1

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Type;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/reflect/Type;

    .line 9
    .line 10
    :try_start_0
    const-string p2, "of"

    .line 11
    .line 12
    filled-new-array {v0, v0}, [Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    invoke-virtual {p1, p2, p3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/reflect/Method;)Ljava/util/function/BiFunction;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/function/BiFunction;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    return-void

    .line 27
    :catch_0
    move-exception p0

    .line 28
    const-string p1, "Pair.of method not found"

    .line 29
    .line 30
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    throw p0
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲世兰苏楪()Z

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
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏世楪兰()Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    const-string p4, "not support input"

    .line 14
    .line 15
    iget-object p5, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Type;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/reflect/Type;

    .line 18
    .line 19
    if-eqz p2, :cond_7

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    move-object v1, p3

    .line 23
    move-object v2, v1

    .line 24
    :goto_0
    const/16 v3, 0x64

    .line 25
    .line 26
    if-ge p2, v3, :cond_8

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰世楪()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/16 v4, 0x3a

    .line 40
    .line 41
    if-eqz v3, :cond_5

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲楪世()J

    .line 44
    .line 45
    .line 46
    move-result-wide v5

    .line 47
    sget-wide v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:J

    .line 48
    .line 49
    cmp-long v3, v5, v7

    .line 50
    .line 51
    if-nez v3, :cond_2

    .line 52
    .line 53
    invoke-virtual {p1, p5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰苏世楪(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    sget-wide v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:J

    .line 59
    .line 60
    cmp-long v3, v5, v7

    .line 61
    .line 62
    if-nez v3, :cond_3

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰苏世楪(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    goto :goto_1

    .line 69
    :cond_3
    if-nez p2, :cond_4

    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {p1, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪兰苏世(C)Z

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰苏世楪(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    goto :goto_1

    .line 83
    :cond_4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世哲兰子()V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_5
    if-nez p2, :cond_6

    .line 88
    .line 89
    invoke-virtual {p1, p5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰苏世楪(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {p1, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪兰苏世(C)Z

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰苏世楪(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    :goto_1
    add-int/lit8 p2, p2, 0x1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_6
    invoke-virtual {p1, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return-object p3

    .line 111
    :cond_7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪世兰苏()Z

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    if-eqz p2, :cond_a

    .line 116
    .line 117
    invoke-virtual {p1, p5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰苏世楪(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰苏世楪(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪世苏兰()Z

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    if-eqz p2, :cond_9

    .line 130
    .line 131
    :cond_8
    :goto_2
    iget-object p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/function/BiFunction;

    .line 132
    .line 133
    invoke-interface {p0, v1, v2}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0

    .line 138
    :cond_9
    invoke-virtual {p1, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-object p3

    .line 146
    :cond_a
    invoke-virtual {p1, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    return-object p3
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲世兰苏楪()Z

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
    const/16 p2, -0x6e

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪兰世苏(B)Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-eqz p2, :cond_2

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子世兰哲()J

    .line 18
    .line 19
    .line 20
    move-result-wide p4

    .line 21
    const-wide v0, 0x4076a3beb3345886L    # 362.2340576214559

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    cmp-long p2, p4, v0

    .line 27
    .line 28
    if-eqz p2, :cond_2

    .line 29
    .line 30
    const-wide v0, -0x26e63497cf3e0856L    # -1.6651998930831493E121

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    cmp-long p2, p4, v0

    .line 36
    .line 37
    if-eqz p2, :cond_2

    .line 38
    .line 39
    const-wide v0, 0x73541298372f80e4L    # 3.508656425431719E247

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    cmp-long p2, p4, v0

    .line 45
    .line 46
    if-nez p2, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const-string p0, "not support inputType : "

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世兰楪哲苏()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object p3

    .line 59
    :cond_2
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏世楪兰()Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    const-string p4, "not support input"

    .line 64
    .line 65
    iget-object p5, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Type;

    .line 66
    .line 67
    iget-object v0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/reflect/Type;

    .line 68
    .line 69
    if-eqz p2, :cond_9

    .line 70
    .line 71
    const/4 p2, 0x0

    .line 72
    move-object v1, p3

    .line 73
    move-object v2, v1

    .line 74
    :goto_1
    const/16 v3, 0x64

    .line 75
    .line 76
    if-ge p2, v3, :cond_a

    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_3

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰世楪()Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_7

    .line 90
    .line 91
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲楪世()J

    .line 92
    .line 93
    .line 94
    move-result-wide v3

    .line 95
    sget-wide v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:J

    .line 96
    .line 97
    cmp-long v5, v3, v5

    .line 98
    .line 99
    if-nez v5, :cond_4

    .line 100
    .line 101
    invoke-virtual {p1, p5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰苏世楪(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    goto :goto_2

    .line 106
    :cond_4
    sget-wide v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:J

    .line 107
    .line 108
    cmp-long v3, v3, v5

    .line 109
    .line 110
    if-nez v3, :cond_5

    .line 111
    .line 112
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰苏世楪(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    goto :goto_2

    .line 117
    :cond_5
    if-nez p2, :cond_6

    .line 118
    .line 119
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰苏世楪(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    goto :goto_2

    .line 128
    :cond_6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世哲兰子()V

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_7
    if-nez p2, :cond_8

    .line 133
    .line 134
    invoke-virtual {p1, p5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰苏世楪(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰苏世楪(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    :goto_2
    add-int/lit8 p2, p2, 0x1

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_8
    invoke-virtual {p1, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    return-object p3

    .line 153
    :cond_9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪兰哲()Z

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    if-eqz p2, :cond_c

    .line 158
    .line 159
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世兰子哲()I

    .line 160
    .line 161
    .line 162
    move-result p2

    .line 163
    const/4 v1, 0x2

    .line 164
    if-ne p2, v1, :cond_b

    .line 165
    .line 166
    invoke-virtual {p1, p5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰苏世楪(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰苏世楪(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    :cond_a
    :goto_3
    iget-object p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/function/BiFunction;

    .line 175
    .line 176
    invoke-interface {p0, v1, v2}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    return-object p0

    .line 181
    :cond_b
    invoke-virtual {p1, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    return-object p3

    .line 189
    :cond_c
    invoke-virtual {p1, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    return-object p3
.end method
