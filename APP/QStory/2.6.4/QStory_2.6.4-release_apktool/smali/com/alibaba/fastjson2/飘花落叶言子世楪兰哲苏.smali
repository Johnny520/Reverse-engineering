.class public final Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;
.super Lcom/alibaba/fastjson2/飘花落叶言子世哲兰楪苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Ljava/io/Serializable;

.field public final synthetic 飘花落叶言子楪世苏兰哲:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 39
    invoke-direct {p0}, Lcom/alibaba/fastjson2/飘花落叶言子世哲兰楪苏;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/io/Serializable;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/alibaba/fastjson2/飘花落叶言子世哲兰楪苏;-><init>()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    new-array v1, v0, [Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, [Ljava/lang/String;

    .line 15
    .line 16
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/io/Serializable;

    .line 17
    .line 18
    array-length p1, p1

    .line 19
    new-array v1, p1, [J

    .line 20
    .line 21
    :goto_0
    if-ge v0, p1, :cond_0

    .line 22
    .line 23
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/io/Serializable;

    .line 24
    .line 25
    check-cast v2, [Ljava/lang/String;

    .line 26
    .line 27
    aget-object v2, v2, v0

    .line 28
    .line 29
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    aput-wide v2, v1, v0

    .line 34
    .line 35
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/io/Serializable;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, [Ljava/lang/String;

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "exists(@"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    array-length v2, p0

    .line 19
    if-ge v1, v2, :cond_0

    .line 20
    .line 21
    const/16 v2, 0x2e

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    aget-object v2, p0, v1

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/16 p0, 0x29

    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v1, "?"

    .line 47
    .line 48
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    check-cast p0, Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪世哲苏兰(Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 9
    .line 10
    .line 11
    throw p0

    .line 12
    :pswitch_0
    instance-of p1, p2, Ljava/util/Map;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    check-cast p2, Ljava/util/Map;

    .line 17
    .line 18
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/io/Serializable;

    .line 19
    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-interface {p2, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世()V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    :goto_0
    return p0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/io/Serializable;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, [Ljava/lang/String;

    .line 11
    .line 12
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 20
    .line 21
    :goto_0
    move-object v3, v0

    .line 22
    :goto_1
    array-length v4, p0

    .line 23
    if-ge v2, v4, :cond_4

    .line 24
    .line 25
    aget-object v4, p0, v2

    .line 26
    .line 27
    instance-of v5, v3, Ljava/util/Map;

    .line 28
    .line 29
    if-eqz v5, :cond_3

    .line 30
    .line 31
    check-cast v3, Ljava/util/Map;

    .line 32
    .line 33
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    array-length v4, p0

    .line 38
    add-int/lit8 v4, v4, -0x1

    .line 39
    .line 40
    if-eq v2, v4, :cond_1

    .line 41
    .line 42
    if-nez v3, :cond_3

    .line 43
    .line 44
    :cond_1
    if-eqz v3, :cond_2

    .line 45
    .line 46
    move-object v1, v0

    .line 47
    :cond_2
    iput-object v1, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_4
    :goto_2
    return-void

    .line 54
    :pswitch_0
    check-cast p0, Ljava/lang/String;

    .line 55
    .line 56
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;

    .line 57
    .line 58
    if-nez v0, :cond_5

    .line 59
    .line 60
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_5
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 64
    .line 65
    :goto_3
    new-instance v3, Lcom/alibaba/fastjson2/JSONArray;

    .line 66
    .line 67
    invoke-direct {v3}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 68
    .line 69
    .line 70
    instance-of v4, v0, Ljava/util/List;

    .line 71
    .line 72
    if-eqz v4, :cond_8

    .line 73
    .line 74
    check-cast v0, Ljava/util/List;

    .line 75
    .line 76
    :goto_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-ge v2, v1, :cond_7

    .line 81
    .line 82
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    instance-of v4, v1, Ljava/util/Map;

    .line 87
    .line 88
    if-eqz v4, :cond_6

    .line 89
    .line 90
    move-object v4, v1

    .line 91
    check-cast v4, Ljava/util/Map;

    .line 92
    .line 93
    invoke-interface {v4, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-eqz v5, :cond_6

    .line 98
    .line 99
    invoke-interface {v4, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    if-eqz v4, :cond_6

    .line 104
    .line 105
    invoke-virtual {v3, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_7
    iput-object v3, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 112
    .line 113
    goto :goto_6

    .line 114
    :cond_8
    instance-of v4, v0, Ljava/util/Map;

    .line 115
    .line 116
    if-eqz v4, :cond_a

    .line 117
    .line 118
    move-object v2, v0

    .line 119
    check-cast v2, Ljava/util/Map;

    .line 120
    .line 121
    invoke-interface {v2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    if-eqz p0, :cond_9

    .line 126
    .line 127
    move-object v1, v0

    .line 128
    :cond_9
    iput-object v1, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 129
    .line 130
    goto :goto_6

    .line 131
    :cond_a
    instance-of v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;

    .line 132
    .line 133
    if-eqz v1, :cond_e

    .line 134
    .line 135
    check-cast v0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;

    .line 136
    .line 137
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 138
    .line 139
    :goto_5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-ge v2, v1, :cond_c

    .line 144
    .line 145
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    instance-of v4, v1, Ljava/util/Map;

    .line 150
    .line 151
    if-eqz v4, :cond_b

    .line 152
    .line 153
    move-object v4, v1

    .line 154
    check-cast v4, Ljava/util/Map;

    .line 155
    .line 156
    invoke-interface {v4, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    if-eqz v5, :cond_b

    .line 161
    .line 162
    invoke-interface {v4, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    if-eqz v4, :cond_b

    .line 167
    .line 168
    invoke-virtual {v3, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    :cond_b
    add-int/lit8 v2, v2, 0x1

    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_c
    iget-object p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;

    .line 175
    .line 176
    if-eqz p0, :cond_d

    .line 177
    .line 178
    new-instance p0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;

    .line 179
    .line 180
    invoke-direct {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;-><init>(Ljava/util/List;)V

    .line 181
    .line 182
    .line 183
    iput-object p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 184
    .line 185
    goto :goto_6

    .line 186
    :cond_d
    iput-object v3, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_e
    invoke-static {}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世()V

    .line 190
    .line 191
    .line 192
    :goto_6
    return-void

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;)V
    .locals 0

    .line 1
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
