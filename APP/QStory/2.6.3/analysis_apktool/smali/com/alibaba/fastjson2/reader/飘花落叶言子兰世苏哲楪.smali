.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏哲楪;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;


# instance fields
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
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏哲楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏哲楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世楪哲兰苏(J)Ljava/lang/Object;
    .locals 0

    .line 1
    const-class p1, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏哲楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

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
    .locals 2

    .line 1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰世苏:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide/16 p4, 0x0

    .line 6
    .line 7
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏哲楪;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲苏楪世()Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    const/4 p3, 0x0

    .line 17
    if-eqz p2, :cond_1

    .line 18
    .line 19
    return-object p3

    .line 20
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏世兰楪()Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_2

    .line 25
    .line 26
    new-instance p0, Ljava/util/HashSet;

    .line 27
    .line 28
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    iget-object p2, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 33
    .line 34
    iget-wide v0, p2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 35
    .line 36
    or-long/2addr p4, v0

    .line 37
    invoke-virtual {p0, p4, p5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏哲楪;->飘花落叶言子世楪哲兰苏(J)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Ljava/util/Collection;

    .line 42
    .line 43
    :goto_0
    iget-char p2, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 44
    .line 45
    const/16 p4, 0x5b

    .line 46
    .line 47
    if-ne p2, p4, :cond_4

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 50
    .line 51
    .line 52
    :goto_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪世苏兰()Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    if-nez p2, :cond_7

    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    if-nez p2, :cond_3

    .line 63
    .line 64
    instance-of p3, p0, Ljava/util/SortedSet;

    .line 65
    .line 66
    if-eqz p3, :cond_3

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    invoke-interface {p0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    const/16 p4, 0x22

    .line 74
    .line 75
    if-eq p2, p4, :cond_6

    .line 76
    .line 77
    const/16 p4, 0x27

    .line 78
    .line 79
    if-eq p2, p4, :cond_6

    .line 80
    .line 81
    const/16 p4, 0x7b

    .line 82
    .line 83
    if-ne p2, p4, :cond_5

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_5
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    return-object p3

    .line 94
    :cond_6
    :goto_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    if-eqz p2, :cond_7

    .line 99
    .line 100
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result p3

    .line 104
    if-nez p3, :cond_7

    .line 105
    .line 106
    invoke-interface {p0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    :cond_7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪苏世兰()Z

    .line 110
    .line 111
    .line 112
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/util/Collection;J)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏哲楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-eqz p2, :cond_2

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    if-eqz p3, :cond_1

    .line 18
    .line 19
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    instance-of p3, p3, Ljava/lang/String;

    .line 24
    .line 25
    if-nez p3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return-object p1

    .line 29
    :cond_2
    :goto_0
    const-wide/16 p2, 0x0

    .line 30
    .line 31
    invoke-virtual {p0, p2, p3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏哲楪;->飘花落叶言子世楪哲兰苏(J)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Ljava/util/Collection;

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_5

    .line 46
    .line 47
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    if-eqz p2, :cond_4

    .line 52
    .line 53
    instance-of p3, p2, Ljava/lang/String;

    .line 54
    .line 55
    if-eqz p3, :cond_3

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    invoke-static {p2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-interface {p0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    :goto_2
    invoke-interface {p0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_5
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏哲楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
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
    iget-object v6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏哲楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 10
    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    move-object v1, p1

    .line 14
    move-wide v4, p4

    .line 15
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏哲兰世(JJLjava/lang/Class;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

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
    move-result-object p1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏哲楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 27
    .line 28
    :goto_0
    sget-object p2, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Class;

    .line 29
    .line 30
    const/4 p4, 0x0

    .line 31
    if-ne p1, p2, :cond_3

    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世兰子哲()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    new-array p1, p0, [Ljava/lang/String;

    .line 38
    .line 39
    :goto_1
    if-ge p4, p0, :cond_2

    .line 40
    .line 41
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    aput-object p2, p1, p4

    .line 46
    .line 47
    add-int/lit8 p4, p4, 0x1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :cond_3
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世兰子哲()I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    const-class p5, Ljava/util/ArrayList;

    .line 60
    .line 61
    if-ne p1, p5, :cond_5

    .line 62
    .line 63
    new-instance p0, Ljava/util/ArrayList;

    .line 64
    .line 65
    if-lez p2, :cond_4

    .line 66
    .line 67
    invoke-direct {p0, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_4

    .line 71
    .line 72
    :cond_4
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    .line 75
    goto/16 :goto_4

    .line 76
    .line 77
    :cond_5
    const-class p5, Lcom/alibaba/fastjson2/JSONArray;

    .line 78
    .line 79
    if-ne p1, p5, :cond_7

    .line 80
    .line 81
    new-instance p0, Lcom/alibaba/fastjson2/JSONArray;

    .line 82
    .line 83
    if-lez p2, :cond_6

    .line 84
    .line 85
    invoke-direct {p0, p2}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 86
    .line 87
    .line 88
    goto/16 :goto_4

    .line 89
    .line 90
    :cond_6
    invoke-direct {p0}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 91
    .line 92
    .line 93
    goto/16 :goto_4

    .line 94
    .line 95
    :cond_7
    sget-object p5, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 96
    .line 97
    if-ne p1, p5, :cond_8

    .line 98
    .line 99
    new-instance p0, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 102
    .line 103
    .line 104
    new-instance p3, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲兰楪;

    .line 105
    .line 106
    const/16 p1, 0xd

    .line 107
    .line 108
    invoke-direct {p3, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲兰楪;-><init>(I)V

    .line 109
    .line 110
    .line 111
    goto/16 :goto_4

    .line 112
    .line 113
    :cond_8
    sget-object p5, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Class;

    .line 114
    .line 115
    if-ne p1, p5, :cond_9

    .line 116
    .line 117
    new-instance p0, Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 120
    .line 121
    .line 122
    new-instance p3, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲兰楪;

    .line 123
    .line 124
    const/16 p1, 0xe

    .line 125
    .line 126
    invoke-direct {p3, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲兰楪;-><init>(I)V

    .line 127
    .line 128
    .line 129
    goto/16 :goto_4

    .line 130
    .line 131
    :cond_9
    sget-object p5, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Class;

    .line 132
    .line 133
    if-ne p1, p5, :cond_a

    .line 134
    .line 135
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 136
    .line 137
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 138
    .line 139
    .line 140
    new-instance p3, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲兰楪;

    .line 141
    .line 142
    const/16 p1, 0xf

    .line 143
    .line 144
    invoke-direct {p3, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲兰楪;-><init>(I)V

    .line 145
    .line 146
    .line 147
    goto/16 :goto_4

    .line 148
    .line 149
    :cond_a
    sget-object p5, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Class;

    .line 150
    .line 151
    if-ne p1, p5, :cond_b

    .line 152
    .line 153
    new-instance p0, Ljava/util/TreeSet;

    .line 154
    .line 155
    invoke-direct {p0}, Ljava/util/TreeSet;-><init>()V

    .line 156
    .line 157
    .line 158
    new-instance p3, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲兰楪;

    .line 159
    .line 160
    const/16 p1, 0x10

    .line 161
    .line 162
    invoke-direct {p3, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲兰楪;-><init>(I)V

    .line 163
    .line 164
    .line 165
    goto/16 :goto_4

    .line 166
    .line 167
    :cond_b
    sget-object p5, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪兰苏哲世:Ljava/lang/Class;

    .line 168
    .line 169
    if-ne p1, p5, :cond_c

    .line 170
    .line 171
    new-instance p0, Ljava/util/TreeSet;

    .line 172
    .line 173
    invoke-direct {p0}, Ljava/util/TreeSet;-><init>()V

    .line 174
    .line 175
    .line 176
    new-instance p3, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲兰楪;

    .line 177
    .line 178
    const/16 p1, 0x11

    .line 179
    .line 180
    invoke-direct {p3, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世哲兰楪;-><init>(I)V

    .line 181
    .line 182
    .line 183
    goto/16 :goto_4

    .line 184
    .line 185
    :cond_c
    sget-object p5, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲苏世兰:Ljava/lang/Class;

    .line 186
    .line 187
    if-ne p1, p5, :cond_d

    .line 188
    .line 189
    new-instance p0, Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 192
    .line 193
    .line 194
    new-instance p3, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;

    .line 195
    .line 196
    invoke-direct {p3, p4}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;-><init>(I)V

    .line 197
    .line 198
    .line 199
    goto/16 :goto_4

    .line 200
    .line 201
    :cond_d
    sget-object p5, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/Class;

    .line 202
    .line 203
    const/4 v0, 0x1

    .line 204
    if-ne p1, p5, :cond_e

    .line 205
    .line 206
    new-instance p0, Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 209
    .line 210
    .line 211
    new-instance p3, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;

    .line 212
    .line 213
    invoke-direct {p3, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;-><init>(I)V

    .line 214
    .line 215
    .line 216
    goto/16 :goto_4

    .line 217
    .line 218
    :cond_e
    if-eqz p1, :cond_17

    .line 219
    .line 220
    iget-object p5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏哲楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 221
    .line 222
    if-eq p1, p5, :cond_17

    .line 223
    .line 224
    invoke-virtual {p1}, Ljava/lang/Class;->getTypeName()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    const-string p5, "com.google.common.collect.ImmutableList"

    .line 232
    .line 233
    invoke-virtual {p0, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result p5

    .line 237
    if-nez p5, :cond_16

    .line 238
    .line 239
    const-string p5, "kotlin.collections.EmptyList"

    .line 240
    .line 241
    invoke-virtual {p0, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result p5

    .line 245
    if-nez p5, :cond_15

    .line 246
    .line 247
    const-string p5, "java.util.Collections$EmptySet"

    .line 248
    .line 249
    invoke-virtual {p0, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result p5

    .line 253
    if-nez p5, :cond_14

    .line 254
    .line 255
    const-string p5, "java.util.Collections$EmptyList"

    .line 256
    .line 257
    invoke-virtual {p0, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result p5

    .line 261
    if-nez p5, :cond_13

    .line 262
    .line 263
    const-string p5, "kotlin.collections.EmptySet"

    .line 264
    .line 265
    invoke-virtual {p0, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result p5

    .line 269
    if-nez p5, :cond_12

    .line 270
    .line 271
    const-string p5, "com.google.common.collect.ImmutableSet"

    .line 272
    .line 273
    invoke-virtual {p0, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result p5

    .line 277
    if-nez p5, :cond_11

    .line 278
    .line 279
    const-string p5, "com.google.common.collect.Lists$TransformingRandomAccessList"

    .line 280
    .line 281
    invoke-virtual {p0, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result p5

    .line 285
    if-nez p5, :cond_10

    .line 286
    .line 287
    const-string p5, "com.google.common.collect.Lists.TransformingSequentialList"

    .line 288
    .line 289
    invoke-virtual {p0, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result p0

    .line 293
    if-nez p0, :cond_f

    .line 294
    .line 295
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object p0

    .line 299
    check-cast p0, Ljava/util/Collection;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 300
    .line 301
    goto :goto_4

    .line 302
    :catch_0
    move-exception v0

    .line 303
    :goto_2
    move-object p0, v0

    .line 304
    goto :goto_3

    .line 305
    :catch_1
    move-exception v0

    .line 306
    goto :goto_2

    .line 307
    :goto_3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 308
    .line 309
    const-string p4, "create instance error "

    .line 310
    .line 311
    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 326
    .line 327
    .line 328
    return-object p3

    .line 329
    :cond_f
    new-instance p0, Ljava/util/LinkedList;

    .line 330
    .line 331
    invoke-direct {p0}, Ljava/util/LinkedList;-><init>()V

    .line 332
    .line 333
    .line 334
    goto :goto_4

    .line 335
    :cond_10
    new-instance p0, Ljava/util/ArrayList;

    .line 336
    .line 337
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 338
    .line 339
    .line 340
    goto :goto_4

    .line 341
    :cond_11
    new-instance p0, Ljava/util/ArrayList;

    .line 342
    .line 343
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 344
    .line 345
    .line 346
    new-instance p3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;

    .line 347
    .line 348
    invoke-direct {p3, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;-><init>(I)V

    .line 349
    .line 350
    .line 351
    goto :goto_4

    .line 352
    :cond_12
    invoke-static {p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪哲苏世兰(Ljava/lang/Class;)Ljava/util/Set;

    .line 353
    .line 354
    .line 355
    move-result-object p0

    .line 356
    goto :goto_4

    .line 357
    :cond_13
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 358
    .line 359
    goto :goto_4

    .line 360
    :cond_14
    sget-object p0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 361
    .line 362
    goto :goto_4

    .line 363
    :cond_15
    invoke-static {p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/Class;)Ljava/util/List;

    .line 364
    .line 365
    .line 366
    move-result-object p0

    .line 367
    goto :goto_4

    .line 368
    :cond_16
    new-instance p0, Ljava/util/ArrayList;

    .line 369
    .line 370
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 371
    .line 372
    .line 373
    new-instance p3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;

    .line 374
    .line 375
    invoke-direct {p3, p4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;-><init>(I)V

    .line 376
    .line 377
    .line 378
    goto :goto_4

    .line 379
    :cond_17
    iget-object p1, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 380
    .line 381
    iget-wide v2, p1, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 382
    .line 383
    or-long/2addr v2, v4

    .line 384
    invoke-virtual {p0, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏哲楪;->飘花落叶言子世楪哲兰苏(J)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object p0

    .line 388
    check-cast p0, Ljava/util/Collection;

    .line 389
    .line 390
    :goto_4
    if-ge p4, p2, :cond_18

    .line 391
    .line 392
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object p1

    .line 396
    invoke-interface {p0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    add-int/lit8 p4, p4, 0x1

    .line 400
    .line 401
    goto :goto_4

    .line 402
    :cond_18
    if-eqz p3, :cond_19

    .line 403
    .line 404
    invoke-interface {p3, p0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object p0

    .line 408
    check-cast p0, Ljava/util/Collection;

    .line 409
    .line 410
    :cond_19
    return-object p0
.end method
