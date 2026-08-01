.class public final Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;
.super Lcom/google/protobuf/飘花落叶言世苏子哲楪兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪兰世苏哲:Lcom/google/protobuf/飘花落叶言世苏子楪哲兰;

.field public 飘花落叶言子楪哲兰世苏:Ljava/util/Map;

.field public 飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

.field public 飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/飘花落叶言世兰苏哲楪子;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/Map;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 15
    .line 16
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪兰世苏哲:Lcom/google/protobuf/飘花落叶言世苏子楪哲兰;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪世兰苏哲()Ljava/util/Map;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪世兰苏哲()Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p0, p1}, Lcom/google/protobuf/MapFieldLite;->equals(Ljava/util/Map;Ljava/util/Map;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪世兰苏哲()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/google/protobuf/MapFieldLite;->calculateHashCodeForMap(Ljava/util/Map;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/util/List;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iget-object v2, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪兰世苏哲:Lcom/google/protobuf/飘花落叶言世苏子楪哲兰;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    iget-object v3, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-interface {v3}, Ljava/util/Map;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Ljava/util/Map$Entry;

    .line 47
    .line 48
    iget-object v4, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 49
    .line 50
    move-object v5, v2

    .line 51
    check-cast v5, Lcom/google/protobuf/飘花落叶言世兰苏哲楪子;

    .line 52
    .line 53
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    sget-object v6, Lcom/google/protobuf/飘花落叶言世兰哲子楪苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 57
    .line 58
    invoke-virtual {v6}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->toBuilder()Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-virtual {v6, v7}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;->setKey(Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;

    .line 75
    .line 76
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    check-cast v3, Lcom/google/protobuf/飘花落叶言苏楪世兰哲子;

    .line 80
    .line 81
    invoke-static {v3}, Lcom/google/protobuf/飘花落叶言世兰苏哲楪子;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言苏楪世兰哲子;)Lcom/google/protobuf/Value;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v6, v3}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;->setValue(Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v3}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_1
    iput-object v1, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 98
    .line 99
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 100
    .line 101
    return-object p0

    .line 102
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 103
    .line 104
    iget-object v3, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/Map;

    .line 105
    .line 106
    invoke-interface {v3}, Ljava/util/Map;->size()I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 111
    .line 112
    .line 113
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 114
    .line 115
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/Map;

    .line 116
    .line 117
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-eqz v3, :cond_3

    .line 130
    .line 131
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    check-cast v3, Ljava/util/Map$Entry;

    .line 136
    .line 137
    iget-object v4, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 138
    .line 139
    move-object v5, v2

    .line 140
    check-cast v5, Lcom/google/protobuf/飘花落叶言世兰苏哲楪子;

    .line 141
    .line 142
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    sget-object v5, Lcom/google/protobuf/飘花落叶言世兰哲子楪苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 146
    .line 147
    invoke-virtual {v5}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->toBuilder()Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    invoke-virtual {v5, v6}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;->setKey(Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    check-cast v3, Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;

    .line 164
    .line 165
    invoke-virtual {v5, v3}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;->setValue(Ljava/lang/Object;)Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-virtual {v3}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_3
    iput-object v1, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/Map;

    .line 178
    .line 179
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 180
    .line 181
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲()Ljava/util/Map;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/Map;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    iget-object v2, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/Map;

    .line 14
    .line 15
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-direct {v0, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/Map;

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Ljava/util/Map$Entry;

    .line 45
    .line 46
    iget-object v3, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 47
    .line 48
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;

    .line 57
    .line 58
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iput-object v1, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/Map;

    .line 63
    .line 64
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_2
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 68
    .line 69
    iget-object v2, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    invoke-direct {v0, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪苏世哲兰()Ljava/util/ArrayList;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_3

    .line 93
    .line 94
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 99
    .line 100
    iget-object v3, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 101
    .line 102
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->getKey()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    check-cast v2, Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;

    .line 111
    .line 112
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_3
    iput-object v1, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 117
    .line 118
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 119
    .line 120
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲兰苏()Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪世兰哲苏()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪兰世苏哲:Lcom/google/protobuf/飘花落叶言世苏子楪哲兰;

    .line 2
    .line 3
    check-cast p0, Lcom/google/protobuf/飘花落叶言世兰苏哲楪子;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object p0, Lcom/google/protobuf/飘花落叶言世兰哲子楪苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 9
    .line 10
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪世兰哲苏()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世兰哲()Ljava/util/Map;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/Map;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Ljava/util/Map$Entry;

    .line 42
    .line 43
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;

    .line 52
    .line 53
    iget-object v4, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪兰世苏哲:Lcom/google/protobuf/飘花落叶言世苏子楪哲兰;

    .line 54
    .line 55
    check-cast v4, Lcom/google/protobuf/飘花落叶言世兰苏哲楪子;

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    check-cast v2, Lcom/google/protobuf/飘花落叶言苏楪世兰哲子;

    .line 61
    .line 62
    invoke-static {v2}, Lcom/google/protobuf/飘花落叶言世兰苏哲楪子;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/飘花落叶言苏楪世兰哲子;)Lcom/google/protobuf/Value;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    return-object v0

    .line 71
    :cond_2
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 72
    .line 73
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪苏世哲兰()Ljava/util/ArrayList;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_3

    .line 95
    .line 96
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    check-cast v1, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 101
    .line 102
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->getKey()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    check-cast v1, Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;

    .line 111
    .line 112
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_3
    return-object v0
.end method

.method public final 飘花落叶言子楪苏世哲兰()Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪兰世苏哲:Lcom/google/protobuf/飘花落叶言世苏子楪哲兰;

    .line 13
    .line 14
    check-cast v1, Lcom/google/protobuf/飘花落叶言世兰苏哲楪子;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    sget-object v2, Lcom/google/protobuf/飘花落叶言世兰哲子楪苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 20
    .line 21
    invoke-virtual {v2}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lcom/google/protobuf/飘花落叶言世苏哲楪兰子;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世苏子楪兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;

    .line 48
    .line 49
    move-object v4, v3

    .line 50
    check-cast v4, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 51
    .line 52
    invoke-virtual {v4}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-virtual {v2, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_0

    .line 61
    .line 62
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    sget-object v4, Lcom/google/protobuf/飘花落叶言世兰哲子楪苏;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 70
    .line 71
    invoke-virtual {v4}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;->toBuilder()Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v4, v3}, Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏楪哲子兰;)Lcom/google/protobuf/飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;

    .line 80
    .line 81
    invoke-virtual {v3}, Lcom/google/protobuf/飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰;->build()Lcom/google/protobuf/飘花落叶言世楪哲子苏兰;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    return-object v0
.end method
