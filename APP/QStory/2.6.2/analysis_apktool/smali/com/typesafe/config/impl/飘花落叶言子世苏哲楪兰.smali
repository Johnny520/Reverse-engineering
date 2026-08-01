.class public final Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Ljava/lang/String;

.field public final 飘花落叶言子楪世兰苏哲:Ljava/lang/String;

.field public final 飘花落叶言子楪世哲兰苏:Lcom/typesafe/config/impl/OriginType;

.field public final 飘花落叶言子楪世哲苏兰:I

.field public final 飘花落叶言子楪世苏兰哲:I

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/String;

.field public final 飘花落叶言子楪苏世哲兰:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;IILcom/typesafe/config/impl/OriginType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 7
    .line 8
    iput p2, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 9
    .line 10
    iput p3, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:I

    .line 11
    .line 12
    iput-object p4, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Lcom/typesafe/config/impl/OriginType;

    .line 13
    .line 14
    iput-object p5, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p6, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p7, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世哲兰:Ljava/util/List;

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const-string p0, "description may not be null"

    .line 22
    .line 23
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    throw p0
.end method

.method public static 飘花落叶言子楪世兰苏哲(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Lcom/typesafe/config/impl/OriginType;

    .line 2
    .line 3
    iget-object v1, p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Lcom/typesafe/config/impl/OriginType;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    move v0, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget-object v1, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v3, p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_5

    .line 20
    .line 21
    add-int/lit8 v1, v0, 0x1

    .line 22
    .line 23
    iget v3, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 24
    .line 25
    iget v4, p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 26
    .line 27
    if-ne v3, v4, :cond_1

    .line 28
    .line 29
    add-int/lit8 v1, v0, 0x2

    .line 30
    .line 31
    :cond_1
    iget v0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:I

    .line 32
    .line 33
    iget v3, p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:I

    .line 34
    .line 35
    if-ne v0, v3, :cond_2

    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    :cond_2
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v3, p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v0, v3}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    :cond_3
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/String;

    .line 52
    .line 53
    iget-object p1, p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-eqz p0, :cond_4

    .line 60
    .line 61
    add-int/2addr v1, v2

    .line 62
    :cond_4
    return v1

    .line 63
    :cond_5
    return v0
.end method

