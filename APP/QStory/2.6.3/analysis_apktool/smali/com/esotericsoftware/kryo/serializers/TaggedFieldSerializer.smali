.class public Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer;
.super Lcom/esotericsoftware/kryo/serializers/FieldSerializer;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer$TaggedFieldSerializerConfig;,
        Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer$Tag;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/esotericsoftware/kryo/serializers/FieldSerializer<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final config:Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer$TaggedFieldSerializerConfig;

.field private readTags:Lcom/esotericsoftware/kryo/util/IntMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/esotericsoftware/kryo/util/IntMap<",
            "Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;",
            ">;"
        }
    .end annotation
.end field

.field private writeTags:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;


# direct methods
.method public constructor <init>(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Class;)V
    .locals 1

    .line 11
    new-instance v0, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer$TaggedFieldSerializerConfig;

    invoke-direct {v0}, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer$TaggedFieldSerializerConfig;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer;-><init>(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Class;Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer$TaggedFieldSerializerConfig;)V

    return-void
.end method

.method public constructor <init>(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Class;Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer$TaggedFieldSerializerConfig;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;-><init>(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Class;Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer;->config:Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer$TaggedFieldSerializerConfig;

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/Serializer;->setAcceptsNull(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public getTaggedFieldSerializerConfig()Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer$TaggedFieldSerializerConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer;->config:Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer$TaggedFieldSerializerConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public initializeCachedFields()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->cachedFields:Lcom/esotericsoftware/kryo/serializers/CachedFields;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->fields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    const-class v4, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer$Tag;

    .line 9
    .line 10
    if-ge v3, v1, :cond_2

    .line 11
    .line 12
    aget-object v5, v0, v3

    .line 13
    .line 14
    iget-object v5, v5, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->field:Ljava/lang/reflect/Field;

    .line 15
    .line 16
    invoke-virtual {v5, v4}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    if-nez v4, :cond_1

    .line 21
    .line 22
    sget-boolean v4, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 23
    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    new-instance v4, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v5, "Ignoring field without tag: "

    .line 29
    .line 30
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    aget-object v5, v0, v3

    .line 34
    .line 35
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    const-string v5, "kryo"

    .line 43
    .line 44
    invoke-static {v5, v4}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    aget-object v4, v0, v3

    .line 48
    .line 49
    invoke-super {p0, v4}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->removeField(Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    iget-object v0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->cachedFields:Lcom/esotericsoftware/kryo/serializers/CachedFields;

    .line 56
    .line 57
    iget-object v0, v0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->fields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 58
    .line 59
    new-instance v1, Ljava/util/ArrayList;

    .line 60
    .line 61
    array-length v3, v0

    .line 62
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 63
    .line 64
    .line 65
    new-instance v3, Lcom/esotericsoftware/kryo/util/IntMap;

    .line 66
    .line 67
    array-length v5, v0

    .line 68
    int-to-float v5, v5

    .line 69
    const v6, 0x3f4ccccd    # 0.8f

    .line 70
    .line 71
    .line 72
    div-float/2addr v5, v6

    .line 73
    float-to-int v5, v5

    .line 74
    invoke-direct {v3, v5}, Lcom/esotericsoftware/kryo/util/IntMap;-><init>(I)V

    .line 75
    .line 76
    .line 77
    iput-object v3, p0, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer;->readTags:Lcom/esotericsoftware/kryo/util/IntMap;

    .line 78
    .line 79
    array-length v3, v0

    .line 80
    :goto_1
    if-ge v2, v3, :cond_5

    .line 81
    .line 82
    aget-object v5, v0, v2

    .line 83
    .line 84
    iget-object v6, v5, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->field:Ljava/lang/reflect/Field;

    .line 85
    .line 86
    invoke-virtual {v6, v4}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    check-cast v7, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer$Tag;

    .line 91
    .line 92
    invoke-interface {v7}, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer$Tag;->value()I

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    iget-object v8, p0, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer;->readTags:Lcom/esotericsoftware/kryo/util/IntMap;

    .line 97
    .line 98
    invoke-virtual {v8, v7}, Lcom/esotericsoftware/kryo/util/IntMap;->containsKey(I)Z

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    if-nez v8, :cond_4

    .line 103
    .line 104
    iget-object v8, p0, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer;->readTags:Lcom/esotericsoftware/kryo/util/IntMap;

    .line 105
    .line 106
    invoke-virtual {v8, v7, v5}, Lcom/esotericsoftware/kryo/util/IntMap;->put(ILjava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    const-class v8, Ljava/lang/Deprecated;

    .line 110
    .line 111
    invoke-virtual {v6, v8}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    if-nez v6, :cond_3

    .line 116
    .line 117
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    :cond_3
    iput v7, v5, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->tag:I

    .line 121
    .line 122
    add-int/lit8 v2, v2, 0x1

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    new-instance p0, Lcom/esotericsoftware/kryo/KryoException;

    .line 126
    .line 127
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    filled-new-array {v0, v6, v1}, [Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    const-string v1, "Duplicate tag %d on fields: %s and %s"

    .line 140
    .line 141
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw p0

    .line 149
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    new-array v0, v0, [Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 154
    .line 155
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    check-cast v0, [Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 160
    .line 161
    iput-object v0, p0, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer;->writeTags:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 162
    .line 163
    return-void
.end method

.method public read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 22
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
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    const-string v4, "#"

    .line 8
    .line 9
    const-string v5, "Unable to read unknown tag "

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    invoke-virtual {v3, v6}, Lcom/esotericsoftware/kryo/io/Input;->readVarInt(Z)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v7, 0x0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    return-object v7

    .line 20
    :cond_0
    add-int/lit8 v8, v0, -0x1

    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->pushTypeVariables()I

    .line 23
    .line 24
    .line 25
    move-result v9

    .line 26
    invoke-virtual/range {p0 .. p3}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->create(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v10

    .line 30
    invoke-virtual {v2, v10}, Lcom/esotericsoftware/kryo/Kryo;->reference(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, v1, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer;->config:Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer$TaggedFieldSerializerConfig;

    .line 34
    .line 35
    iget-boolean v11, v0, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer$TaggedFieldSerializerConfig;->chunked:Z

    .line 36
    .line 37
    iget-boolean v12, v0, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer$TaggedFieldSerializerConfig;->readUnknownTagData:Z

    .line 38
    .line 39
    if-eqz v11, :cond_1

    .line 40
    .line 41
    new-instance v7, Lcom/esotericsoftware/kryo/io/InputChunked;

    .line 42
    .line 43
    iget-object v0, v1, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer;->config:Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer$TaggedFieldSerializerConfig;

    .line 44
    .line 45
    iget v0, v0, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer$TaggedFieldSerializerConfig;->chunkSize:I

    .line 46
    .line 47
    invoke-direct {v7, v3, v0}, Lcom/esotericsoftware/kryo/io/InputChunked;-><init>(Ljava/io/InputStream;I)V

    .line 48
    .line 49
    .line 50
    move-object v13, v7

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move-object v13, v7

    .line 53
    move-object v7, v3

    .line 54
    :goto_0
    iget-object v14, v1, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer;->readTags:Lcom/esotericsoftware/kryo/util/IntMap;

    .line 55
    .line 56
    const/4 v15, 0x0

    .line 57
    :goto_1
    if-ge v15, v8, :cond_11

    .line 58
    .line 59
    move/from16 v16, v8

    .line 60
    .line 61
    invoke-virtual {v3, v6}, Lcom/esotericsoftware/kryo/io/Input;->readVarInt(Z)I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    invoke-virtual {v14, v8}, Lcom/esotericsoftware/kryo/util/IntMap;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    move-object v6, v0

    .line 70
    check-cast v6, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 71
    .line 72
    const-string v3, " ("

    .line 73
    .line 74
    move/from16 v17, v11

    .line 75
    .line 76
    const-string v11, ")"

    .line 77
    .line 78
    move/from16 v18, v12

    .line 79
    .line 80
    const-string v12, "kryo"

    .line 81
    .line 82
    if-eqz v18, :cond_b

    .line 83
    .line 84
    :try_start_0
    invoke-virtual {v2, v7}, Lcom/esotericsoftware/kryo/Kryo;->readClass(Lcom/esotericsoftware/kryo/io/Input;)Lcom/esotericsoftware/kryo/Registration;

    .line 85
    .line 86
    .line 87
    move-result-object v0
    :try_end_0
    .catch Lcom/esotericsoftware/kryo/KryoException; {:try_start_0 .. :try_end_0} :catch_1

    .line 88
    if-nez v0, :cond_4

    .line 89
    .line 90
    if-eqz v17, :cond_2

    .line 91
    .line 92
    invoke-virtual {v13}, Lcom/esotericsoftware/kryo/io/InputChunked;->nextChunk()V

    .line 93
    .line 94
    .line 95
    :cond_2
    move-object/from16 v19, v13

    .line 96
    .line 97
    move-object/from16 v20, v14

    .line 98
    .line 99
    move/from16 v21, v15

    .line 100
    .line 101
    :cond_3
    :goto_2
    const/4 v14, 0x0

    .line 102
    goto/16 :goto_6

    .line 103
    .line 104
    :cond_4
    move-object/from16 v19, v13

    .line 105
    .line 106
    invoke-virtual {v0}, Lcom/esotericsoftware/kryo/Registration;->getType()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object v13

    .line 110
    if-nez v6, :cond_8

    .line 111
    .line 112
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 113
    .line 114
    move-object/from16 v20, v14

    .line 115
    .line 116
    const-string v14, " data, type: "

    .line 117
    .line 118
    if-eqz v0, :cond_5

    .line 119
    .line 120
    const-string v0, "Read unknown tag "

    .line 121
    .line 122
    invoke-static {v8, v0, v14}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    move/from16 v21, v15

    .line 127
    .line 128
    invoke-static {v13}, Lcom/esotericsoftware/kryo/util/Util;->className(Ljava/lang/Class;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v15

    .line 132
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-static {v12, v0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_5
    move/from16 v21, v15

    .line 144
    .line 145
    :goto_3
    :try_start_1
    invoke-virtual {v2, v7, v13}, Lcom/esotericsoftware/kryo/Kryo;->readObject(Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;
    :try_end_1
    .catch Lcom/esotericsoftware/kryo/KryoException; {:try_start_1 .. :try_end_1} :catch_0

    .line 146
    .line 147
    .line 148
    goto :goto_4

    .line 149
    :catch_0
    move-exception v0

    .line 150
    invoke-static {v8, v5, v14}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    invoke-static {v13}, Lcom/esotericsoftware/kryo/util/Util;->className(Ljava/lang/Class;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v13

    .line 158
    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->getType()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    if-eqz v17, :cond_7

    .line 189
    .line 190
    sget-boolean v6, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 191
    .line 192
    if-eqz v6, :cond_6

    .line 193
    .line 194
    invoke-static {v12, v3, v0}, Lcom/esotericsoftware/minlog/Log;->debug(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 195
    .line 196
    .line 197
    :cond_6
    :goto_4
    if-eqz v17, :cond_3

    .line 198
    .line 199
    invoke-virtual/range {v19 .. v19}, Lcom/esotericsoftware/kryo/io/InputChunked;->nextChunk()V

    .line 200
    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_7
    new-instance v1, Lcom/esotericsoftware/kryo/KryoException;

    .line 204
    .line 205
    invoke-direct {v1, v3, v0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 206
    .line 207
    .line 208
    throw v1

    .line 209
    :cond_8
    move-object/from16 v20, v14

    .line 210
    .line 211
    move/from16 v21, v15

    .line 212
    .line 213
    const/4 v14, 0x0

    .line 214
    invoke-virtual {v6, v14}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->setCanBeNull(Z)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v6, v13}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->setValueClass(Ljava/lang/Class;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v6, v14}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->setReuseSerializer(Z)V

    .line 221
    .line 222
    .line 223
    goto/16 :goto_5

    .line 224
    .line 225
    :catch_1
    move-exception v0

    .line 226
    move-object/from16 v19, v13

    .line 227
    .line 228
    move-object/from16 v20, v14

    .line 229
    .line 230
    move/from16 v21, v15

    .line 231
    .line 232
    const/4 v14, 0x0

    .line 233
    const-string v3, " data (unknown type). ("

    .line 234
    .line 235
    invoke-static {v8, v5, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-virtual {v1}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->getType()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    move-result-object v8

    .line 243
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v8

    .line 247
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    if-eqz v17, :cond_a

    .line 264
    .line 265
    sget-boolean v6, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 266
    .line 267
    if-eqz v6, :cond_9

    .line 268
    .line 269
    invoke-static {v12, v3, v0}, Lcom/esotericsoftware/minlog/Log;->debug(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 270
    .line 271
    .line 272
    :cond_9
    invoke-virtual/range {v19 .. v19}, Lcom/esotericsoftware/kryo/io/InputChunked;->nextChunk()V

    .line 273
    .line 274
    .line 275
    goto :goto_6

    .line 276
    :cond_a
    new-instance v1, Lcom/esotericsoftware/kryo/KryoException;

    .line 277
    .line 278
    invoke-direct {v1, v3, v0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 279
    .line 280
    .line 281
    throw v1

    .line 282
    :cond_b
    move-object/from16 v19, v13

    .line 283
    .line 284
    move-object/from16 v20, v14

    .line 285
    .line 286
    move/from16 v21, v15

    .line 287
    .line 288
    const/4 v14, 0x0

    .line 289
    if-nez v6, :cond_e

    .line 290
    .line 291
    if-eqz v17, :cond_d

    .line 292
    .line 293
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 294
    .line 295
    if-eqz v0, :cond_c

    .line 296
    .line 297
    new-instance v0, Ljava/lang/StringBuilder;

    .line 298
    .line 299
    const-string v3, "Skip unknown field tag: "

    .line 300
    .line 301
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-static {v12, v0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    :cond_c
    invoke-virtual/range {v19 .. v19}, Lcom/esotericsoftware/kryo/io/InputChunked;->nextChunk()V

    .line 315
    .line 316
    .line 317
    goto :goto_6

    .line 318
    :cond_d
    new-instance v0, Lcom/esotericsoftware/kryo/KryoException;

    .line 319
    .line 320
    const-string v2, "Unknown field tag: "

    .line 321
    .line 322
    invoke-static {v8, v2, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-virtual {v1}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->getType()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    invoke-direct {v0, v1}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    throw v0

    .line 348
    :cond_e
    :goto_5
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 349
    .line 350
    if-eqz v0, :cond_f

    .line 351
    .line 352
    const-string v0, "Read"

    .line 353
    .line 354
    invoke-virtual/range {p2 .. p2}, Lcom/esotericsoftware/kryo/io/Input;->position()I

    .line 355
    .line 356
    .line 357
    move-result v3

    .line 358
    invoke-virtual {v1, v0, v6, v3}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->log(Ljava/lang/String;Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;I)V

    .line 359
    .line 360
    .line 361
    :cond_f
    invoke-virtual {v6, v7, v10}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->read(Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    if-eqz v17, :cond_10

    .line 365
    .line 366
    invoke-virtual/range {v19 .. v19}, Lcom/esotericsoftware/kryo/io/InputChunked;->nextChunk()V

    .line 367
    .line 368
    .line 369
    :cond_10
    :goto_6
    add-int/lit8 v15, v21, 0x1

    .line 370
    .line 371
    move-object/from16 v3, p2

    .line 372
    .line 373
    move/from16 v8, v16

    .line 374
    .line 375
    move/from16 v11, v17

    .line 376
    .line 377
    move/from16 v12, v18

    .line 378
    .line 379
    move-object/from16 v13, v19

    .line 380
    .line 381
    move-object/from16 v14, v20

    .line 382
    .line 383
    const/4 v6, 0x1

    .line 384
    goto/16 :goto_1

    .line 385
    .line 386
    :cond_11
    invoke-virtual {v1, v9}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->popTypeVariables(I)V

    .line 387
    .line 388
    .line 389
    return-object v10
.end method

.method public removeField(Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;)V
    .locals 0

    .line 8
    invoke-super {p0, p1}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->removeField(Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;)V

    .line 9
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer;->initializeCachedFields()V

    return-void
.end method

.method public removeField(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->removeField(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer;->initializeCachedFields()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/Kryo;",
            "Lcom/esotericsoftware/kryo/io/Output;",
            "TT;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1, v3}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(B)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {v0}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->pushTypeVariables()I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    iget-object v5, v0, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer;->writeTags:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 19
    .line 20
    array-length v6, v5

    .line 21
    const/4 v7, 0x1

    .line 22
    add-int/2addr v6, v7

    .line 23
    invoke-virtual {v1, v6, v7}, Lcom/esotericsoftware/kryo/io/Output;->writeVarInt(IZ)I

    .line 24
    .line 25
    .line 26
    invoke-virtual/range {p0 .. p3}, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer;->writeHeader(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v6, v0, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer;->config:Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer$TaggedFieldSerializerConfig;

    .line 30
    .line 31
    iget-boolean v8, v6, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer$TaggedFieldSerializerConfig;->chunked:Z

    .line 32
    .line 33
    iget-boolean v6, v6, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer$TaggedFieldSerializerConfig;->readUnknownTagData:Z

    .line 34
    .line 35
    if-eqz v8, :cond_1

    .line 36
    .line 37
    new-instance v10, Lcom/esotericsoftware/kryo/io/OutputChunked;

    .line 38
    .line 39
    iget-object v11, v0, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer;->config:Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer$TaggedFieldSerializerConfig;

    .line 40
    .line 41
    iget v11, v11, Lcom/esotericsoftware/kryo/serializers/TaggedFieldSerializer$TaggedFieldSerializerConfig;->chunkSize:I

    .line 42
    .line 43
    invoke-direct {v10, v1, v11}, Lcom/esotericsoftware/kryo/io/OutputChunked;-><init>(Ljava/io/OutputStream;I)V

    .line 44
    .line 45
    .line 46
    move-object v11, v10

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move-object v10, v1

    .line 49
    const/4 v11, 0x0

    .line 50
    :goto_0
    array-length v12, v5

    .line 51
    move v13, v3

    .line 52
    :goto_1
    if-ge v13, v12, :cond_7

    .line 53
    .line 54
    aget-object v14, v5, v13

    .line 55
    .line 56
    sget-boolean v15, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 57
    .line 58
    if-eqz v15, :cond_2

    .line 59
    .line 60
    const-string v15, "Write"

    .line 61
    .line 62
    invoke-virtual {v1}, Lcom/esotericsoftware/kryo/io/Output;->position()I

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    invoke-virtual {v0, v15, v14, v9}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->log(Ljava/lang/String;Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;I)V

    .line 67
    .line 68
    .line 69
    :cond_2
    iget v9, v14, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->tag:I

    .line 70
    .line 71
    invoke-virtual {v1, v9, v7}, Lcom/esotericsoftware/kryo/io/Output;->writeVarInt(IZ)I

    .line 72
    .line 73
    .line 74
    if-eqz v6, :cond_5

    .line 75
    .line 76
    :try_start_0
    iget-object v9, v14, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->field:Ljava/lang/reflect/Field;

    .line 77
    .line 78
    invoke-virtual {v9, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    if-eqz v9, :cond_3

    .line 83
    .line 84
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v9
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    :goto_2
    move-object/from16 v15, p1

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :catch_0
    :cond_3
    const/4 v9, 0x0

    .line 92
    goto :goto_2

    .line 93
    :goto_3
    invoke-virtual {v15, v10, v9}, Lcom/esotericsoftware/kryo/Kryo;->writeClass(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;

    .line 94
    .line 95
    .line 96
    if-nez v9, :cond_4

    .line 97
    .line 98
    if-eqz v8, :cond_6

    .line 99
    .line 100
    invoke-virtual {v11}, Lcom/esotericsoftware/kryo/io/OutputChunked;->endChunk()V

    .line 101
    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_4
    invoke-virtual {v14, v3}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->setCanBeNull(Z)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v14, v9}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->setValueClass(Ljava/lang/Class;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v14, v3}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->setReuseSerializer(Z)V

    .line 111
    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_5
    move-object/from16 v15, p1

    .line 115
    .line 116
    :goto_4
    invoke-virtual {v14, v10, v2}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->write(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    if-eqz v8, :cond_6

    .line 120
    .line 121
    invoke-virtual {v11}, Lcom/esotericsoftware/kryo/io/OutputChunked;->endChunk()V

    .line 122
    .line 123
    .line 124
    :cond_6
    :goto_5
    add-int/lit8 v13, v13, 0x1

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_7
    invoke-virtual {v0, v4}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->popTypeVariables(I)V

    .line 128
    .line 129
    .line 130
    return-void
.end method

.method public writeHeader(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
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
