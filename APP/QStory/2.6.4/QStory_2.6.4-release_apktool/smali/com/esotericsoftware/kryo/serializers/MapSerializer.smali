.class public Lcom/esotericsoftware/kryo/serializers/MapSerializer;
.super Lcom/esotericsoftware/kryo/Serializer;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/esotericsoftware/kryo/serializers/MapSerializer$BindMap;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Ljava/util/Map;",
        ">",
        "Lcom/esotericsoftware/kryo/Serializer<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private keyClass:Ljava/lang/Class;

.field private keySerializer:Lcom/esotericsoftware/kryo/Serializer;

.field private keysCanBeNull:Z

.field private valueClass:Ljava/lang/Class;

.field private valueSerializer:Lcom/esotericsoftware/kryo/Serializer;

.field private valuesCanBeNull:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/Serializer;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->keysCanBeNull:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->valuesCanBeNull:Z

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/Serializer;->setAcceptsNull(Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public bridge synthetic copy(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 46
    check-cast p2, Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->copy(Lcom/esotericsoftware/kryo/Kryo;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public copy(Lcom/esotericsoftware/kryo/Kryo;Ljava/util/Map;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/Kryo;",
            "TT;)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->createCopy(Lcom/esotericsoftware/kryo/Kryo;Ljava/util/Map;)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/util/Map$Entry;

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {p1, v1}, Lcom/esotericsoftware/kryo/Kryo;->copy(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/kryo/Kryo;->copy(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-object p0
.end method

.method public create(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;I)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/Kryo;",
            "Lcom/esotericsoftware/kryo/io/Input;",
            "Ljava/lang/Class<",
            "+TT;>;I)TT;"
        }
    .end annotation

    .line 1
    const-class p0, Ljava/util/HashMap;

    .line 2
    .line 3
    if-ne p3, p0, :cond_2

    .line 4
    .line 5
    const/4 p0, 0x3

    .line 6
    if-ge p4, p0, :cond_0

    .line 7
    .line 8
    add-int/lit8 p4, p4, 0x1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/high16 p0, 0x40000000    # 2.0f

    .line 12
    .line 13
    if-ge p4, p0, :cond_1

    .line 14
    .line 15
    int-to-float p0, p4

    .line 16
    const/high16 p1, 0x3f400000    # 0.75f

    .line 17
    .line 18
    div-float/2addr p0, p1

    .line 19
    const/high16 p1, 0x3f800000    # 1.0f

    .line 20
    .line 21
    add-float/2addr p0, p1

    .line 22
    float-to-int p4, p0

    .line 23
    :cond_1
    :goto_0
    new-instance p0, Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-direct {p0, p4}, Ljava/util/HashMap;-><init>(I)V

    .line 26
    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_2
    invoke-virtual {p1, p3}, Lcom/esotericsoftware/kryo/Kryo;->newInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Ljava/util/Map;

    .line 34
    .line 35
    return-object p0
.end method

.method public createCopy(Lcom/esotericsoftware/kryo/Kryo;Ljava/util/Map;)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/Kryo;",
            "TT;)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1, p0}, Lcom/esotericsoftware/kryo/Kryo;->newInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/util/Map;

    .line 10
    .line 11
    return-object p0
.end method

.method public getKeyClass()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->keyClass:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public getKeySerializer()Lcom/esotericsoftware/kryo/Serializer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->keySerializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 2
    .line 3
    return-object p0
.end method

.method public getValueClass()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->valueClass:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public getValueSerializer()Lcom/esotericsoftware/kryo/Serializer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->valueSerializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 168
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/Kryo;",
            "Lcom/esotericsoftware/kryo/io/Input;",
            "Ljava/lang/Class<",
            "+TT;>;)TT;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p2, v0}, Lcom/esotericsoftware/kryo/io/Input;->readVarInt(Z)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return-object p0

    .line 10
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2, p3, v1}, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->create(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;I)Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    invoke-virtual {p1, p3}, Lcom/esotericsoftware/kryo/Kryo;->reference(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    return-object p3

    .line 22
    :cond_1
    iget-object v2, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->keyClass:Ljava/lang/Class;

    .line 23
    .line 24
    iget-object v3, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->valueClass:Ljava/lang/Class;

    .line 25
    .line 26
    iget-object v4, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->keySerializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 27
    .line 28
    iget-object v5, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->valueSerializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Kryo;->getGenerics()Lcom/esotericsoftware/kryo/util/Generics;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    invoke-interface {v6}, Lcom/esotericsoftware/kryo/util/Generics;->nextGenericTypes()[Lcom/esotericsoftware/kryo/util/Generics$GenericType;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    const/4 v7, 0x0

    .line 39
    if-eqz v6, :cond_3

    .line 40
    .line 41
    if-nez v4, :cond_2

    .line 42
    .line 43
    aget-object v8, v6, v7

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Kryo;->getGenerics()Lcom/esotericsoftware/kryo/util/Generics;

    .line 46
    .line 47
    .line 48
    move-result-object v9

    .line 49
    invoke-virtual {v8, v9}, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->resolve(Lcom/esotericsoftware/kryo/util/Generics;)Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    if-eqz v8, :cond_2

    .line 54
    .line 55
    invoke-virtual {p1, v8}, Lcom/esotericsoftware/kryo/Kryo;->isFinal(Ljava/lang/Class;)Z

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    if-eqz v9, :cond_2

    .line 60
    .line 61
    invoke-virtual {p1, v8}, Lcom/esotericsoftware/kryo/Kryo;->getSerializer(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    move-object v2, v8

    .line 66
    :cond_2
    if-nez v5, :cond_3

    .line 67
    .line 68
    aget-object v0, v6, v0

    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Kryo;->getGenerics()Lcom/esotericsoftware/kryo/util/Generics;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-virtual {v0, v8}, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->resolve(Lcom/esotericsoftware/kryo/util/Generics;)Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/kryo/Kryo;->isFinal(Ljava/lang/Class;)Z

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    if-eqz v8, :cond_3

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/kryo/Kryo;->getSerializer(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    move-object v3, v0

    .line 91
    :cond_3
    move v0, v7

    .line 92
    :goto_0
    if-ge v0, v1, :cond_a

    .line 93
    .line 94
    if-eqz v6, :cond_4

    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Kryo;->getGenerics()Lcom/esotericsoftware/kryo/util/Generics;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    aget-object v9, v6, v7

    .line 101
    .line 102
    invoke-interface {v8, v9}, Lcom/esotericsoftware/kryo/util/Generics;->pushGenericType(Lcom/esotericsoftware/kryo/util/Generics$GenericType;)V

    .line 103
    .line 104
    .line 105
    :cond_4
    if-eqz v4, :cond_6

    .line 106
    .line 107
    iget-boolean v8, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->keysCanBeNull:Z

    .line 108
    .line 109
    if-eqz v8, :cond_5

    .line 110
    .line 111
    invoke-virtual {p1, p2, v2, v4}, Lcom/esotericsoftware/kryo/Kryo;->readObjectOrNull(Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    goto :goto_1

    .line 116
    :cond_5
    invoke-virtual {p1, p2, v2, v4}, Lcom/esotericsoftware/kryo/Kryo;->readObject(Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    goto :goto_1

    .line 121
    :cond_6
    invoke-virtual {p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->readClassAndObject(Lcom/esotericsoftware/kryo/io/Input;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    :goto_1
    if-eqz v6, :cond_7

    .line 126
    .line 127
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Kryo;->getGenerics()Lcom/esotericsoftware/kryo/util/Generics;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    invoke-interface {v9}, Lcom/esotericsoftware/kryo/util/Generics;->popGenericType()V

    .line 132
    .line 133
    .line 134
    :cond_7
    if-eqz v5, :cond_9

    .line 135
    .line 136
    iget-boolean v9, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->valuesCanBeNull:Z

    .line 137
    .line 138
    if-eqz v9, :cond_8

    .line 139
    .line 140
    invoke-virtual {p1, p2, v3, v5}, Lcom/esotericsoftware/kryo/Kryo;->readObjectOrNull(Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v9

    .line 144
    goto :goto_2

    .line 145
    :cond_8
    invoke-virtual {p1, p2, v3, v5}, Lcom/esotericsoftware/kryo/Kryo;->readObject(Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    goto :goto_2

    .line 150
    :cond_9
    invoke-virtual {p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->readClassAndObject(Lcom/esotericsoftware/kryo/io/Input;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v9

    .line 154
    :goto_2
    invoke-interface {p3, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    add-int/lit8 v0, v0, 0x1

    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_a
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Kryo;->getGenerics()Lcom/esotericsoftware/kryo/util/Generics;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-interface {p0}, Lcom/esotericsoftware/kryo/util/Generics;->popGenericType()V

    .line 165
    .line 166
    .line 167
    return-object p3
.end method

.method public setKeyClass(Ljava/lang/Class;)V
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->keyClass:Ljava/lang/Class;

    return-void
.end method

.method public setKeyClass(Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->keyClass:Ljava/lang/Class;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->keySerializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 4
    .line 5
    return-void
.end method

.method public setKeySerializer(Lcom/esotericsoftware/kryo/Serializer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->keySerializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 2
    .line 3
    return-void
.end method

.method public setKeysCanBeNull(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->keysCanBeNull:Z

    .line 2
    .line 3
    return-void
.end method

.method public setValueClass(Ljava/lang/Class;)V
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->valueClass:Ljava/lang/Class;

    return-void
.end method

.method public setValueClass(Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->valueClass:Ljava/lang/Class;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->valueSerializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 4
    .line 5
    return-void
.end method

.method public setValueSerializer(Lcom/esotericsoftware/kryo/Serializer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->valueSerializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 2
    .line 3
    return-void
.end method

.method public setValuesCanBeNull(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->valuesCanBeNull:Z

    .line 2
    .line 3
    return-void
.end method

.method public bridge synthetic write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
    .locals 0

    .line 198
    check-cast p3, Ljava/util/Map;

    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/util/Map;)V

    return-void
.end method

.method public write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/Kryo;",
            "Lcom/esotericsoftware/kryo/io/Output;",
            "TT;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p3, :cond_0

    .line 3
    .line 4
    invoke-virtual {p2, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(I)V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-interface {p3}, Ljava/util/Map;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p2, v2}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->writeHeader(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/util/Map;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    add-int/2addr v1, v2

    .line 23
    invoke-virtual {p2, v1, v2}, Lcom/esotericsoftware/kryo/io/Output;->writeVarInt(IZ)I

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->writeHeader(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/util/Map;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->keySerializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 30
    .line 31
    iget-object v3, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->valueSerializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Kryo;->getGenerics()Lcom/esotericsoftware/kryo/util/Generics;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-interface {v4}, Lcom/esotericsoftware/kryo/util/Generics;->nextGenericTypes()[Lcom/esotericsoftware/kryo/util/Generics$GenericType;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    if-eqz v4, :cond_3

    .line 42
    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    aget-object v5, v4, v0

    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Kryo;->getGenerics()Lcom/esotericsoftware/kryo/util/Generics;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-virtual {v5, v6}, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->resolve(Lcom/esotericsoftware/kryo/util/Generics;)Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    if-eqz v5, :cond_2

    .line 56
    .line 57
    invoke-virtual {p1, v5}, Lcom/esotericsoftware/kryo/Kryo;->isFinal(Ljava/lang/Class;)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_2

    .line 62
    .line 63
    invoke-virtual {p1, v5}, Lcom/esotericsoftware/kryo/Kryo;->getSerializer(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    :cond_2
    if-nez v3, :cond_3

    .line 68
    .line 69
    aget-object v2, v4, v2

    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Kryo;->getGenerics()Lcom/esotericsoftware/kryo/util/Generics;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-virtual {v2, v5}, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->resolve(Lcom/esotericsoftware/kryo/util/Generics;)Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-eqz v2, :cond_3

    .line 80
    .line 81
    invoke-virtual {p1, v2}, Lcom/esotericsoftware/kryo/Kryo;->isFinal(Ljava/lang/Class;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_3

    .line 86
    .line 87
    invoke-virtual {p1, v2}, Lcom/esotericsoftware/kryo/Kryo;->getSerializer(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    :cond_3
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 92
    .line 93
    .line 94
    move-result-object p3

    .line 95
    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_a

    .line 104
    .line 105
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    check-cast v2, Ljava/util/Map$Entry;

    .line 110
    .line 111
    if-eqz v4, :cond_4

    .line 112
    .line 113
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Kryo;->getGenerics()Lcom/esotericsoftware/kryo/util/Generics;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    aget-object v6, v4, v0

    .line 118
    .line 119
    invoke-interface {v5, v6}, Lcom/esotericsoftware/kryo/util/Generics;->pushGenericType(Lcom/esotericsoftware/kryo/util/Generics$GenericType;)V

    .line 120
    .line 121
    .line 122
    :cond_4
    if-eqz v1, :cond_6

    .line 123
    .line 124
    iget-boolean v5, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->keysCanBeNull:Z

    .line 125
    .line 126
    if-eqz v5, :cond_5

    .line 127
    .line 128
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-virtual {p1, p2, v5, v1}, Lcom/esotericsoftware/kryo/Kryo;->writeObjectOrNull(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;Lcom/esotericsoftware/kryo/Serializer;)V

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_5
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    invoke-virtual {p1, p2, v5, v1}, Lcom/esotericsoftware/kryo/Kryo;->writeObject(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;Lcom/esotericsoftware/kryo/Serializer;)V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_6
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    invoke-virtual {p1, p2, v5}, Lcom/esotericsoftware/kryo/Kryo;->writeClassAndObject(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    :goto_1
    if-eqz v4, :cond_7

    .line 152
    .line 153
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Kryo;->getGenerics()Lcom/esotericsoftware/kryo/util/Generics;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    invoke-interface {v5}, Lcom/esotericsoftware/kryo/util/Generics;->popGenericType()V

    .line 158
    .line 159
    .line 160
    :cond_7
    if-eqz v3, :cond_9

    .line 161
    .line 162
    iget-boolean v5, p0, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->valuesCanBeNull:Z

    .line 163
    .line 164
    if-eqz v5, :cond_8

    .line 165
    .line 166
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-virtual {p1, p2, v2, v3}, Lcom/esotericsoftware/kryo/Kryo;->writeObjectOrNull(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;Lcom/esotericsoftware/kryo/Serializer;)V

    .line 171
    .line 172
    .line 173
    goto :goto_0

    .line 174
    :cond_8
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-virtual {p1, p2, v2, v3}, Lcom/esotericsoftware/kryo/Kryo;->writeObject(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;Lcom/esotericsoftware/kryo/Serializer;)V

    .line 179
    .line 180
    .line 181
    goto :goto_0

    .line 182
    :cond_9
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-virtual {p1, p2, v2}, Lcom/esotericsoftware/kryo/Kryo;->writeClassAndObject(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    goto :goto_0

    .line 190
    :cond_a
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Kryo;->getGenerics()Lcom/esotericsoftware/kryo/util/Generics;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-interface {p0}, Lcom/esotericsoftware/kryo/util/Generics;->popGenericType()V

    .line 195
    .line 196
    .line 197
    return-void
.end method

.method public writeHeader(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/Kryo;",
            "Lcom/esotericsoftware/kryo/io/Output;",
            "TT;)V"
        }
    .end annotation

    .line 1
    return-void
.end method
