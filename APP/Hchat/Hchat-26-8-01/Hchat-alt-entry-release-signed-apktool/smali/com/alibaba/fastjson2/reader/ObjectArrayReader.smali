.class public final Lcom/alibaba/fastjson2/reader/ObjectArrayReader;
.super Lcom/alibaba/fastjson2/reader/ObjectReaderPrimitive;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectArrayReader;

.field public static final TYPE_HASH_CODE:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectArrayReader;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/alibaba/fastjson2/reader/ObjectArrayReader;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/alibaba/fastjson2/reader/ObjectArrayReader;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectArrayReader;

    .line 7
    .line 8
    const-string v0, "[O"

    .line 9
    .line 10
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    sput-wide v0, Lcom/alibaba/fastjson2/reader/ObjectArrayReader;->TYPE_HASH_CODE:J

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const-class v0, [Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderPrimitive;-><init>(Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic createInstance(Ljava/util/Collection;J)Ljava/lang/Object;
    .locals 0

    .line 29
    invoke-virtual {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectArrayReader;->createInstance(Ljava/util/Collection;J)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createInstance(Ljava/util/Collection;J)[Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    new-array p2, p2, [Ljava/lang/Object;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 p3, 0x0

    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    add-int/lit8 v1, p3, 0x1

    .line 23
    .line 24
    aput-object v0, p2, p3

    .line 25
    .line 26
    move p3, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-object p2
.end method

.method public bridge synthetic getObjectClass()Ljava/lang/Class;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderPrimitive;->getObjectClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getType()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, -0x6e

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    const-class v3, [Ljava/lang/Object;

    .line 10
    .line 11
    sget-wide v4, Lcom/alibaba/fastjson2/reader/ObjectArrayReader;->TYPE_HASH_CODE:J

    .line 12
    .line 13
    move-object v2, p1

    .line 14
    move-wide/from16 v6, p4

    .line 15
    .line 16
    invoke-virtual/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONReader;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eq v0, p0, :cond_0

    .line 21
    .line 22
    move-object v7, p1

    .line 23
    move-object v8, p2

    .line 24
    move-object v9, p3

    .line 25
    move-wide/from16 v10, p4

    .line 26
    .line 27
    move-object v6, v0

    .line 28
    invoke-interface/range {v6 .. v11}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->startArray()I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    const/4 p3, -0x1

    .line 38
    const/4 v0, 0x0

    .line 39
    if-ne p2, p3, :cond_1

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_1
    new-array p3, p2, [Ljava/lang/Object;

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    move v8, v2

    .line 46
    :goto_0
    if-ge v8, p2, :cond_9

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getType()B

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    const/16 v3, 0x49

    .line 53
    .line 54
    if-lt v2, v3, :cond_2

    .line 55
    .line 56
    const/16 v3, 0x7d

    .line 57
    .line 58
    if-gt v2, v3, :cond_2

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    if-ne v2, v1, :cond_4

    .line 66
    .line 67
    const-class v3, Ljava/lang/Object;

    .line 68
    .line 69
    const-wide/16 v4, 0x0

    .line 70
    .line 71
    move-object v2, p1

    .line 72
    move-wide/from16 v6, p4

    .line 73
    .line 74
    invoke-virtual/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONReader;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    if-eqz v3, :cond_3

    .line 79
    .line 80
    const/4 v4, 0x0

    .line 81
    const/4 v5, 0x0

    .line 82
    move-wide/from16 v6, p4

    .line 83
    .line 84
    move-object v2, v3

    .line 85
    move-object v3, p1

    .line 86
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    goto :goto_1

    .line 91
    :cond_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readAny()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    goto :goto_1

    .line 96
    :cond_4
    const/16 v3, -0x51

    .line 97
    .line 98
    if-ne v2, v3, :cond_5

    .line 99
    .line 100
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 101
    .line 102
    .line 103
    move-object v2, v0

    .line 104
    goto :goto_1

    .line 105
    :cond_5
    const/16 v3, -0x4f

    .line 106
    .line 107
    if-ne v2, v3, :cond_6

    .line 108
    .line 109
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 110
    .line 111
    .line 112
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_6
    const/16 v3, -0x50

    .line 116
    .line 117
    if-ne v2, v3, :cond_7

    .line 118
    .line 119
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 120
    .line 121
    .line 122
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_7
    const/16 v3, -0x42

    .line 126
    .line 127
    if-ne v2, v3, :cond_8

    .line 128
    .line 129
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readInt64Value()J

    .line 130
    .line 131
    .line 132
    move-result-wide v2

    .line 133
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    goto :goto_1

    .line 138
    :cond_8
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readAny()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    :goto_1
    aput-object v2, p3, v8

    .line 143
    .line 144
    add-int/lit8 v8, v8, 0x1

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_9
    return-object p3
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNullOrEmptyString()Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 p3, 0x0

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    return-object p3

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayStart()Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-eqz p2, :cond_c

    .line 14
    .line 15
    const/16 p2, 0x10

    .line 16
    .line 17
    new-array p2, p2, [Ljava/lang/Object;

    .line 18
    .line 19
    const/4 p4, 0x0

    .line 20
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayEnd()Z

    .line 21
    .line 22
    .line 23
    move-result p5

    .line 24
    if-eqz p5, :cond_1

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 27
    .line 28
    .line 29
    invoke-static {p2, p4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_1
    add-int/lit8 p5, p4, 0x1

    .line 35
    .line 36
    array-length v0, p2

    .line 37
    sub-int v0, p5, v0

    .line 38
    .line 39
    if-lez v0, :cond_3

    .line 40
    .line 41
    array-length v0, p2

    .line 42
    shr-int/lit8 v1, v0, 0x1

    .line 43
    .line 44
    add-int/2addr v0, v1

    .line 45
    sub-int v1, v0, p5

    .line 46
    .line 47
    if-gez v1, :cond_2

    .line 48
    .line 49
    move v0, p5

    .line 50
    :cond_2
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    :cond_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    const/16 v1, 0x22

    .line 59
    .line 60
    if-eq v0, v1, :cond_b

    .line 61
    .line 62
    const/16 v1, 0x2b

    .line 63
    .line 64
    if-eq v0, v1, :cond_a

    .line 65
    .line 66
    const/16 v1, 0x53

    .line 67
    .line 68
    if-eq v0, v1, :cond_8

    .line 69
    .line 70
    const/16 v1, 0x5b

    .line 71
    .line 72
    if-eq v0, v1, :cond_7

    .line 73
    .line 74
    const/16 v1, 0x66

    .line 75
    .line 76
    if-eq v0, v1, :cond_6

    .line 77
    .line 78
    const/16 v1, 0x6e

    .line 79
    .line 80
    if-eq v0, v1, :cond_5

    .line 81
    .line 82
    const/16 v1, 0x74

    .line 83
    .line 84
    if-eq v0, v1, :cond_6

    .line 85
    .line 86
    const/16 v1, 0x7b

    .line 87
    .line 88
    if-eq v0, v1, :cond_4

    .line 89
    .line 90
    const/16 v1, 0x2d

    .line 91
    .line 92
    if-eq v0, v1, :cond_a

    .line 93
    .line 94
    const/16 v1, 0x2e

    .line 95
    .line 96
    if-eq v0, v1, :cond_a

    .line 97
    .line 98
    packed-switch v0, :pswitch_data_0

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->info()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    const/4 p1, 0x0

    .line 109
    return-object p1

    .line 110
    :cond_4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readObject()Ljava/util/Map;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    goto :goto_1

    .line 115
    :cond_5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readNull()V

    .line 116
    .line 117
    .line 118
    move-object v0, p3

    .line 119
    goto :goto_1

    .line 120
    :cond_6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readBoolValue()Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    goto :goto_1

    .line 129
    :cond_7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readArray()Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    goto :goto_1

    .line 134
    :cond_8
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfSet()Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_9

    .line 139
    .line 140
    const-class v0, Ljava/util/HashSet;

    .line 141
    .line 142
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/lang/Class;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    goto :goto_1

    .line 147
    :cond_9
    const-string p2, "Expected Set format but parsing failed: "

    .line 148
    .line 149
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->info()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-static {p1, p2}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    const/4 p1, 0x0

    .line 157
    return-object p1

    .line 158
    :cond_a
    :pswitch_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readNumber()Ljava/lang/Number;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    goto :goto_1

    .line 163
    :cond_b
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    :goto_1
    aput-object v0, p2, p4

    .line 168
    .line 169
    move p4, p5

    .line 170
    goto/16 :goto_0

    .line 171
    .line 172
    :cond_c
    const-string p2, "TODO"

    .line 173
    .line 174
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    const/4 p1, 0x0

    .line 182
    return-object p1

    .line 183
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
