.class public final Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;


# instance fields
.field public 飘花落叶言子楪哲苏兰世:Ljava/util/TreeMap;


# virtual methods
.method public final bridge synthetic build()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪世苏哲兰()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final buildPartial()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪世苏哲兰()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->newBuilder()Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪哲苏兰世:Ljava/util/TreeMap;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/util/Map$Entry;

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;

    .line 38
    .line 39
    iget-object v3, v0, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪哲苏兰世:Ljava/util/TreeMap;

    .line 40
    .line 41
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;->飘花落叶言子楪世哲苏兰()Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v3, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final mergeFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 19
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪世兰苏哲(Lcom/google/protobuf/ByteString;)V

    return-object p0
.end method

.method public final mergeFrom(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪苏世兰哲(Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;)V

    .line 8
    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    const-string p0, "mergeFrom(MessageLite) can only merge messages of the same type."

    .line 12
    .line 13
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method

.method public final mergeFrom(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 18
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;)V

    return-object p0
.end method

.method public final bridge synthetic mergeFrom([B)Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 20
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪苏哲世兰([B)V

    return-object p0
.end method

.method public final 飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;)V
    .locals 1

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世苏哲兰楪()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, v0, p1}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪世哲兰苏(ILcom/google/protobuf/飘花落叶言子世苏兰哲楪;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    :cond_1
    return-void
.end method

.method public final 飘花落叶言子楪世兰苏哲(Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->newCodedInput()Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;)V

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    invoke-virtual {p1, p0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰(I)V
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catch_0
    move-exception p0

    .line 14
    const-string p1, "Reading from a ByteString threw an IOException (should never happen)."

    .line 15
    .line 16
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catch_1
    move-exception p0

    .line 21
    throw p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(ILcom/google/protobuf/飘花落叶言子世苏兰哲楪;)Z
    .locals 3

    .line 1
    ushr-int/lit8 v0, p1, 0x3

    .line 2
    .line 3
    and-int/lit8 p1, p1, 0x7

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz p1, :cond_9

    .line 7
    .line 8
    if-eq p1, v1, :cond_7

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    if-eq p1, v2, :cond_6

    .line 12
    .line 13
    const/4 v2, 0x3

    .line 14
    if-eq p1, v2, :cond_4

    .line 15
    .line 16
    const/4 v2, 0x4

    .line 17
    if-eq p1, v2, :cond_2

    .line 18
    .line 19
    const/4 v2, 0x5

    .line 20
    if-ne p1, v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪世苏兰哲(I)Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲兰世苏()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    iget-object p2, p0, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;

    .line 31
    .line 32
    iget-object v0, p2, Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;

    .line 33
    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    new-instance v0, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;

    .line 37
    .line 38
    invoke-direct {v0}, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v0, p2, Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;

    .line 42
    .line 43
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;

    .line 44
    .line 45
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;->飘花落叶言子楪世苏兰哲:Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言楪兰哲苏子世;->飘花落叶言子楪世哲兰苏(I)V

    .line 48
    .line 49
    .line 50
    return v1

    .line 51
    :cond_1
    invoke-static {}, Lcom/google/protobuf/InvalidProtocolBufferException;->invalidWireType()Lcom/google/protobuf/InvalidProtocolBufferException$InvalidWireTypeException;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    throw p0

    .line 56
    :cond_2
    iget p0, p2, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏兰哲:I

    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    if-nez p0, :cond_3

    .line 60
    .line 61
    invoke-virtual {p2, p1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰(I)V

    .line 62
    .line 63
    .line 64
    :cond_3
    return p1

    .line 65
    :cond_4
    invoke-static {}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->newBuilder()Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    sget-object v2, Lcom/google/protobuf/飘花落叶言楪苏子世哲兰;->飘花落叶言子楪苏世兰哲:Lcom/google/protobuf/飘花落叶言楪苏子世哲兰;

    .line 70
    .line 71
    invoke-virtual {p2, v0, p1, v2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰世哲苏(ILcom/google/protobuf/飘花落叶言世苏楪兰哲子;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪世苏兰哲(I)Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p1}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪世苏哲兰()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iget-object p2, p0, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;

    .line 83
    .line 84
    iget-object v0, p2, Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;->飘花落叶言子楪世兰苏哲:Ljava/util/List;

    .line 85
    .line 86
    if-nez v0, :cond_5

    .line 87
    .line 88
    new-instance v0, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    iput-object v0, p2, Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;->飘花落叶言子楪世兰苏哲:Ljava/util/List;

    .line 94
    .line 95
    :cond_5
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;

    .line 96
    .line 97
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;->飘花落叶言子楪世兰苏哲:Ljava/util/List;

    .line 98
    .line 99
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    return v1

    .line 103
    :cond_6
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪世苏兰哲(I)Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-virtual {p2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲世兰苏()Lcom/google/protobuf/ByteString;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;->飘花落叶言子楪世苏哲兰(Lcom/google/protobuf/ByteString;)V

    .line 112
    .line 113
    .line 114
    return v1

    .line 115
    :cond_7
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪世苏兰哲(I)Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {p2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲兰苏世()J

    .line 120
    .line 121
    .line 122
    move-result-wide p1

    .line 123
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;

    .line 124
    .line 125
    iget-object v2, v0, Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;

    .line 126
    .line 127
    if-nez v2, :cond_8

    .line 128
    .line 129
    new-instance v2, Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;

    .line 130
    .line 131
    invoke-direct {v2}, Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;-><init>()V

    .line 132
    .line 133
    .line 134
    iput-object v2, v0, Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;

    .line 135
    .line 136
    :cond_8
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;

    .line 137
    .line 138
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;->飘花落叶言子楪世哲苏兰:Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;

    .line 139
    .line 140
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;->飘花落叶言子楪世哲兰苏(J)V

    .line 141
    .line 142
    .line 143
    return v1

    .line 144
    :cond_9
    invoke-virtual {p0, v0}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪世苏兰哲(I)Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-virtual {p2}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰苏哲世()J

    .line 149
    .line 150
    .line 151
    move-result-wide p1

    .line 152
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;

    .line 153
    .line 154
    iget-object v2, v0, Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;

    .line 155
    .line 156
    if-nez v2, :cond_a

    .line 157
    .line 158
    new-instance v2, Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;

    .line 159
    .line 160
    invoke-direct {v2}, Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;-><init>()V

    .line 161
    .line 162
    .line 163
    iput-object v2, v0, Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;

    .line 164
    .line 165
    :cond_a
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;

    .line 166
    .line 167
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;

    .line 168
    .line 169
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;->飘花落叶言子楪世哲兰苏(J)V

    .line 170
    .line 171
    .line 172
    return v1
.end method

.method public final 飘花落叶言子楪世哲苏兰(ILcom/google/protobuf/飘花落叶言苏子兰楪哲世;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪哲苏兰世:Ljava/util/TreeMap;

    .line 2
    .line 3
    const-string v1, " is not a valid field number."

    .line 4
    .line 5
    if-lez p1, :cond_2

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0, v2}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪世苏兰哲(I)Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0, p2}, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    if-lez p1, :cond_1

    .line 26
    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    sget-object p1, Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;->飘花落叶言子楪世兰哲苏:Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;

    .line 32
    .line 33
    new-instance p1, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;

    .line 34
    .line 35
    invoke-direct {p1}, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p2}, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;->飘花落叶言子楪世哲兰苏(Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p0, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    invoke-static {p1, v1}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    invoke-static {p1, v1}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(I)Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪哲苏兰世:Ljava/util/TreeMap;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, v0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    sget-object v0, Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;->飘花落叶言子楪世兰哲苏:Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;

    .line 20
    .line 21
    new-instance v0, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;

    .line 22
    .line 23
    invoke-direct {v0}, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p0, p1, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_1
    return-object v0
.end method

.method public final 飘花落叶言子楪世苏哲兰()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;
    .locals 3

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪哲苏兰世:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->getDefaultInstance()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance v0, Ljava/util/TreeMap;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ljava/util/Map$Entry;

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;

    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;->飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    new-instance p0, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    invoke-direct {p0, v0, v1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;-><init>(Ljava/util/TreeMap;Lcom/google/protobuf/飘花落叶言苏子哲兰楪世;)V

    .line 63
    .line 64
    .line 65
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世兰哲(Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->getDefaultInstance()Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;->access$300(Lcom/google/protobuf/飘花落叶言苏子兰世哲楪;)Ljava/util/TreeMap;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/util/Map$Entry;

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;

    .line 46
    .line 47
    invoke-virtual {p0, v1, v0}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪世哲苏兰(ILcom/google/protobuf/飘花落叶言苏子兰楪哲世;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪苏兰哲世(II)V
    .locals 2

    .line 1
    if-lez p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪世苏兰哲(I)Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    int-to-long p1, p2

    .line 8
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;

    .line 9
    .line 10
    iget-object v1, v0, Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    new-instance v1, Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;

    .line 15
    .line 16
    invoke-direct {v1}, Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;

    .line 20
    .line 21
    :cond_0
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言苏子兰楪世哲;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;

    .line 22
    .line 23
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言苏子兰楪哲世;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;

    .line 24
    .line 25
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言世楪苏子兰哲;->飘花落叶言子楪世哲兰苏(J)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    const-string p0, " is not a valid field number."

    .line 30
    .line 31
    invoke-static {p1, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final 飘花落叶言子楪苏哲世兰([B)V
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世哲兰苏:Lcom/google/protobuf/CodedInputStream$VarintExperiment;

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-static {p1, v1, v0, v1}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏哲世兰([BIIZ)Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言苏子哲兰世楪;->飘花落叶言子楪世兰哲苏(Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v1}, Lcom/google/protobuf/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰(I)V
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catch_0
    move-exception p0

    .line 17
    goto :goto_0

    .line 18
    :catch_1
    move-exception p0

    .line 19
    goto :goto_1

    .line 20
    :goto_0
    const-string p1, "Reading from a byte array threw an IOException (should never happen)."

    .line 21
    .line 22
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :goto_1
    throw p0
.end method
