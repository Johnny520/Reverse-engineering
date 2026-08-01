.class public Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer;
.super Lcom/esotericsoftware/kryo/serializers/FieldSerializer;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;
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


# static fields
.field private static final binarySearchThreshold:I = 0x20


# instance fields
.field private final config:Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;


# direct methods
.method public constructor <init>(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Class;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2, v0}, Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer;-><init>(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Class;Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Class;Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;-><init>(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Class;Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;)V

    .line 11
    iput-object p3, p0, Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer;->config:Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;

    return-void
.end method

.method private readFields(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;)[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-boolean v1, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 4
    .line 5
    const-string v2, "kryo"

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, v0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->type:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v3, "Read fields for class: "

    .line 16
    .line 17
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v2, v1}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    const/4 v1, 0x1

    .line 25
    move-object/from16 v3, p2

    .line 26
    .line 27
    invoke-virtual {v3, v1}, Lcom/esotericsoftware/kryo/io/Input;->readVarInt(Z)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    new-array v5, v4, [Ljava/lang/String;

    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    move v7, v6

    .line 35
    :goto_0
    if-ge v7, v4, :cond_2

    .line 36
    .line 37
    invoke-virtual {v3}, Lcom/esotericsoftware/kryo/io/Input;->readString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    aput-object v8, v5, v7

    .line 42
    .line 43
    sget-boolean v8, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 44
    .line 45
    if-eqz v8, :cond_1

    .line 46
    .line 47
    new-instance v8, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v9, "Read field name: "

    .line 50
    .line 51
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    aget-object v9, v5, v7

    .line 55
    .line 56
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    invoke-static {v2, v8}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    add-int/lit8 v7, v7, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    new-array v3, v4, [Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 70
    .line 71
    iget-object v7, v0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->cachedFields:Lcom/esotericsoftware/kryo/serializers/CachedFields;

    .line 72
    .line 73
    iget-object v7, v7, Lcom/esotericsoftware/kryo/serializers/CachedFields;->fields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 74
    .line 75
    const/16 v8, 0x20

    .line 76
    .line 77
    const-string v9, "Unknown field will be skipped: "

    .line 78
    .line 79
    if-ge v4, v8, :cond_6

    .line 80
    .line 81
    move v1, v6

    .line 82
    :goto_1
    if-ge v1, v4, :cond_b

    .line 83
    .line 84
    aget-object v8, v5, v1

    .line 85
    .line 86
    array-length v10, v7

    .line 87
    move v11, v6

    .line 88
    :goto_2
    if-ge v11, v10, :cond_4

    .line 89
    .line 90
    aget-object v12, v7, v11

    .line 91
    .line 92
    iget-object v12, v12, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->name:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v12

    .line 98
    if-eqz v12, :cond_3

    .line 99
    .line 100
    aget-object v8, v7, v11

    .line 101
    .line 102
    aput-object v8, v3, v1

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_3
    add-int/lit8 v11, v11, 0x1

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_4
    sget-boolean v10, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 109
    .line 110
    if-eqz v10, :cond_5

    .line 111
    .line 112
    new-instance v10, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    invoke-static {v2, v8}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    :cond_5
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_6
    array-length v8, v7

    .line 131
    sub-int/2addr v8, v1

    .line 132
    move v10, v6

    .line 133
    :goto_4
    if-ge v10, v4, :cond_b

    .line 134
    .line 135
    aget-object v11, v5, v10

    .line 136
    .line 137
    move v12, v6

    .line 138
    move v13, v8

    .line 139
    :goto_5
    if-gt v12, v13, :cond_9

    .line 140
    .line 141
    add-int v14, v12, v13

    .line 142
    .line 143
    ushr-int/2addr v14, v1

    .line 144
    aget-object v15, v7, v14

    .line 145
    .line 146
    iget-object v15, v15, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->name:Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {v11, v15}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result v15

    .line 152
    if-gez v15, :cond_7

    .line 153
    .line 154
    add-int/lit8 v13, v14, -0x1

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_7
    if-lez v15, :cond_8

    .line 158
    .line 159
    add-int/lit8 v12, v14, 0x1

    .line 160
    .line 161
    goto :goto_5

    .line 162
    :cond_8
    aget-object v11, v7, v14

    .line 163
    .line 164
    aput-object v11, v3, v10

    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_9
    sget-boolean v12, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 168
    .line 169
    if-eqz v12, :cond_a

    .line 170
    .line 171
    new-instance v12, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    invoke-direct {v12, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v11

    .line 183
    invoke-static {v2, v11}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    :cond_a
    :goto_6
    add-int/lit8 v10, v10, 0x1

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_b
    invoke-virtual/range {p1 .. p1}, Lcom/esotericsoftware/kryo/Kryo;->getGraphContext()Lcom/esotericsoftware/kryo/util/ObjectMap;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-virtual {v1, v0, v3}, Lcom/esotericsoftware/kryo/util/ObjectMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    return-object v3
.end method


# virtual methods
.method public getCompatibleFieldSerializerConfig()Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer;->config:Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;

    .line 2
    .line 3
    return-object p0
.end method

.method public read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 19
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
    const-string v3, "#"

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->pushTypeVariables()I

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    invoke-virtual/range {p0 .. p3}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->create(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-virtual {v2, v5}, Lcom/esotericsoftware/kryo/Kryo;->reference(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/esotericsoftware/kryo/Kryo;->getGraphContext()Lcom/esotericsoftware/kryo/util/ObjectMap;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/kryo/util/ObjectMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, [Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    invoke-direct/range {p0 .. p2}, Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer;->readFields(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;)[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_0
    move-object v6, v0

    .line 35
    iget-object v0, v1, Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer;->config:Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;

    .line 36
    .line 37
    iget-boolean v7, v0, Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;->chunked:Z

    .line 38
    .line 39
    iget-boolean v8, v0, Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;->readUnknownFieldData:Z

    .line 40
    .line 41
    if-eqz v7, :cond_1

    .line 42
    .line 43
    new-instance v0, Lcom/esotericsoftware/kryo/io/InputChunked;

    .line 44
    .line 45
    iget-object v9, v1, Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer;->config:Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;

    .line 46
    .line 47
    iget v9, v9, Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;->chunkSize:I

    .line 48
    .line 49
    move-object/from16 v10, p2

    .line 50
    .line 51
    invoke-direct {v0, v10, v9}, Lcom/esotericsoftware/kryo/io/InputChunked;-><init>(Ljava/io/InputStream;I)V

    .line 52
    .line 53
    .line 54
    move-object v9, v0

    .line 55
    move-object v11, v9

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    move-object/from16 v10, p2

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    move-object v11, v0

    .line 61
    move-object v9, v10

    .line 62
    :goto_0
    array-length v12, v6

    .line 63
    const/4 v14, 0x0

    .line 64
    :goto_1
    if-ge v14, v12, :cond_14

    .line 65
    .line 66
    aget-object v15, v6, v14

    .line 67
    .line 68
    const-string v13, ")"

    .line 69
    .line 70
    move-object/from16 v16, v6

    .line 71
    .line 72
    const-string v6, "kryo"

    .line 73
    .line 74
    if-eqz v8, :cond_e

    .line 75
    .line 76
    :try_start_0
    invoke-virtual {v2, v9}, Lcom/esotericsoftware/kryo/Kryo;->readClass(Lcom/esotericsoftware/kryo/io/Input;)Lcom/esotericsoftware/kryo/Registration;

    .line 77
    .line 78
    .line 79
    move-result-object v0
    :try_end_0
    .catch Lcom/esotericsoftware/kryo/KryoException; {:try_start_0 .. :try_end_0} :catch_1

    .line 80
    if-nez v0, :cond_4

    .line 81
    .line 82
    if-eqz v7, :cond_2

    .line 83
    .line 84
    invoke-virtual {v11}, Lcom/esotericsoftware/kryo/io/InputChunked;->nextChunk()V

    .line 85
    .line 86
    .line 87
    :cond_2
    move/from16 v17, v7

    .line 88
    .line 89
    move/from16 v18, v8

    .line 90
    .line 91
    :cond_3
    :goto_2
    const/4 v2, 0x0

    .line 92
    goto/16 :goto_5

    .line 93
    .line 94
    :cond_4
    move/from16 v17, v7

    .line 95
    .line 96
    invoke-virtual {v0}, Lcom/esotericsoftware/kryo/Registration;->getType()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    move/from16 v18, v8

    .line 101
    .line 102
    const-string v8, " ("

    .line 103
    .line 104
    if-nez v15, :cond_8

    .line 105
    .line 106
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 107
    .line 108
    if-eqz v0, :cond_5

    .line 109
    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v10, "Read unknown data, type: "

    .line 113
    .line 114
    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v7}, Lcom/esotericsoftware/kryo/util/Util;->className(Ljava/lang/Class;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v10

    .line 121
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {p2 .. p2}, Lcom/esotericsoftware/kryo/io/Input;->position()I

    .line 125
    .line 126
    .line 127
    move-result v10

    .line 128
    invoke-static {v10}, Lcom/esotericsoftware/kryo/util/Util;->pos(I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-static {v6, v0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    :cond_5
    :try_start_1
    invoke-virtual {v2, v9, v7}, Lcom/esotericsoftware/kryo/Kryo;->readObject(Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;
    :try_end_1
    .catch Lcom/esotericsoftware/kryo/KryoException; {:try_start_1 .. :try_end_1} :catch_0

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :catch_0
    move-exception v0

    .line 147
    new-instance v10, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    const-string v2, "Unable to read unknown data, type: "

    .line 150
    .line 151
    invoke-direct {v10, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-static {v7}, Lcom/esotericsoftware/kryo/util/Util;->className(Ljava/lang/Class;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->getType()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    if-eqz v17, :cond_7

    .line 189
    .line 190
    sget-boolean v7, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 191
    .line 192
    if-eqz v7, :cond_6

    .line 193
    .line 194
    invoke-static {v6, v2, v0}, Lcom/esotericsoftware/minlog/Log;->debug(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 195
    .line 196
    .line 197
    :cond_6
    :goto_3
    if-eqz v17, :cond_3

    .line 198
    .line 199
    invoke-virtual {v11}, Lcom/esotericsoftware/kryo/io/InputChunked;->nextChunk()V

    .line 200
    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_7
    new-instance v1, Lcom/esotericsoftware/kryo/KryoException;

    .line 204
    .line 205
    invoke-direct {v1, v2, v0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 206
    .line 207
    .line 208
    throw v1

    .line 209
    :cond_8
    iget-object v0, v15, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->valueClass:Ljava/lang/Class;

    .line 210
    .line 211
    if-eqz v0, :cond_b

    .line 212
    .line 213
    iget-object v0, v15, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->field:Ljava/lang/reflect/Field;

    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-static {v7, v0}, Lcom/esotericsoftware/kryo/util/Util;->isAssignableTo(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-nez v0, :cond_b

    .line 224
    .line 225
    new-instance v0, Ljava/lang/StringBuilder;

    .line 226
    .line 227
    const-string v2, "Read type is incompatible with the field type: "

    .line 228
    .line 229
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    invoke-static {v7}, Lcom/esotericsoftware/kryo/util/Util;->className(Ljava/lang/Class;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    const-string v2, " -> "

    .line 240
    .line 241
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    iget-object v2, v15, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->valueClass:Ljava/lang/Class;

    .line 245
    .line 246
    invoke-static {v2}, Lcom/esotericsoftware/kryo/util/Util;->className(Ljava/lang/Class;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v1}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->getType()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    if-eqz v17, :cond_a

    .line 281
    .line 282
    sget-boolean v2, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 283
    .line 284
    if-eqz v2, :cond_9

    .line 285
    .line 286
    invoke-static {v6, v0}, Lcom/esotericsoftware/minlog/Log;->debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    :cond_9
    invoke-virtual {v11}, Lcom/esotericsoftware/kryo/io/InputChunked;->nextChunk()V

    .line 290
    .line 291
    .line 292
    goto/16 :goto_2

    .line 293
    .line 294
    :cond_a
    new-instance v1, Lcom/esotericsoftware/kryo/KryoException;

    .line 295
    .line 296
    invoke-direct {v1, v0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    throw v1

    .line 300
    :cond_b
    const/4 v2, 0x0

    .line 301
    invoke-virtual {v15, v2}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->setCanBeNull(Z)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v15, v7}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->setValueClass(Ljava/lang/Class;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v15, v2}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->setReuseSerializer(Z)V

    .line 308
    .line 309
    .line 310
    goto :goto_4

    .line 311
    :catch_1
    move-exception v0

    .line 312
    move/from16 v17, v7

    .line 313
    .line 314
    move/from16 v18, v8

    .line 315
    .line 316
    const/4 v2, 0x0

    .line 317
    new-instance v7, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    const-string v8, "Unable to read unknown data (unknown type). ("

    .line 320
    .line 321
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v1}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->getType()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    move-result-object v8

    .line 328
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v8

    .line 332
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v7

    .line 348
    if-eqz v17, :cond_d

    .line 349
    .line 350
    sget-boolean v8, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 351
    .line 352
    if-eqz v8, :cond_c

    .line 353
    .line 354
    invoke-static {v6, v7, v0}, Lcom/esotericsoftware/minlog/Log;->debug(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 355
    .line 356
    .line 357
    :cond_c
    invoke-virtual {v11}, Lcom/esotericsoftware/kryo/io/InputChunked;->nextChunk()V

    .line 358
    .line 359
    .line 360
    goto :goto_5

    .line 361
    :cond_d
    new-instance v1, Lcom/esotericsoftware/kryo/KryoException;

    .line 362
    .line 363
    invoke-direct {v1, v7, v0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 364
    .line 365
    .line 366
    throw v1

    .line 367
    :cond_e
    move/from16 v17, v7

    .line 368
    .line 369
    move/from16 v18, v8

    .line 370
    .line 371
    const/4 v2, 0x0

    .line 372
    if-nez v15, :cond_11

    .line 373
    .line 374
    if-eqz v17, :cond_10

    .line 375
    .line 376
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 377
    .line 378
    if-eqz v0, :cond_f

    .line 379
    .line 380
    const-string v0, "Skip unknown field."

    .line 381
    .line 382
    invoke-static {v6, v0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    :cond_f
    invoke-virtual {v11}, Lcom/esotericsoftware/kryo/io/InputChunked;->nextChunk()V

    .line 386
    .line 387
    .line 388
    goto :goto_5

    .line 389
    :cond_10
    new-instance v0, Lcom/esotericsoftware/kryo/KryoException;

    .line 390
    .line 391
    invoke-virtual {v1}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->getType()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    new-instance v2, Ljava/lang/StringBuilder;

    .line 400
    .line 401
    const-string v3, "Unknown field. ("

    .line 402
    .line 403
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v1

    .line 416
    invoke-direct {v0, v1}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    throw v0

    .line 420
    :cond_11
    :goto_4
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 421
    .line 422
    if-eqz v0, :cond_12

    .line 423
    .line 424
    const-string v0, "Read"

    .line 425
    .line 426
    invoke-virtual/range {p2 .. p2}, Lcom/esotericsoftware/kryo/io/Input;->position()I

    .line 427
    .line 428
    .line 429
    move-result v6

    .line 430
    invoke-virtual {v1, v0, v15, v6}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->log(Ljava/lang/String;Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;I)V

    .line 431
    .line 432
    .line 433
    :cond_12
    invoke-virtual {v15, v9, v5}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->read(Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Object;)V

    .line 434
    .line 435
    .line 436
    if-eqz v17, :cond_13

    .line 437
    .line 438
    invoke-virtual {v11}, Lcom/esotericsoftware/kryo/io/InputChunked;->nextChunk()V

    .line 439
    .line 440
    .line 441
    :cond_13
    :goto_5
    add-int/lit8 v14, v14, 0x1

    .line 442
    .line 443
    move-object/from16 v2, p1

    .line 444
    .line 445
    move-object/from16 v10, p2

    .line 446
    .line 447
    move-object/from16 v6, v16

    .line 448
    .line 449
    move/from16 v7, v17

    .line 450
    .line 451
    move/from16 v8, v18

    .line 452
    .line 453
    goto/16 :goto_1

    .line 454
    .line 455
    :cond_14
    invoke-virtual {v1, v4}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->popTypeVariables(I)V

    .line 456
    .line 457
    .line 458
    return-object v5
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
    invoke-virtual {v0}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->pushTypeVariables()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    iget-object v4, v0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->cachedFields:Lcom/esotericsoftware/kryo/serializers/CachedFields;

    .line 12
    .line 13
    iget-object v4, v4, Lcom/esotericsoftware/kryo/serializers/CachedFields;->fields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 14
    .line 15
    invoke-virtual/range {p1 .. p1}, Lcom/esotericsoftware/kryo/Kryo;->getGraphContext()Lcom/esotericsoftware/kryo/util/ObjectMap;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-virtual {v5, v0}, Lcom/esotericsoftware/kryo/util/ObjectMap;->containsKey(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v8, 0x0

    .line 25
    if-nez v6, :cond_2

    .line 26
    .line 27
    sget-boolean v6, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 28
    .line 29
    const-string v9, "kryo"

    .line 30
    .line 31
    if-eqz v6, :cond_0

    .line 32
    .line 33
    iget-object v6, v0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->type:Ljava/lang/Class;

    .line 34
    .line 35
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    const-string v10, "Write fields for class: "

    .line 40
    .line 41
    invoke-virtual {v10, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-static {v9, v6}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    invoke-virtual {v5, v0, v7}, Lcom/esotericsoftware/kryo/util/ObjectMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    array-length v5, v4

    .line 52
    const/4 v6, 0x1

    .line 53
    invoke-virtual {v1, v5, v6}, Lcom/esotericsoftware/kryo/io/Output;->writeVarInt(IZ)I

    .line 54
    .line 55
    .line 56
    array-length v5, v4

    .line 57
    move v6, v8

    .line 58
    :goto_0
    if-ge v6, v5, :cond_2

    .line 59
    .line 60
    sget-boolean v10, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 61
    .line 62
    if-eqz v10, :cond_1

    .line 63
    .line 64
    new-instance v10, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    const-string v11, "Write field name: "

    .line 67
    .line 68
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    aget-object v11, v4, v6

    .line 72
    .line 73
    iget-object v11, v11, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->name:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Lcom/esotericsoftware/kryo/io/Output;->position()I

    .line 79
    .line 80
    .line 81
    move-result v11

    .line 82
    invoke-static {v11}, Lcom/esotericsoftware/kryo/util/Util;->pos(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v11

    .line 86
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v10

    .line 93
    invoke-static {v9, v10}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :cond_1
    aget-object v10, v4, v6

    .line 97
    .line 98
    iget-object v10, v10, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->name:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v1, v10}, Lcom/esotericsoftware/kryo/io/Output;->writeString(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    add-int/lit8 v6, v6, 0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_2
    iget-object v5, v0, Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer;->config:Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;

    .line 107
    .line 108
    iget-boolean v6, v5, Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;->chunked:Z

    .line 109
    .line 110
    iget-boolean v5, v5, Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;->readUnknownFieldData:Z

    .line 111
    .line 112
    if-eqz v6, :cond_3

    .line 113
    .line 114
    new-instance v9, Lcom/esotericsoftware/kryo/io/OutputChunked;

    .line 115
    .line 116
    iget-object v10, v0, Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer;->config:Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;

    .line 117
    .line 118
    iget v10, v10, Lcom/esotericsoftware/kryo/serializers/CompatibleFieldSerializer$CompatibleFieldSerializerConfig;->chunkSize:I

    .line 119
    .line 120
    invoke-direct {v9, v1, v10}, Lcom/esotericsoftware/kryo/io/OutputChunked;-><init>(Ljava/io/OutputStream;I)V

    .line 121
    .line 122
    .line 123
    move-object v10, v9

    .line 124
    goto :goto_1

    .line 125
    :cond_3
    move-object v9, v1

    .line 126
    move-object v10, v7

    .line 127
    :goto_1
    array-length v11, v4

    .line 128
    move v12, v8

    .line 129
    :goto_2
    if-ge v12, v11, :cond_9

    .line 130
    .line 131
    aget-object v13, v4, v12

    .line 132
    .line 133
    sget-boolean v14, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 134
    .line 135
    if-eqz v14, :cond_4

    .line 136
    .line 137
    const-string v14, "Write"

    .line 138
    .line 139
    invoke-virtual {v1}, Lcom/esotericsoftware/kryo/io/Output;->position()I

    .line 140
    .line 141
    .line 142
    move-result v15

    .line 143
    invoke-virtual {v0, v14, v13, v15}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->log(Ljava/lang/String;Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;I)V

    .line 144
    .line 145
    .line 146
    :cond_4
    if-eqz v5, :cond_7

    .line 147
    .line 148
    if-eqz v2, :cond_5

    .line 149
    .line 150
    :try_start_0
    iget-object v14, v13, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->field:Ljava/lang/reflect/Field;

    .line 151
    .line 152
    invoke-virtual {v14, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v14

    .line 156
    if-eqz v14, :cond_5

    .line 157
    .line 158
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-result-object v14
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 162
    goto :goto_3

    .line 163
    :catch_0
    :cond_5
    move-object v14, v7

    .line 164
    :goto_3
    move-object/from16 v15, p1

    .line 165
    .line 166
    invoke-virtual {v15, v9, v14}, Lcom/esotericsoftware/kryo/Kryo;->writeClass(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;

    .line 167
    .line 168
    .line 169
    if-nez v14, :cond_6

    .line 170
    .line 171
    if-eqz v6, :cond_8

    .line 172
    .line 173
    invoke-virtual {v10}, Lcom/esotericsoftware/kryo/io/OutputChunked;->endChunk()V

    .line 174
    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_6
    invoke-virtual {v13, v8}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->setCanBeNull(Z)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v13, v14}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->setValueClass(Ljava/lang/Class;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v13, v8}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->setReuseSerializer(Z)V

    .line 184
    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_7
    move-object/from16 v15, p1

    .line 188
    .line 189
    :goto_4
    invoke-virtual {v13, v9, v2}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->write(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    if-eqz v6, :cond_8

    .line 193
    .line 194
    invoke-virtual {v10}, Lcom/esotericsoftware/kryo/io/OutputChunked;->endChunk()V

    .line 195
    .line 196
    .line 197
    :cond_8
    :goto_5
    add-int/lit8 v12, v12, 0x1

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_9
    invoke-virtual {v0, v3}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->popTypeVariables(I)V

    .line 201
    .line 202
    .line 203
    return-void
.end method
