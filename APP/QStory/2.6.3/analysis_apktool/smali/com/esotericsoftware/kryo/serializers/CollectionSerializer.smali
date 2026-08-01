.class public Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;
.super Lcom/esotericsoftware/kryo/Serializer;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/esotericsoftware/kryo/serializers/CollectionSerializer$BindCollection;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Ljava/util/Collection;",
        ">",
        "Lcom/esotericsoftware/kryo/Serializer<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private elementClass:Ljava/lang/Class;

.field private elementSerializer:Lcom/esotericsoftware/kryo/Serializer;

.field private elementsCanBeNull:Z


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
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->elementsCanBeNull:Z

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/Serializer;->setAcceptsNull(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public bridge synthetic copy(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 31
    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->copy(Lcom/esotericsoftware/kryo/Kryo;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method public copy(Lcom/esotericsoftware/kryo/Kryo;Ljava/util/Collection;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/Kryo;",
            "TT;)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->createCopy(Lcom/esotericsoftware/kryo/Kryo;Ljava/util/Collection;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1, p0}, Lcom/esotericsoftware/kryo/Kryo;->reference(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/kryo/Kryo;->copy(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {p0, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-object p0
.end method

.method public create(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;I)Ljava/util/Collection;
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
    const-class p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    if-ne p3, p0, :cond_0

    .line 4
    .line 5
    new-instance p0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {p0, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    const-class p0, Ljava/util/HashSet;

    .line 12
    .line 13
    if-ne p3, p0, :cond_1

    .line 14
    .line 15
    new-instance p0, Ljava/util/HashSet;

    .line 16
    .line 17
    int-to-float p1, p4

    .line 18
    const/high16 p2, 0x3f400000    # 0.75f

    .line 19
    .line 20
    div-float/2addr p1, p2

    .line 21
    float-to-int p1, p1

    .line 22
    add-int/lit8 p1, p1, 0x1

    .line 23
    .line 24
    const/16 p2, 0x10

    .line 25
    .line 26
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-direct {p0, p1}, Ljava/util/HashSet;-><init>(I)V

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_1
    invoke-virtual {p1, p3}, Lcom/esotericsoftware/kryo/Kryo;->newInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Ljava/util/Collection;

    .line 39
    .line 40
    instance-of p1, p0, Ljava/util/ArrayList;

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    move-object p1, p0

    .line 45
    check-cast p1, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 48
    .line 49
    .line 50
    :cond_2
    return-object p0
.end method

.method public createCopy(Lcom/esotericsoftware/kryo/Kryo;Ljava/util/Collection;)Ljava/util/Collection;
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
    check-cast p0, Ljava/util/Collection;

    .line 10
    .line 11
    return-object p0
.end method

.method public getElementClass()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->elementClass:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public getElementSerializer()Lcom/esotericsoftware/kryo/Serializer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->elementSerializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 191
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method public read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/util/Collection;
    .locals 7
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
    iget-object v0, p0, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->elementClass:Ljava/lang/Class;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->elementSerializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Kryo;->getGenerics()Lcom/esotericsoftware/kryo/util/Generics;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {v2}, Lcom/esotericsoftware/kryo/util/Generics;->nextGenericClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1, v2}, Lcom/esotericsoftware/kryo/Kryo;->isFinal(Ljava/lang/Class;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, v2}, Lcom/esotericsoftware/kryo/Kryo;->getSerializer(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    move-object v0, v2

    .line 28
    :cond_0
    :try_start_0
    iget-boolean v2, p0, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->elementsCanBeNull:Z

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x0

    .line 32
    const/4 v5, 0x1

    .line 33
    if-eqz v1, :cond_4

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-virtual {p2}, Lcom/esotericsoftware/kryo/io/Input;->readVarIntFlag()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-virtual {p2, v5}, Lcom/esotericsoftware/kryo/io/Input;->readVarIntFlag(Z)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto/16 :goto_7

    .line 48
    .line 49
    :cond_1
    invoke-virtual {p2, v5}, Lcom/esotericsoftware/kryo/io/Input;->readVarInt(Z)I

    .line 50
    .line 51
    .line 52
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    :goto_0
    if-nez v5, :cond_2

    .line 54
    .line 55
    :goto_1
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Kryo;->getGenerics()Lcom/esotericsoftware/kryo/util/Generics;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-interface {p0}, Lcom/esotericsoftware/kryo/util/Generics;->popGenericType()V

    .line 60
    .line 61
    .line 62
    return-object v3

    .line 63
    :cond_2
    add-int/lit8 v5, v5, -0x1

    .line 64
    .line 65
    :try_start_1
    invoke-virtual {p0, p1, p2, p3, v5}, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->create(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;I)Ljava/util/Collection;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p1, p0}, Lcom/esotericsoftware/kryo/Kryo;->reference(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    .line 71
    .line 72
    if-nez v5, :cond_9

    .line 73
    .line 74
    :cond_3
    :goto_2
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Kryo;->getGenerics()Lcom/esotericsoftware/kryo/util/Generics;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-interface {p1}, Lcom/esotericsoftware/kryo/util/Generics;->popGenericType()V

    .line 79
    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_4
    :try_start_2
    invoke-virtual {p2}, Lcom/esotericsoftware/kryo/io/Input;->readVarIntFlag()Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    invoke-virtual {p2, v5}, Lcom/esotericsoftware/kryo/io/Input;->readVarIntFlag(Z)I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-nez v5, :cond_5

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_5
    add-int/lit8 v5, v5, -0x1

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2, p3, v5}, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->create(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;I)Ljava/util/Collection;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p1, p0}, Lcom/esotericsoftware/kryo/Kryo;->reference(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    if-nez v5, :cond_6

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_6
    if-eqz v6, :cond_9

    .line 106
    .line 107
    invoke-virtual {p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->readClass(Lcom/esotericsoftware/kryo/io/Input;)Lcom/esotericsoftware/kryo/Registration;

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    if-nez p3, :cond_8

    .line 112
    .line 113
    :goto_3
    if-ge v4, v5, :cond_7

    .line 114
    .line 115
    invoke-interface {p0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    add-int/lit8 v4, v4, 0x1

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_7
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Kryo;->getGenerics()Lcom/esotericsoftware/kryo/util/Generics;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    invoke-interface {p2}, Lcom/esotericsoftware/kryo/util/Generics;->popGenericType()V

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_8
    invoke-virtual {p3}, Lcom/esotericsoftware/kryo/Registration;->getType()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/kryo/Kryo;->getSerializer(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    if-eqz v2, :cond_9

    .line 138
    .line 139
    invoke-virtual {p2}, Lcom/esotericsoftware/kryo/io/Input;->readBoolean()Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    :cond_9
    if-eqz v1, :cond_b

    .line 144
    .line 145
    if-eqz v2, :cond_a

    .line 146
    .line 147
    :goto_4
    if-ge v4, v5, :cond_3

    .line 148
    .line 149
    invoke-virtual {p1, p2, v0, v1}, Lcom/esotericsoftware/kryo/Kryo;->readObjectOrNull(Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p3

    .line 153
    invoke-interface {p0, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    add-int/lit8 v4, v4, 0x1

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_a
    :goto_5
    if-ge v4, v5, :cond_3

    .line 160
    .line 161
    invoke-virtual {p1, p2, v0, v1}, Lcom/esotericsoftware/kryo/Kryo;->readObject(Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p3

    .line 165
    invoke-interface {p0, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    add-int/lit8 v4, v4, 0x1

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_b
    :goto_6
    if-ge v4, v5, :cond_3

    .line 172
    .line 173
    invoke-virtual {p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->readClassAndObject(Lcom/esotericsoftware/kryo/io/Input;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p3

    .line 177
    invoke-interface {p0, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 178
    .line 179
    .line 180
    add-int/lit8 v4, v4, 0x1

    .line 181
    .line 182
    goto :goto_6

    .line 183
    :goto_7
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Kryo;->getGenerics()Lcom/esotericsoftware/kryo/util/Generics;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-interface {p1}, Lcom/esotericsoftware/kryo/util/Generics;->popGenericType()V

    .line 188
    .line 189
    .line 190
    throw p0
.end method

.method public setElementClass(Ljava/lang/Class;)V
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->elementClass:Ljava/lang/Class;

    return-void
.end method

.method public setElementClass(Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->elementClass:Ljava/lang/Class;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->elementSerializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 4
    .line 5
    return-void
.end method

.method public setElementSerializer(Lcom/esotericsoftware/kryo/Serializer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->elementSerializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 2
    .line 3
    return-void
.end method

.method public setElementsCanBeNull(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->elementsCanBeNull:Z

    .line 2
    .line 3
    return-void
.end method

.method public bridge synthetic write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
    .locals 0

    .line 239
    check-cast p3, Ljava/util/Collection;

    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/util/Collection;)V

    return-void
.end method

.method public write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/util/Collection;)V
    .locals 9
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
    invoke-virtual {p2, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(B)V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-interface {p3}, Ljava/util/Collection;->size()I

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
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->writeHeader(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/util/Collection;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    iget-boolean v3, p0, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->elementsCanBeNull:Z

    .line 23
    .line 24
    iget-object v4, p0, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->elementSerializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 25
    .line 26
    if-nez v4, :cond_2

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Kryo;->getGenerics()Lcom/esotericsoftware/kryo/util/Generics;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-interface {v5}, Lcom/esotericsoftware/kryo/util/Generics;->nextGenericClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    if-eqz v5, :cond_2

    .line 37
    .line 38
    invoke-virtual {p1, v5}, Lcom/esotericsoftware/kryo/Kryo;->isFinal(Ljava/lang/Class;)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-eqz v6, :cond_2

    .line 43
    .line 44
    invoke-virtual {p1, v5}, Lcom/esotericsoftware/kryo/Kryo;->getSerializer(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    :cond_2
    if-eqz v4, :cond_6

    .line 49
    .line 50
    if-eqz v3, :cond_5

    .line 51
    .line 52
    :try_start_0
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eqz v6, :cond_4

    .line 61
    .line 62
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    if-nez v6, :cond_3

    .line 67
    .line 68
    add-int/2addr v1, v2

    .line 69
    invoke-virtual {p2, v2, v1, v2}, Lcom/esotericsoftware/kryo/io/Output;->writeVarIntFlag(ZIZ)I

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception p0

    .line 74
    goto/16 :goto_7

    .line 75
    .line 76
    :cond_4
    add-int/2addr v1, v2

    .line 77
    invoke-virtual {p2, v0, v1, v2}, Lcom/esotericsoftware/kryo/io/Output;->writeVarIntFlag(ZIZ)I

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_5
    add-int/2addr v1, v2

    .line 82
    invoke-virtual {p2, v1, v2}, Lcom/esotericsoftware/kryo/io/Output;->writeVarInt(IZ)I

    .line 83
    .line 84
    .line 85
    :goto_0
    move v0, v3

    .line 86
    :goto_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->writeHeader(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/util/Collection;)V

    .line 87
    .line 88
    .line 89
    move v3, v0

    .line 90
    goto :goto_3

    .line 91
    :cond_6
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    const/4 v6, 0x0

    .line 96
    move v7, v0

    .line 97
    :cond_7
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    if-eqz v8, :cond_a

    .line 102
    .line 103
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    if-nez v8, :cond_8

    .line 108
    .line 109
    move v7, v2

    .line 110
    goto :goto_2

    .line 111
    :cond_8
    if-nez v6, :cond_9

    .line 112
    .line 113
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    goto :goto_2

    .line 118
    :cond_9
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    if-eq v8, v6, :cond_7

    .line 123
    .line 124
    add-int/2addr v1, v2

    .line 125
    invoke-virtual {p2, v0, v1, v2}, Lcom/esotericsoftware/kryo/io/Output;->writeVarIntFlag(ZIZ)I

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->writeHeader(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/util/Collection;)V

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_a
    add-int/2addr v1, v2

    .line 133
    invoke-virtual {p2, v2, v1, v2}, Lcom/esotericsoftware/kryo/io/Output;->writeVarIntFlag(ZIZ)I

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->writeHeader(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/util/Collection;)V

    .line 137
    .line 138
    .line 139
    if-nez v6, :cond_b

    .line 140
    .line 141
    invoke-virtual {p2, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Kryo;->getGenerics()Lcom/esotericsoftware/kryo/util/Generics;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-interface {p0}, Lcom/esotericsoftware/kryo/util/Generics;->popGenericType()V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_b
    :try_start_1
    invoke-virtual {p1, p2, v6}, Lcom/esotericsoftware/kryo/Kryo;->writeClass(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1, v6}, Lcom/esotericsoftware/kryo/Kryo;->getSerializer(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    if-eqz v3, :cond_c

    .line 160
    .line 161
    invoke-virtual {p2, v7}, Lcom/esotericsoftware/kryo/io/Output;->writeBoolean(Z)V

    .line 162
    .line 163
    .line 164
    move v3, v7

    .line 165
    :cond_c
    :goto_3
    if-eqz v4, :cond_e

    .line 166
    .line 167
    if-eqz v3, :cond_d

    .line 168
    .line 169
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result p3

    .line 177
    if-eqz p3, :cond_f

    .line 178
    .line 179
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p3

    .line 183
    invoke-virtual {p1, p2, p3, v4}, Lcom/esotericsoftware/kryo/Kryo;->writeObjectOrNull(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;Lcom/esotericsoftware/kryo/Serializer;)V

    .line 184
    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_d
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result p3

    .line 195
    if-eqz p3, :cond_f

    .line 196
    .line 197
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p3

    .line 201
    invoke-virtual {p1, p2, p3, v4}, Lcom/esotericsoftware/kryo/Kryo;->writeObject(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;Lcom/esotericsoftware/kryo/Serializer;)V

    .line 202
    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_e
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result p3

    .line 213
    if-eqz p3, :cond_f

    .line 214
    .line 215
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p3

    .line 219
    invoke-virtual {p1, p2, p3}, Lcom/esotericsoftware/kryo/Kryo;->writeClassAndObject(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 220
    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_f
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Kryo;->getGenerics()Lcom/esotericsoftware/kryo/util/Generics;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    invoke-interface {p0}, Lcom/esotericsoftware/kryo/util/Generics;->popGenericType()V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :goto_7
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Kryo;->getGenerics()Lcom/esotericsoftware/kryo/util/Generics;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-interface {p1}, Lcom/esotericsoftware/kryo/util/Generics;->popGenericType()V

    .line 236
    .line 237
    .line 238
    throw p0
.end method

.method public writeHeader(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/util/Collection;)V
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
