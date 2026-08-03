.class public Lcom/alibaba/fastjson2/reader/FieldReaderList;
.super Lcom/alibaba/fastjson2/reader/FieldReaderObject;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/alibaba/fastjson2/reader/FieldReaderObject<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final fieldClassHash:J

.field final itemClassHash:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/util/function/BiConsumer;)V
    .locals 15

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    move-object v2, p0

    .line 6
    move-object/from16 v3, p1

    .line 7
    .line 8
    move-object/from16 v4, p2

    .line 9
    .line 10
    move-object/from16 v5, p3

    .line 11
    .line 12
    move/from16 v6, p6

    .line 13
    .line 14
    move-wide/from16 v7, p7

    .line 15
    .line 16
    move-object/from16 v9, p9

    .line 17
    .line 18
    move-object/from16 v10, p10

    .line 19
    .line 20
    move-object/from16 v11, p11

    .line 21
    .line 22
    move-object/from16 v12, p12

    .line 23
    .line 24
    move-object/from16 v13, p13

    .line 25
    .line 26
    move-object/from16 v14, p14

    .line 27
    .line 28
    invoke-direct/range {v2 .. v14}, Lcom/alibaba/fastjson2/reader/FieldReaderObject;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/util/function/BiConsumer;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->itemType:Ljava/lang/reflect/Type;

    .line 32
    .line 33
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->itemClass:Ljava/lang/Class;

    .line 34
    .line 35
    const-wide/16 v3, 0x0

    .line 36
    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    move-wide v5, v3

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v5

    .line 49
    :goto_0
    iput-wide v5, p0, Lcom/alibaba/fastjson2/reader/FieldReaderList;->itemClassHash:J

    .line 50
    .line 51
    if-nez p3, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-static/range {p3 .. p3}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 59
    .line 60
    .line 61
    move-result-wide v3

    .line 62
    :goto_1
    iput-wide v3, p0, Lcom/alibaba/fastjson2/reader/FieldReaderList;->fieldClassHash:J

    .line 63
    .line 64
    if-eqz v9, :cond_2

    .line 65
    .line 66
    const-class v1, Ljava/util/Date;

    .line 67
    .line 68
    if-ne v0, v1, :cond_2

    .line 69
    .line 70
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;

    .line 71
    .line 72
    move-object/from16 v10, p10

    .line 73
    .line 74
    invoke-direct {v0, v9, v10}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 75
    .line 76
    .line 77
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->itemReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 78
    .line 79
    :cond_2
    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONArray;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/alibaba/fastjson2/JSONArray;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReaderObject;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public checkObjectAutoType(Lcom/alibaba/fastjson2/JSONReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 8

    .line 1
    const/16 v0, -0x6e

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(B)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_6

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readTypeHashCode()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->features:J

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1}, Lcom/alibaba/fastjson2/JSONReader;->features(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    iget-object v0, p1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader$Context;->getContextAutoTypeBeforeHandler()Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 28
    .line 29
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;->apply(JLjava/lang/Class;J)Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    if-nez v4, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    iget-object v7, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 40
    .line 41
    invoke-interface {v1, v4, v7, v5, v6}, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;->apply(Ljava/lang/String;Ljava/lang/Class;J)Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    :cond_0
    if-eqz v4, :cond_1

    .line 46
    .line 47
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1

    .line 54
    :cond_1
    invoke-virtual {p1, v5, v6}, Lcom/alibaba/fastjson2/JSONReader;->isSupportAutoType(J)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_3

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isArray()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNotSupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->isEnabled(Lcom/alibaba/fastjson2/JSONReader$Feature;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_2

    .line 73
    .line 74
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/FieldReaderObject;->getObjectReader(Lcom/alibaba/fastjson2/JSONReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const-string v1, "autoType not support input "

    .line 82
    .line 83
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const/4 p1, 0x0

    .line 105
    return-object p1

    .line 106
    :cond_3
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 107
    .line 108
    move-object v1, p1

    .line 109
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReader;->getObjectReaderAutoType(JLjava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    instance-of v0, p1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;

    .line 114
    .line 115
    if-eqz v0, :cond_4

    .line 116
    .line 117
    check-cast p1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;

    .line 118
    .line 119
    new-instance v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;

    .line 120
    .line 121
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldType:Ljava/lang/reflect/Type;

    .line 122
    .line 123
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 124
    .line 125
    iget-object v5, p1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->instanceType:Ljava/lang/Class;

    .line 126
    .line 127
    iget-object v6, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->itemType:Ljava/lang/reflect/Type;

    .line 128
    .line 129
    iget-object v7, p1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->builder:Ljava/util/function/Function;

    .line 130
    .line 131
    invoke-direct/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;-><init>(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/function/Function;)V

    .line 132
    .line 133
    .line 134
    move-object p1, v2

    .line 135
    :cond_4
    if-eqz p1, :cond_5

    .line 136
    .line 137
    return-object p1

    .line 138
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    const-string v0, "auotype not support : "

    .line 141
    .line 142
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    const/4 p1, 0x0

    .line 164
    return-object p1

    .line 165
    :cond_6
    const/4 p1, 0x0

    .line 166
    return-object p1
.end method

.method public createList(Lcom/alibaba/fastjson2/JSONReader$Context;)Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONReader$Context;",
            ")",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 2
    .line 3
    const-class v1, Ljava/util/List;

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const-class v1, Ljava/util/Collection;

    .line 8
    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    const-class v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/FieldReaderObject;->getObjectReader(Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {p1}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ljava/util/Collection;

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_1
    :goto_0
    new-instance p1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    return-object p1
.end method

.method public getItemClassHash()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/FieldReaderList;->itemClassHash:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public readFieldValue(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;
    .locals 11

    .line 222
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/JSONReader;->jsonb:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 223
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->startArray()I

    move-result v0

    .line 224
    new-array v2, v0, [Ljava/lang/Object;

    .line 225
    iget-object v3, p1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 226
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/reader/FieldReader;->getItemObjectReader(Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v4

    :goto_0
    if-ge v1, v0, :cond_0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v6, 0x0

    move-object v5, p1

    .line 227
    invoke-interface/range {v4 .. v9}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    aput-object p1, v2, v1

    add-int/lit8 v1, v1, 0x1

    move-object p1, v5

    goto :goto_0

    .line 228
    :cond_0
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_1
    move-object v5, p1

    .line 229
    invoke-virtual {v5}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    move-result p1

    const/16 v0, 0x5b

    if-ne p1, v0, :cond_3

    .line 230
    iget-object p1, v5, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    move-object v6, v5

    .line 231
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->getItemObjectReader(Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v5

    .line 232
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/FieldReaderList;->createList(Lcom/alibaba/fastjson2/JSONReader$Context;)Ljava/util/Collection;

    move-result-object p1

    .line 233
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 234
    :goto_1
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayEnd()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 235
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    return-object p1

    .line 236
    :cond_2
    iget-object v7, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldType:Ljava/lang/reflect/Type;

    iget-object v8, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    const-wide/16 v9, 0x0

    .line 237
    invoke-interface/range {v5 .. v10}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v5

    move-object v5, v6

    .line 238
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 239
    invoke-virtual {v5}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    move-object v5, v2

    goto :goto_1

    .line 240
    :cond_3
    invoke-virtual {v5}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 241
    invoke-virtual {v5}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    move-result-object p1

    .line 242
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->itemType:Ljava/lang/reflect/Type;

    instance-of v2, v0, Ljava/lang/Class;

    if-eqz v2, :cond_5

    const-class v2, Ljava/lang/Number;

    check-cast v0, Ljava/lang/Class;

    .line 243
    invoke-virtual {v2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 244
    iget-object v0, v5, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    iget-object v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    const-class v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->itemType:Ljava/lang/reflect/Type;

    invoke-virtual {v0, v2, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getTypeConvert(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 245
    iget-object v2, v5, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/reader/FieldReaderList;->createList(Lcom/alibaba/fastjson2/JSONReader$Context;)Ljava/util/Collection;

    move-result-object v2

    const/16 v3, 0x2c

    .line 246
    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_4

    .line 247
    const-string v3, ","

    invoke-virtual {p1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 248
    array-length v3, p1

    :goto_2
    if-ge v1, v3, :cond_4

    aget-object v4, p1, v1

    .line 249
    invoke-interface {v0, v4}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 250
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_4
    return-object v2

    .line 251
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "TODO : "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONReader;",
            "TT;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/JSONReader;->jsonb:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReaderObject;->readFieldValueJSONB(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, p2, v1}, Lcom/alibaba/fastjson2/reader/FieldReaderList;->accept(Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONArray;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isReference()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const-string v2, ".."

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readReference()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0, p2, p2}, Lcom/alibaba/fastjson2/reader/FieldReaderObject;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    invoke-virtual {p0, p1, p2, v0}, Lcom/alibaba/fastjson2/reader/FieldReader;->addResolveTask(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_3
    iget-object v0, p1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/reader/FieldReaderObject;->getObjectReader(Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/FieldReaderObject;->initReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 53
    .line 54
    if-eqz v4, :cond_4

    .line 55
    .line 56
    invoke-interface {v4}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getBuildFunction()Ljava/util/function/Function;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    goto :goto_0

    .line 61
    :cond_4
    instance-of v4, v3, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;

    .line 62
    .line 63
    if-eqz v4, :cond_5

    .line 64
    .line 65
    invoke-interface {v3}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getBuildFunction()Ljava/util/function/Function;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    :cond_5
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    const/16 v5, 0x5b

    .line 74
    .line 75
    if-ne v4, v5, :cond_a

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/reader/FieldReader;->getItemObjectReader(Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/reader/FieldReaderList;->createList(Lcom/alibaba/fastjson2/JSONReader$Context;)Ljava/util/Collection;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 86
    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    :goto_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayEnd()Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_7

    .line 94
    .line 95
    if-eqz v1, :cond_6

    .line 96
    .line 97
    invoke-interface {v1, v5}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    move-object v5, v0

    .line 102
    check-cast v5, Ljava/util/Collection;

    .line 103
    .line 104
    :cond_6
    invoke-virtual {p0, p2, v5}, Lcom/alibaba/fastjson2/reader/FieldReaderObject;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isReference()Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-eqz v3, :cond_9

    .line 116
    .line 117
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readReference()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-eqz v4, :cond_8

    .line 126
    .line 127
    move-object v7, p1

    .line 128
    move-object p1, v5

    .line 129
    goto :goto_2

    .line 130
    :cond_8
    move-object v4, v5

    .line 131
    check-cast v4, Ljava/util/List;

    .line 132
    .line 133
    invoke-virtual {p0, p1, v4, v0, v3}, Lcom/alibaba/fastjson2/reader/FieldReader;->addResolveTask(Lcom/alibaba/fastjson2/JSONReader;Ljava/util/List;ILjava/lang/String;)V

    .line 134
    .line 135
    .line 136
    move-object v7, p1

    .line 137
    goto :goto_3

    .line 138
    :cond_9
    const/4 v9, 0x0

    .line 139
    const-wide/16 v10, 0x0

    .line 140
    .line 141
    const/4 v8, 0x0

    .line 142
    move-object v7, p1

    .line 143
    invoke-interface/range {v6 .. v11}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    :goto_2
    invoke-interface {v5, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 151
    .line 152
    .line 153
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 154
    .line 155
    move-object p1, v7

    .line 156
    goto :goto_1

    .line 157
    :cond_a
    move-object v7, p1

    .line 158
    const/16 p1, 0x7b

    .line 159
    .line 160
    if-ne v4, p1, :cond_c

    .line 161
    .line 162
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/reader/FieldReader;->getItemObjectReader(Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    instance-of p1, p1, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;

    .line 167
    .line 168
    if-eqz p1, :cond_c

    .line 169
    .line 170
    move-object v4, v7

    .line 171
    iget-object v7, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->itemReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 172
    .line 173
    const/4 v10, 0x0

    .line 174
    iget-wide v11, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->features:J

    .line 175
    .line 176
    const/4 v9, 0x0

    .line 177
    move-object v8, v4

    .line 178
    invoke-interface/range {v7 .. v12}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    iget-wide v5, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->features:J

    .line 183
    .line 184
    invoke-interface {v3, v5, v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(J)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    check-cast v0, Ljava/util/Collection;

    .line 189
    .line 190
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    if-eqz v1, :cond_b

    .line 194
    .line 195
    invoke-interface {v1, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    move-object v0, p1

    .line 200
    check-cast v0, Ljava/util/Collection;

    .line 201
    .line 202
    :cond_b
    invoke-virtual {p0, p2, v0}, Lcom/alibaba/fastjson2/reader/FieldReaderObject;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :cond_c
    move-object v4, v7

    .line 210
    const/4 v6, 0x0

    .line 211
    iget-wide v7, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->features:J

    .line 212
    .line 213
    const/4 v5, 0x0

    .line 214
    invoke-interface/range {v3 .. v8}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-virtual {p0, p2, p1}, Lcom/alibaba/fastjson2/reader/FieldReaderObject;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    return-void
.end method
