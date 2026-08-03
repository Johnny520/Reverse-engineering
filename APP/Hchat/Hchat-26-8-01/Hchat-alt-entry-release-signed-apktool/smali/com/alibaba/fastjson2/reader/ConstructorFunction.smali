.class final Lcom/alibaba/fastjson2/reader/ConstructorFunction;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Function;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/function/Function<",
        "Ljava/util/Map<",
        "Ljava/lang/Long;",
        "Ljava/lang/Object;",
        ">;TT;>;"
    }
.end annotation


# instance fields
.field alternateConstructorArgTypes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;[",
            "Ljava/lang/reflect/Type;",
            ">;"
        }
    .end annotation
.end field

.field alternateConstructorMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;",
            "Ljava/lang/reflect/Constructor;",
            ">;"
        }
    .end annotation
.end field

.field alternateConstructorNameHashCodes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;[J>;"
        }
    .end annotation
.end field

.field alternateConstructorNames:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;[",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final biFunction:Ljava/util/function/BiFunction;

.field final constructor:Ljava/lang/reflect/Constructor;

.field final function:Ljava/util/function/Function;

.field final hashCodes:[J

.field final kotlinMaker:Z

.field final parameterCount:I

.field final parameterTypes:[Ljava/lang/Class;


# direct methods
.method public varargs constructor <init>(Ljava/util/List;Ljava/lang/reflect/Constructor;Ljava/util/function/Function;Ljava/util/function/BiFunction;Ljava/lang/reflect/Constructor;[Ljava/lang/String;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Constructor;",
            ">;",
            "Ljava/lang/reflect/Constructor;",
            "Ljava/util/function/Function;",
            "Ljava/util/function/BiFunction;",
            "Ljava/lang/reflect/Constructor;",
            "[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz p5, :cond_0

    .line 7
    .line 8
    move v2, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v2, v0

    .line 11
    :goto_0
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->kotlinMaker:Z

    .line 12
    .line 13
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->function:Ljava/util/function/Function;

    .line 14
    .line 15
    iput-object p4, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->biFunction:Ljava/util/function/BiFunction;

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move-object p5, p2

    .line 21
    :goto_1
    iput-object p5, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->constructor:Ljava/lang/reflect/Constructor;

    .line 22
    .line 23
    invoke-virtual {p5}, Ljava/lang/reflect/Constructor;->getParameterCount()I

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    iput p3, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->parameterCount:I

    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->parameterTypes:[Ljava/lang/Class;

    .line 34
    .line 35
    array-length p2, p2

    .line 36
    new-array p2, p2, [J

    .line 37
    .line 38
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->hashCodes:[J

    .line 39
    .line 40
    move p2, v0

    .line 41
    :goto_2
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->parameterTypes:[Ljava/lang/Class;

    .line 42
    .line 43
    array-length p3, p3

    .line 44
    if-ge p2, p3, :cond_4

    .line 45
    .line 46
    array-length p3, p6

    .line 47
    if-ge p2, p3, :cond_2

    .line 48
    .line 49
    aget-object p3, p6, p2

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_2
    const/4 p3, 0x0

    .line 53
    :goto_3
    if-nez p3, :cond_3

    .line 54
    .line 55
    const-string p3, "arg"

    .line 56
    .line 57
    invoke-static {p2, p3}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    :cond_3
    iget-object p4, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->hashCodes:[J

    .line 62
    .line 63
    invoke-static {p3}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    aput-wide v2, p4, p2

    .line 68
    .line 69
    add-int/lit8 p2, p2, 0x1

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    if-eqz p1, :cond_9

    .line 73
    .line 74
    new-instance p2, Ljava/util/HashMap;

    .line 75
    .line 76
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 77
    .line 78
    .line 79
    move-result p3

    .line 80
    invoke-direct {p2, p3}, Ljava/util/HashMap;-><init>(I)V

    .line 81
    .line 82
    .line 83
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->alternateConstructorMap:Ljava/util/Map;

    .line 84
    .line 85
    new-instance p2, Ljava/util/HashMap;

    .line 86
    .line 87
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 88
    .line 89
    .line 90
    move-result p3

    .line 91
    invoke-direct {p2, p3}, Ljava/util/HashMap;-><init>(I)V

    .line 92
    .line 93
    .line 94
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->alternateConstructorNames:Ljava/util/Map;

    .line 95
    .line 96
    new-instance p2, Ljava/util/HashMap;

    .line 97
    .line 98
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 99
    .line 100
    .line 101
    move-result p3

    .line 102
    invoke-direct {p2, p3}, Ljava/util/HashMap;-><init>(I)V

    .line 103
    .line 104
    .line 105
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->alternateConstructorArgTypes:Ljava/util/Map;

    .line 106
    .line 107
    new-instance p2, Ljava/util/HashMap;

    .line 108
    .line 109
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 110
    .line 111
    .line 112
    move-result p3

    .line 113
    invoke-direct {p2, p3}, Ljava/util/HashMap;-><init>(I)V

    .line 114
    .line 115
    .line 116
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->alternateConstructorNameHashCodes:Ljava/util/Map;

    .line 117
    .line 118
    move p2, v0

    .line 119
    :goto_4
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 120
    .line 121
    .line 122
    move-result p3

    .line 123
    if-ge p2, p3, :cond_9

    .line 124
    .line 125
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p3

    .line 129
    move-object v5, p3

    .line 130
    check-cast v5, Ljava/lang/reflect/Constructor;

    .line 131
    .line 132
    invoke-virtual {v5, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 133
    .line 134
    .line 135
    invoke-static {v5}, Lcom/alibaba/fastjson2/util/BeanUtils;->lookupParameterNames(Ljava/lang/reflect/Constructor;)[Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p3

    .line 139
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    move-result-object p4

    .line 143
    new-instance v3, Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 144
    .line 145
    invoke-direct {v3}, Lcom/alibaba/fastjson2/codec/FieldInfo;-><init>()V

    .line 146
    .line 147
    .line 148
    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 149
    .line 150
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    move v6, v0

    .line 155
    :goto_5
    array-length p5, p4

    .line 156
    if-ge p2, p5, :cond_6

    .line 157
    .line 158
    array-length p5, p3

    .line 159
    if-ge v6, p5, :cond_6

    .line 160
    .line 161
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/codec/FieldInfo;->init()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    invoke-virtual/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Constructor;I[[Ljava/lang/annotation/Annotation;)V

    .line 169
    .line 170
    .line 171
    iget-object p5, v3, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldName:Ljava/lang/String;

    .line 172
    .line 173
    if-eqz p5, :cond_5

    .line 174
    .line 175
    aput-object p5, p3, v6

    .line 176
    .line 177
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_6
    array-length p4, p3

    .line 181
    new-array p4, p4, [J

    .line 182
    .line 183
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 184
    .line 185
    .line 186
    move-result-object p5

    .line 187
    new-instance p6, Ljava/util/HashSet;

    .line 188
    .line 189
    array-length v2, p3

    .line 190
    invoke-direct {p6, v2}, Ljava/util/HashSet;-><init>(I)V

    .line 191
    .line 192
    .line 193
    move v2, v0

    .line 194
    :goto_6
    array-length v3, p3

    .line 195
    if-ge v2, v3, :cond_8

    .line 196
    .line 197
    aget-object v3, p3, v2

    .line 198
    .line 199
    if-nez v3, :cond_7

    .line 200
    .line 201
    const-wide/16 v3, 0x0

    .line 202
    .line 203
    goto :goto_7

    .line 204
    :cond_7
    invoke-static {v3}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 205
    .line 206
    .line 207
    move-result-wide v3

    .line 208
    :goto_7
    aput-wide v3, p4, v2

    .line 209
    .line 210
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    invoke-virtual {p6, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    add-int/lit8 v2, v2, 0x1

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_8
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->alternateConstructorMap:Ljava/util/Map;

    .line 221
    .line 222
    invoke-interface {v2, p6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->alternateConstructorNames:Ljava/util/Map;

    .line 226
    .line 227
    invoke-interface {v2, p6, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->alternateConstructorNameHashCodes:Ljava/util/Map;

    .line 231
    .line 232
    invoke-interface {p3, p6, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->alternateConstructorArgTypes:Ljava/util/Map;

    .line 236
    .line 237
    invoke-interface {p3, p6, p5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    add-int/lit8 p2, p2, 0x1

    .line 241
    .line 242
    goto :goto_4

    .line 243
    :cond_9
    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 426
    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->apply(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public apply(Ljava/util/Map;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/Object;",
            ">;)TT;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->hashCodes:[J

    .line 4
    .line 5
    array-length v3, v2

    .line 6
    const-string v4, "invoke constructor error, "

    .line 7
    .line 8
    if-ge v1, v3, :cond_3

    .line 9
    .line 10
    aget-wide v5, v2, v1

    .line 11
    .line 12
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_2

    .line 21
    .line 22
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->alternateConstructorMap:Ljava/util/Map;

    .line 23
    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->alternateConstructorMap:Ljava/util/Map;

    .line 31
    .line 32
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/lang/reflect/Constructor;

    .line 37
    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->alternateConstructorNameHashCodes:Ljava/util/Map;

    .line 41
    .line 42
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, [J

    .line 47
    .line 48
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->alternateConstructorArgTypes:Ljava/util/Map;

    .line 49
    .line 50
    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, [Ljava/lang/reflect/Type;

    .line 55
    .line 56
    array-length v5, v3

    .line 57
    new-array v5, v5, [Ljava/lang/Object;

    .line 58
    .line 59
    :goto_1
    array-length v6, v3

    .line 60
    if-ge v0, v6, :cond_1

    .line 61
    .line 62
    aget-wide v6, v3, v0

    .line 63
    .line 64
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    aget-object v7, v1, v0

    .line 73
    .line 74
    if-nez v6, :cond_0

    .line 75
    .line 76
    invoke-static {v7}, Lcom/alibaba/fastjson2/util/TypeUtils;->getDefaultValue(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    :cond_0
    aput-object v6, v5, v0

    .line 81
    .line 82
    add-int/lit8 v0, v0, 0x1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    :try_start_0
    invoke-virtual {v2, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    return-object p1

    .line 90
    :catch_0
    move-exception p1

    .line 91
    goto :goto_2

    .line 92
    :catch_1
    move-exception p1

    .line 93
    goto :goto_2

    .line 94
    :catch_2
    move-exception p1

    .line 95
    goto :goto_2

    .line 96
    :catch_3
    move-exception p1

    .line 97
    :goto_2
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 98
    .line 99
    new-instance v1, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-direct {v0, v1, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    throw v0

    .line 115
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_3
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->function:Ljava/util/function/Function;

    .line 119
    .line 120
    const/4 v2, 0x1

    .line 121
    if-eqz v1, :cond_6

    .line 122
    .line 123
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->parameterTypes:[Ljava/lang/Class;

    .line 124
    .line 125
    array-length v1, v1

    .line 126
    if-ne v1, v2, :cond_6

    .line 127
    .line 128
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->hashCodes:[J

    .line 129
    .line 130
    aget-wide v2, v1, v0

    .line 131
    .line 132
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->parameterTypes:[Ljava/lang/Class;

    .line 141
    .line 142
    aget-object v0, v1, v0

    .line 143
    .line 144
    if-nez p1, :cond_4

    .line 145
    .line 146
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getDefaultValue(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    goto :goto_3

    .line 151
    :cond_4
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-nez v1, :cond_5

    .line 156
    .line 157
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 158
    .line 159
    invoke-static {p1, v0, v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->cast(Ljava/lang/Object;Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    :cond_5
    :goto_3
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->function:Ljava/util/function/Function;

    .line 164
    .line 165
    invoke-interface {v0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    return-object p1

    .line 170
    :cond_6
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->biFunction:Ljava/util/function/BiFunction;

    .line 171
    .line 172
    if-eqz v1, :cond_b

    .line 173
    .line 174
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->parameterTypes:[Ljava/lang/Class;

    .line 175
    .line 176
    array-length v1, v1

    .line 177
    const/4 v3, 0x2

    .line 178
    if-ne v1, v3, :cond_b

    .line 179
    .line 180
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->hashCodes:[J

    .line 181
    .line 182
    aget-wide v3, v1, v0

    .line 183
    .line 184
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->parameterTypes:[Ljava/lang/Class;

    .line 193
    .line 194
    aget-object v0, v3, v0

    .line 195
    .line 196
    if-nez v1, :cond_7

    .line 197
    .line 198
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getDefaultValue(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    goto :goto_4

    .line 203
    :cond_7
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    if-nez v3, :cond_8

    .line 208
    .line 209
    sget-object v3, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 210
    .line 211
    invoke-static {v1, v0, v3}, Lcom/alibaba/fastjson2/util/TypeUtils;->cast(Ljava/lang/Object;Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    :cond_8
    :goto_4
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->hashCodes:[J

    .line 216
    .line 217
    aget-wide v3, v0, v2

    .line 218
    .line 219
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->parameterTypes:[Ljava/lang/Class;

    .line 228
    .line 229
    aget-object v0, v0, v2

    .line 230
    .line 231
    if-nez p1, :cond_9

    .line 232
    .line 233
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getDefaultValue(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    goto :goto_5

    .line 238
    :cond_9
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    if-nez v2, :cond_a

    .line 243
    .line 244
    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 245
    .line 246
    invoke-static {p1, v0, v2}, Lcom/alibaba/fastjson2/util/TypeUtils;->cast(Ljava/lang/Object;Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    :cond_a
    :goto_5
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->biFunction:Ljava/util/function/BiFunction;

    .line 251
    .line 252
    invoke-interface {v0, v1, p1}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    return-object p1

    .line 257
    :cond_b
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->parameterTypes:[Ljava/lang/Class;

    .line 258
    .line 259
    array-length v1, v1

    .line 260
    iget v3, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->parameterCount:I

    .line 261
    .line 262
    new-array v3, v3, [Ljava/lang/Object;

    .line 263
    .line 264
    iget-boolean v5, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->kotlinMaker:Z

    .line 265
    .line 266
    if-eqz v5, :cond_10

    .line 267
    .line 268
    move v5, v0

    .line 269
    move v6, v5

    .line 270
    :goto_6
    if-ge v5, v1, :cond_15

    .line 271
    .line 272
    iget-object v7, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->hashCodes:[J

    .line 273
    .line 274
    aget-wide v8, v7, v5

    .line 275
    .line 276
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 277
    .line 278
    .line 279
    move-result-object v7

    .line 280
    invoke-interface {p1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v7

    .line 284
    if-eqz v7, :cond_c

    .line 285
    .line 286
    aput-object v7, v3, v5

    .line 287
    .line 288
    goto :goto_7

    .line 289
    :cond_c
    shl-int v7, v2, v5

    .line 290
    .line 291
    or-int/2addr v6, v7

    .line 292
    iget-object v7, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->parameterTypes:[Ljava/lang/Class;

    .line 293
    .line 294
    aget-object v7, v7, v5

    .line 295
    .line 296
    invoke-virtual {v7}, Ljava/lang/Class;->isPrimitive()Z

    .line 297
    .line 298
    .line 299
    move-result v8

    .line 300
    if-eqz v8, :cond_d

    .line 301
    .line 302
    invoke-static {v7}, Lcom/alibaba/fastjson2/util/TypeUtils;->getDefaultValue(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v7

    .line 306
    aput-object v7, v3, v5

    .line 307
    .line 308
    :cond_d
    :goto_7
    add-int/lit8 v7, v5, 0x1

    .line 309
    .line 310
    rem-int/lit8 v8, v7, 0x20

    .line 311
    .line 312
    if-eqz v8, :cond_e

    .line 313
    .line 314
    if-ne v7, v1, :cond_f

    .line 315
    .line 316
    :cond_e
    div-int/lit8 v5, v5, 0x20

    .line 317
    .line 318
    add-int/2addr v5, v1

    .line 319
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 320
    .line 321
    .line 322
    move-result-object v6

    .line 323
    aput-object v6, v3, v5

    .line 324
    .line 325
    move v6, v0

    .line 326
    :cond_f
    move v5, v7

    .line 327
    goto :goto_6

    .line 328
    :cond_10
    :goto_8
    if-ge v0, v1, :cond_15

    .line 329
    .line 330
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->parameterTypes:[Ljava/lang/Class;

    .line 331
    .line 332
    aget-object v2, v2, v0

    .line 333
    .line 334
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->hashCodes:[J

    .line 335
    .line 336
    aget-wide v6, v5, v0

    .line 337
    .line 338
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 339
    .line 340
    .line 341
    move-result-object v5

    .line 342
    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v5

    .line 346
    if-nez v5, :cond_11

    .line 347
    .line 348
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/TypeUtils;->getDefaultValue(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    goto :goto_9

    .line 353
    :cond_11
    invoke-virtual {v2, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result v6

    .line 357
    if-nez v6, :cond_12

    .line 358
    .line 359
    sget-object v6, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 360
    .line 361
    invoke-static {v5, v2, v6}, Lcom/alibaba/fastjson2/util/TypeUtils;->cast(Ljava/lang/Object;Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v5

    .line 365
    goto :goto_9

    .line 366
    :cond_12
    const-class v6, Ljava/util/Collection;

    .line 367
    .line 368
    invoke-virtual {v6, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 369
    .line 370
    .line 371
    move-result v6

    .line 372
    if-nez v6, :cond_13

    .line 373
    .line 374
    const-class v6, Ljava/util/Map;

    .line 375
    .line 376
    invoke-virtual {v6, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 377
    .line 378
    .line 379
    move-result v2

    .line 380
    if-eqz v2, :cond_14

    .line 381
    .line 382
    :cond_13
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->constructor:Ljava/lang/reflect/Constructor;

    .line 383
    .line 384
    invoke-virtual {v2}, Ljava/lang/reflect/Constructor;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    array-length v6, v2

    .line 389
    iget-object v7, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->parameterTypes:[Ljava/lang/Class;

    .line 390
    .line 391
    array-length v7, v7

    .line 392
    if-ne v6, v7, :cond_14

    .line 393
    .line 394
    aget-object v2, v2, v0

    .line 395
    .line 396
    invoke-static {v5, v2}, Lcom/alibaba/fastjson2/util/TypeUtils;->cast(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v5

    .line 400
    :cond_14
    :goto_9
    aput-object v5, v3, v0

    .line 401
    .line 402
    add-int/lit8 v0, v0, 0x1

    .line 403
    .line 404
    goto :goto_8

    .line 405
    :cond_15
    :try_start_1
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->constructor:Ljava/lang/reflect/Constructor;

    .line 406
    .line 407
    invoke-virtual {p1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_4

    .line 411
    return-object p1

    .line 412
    :catch_4
    move-exception p1

    .line 413
    goto :goto_a

    .line 414
    :catch_5
    move-exception p1

    .line 415
    goto :goto_a

    .line 416
    :catch_6
    move-exception p1

    .line 417
    goto :goto_a

    .line 418
    :catch_7
    move-exception p1

    .line 419
    :goto_a
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ConstructorFunction;->constructor:Ljava/lang/reflect/Constructor;

    .line 420
    .line 421
    invoke-static {v4, v0, p1}, Lah/a;->o(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 422
    .line 423
    .line 424
    const/4 p1, 0x0

    .line 425
    return-object p1
.end method
