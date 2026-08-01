.class public abstract Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;


# direct methods
.method public static addAll(Ljava/lang/Iterable;Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "TT;>;",
            "Ljava/util/Collection<",
            "-TT;>;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 224
    check-cast p1, Ljava/util/List;

    invoke-static {p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public static addAll(Ljava/lang/Iterable;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "TT;>;",
            "Ljava/util/List<",
            "-TT;>;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世苏哲兰:[B

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Lcom/google/protobuf/飘花落叶言世楪子苏哲兰;

    .line 7
    .line 8
    if-eqz v0, :cond_4

    .line 9
    .line 10
    check-cast p0, Lcom/google/protobuf/飘花落叶言世楪子苏哲兰;

    .line 11
    .line 12
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言世楪子苏哲兰;->飘花落叶言子楪世哲苏兰()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    move-object v0, p1

    .line 17
    check-cast v0, Lcom/google/protobuf/飘花落叶言世楪子苏哲兰;

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

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
    if-eqz v1, :cond_b

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    new-instance p0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v1, "Element at index "

    .line 42
    .line 43
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    sub-int/2addr v1, p1

    .line 51
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, " is null."

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    add-int/lit8 v1, v1, -0x1

    .line 68
    .line 69
    :goto_1
    if-lt v1, p1, :cond_0

    .line 70
    .line 71
    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    add-int/lit8 v1, v1, -0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_0
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_1
    instance-of v2, v1, Lcom/google/protobuf/ByteString;

    .line 82
    .line 83
    if-eqz v2, :cond_2

    .line 84
    .line 85
    check-cast v1, Lcom/google/protobuf/ByteString;

    .line 86
    .line 87
    invoke-interface {v0, v1}, Lcom/google/protobuf/飘花落叶言世楪子苏哲兰;->飘花落叶言子楪哲兰苏世(Lcom/google/protobuf/ByteString;)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_2
    instance-of v2, v1, [B

    .line 92
    .line 93
    if-eqz v2, :cond_3

    .line 94
    .line 95
    check-cast v1, [B

    .line 96
    .line 97
    invoke-static {v1}, Lcom/google/protobuf/ByteString;->copyFrom([B)Lcom/google/protobuf/ByteString;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-interface {v0, v1}, Lcom/google/protobuf/飘花落叶言世楪子苏哲兰;->飘花落叶言子楪哲兰苏世(Lcom/google/protobuf/ByteString;)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_3
    check-cast v1, Ljava/lang/String;

    .line 106
    .line 107
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_4
    instance-of v0, p0, Lcom/google/protobuf/飘花落叶言世哲楪兰子苏;

    .line 112
    .line 113
    if-eqz v0, :cond_5

    .line 114
    .line 115
    check-cast p0, Ljava/util/Collection;

    .line 116
    .line 117
    invoke-interface {p1, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_5
    instance-of v0, p0, Ljava/util/Collection;

    .line 122
    .line 123
    if-eqz v0, :cond_7

    .line 124
    .line 125
    move-object v0, p0

    .line 126
    check-cast v0, Ljava/util/Collection;

    .line 127
    .line 128
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    instance-of v1, p1, Ljava/util/ArrayList;

    .line 133
    .line 134
    if-eqz v1, :cond_6

    .line 135
    .line 136
    move-object v1, p1

    .line 137
    check-cast v1, Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    add-int/2addr v2, v0

    .line 144
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_6
    instance-of v1, p1, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;

    .line 149
    .line 150
    if-eqz v1, :cond_7

    .line 151
    .line 152
    move-object v1, p1

    .line 153
    check-cast v1, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;

    .line 154
    .line 155
    iget v2, v1, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪哲兰苏世:I

    .line 156
    .line 157
    add-int/2addr v2, v0

    .line 158
    invoke-virtual {v1, v2}, Lcom/google/protobuf/飘花落叶言世哲苏子楪兰;->飘花落叶言子楪世哲兰苏(I)V

    .line 159
    .line 160
    .line 161
    :cond_7
    :goto_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    instance-of v1, p0, Ljava/util/List;

    .line 166
    .line 167
    const/4 v2, 0x0

    .line 168
    if-eqz v1, :cond_9

    .line 169
    .line 170
    instance-of v1, p0, Ljava/util/RandomAccess;

    .line 171
    .line 172
    if-eqz v1, :cond_9

    .line 173
    .line 174
    check-cast p0, Ljava/util/List;

    .line 175
    .line 176
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    const/4 v3, 0x0

    .line 181
    :goto_3
    if-ge v3, v1, :cond_b

    .line 182
    .line 183
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    if-eqz v4, :cond_8

    .line 188
    .line 189
    invoke-interface {p1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    add-int/lit8 v3, v3, 0x1

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_8
    invoke-static {v0, p1}, Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(ILjava/util/List;)V

    .line 196
    .line 197
    .line 198
    throw v2

    .line 199
    :cond_9
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-eqz v1, :cond_b

    .line 208
    .line 209
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    if-eqz v1, :cond_a

    .line 214
    .line 215
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_a
    invoke-static {v0, p1}, Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(ILjava/util/List;)V

    .line 220
    .line 221
    .line 222
    throw v2

    .line 223
    :cond_b
    return-void
.end method

.method public static newUninitializedMessageException(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Lcom/google/protobuf/UninitializedMessageException;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/protobuf/UninitializedMessageException;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/google/protobuf/UninitializedMessageException;-><init>(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static 飘花落叶言子楪世苏兰哲(ILjava/util/List;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Element at index "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    sub-int/2addr v1, p0

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, " is null."

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    add-int/lit8 v1, v1, -0x1

    .line 30
    .line 31
    :goto_0
    if-lt v1, p0, :cond_0

    .line 32
    .line 33
    invoke-interface {p1, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    add-int/lit8 v1, v1, -0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 40
    .line 41
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p0
.end method


# virtual methods
.method public abstract internalMergeFrom(Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;)Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;
.end method

.method public mergeDelimitedFrom(Ljava/io/InputStream;)Z
    .locals 1

    .line 24
    invoke-static {}, Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;->飘花落叶言子楪世苏兰哲()Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;->mergeDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Z

    move-result p0

    return p0
.end method

.method public mergeDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    return v2

    .line 10
    :cond_0
    invoke-static {p1, v0}, Lcom/google/protobuf/飘花落叶言子世苏兰哲楪;->飘花落叶言子世楪哲苏兰(Ljava/io/InputStream;I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    new-instance v1, Lcom/google/protobuf/飘花落叶言子楪世哲苏兰;

    .line 15
    .line 16
    invoke-direct {v1, p1, v0, v2}, Lcom/google/protobuf/飘花落叶言子楪世哲苏兰;-><init>(Ljava/io/InputStream;II)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v1, p2}, Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;->mergeFrom(Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    return p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Lcom/google/protobuf/飘花落叶言世苏楪兰哲子;
    .locals 0

    .line 29
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;->mergeFrom(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;

    move-result-object p0

    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;)Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u54f2\u5b50\u696a\u5170;",
            ")",
            "Lcom/google/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lcom/google/protobuf/飘花落叶言世苏哲子兰楪;->getDefaultInstanceForType()Lcom/google/protobuf/飘花落叶言世苏哲子楪兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p1, Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;->internalMergeFrom(Lcom/google/protobuf/飘花落叶言子楪世兰苏哲;)Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    const-string p0, "mergeFrom(MessageLite) can only merge messages of the same type."

    .line 23
    .line 24
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method

.method public abstract mergeFrom(Ljava/io/InputStream;Lcom/google/protobuf/飘花落叶言楪苏子哲兰世;)Lcom/google/protobuf/飘花落叶言子楪世哲兰苏;
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Reading "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p0, " from a "

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p0, " threw an IOException (should never happen)."

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method