.method public static 飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;
    .locals 8

    .line 1
    new-instance v0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 2
    .line 3
    sget-object v4, Lcom/typesafe/config/impl/OriginType;->GENERIC:Lcom/typesafe/config/impl/OriginType;

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v7, 0x0

    .line 7
    const/4 v2, -0x1

    .line 8
    const/4 v3, -0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    move-object v1, p0

    .line 11
    invoke-direct/range {v0 .. v7}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;-><init>(Ljava/lang/String;IILcom/typesafe/config/impl/OriginType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static 飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Lcom/typesafe/config/impl/OriginType;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世哲兰:Ljava/util/List;

    .line 8
    .line 9
    iget-object v4, p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Lcom/typesafe/config/impl/OriginType;

    .line 10
    .line 11
    iget-object v5, p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世哲兰:Ljava/util/List;

    .line 12
    .line 13
    if-ne v0, v4, :cond_0

    .line 14
    .line 15
    :goto_0
    move-object v10, v0

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    sget-object v0, Lcom/typesafe/config/impl/OriginType;->GENERIC:Lcom/typesafe/config/impl/OriginType;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :goto_1
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v4, p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 23
    .line 24
    const-string v6, "merge of "

    .line 25
    .line 26
    invoke-virtual {v0, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    const/16 v8, 0x9

    .line 31
    .line 32
    if-eqz v7, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :cond_1
    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    if-eqz v7, :cond_2

    .line 43
    .line 44
    invoke-virtual {v4, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    :cond_2
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_5

    .line 53
    .line 54
    iget v4, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 55
    .line 56
    iget v6, p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 57
    .line 58
    if-gez v4, :cond_3

    .line 59
    .line 60
    move v4, v6

    .line 61
    goto :goto_2

    .line 62
    :cond_3
    if-gez v6, :cond_4

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    :goto_2
    iget p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:I

    .line 70
    .line 71
    iget v6, p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:I

    .line 72
    .line 73
    invoke-static {p0, v6}, Ljava/lang/Math;->max(II)I

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    move v9, p0

    .line 78
    move v8, v4

    .line 79
    :goto_3
    move-object v7, v0

    .line 80
    goto :goto_4

    .line 81
    :cond_5
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p1}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {p0, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-eqz v4, :cond_6

    .line 94
    .line 95
    invoke-virtual {p0, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    :cond_6
    invoke-virtual {v0, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-eqz v4, :cond_7

    .line 104
    .line 105
    invoke-virtual {v0, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    :cond_7
    const-string v4, ","

    .line 110
    .line 111
    invoke-static {v6, p0, v4, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    const/4 v4, -0x1

    .line 116
    move v8, v4

    .line 117
    move v9, v8

    .line 118
    goto :goto_3

    .line 119
    :goto_4
    iget-object p0, p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 120
    .line 121
    invoke-static {v2, p0}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    const/4 v0, 0x0

    .line 126
    if-eqz p0, :cond_8

    .line 127
    .line 128
    move-object v11, v2

    .line 129
    goto :goto_5

    .line 130
    :cond_8
    move-object v11, v0

    .line 131
    :goto_5
    iget-object p0, p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/String;

    .line 132
    .line 133
    invoke-static {v1, p0}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    if-eqz p0, :cond_9

    .line 138
    .line 139
    move-object v12, v1

    .line 140
    goto :goto_6

    .line 141
    :cond_9
    move-object v12, v0

    .line 142
    :goto_6
    invoke-static {v3, v5}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    if-eqz p0, :cond_a

    .line 147
    .line 148
    move-object v13, v3

    .line 149
    goto :goto_7

    .line 150
    :cond_a
    new-instance p0, Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 153
    .line 154
    .line 155
    if-eqz v3, :cond_b

    .line 156
    .line 157
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 158
    .line 159
    .line 160
    :cond_b
    if-eqz v5, :cond_c

    .line 161
    .line 162
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 163
    .line 164
    .line 165
    :cond_c
    move-object v13, p0

    .line 166
    :goto_7
    new-instance v6, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 167
    .line 168
    invoke-direct/range {v6 .. v13}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;-><init>(Ljava/lang/String;IILcom/typesafe/config/impl/OriginType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 169
    .line 170
    .line 171
    return-object v6
.end method

.method public static 飘花落叶言子楪世苏兰哲(Ljava/util/ArrayList;)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_5

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v2, 0x2

    .line 30
    if-ne v0, v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 41
    .line 42
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 47
    .line 48
    invoke-static {v0, p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_2

    .line 71
    .line 72
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;

    .line 77
    .line 78
    check-cast v3, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 79
    .line 80
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-le p0, v2, :cond_4

    .line 89
    .line 90
    invoke-static {v1, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏世哲兰(ILjava/util/ArrayList;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    check-cast p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    sub-int/2addr v3, v1

    .line 101
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    sub-int/2addr v3, v1

    .line 109
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    check-cast v3, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    sub-int/2addr v4, v1

    .line 120
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    sub-int/2addr v4, v1

    .line 128
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    check-cast v4, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    sub-int/2addr v5, v1

    .line 139
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    invoke-static {v4, v3}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)I

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    invoke-static {v3, p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)I

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    if-lt v5, v6, :cond_3

    .line 151
    .line 152
    invoke-static {v4, v3}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-static {v3, p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    goto :goto_2

    .line 161
    :cond_3
    invoke-static {v3, p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-static {v4, p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰(Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    :goto_2
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_4
    invoke-static {v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲(Ljava/util/ArrayList;)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    return-object p0

    .line 178
    :cond_5
    const-string p0, "can\'t merge empty list of origins"

    .line 179
    .line 180
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    const/4 p0, 0x0

    .line 184
    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget v0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 19
    .line 20
    iget v2, p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 21
    .line 22
    if-ne v0, v2, :cond_0

    .line 23
    .line 24
    iget v0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:I

    .line 25
    .line 26
    iget v2, p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:I

    .line 27
    .line 28
    if-ne v0, v2, :cond_0

    .line 29
    .line 30
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Lcom/typesafe/config/impl/OriginType;

    .line 31
    .line 32
    iget-object v2, p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Lcom/typesafe/config/impl/OriginType;

    .line 33
    .line 34
    if-ne v0, v2, :cond_0

    .line 35
    .line 36
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v2, p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v0, v2}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/String;

    .line 47
    .line 48
    iget-object p1, p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_0

    .line 55
    .line 56
    const/4 p0, 0x1

    .line 57
    return p0

    .line 58
    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 2
    .line 3
    const/16 v1, 0x29

    .line 4
    .line 5
    invoke-static {v1, v1, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v2, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 10
    .line 11
    add-int/2addr v0, v2

    .line 12
    mul-int/2addr v0, v1

    .line 13
    iget v2, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:I

    .line 14
    .line 15
    add-int/2addr v0, v2

    .line 16
    mul-int/2addr v0, v1

    .line 17
    iget-object v2, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Lcom/typesafe/config/impl/OriginType;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    add-int/2addr v2, v0

    .line 24
    mul-int/2addr v2, v1

    .line 25
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-static {v2, v1, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    :cond_0
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/String;

    .line 34
    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    invoke-static {v2, v1, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0

    .line 42
    :cond_1
    return v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ConfigOrigin("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 9
    .line 10
    const-string v1, ")"

    .line 11
    .line 12
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/util/EnumMap;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/EnumMap;

    .line 2
    .line 3
    const-class v1, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ORIGIN_DESCRIPTION:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    iget v1, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 16
    .line 17
    if-ltz v1, :cond_0

    .line 18
    .line 19
    sget-object v2, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ORIGIN_LINE_NUMBER:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 20
    .line 21
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v2, v1}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    :cond_0
    iget v1, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:I

    .line 29
    .line 30
    if-ltz v1, :cond_1

    .line 31
    .line 32
    sget-object v2, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ORIGIN_END_LINE_NUMBER:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 33
    .line 34
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v2, v1}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    :cond_1
    sget-object v1, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ORIGIN_TYPE:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 42
    .line 43
    iget-object v2, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Lcom/typesafe/config/impl/OriginType;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v0, v1, v2}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 57
    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    sget-object v2, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ORIGIN_URL:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 61
    .line 62
    invoke-virtual {v0, v2, v1}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    :cond_2
    iget-object v1, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/String;

    .line 66
    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    sget-object v2, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ORIGIN_RESOURCE:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 70
    .line 71
    invoke-virtual {v0, v2, v1}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    :cond_3
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世哲兰:Ljava/util/List;

    .line 75
    .line 76
    if-eqz p0, :cond_4

    .line 77
    .line 78
    sget-object v1, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ORIGIN_COMMENTS:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 79
    .line 80
    invoke-virtual {v0, v1, p0}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    :cond_4
    return-object v0
.end method

.method public final 飘花落叶言子楪世苏哲兰()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 2
    .line 3
    iget v1, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 4
    .line 5
    if-gez v1, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-string v2, ": "

    .line 9
    .line 10
    iget p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:I

    .line 11
    .line 12
    if-ne p0, v1, :cond_1

    .line 13
    .line 14
    new-instance p0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v0, "-"

    .line 48
    .line 49
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世哲兰(I)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;
    .locals 9

    .line 1
    iget v0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:I

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 11
    .line 12
    iget-object v7, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v8, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世哲兰:Ljava/util/List;

    .line 15
    .line 16
    iget-object v2, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v5, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Lcom/typesafe/config/impl/OriginType;

    .line 19
    .line 20
    iget-object v6, p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:Ljava/lang/String;

    .line 21
    .line 22
    move v4, p1

    .line 23
    move v3, p1

    .line 24
    invoke-direct/range {v1 .. v8}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;-><init>(Ljava/lang/String;IILcom/typesafe/config/impl/OriginType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 25
    .line 26
    .line 27
    return-object v1
.end method
