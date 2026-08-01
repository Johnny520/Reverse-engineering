.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:J

.field public final 飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 7
    .line 8
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    iput-wide p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世哲兰苏:J

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世楪哲兰苏(J)Ljava/lang/Object;
    .locals 0

    .line 1
    const-class p1, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 4
    .line 5
    if-ne p0, p1, :cond_0

    .line 6
    .line 7
    new-instance p0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    const-class p1, Ljava/util/LinkedList;

    .line 14
    .line 15
    if-ne p0, p1, :cond_1

    .line 16
    .line 17
    new-instance p0, Ljava/util/LinkedList;

    .line 18
    .line 19
    invoke-direct {p0}, Ljava/util/LinkedList;-><init>()V

    .line 20
    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    return-object p0

    .line 28
    :catch_0
    const-string p1, "create list error, type "

    .line 29
    .line 30
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰世苏:Z

    .line 2
    .line 3
    iget-object v1, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-wide/16 p4, 0x0

    .line 8
    .line 9
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲苏楪世()Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    const/4 p3, 0x0

    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    return-object p3

    .line 22
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰世楪()Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_4

    .line 27
    .line 28
    iget-wide p2, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 29
    .line 30
    or-long/2addr p2, p4

    .line 31
    invoke-virtual {p0, p2, p3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪哲苏;->飘花落叶言子世楪哲兰苏(J)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Ljava/util/Collection;

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    const/16 p3, 0x2c

    .line 42
    .line 43
    invoke-virtual {p2, p3}, Ljava/lang/String;->indexOf(I)I

    .line 44
    .line 45
    .line 46
    move-result p3

    .line 47
    const/4 p4, -0x1

    .line 48
    if-eq p3, p4, :cond_2

    .line 49
    .line 50
    const-string p3, ","

    .line 51
    .line 52
    invoke-virtual {p2, p3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    const/4 p3, 0x0

    .line 57
    :goto_0
    array-length p4, p2

    .line 58
    if-ge p3, p4, :cond_3

    .line 59
    .line 60
    aget-object p4, p2, p3

    .line 61
    .line 62
    invoke-static {p4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 63
    .line 64
    .line 65
    move-result-wide p4

    .line 66
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object p4

    .line 70
    invoke-interface {p0, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    add-int/lit8 p3, p3, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 77
    .line 78
    .line 79
    move-result-wide p2

    .line 80
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-interface {p0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    :cond_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪苏世兰()Z

    .line 88
    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏世兰楪()Z

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    iget-char v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 96
    .line 97
    const/16 v2, 0x5b

    .line 98
    .line 99
    if-ne v0, v2, :cond_8

    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 102
    .line 103
    .line 104
    if-eqz p2, :cond_5

    .line 105
    .line 106
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 107
    .line 108
    const-class v0, Ljava/util/Collection;

    .line 109
    .line 110
    if-ne p2, v0, :cond_5

    .line 111
    .line 112
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 113
    .line 114
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_5
    iget-wide v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 119
    .line 120
    or-long/2addr p4, v0

    .line 121
    invoke-virtual {p0, p4, p5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪哲苏;->飘花落叶言子世楪哲兰苏(J)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    check-cast p0, Ljava/util/Collection;

    .line 126
    .line 127
    :goto_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世兰哲楪()Z

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    if-nez p2, :cond_7

    .line 132
    .line 133
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪世苏兰()Z

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    if-eqz p2, :cond_6

    .line 138
    .line 139
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪苏世兰()Z

    .line 140
    .line 141
    .line 142
    return-object p0

    .line 143
    :cond_6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世哲兰苏()Ljava/lang/Long;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    invoke-interface {p0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_7
    const-string p0, "illegal input error"

    .line 152
    .line 153
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    return-object p3

    .line 161
    :cond_8
    const-string p0, "format error"

    .line 162
    .line 163
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    return-object p3
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/util/Collection;J)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p2, p3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪哲苏;->飘花落叶言子世楪哲兰苏(J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/util/Collection;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世哲兰楪苏(Ljava/lang/Object;)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-interface {p0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲世兰苏楪()Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    iget-wide v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世哲兰苏:J

    .line 10
    .line 11
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 12
    .line 13
    move-object v0, p1

    .line 14
    move-wide v3, p4

    .line 15
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏哲兰世(JJLjava/lang/Class;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-interface {p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世苏兰哲()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    :cond_1
    const-class p2, Ljava/util/ArrayList;

    .line 26
    .line 27
    if-ne v5, p2, :cond_2

    .line 28
    .line 29
    new-instance p0, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    const-class p2, Lcom/alibaba/fastjson2/JSONArray;

    .line 36
    .line 37
    if-ne v5, p2, :cond_3

    .line 38
    .line 39
    new-instance p0, Lcom/alibaba/fastjson2/JSONArray;

    .line 40
    .line 41
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    if-eqz v5, :cond_4

    .line 46
    .line 47
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 48
    .line 49
    if-eq v5, p2, :cond_4

    .line 50
    .line 51
    invoke-interface {p1, v3, v4}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子世楪哲兰苏(J)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, Ljava/util/Collection;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_4
    iget-object p2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 59
    .line 60
    iget-wide p2, p2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 61
    .line 62
    or-long/2addr p2, v3

    .line 63
    invoke-virtual {p0, p2, p3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪哲苏;->飘花落叶言子世楪哲兰苏(J)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    check-cast p0, Ljava/util/Collection;

    .line 68
    .line 69
    :goto_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世兰子哲()I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    const/4 p3, 0x0

    .line 74
    :goto_1
    if-ge p3, p2, :cond_5

    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世哲兰苏()Ljava/lang/Long;

    .line 77
    .line 78
    .line 79
    move-result-object p4

    .line 80
    invoke-interface {p0, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    add-int/lit8 p3, p3, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_5
    if-eqz p1, :cond_6

    .line 87
    .line 88
    invoke-interface {p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲世苏兰()Ljava/util/function/Function;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    if-eqz p1, :cond_6

    .line 93
    .line 94
    invoke-interface {p1, p0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    check-cast p0, Ljava/util/Collection;

    .line 99
    .line 100
    :cond_6
    return-object p0
.end method
