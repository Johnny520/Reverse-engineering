.class final Lcom/alibaba/fastjson2/reader/ObjectReaderException;
.super Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter<",
        "TT;>;"
    }
.end annotation


# static fields
.field static final HASH_CAUSE:J

.field static final HASH_DETAIL_MESSAGE:J

.field static final HASH_LOCALIZED_MESSAGE:J

.field static final HASH_MESSAGE:J

.field static final HASH_STACKTRACE:J

.field static final HASH_SUPPRESSED_EXCEPTIONS:J

.field static final HASH_TYPE:J


# instance fields
.field final constructorCause:Ljava/lang/reflect/Constructor;

.field final constructorDefault:Ljava/lang/reflect/Constructor;

.field final constructorMessage:Ljava/lang/reflect/Constructor;

.field final constructorMessageCause:Ljava/lang/reflect/Constructor;

.field final constructorParameters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final constructors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/reflect/Constructor;",
            ">;"
        }
    .end annotation
.end field

.field private final fieldReaderStackTrace:Lcom/alibaba/fastjson2/reader/FieldReader;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "@type"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sput-wide v0, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->HASH_TYPE:J

    .line 8
    .line 9
    const-string v0, "message"

    .line 10
    .line 11
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sput-wide v0, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->HASH_MESSAGE:J

    .line 16
    .line 17
    const-string v0, "detailMessage"

    .line 18
    .line 19
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    sput-wide v0, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->HASH_DETAIL_MESSAGE:J

    .line 24
    .line 25
    const-string v0, "localizedMessage"

    .line 26
    .line 27
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    sput-wide v0, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->HASH_LOCALIZED_MESSAGE:J

    .line 32
    .line 33
    const-string v0, "cause"

    .line 34
    .line 35
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    sput-wide v0, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->HASH_CAUSE:J

    .line 40
    .line 41
    const-string v0, "stackTrace"

    .line 42
    .line 43
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    sput-wide v0, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->HASH_STACKTRACE:J

    .line 48
    .line 49
    const-string v0, "suppressedExceptions"

    .line 50
    .line 51
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    sput-wide v0, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->HASH_SUPPRESSED_EXCEPTIONS:J

    .line 56
    .line 57
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;)V"
        }
    .end annotation

    .line 221
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/BeanUtils;->getConstructor(Ljava/lang/Class;)[Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/alibaba/fastjson2/reader/d;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 222
    const-string v2, "stackTrace"

    const-class v3, [Ljava/lang/StackTraceElement;

    invoke-static {v2, v3, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaders;->fieldReader(Ljava/lang/String;Ljava/lang/Class;Ljava/util/function/BiConsumer;)Lcom/alibaba/fastjson2/reader/FieldReader;

    move-result-object v1

    filled-new-array {v1}, [Lcom/alibaba/fastjson2/reader/FieldReader;

    move-result-object v1

    .line 223
    invoke-direct {p0, p1, v0, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderException;-><init>(Ljava/lang/Class;Ljava/util/List;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/Class;Ljava/util/List;[Lcom/alibaba/fastjson2/reader/FieldReader;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Constructor;",
            ">;[",
            "Lcom/alibaba/fastjson2/reader/FieldReader;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v9, p2

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    const/4 v6, 0x0

    .line 8
    const/4 v7, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    const-wide/16 v4, 0x0

    .line 11
    .line 12
    move-object/from16 v0, p0

    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    move-object/from16 v8, p3

    .line 17
    .line 18
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    .line 19
    .line 20
    .line 21
    iput-object v9, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->constructors:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    const/4 v10, 0x0

    .line 36
    if-eqz v6, :cond_4

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    check-cast v6, Ljava/lang/reflect/Constructor;

    .line 43
    .line 44
    if-eqz v6, :cond_0

    .line 45
    .line 46
    if-nez v4, :cond_0

    .line 47
    .line 48
    invoke-virtual {v6}, Ljava/lang/reflect/Constructor;->getParameterCount()I

    .line 49
    .line 50
    .line 51
    move-result v11

    .line 52
    if-nez v11, :cond_1

    .line 53
    .line 54
    move-object v2, v6

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-virtual {v6}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v12

    .line 60
    aget-object v10, v12, v10

    .line 61
    .line 62
    const-class v13, Ljava/lang/Throwable;

    .line 63
    .line 64
    const-class v14, Ljava/lang/String;

    .line 65
    .line 66
    const/4 v15, 0x1

    .line 67
    if-ne v11, v15, :cond_3

    .line 68
    .line 69
    if-ne v10, v14, :cond_2

    .line 70
    .line 71
    move-object v3, v6

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    invoke-virtual {v13, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 74
    .line 75
    .line 76
    move-result v16

    .line 77
    if-eqz v16, :cond_3

    .line 78
    .line 79
    move-object v5, v6

    .line 80
    :cond_3
    :goto_1
    const/4 v7, 0x2

    .line 81
    if-ne v11, v7, :cond_0

    .line 82
    .line 83
    if-ne v10, v14, :cond_0

    .line 84
    .line 85
    aget-object v7, v12, v15

    .line 86
    .line 87
    invoke-virtual {v13, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    if-eqz v7, :cond_0

    .line 92
    .line 93
    move-object v4, v6

    .line 94
    goto :goto_0

    .line 95
    :cond_4
    iput-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->constructorDefault:Ljava/lang/reflect/Constructor;

    .line 96
    .line 97
    iput-object v3, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->constructorMessage:Ljava/lang/reflect/Constructor;

    .line 98
    .line 99
    iput-object v4, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->constructorMessageCause:Ljava/lang/reflect/Constructor;

    .line 100
    .line 101
    iput-object v5, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->constructorCause:Ljava/lang/reflect/Constructor;

    .line 102
    .line 103
    new-instance v1, Lcom/alibaba/fastjson2/reader/e;

    .line 104
    .line 105
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-static {v9, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 109
    .line 110
    .line 111
    new-instance v1, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 118
    .line 119
    .line 120
    iput-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->constructorParameters:Ljava/util/List;

    .line 121
    .line 122
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_8

    .line 131
    .line 132
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    move-object v4, v1

    .line 137
    check-cast v4, Ljava/lang/reflect/Constructor;

    .line 138
    .line 139
    invoke-virtual {v4}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    array-length v1, v9

    .line 144
    if-lez v1, :cond_6

    .line 145
    .line 146
    invoke-static {v4}, Lcom/alibaba/fastjson2/util/BeanUtils;->lookupParameterNames(Ljava/lang/reflect/Constructor;)[Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v11

    .line 150
    new-instance v2, Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 151
    .line 152
    invoke-direct {v2}, Lcom/alibaba/fastjson2/codec/FieldInfo;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v4}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    move v5, v10

    .line 160
    :goto_3
    array-length v1, v9

    .line 161
    if-ge v5, v1, :cond_7

    .line 162
    .line 163
    array-length v1, v11

    .line 164
    if-ge v5, v1, :cond_7

    .line 165
    .line 166
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/codec/FieldInfo;->init()V

    .line 167
    .line 168
    .line 169
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 170
    .line 171
    move-object/from16 v3, p1

    .line 172
    .line 173
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Constructor;I[[Ljava/lang/annotation/Annotation;)V

    .line 174
    .line 175
    .line 176
    iget-object v1, v2, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldName:Ljava/lang/String;

    .line 177
    .line 178
    if-eqz v1, :cond_5

    .line 179
    .line 180
    aput-object v1, v11, v5

    .line 181
    .line 182
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_6
    const/4 v11, 0x0

    .line 186
    :cond_7
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->constructorParameters:Ljava/util/List;

    .line 187
    .line 188
    invoke-interface {v1, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_8
    array-length v1, v8

    .line 193
    const/4 v7, 0x0

    .line 194
    :goto_4
    if-ge v10, v1, :cond_a

    .line 195
    .line 196
    aget-object v2, v8, v10

    .line 197
    .line 198
    const-string v3, "stackTrace"

    .line 199
    .line 200
    iget-object v4, v2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-eqz v3, :cond_9

    .line 207
    .line 208
    iget-object v3, v2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 209
    .line 210
    const-class v4, [Ljava/lang/StackTraceElement;

    .line 211
    .line 212
    if-ne v3, v4, :cond_9

    .line 213
    .line 214
    move-object v7, v2

    .line 215
    :cond_9
    add-int/lit8 v10, v10, 0x1

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_a
    iput-object v7, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->fieldReaderStackTrace:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 219
    .line 220
    return-void
.end method

.method public static synthetic a(Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Constructor;)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->lambda$new$0(Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Constructor;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private createObject(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->constructorMessageCause:Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ljava/lang/Throwable;

    .line 18
    .line 19
    return-object p1

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->constructorMessage:Ljava/lang/reflect/Constructor;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Ljava/lang/Throwable;

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_1
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->constructorCause:Ljava/lang/reflect/Constructor;

    .line 40
    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    if-eqz p2, :cond_2

    .line 44
    .line 45
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {v2, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Ljava/lang/Throwable;

    .line 54
    .line 55
    return-object p1

    .line 56
    :cond_2
    if-eqz v0, :cond_4

    .line 57
    .line 58
    if-nez p2, :cond_3

    .line 59
    .line 60
    if-eqz p1, :cond_4

    .line 61
    .line 62
    :cond_3
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, Ljava/lang/Throwable;

    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_4
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->constructorDefault:Ljava/lang/reflect/Constructor;

    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    if-eqz v3, :cond_5

    .line 77
    .line 78
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Ljava/lang/Throwable;

    .line 83
    .line 84
    return-object p1

    .line 85
    :cond_5
    if-eqz v0, :cond_6

    .line 86
    .line 87
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    check-cast p1, Ljava/lang/Throwable;

    .line 96
    .line 97
    return-object p1

    .line 98
    :cond_6
    if-eqz v1, :cond_7

    .line 99
    .line 100
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    check-cast p1, Ljava/lang/Throwable;

    .line 109
    .line 110
    return-object p1

    .line 111
    :cond_7
    if-eqz v2, :cond_8

    .line 112
    .line 113
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {v2, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    check-cast p1, Ljava/lang/Throwable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    .line 123
    return-object p1

    .line 124
    :cond_8
    return-object v4

    .line 125
    :goto_0
    new-instance p2, Lcom/alibaba/fastjson2/JSONException;

    .line 126
    .line 127
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    new-instance v2, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    const-string v3, "create Exception error, class "

    .line 140
    .line 141
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string v0, ", "

    .line 148
    .line 149
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-direct {p2, v0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 160
    .line 161
    .line 162
    throw p2
.end method

.method private static synthetic lambda$new$0(Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Constructor;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getParameterCount()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterCount()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-ge p0, p1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    if-le p0, p1, :cond_1

    .line 14
    .line 15
    const/4 p0, -0x1

    .line 16
    return p0

    .line 17
    :cond_1
    const/4 p0, 0x0

    .line 18
    return p0
.end method


# virtual methods
.method public readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONReader;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            "J)TT;"
        }
    .end annotation

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
    iget-object v0, p1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 10
    .line 11
    invoke-virtual {p1, p4, p5}, Lcom/alibaba/fastjson2/JSONReader;->isSupportAutoType(J)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader$Context;->getContextAutoTypeBeforeHandler()Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v0, p0

    .line 25
    move-object v1, p1

    .line 26
    move-object v2, p2

    .line 27
    move-object v3, p3

    .line 28
    move-wide v4, p4

    .line 29
    goto :goto_2

    .line 30
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readTypeHashCode()J

    .line 34
    .line 35
    .line 36
    move-result-wide p4

    .line 37
    invoke-virtual {v0, p4, p5}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 38
    .line 39
    .line 40
    move-result-object p4

    .line 41
    if-nez p4, :cond_3

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p4

    .line 47
    const/4 p5, 0x0

    .line 48
    invoke-virtual {v0, p4, p5}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(Ljava/lang/String;Ljava/lang/Class;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 49
    .line 50
    .line 51
    move-result-object p5

    .line 52
    if-eqz p5, :cond_2

    .line 53
    .line 54
    move-object v0, p5

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    new-instance p2, Lcom/alibaba/fastjson2/JSONException;

    .line 57
    .line 58
    const-string p3, "autoType not support : "

    .line 59
    .line 60
    const-string p5, ", offset "

    .line 61
    .line 62
    invoke-static {p3, p4, p5}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getOffset()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {p2, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p2

    .line 81
    :cond_3
    move-object v0, p4

    .line 82
    :goto_1
    const-wide/16 v4, 0x0

    .line 83
    .line 84
    move-object v1, p1

    .line 85
    move-object v2, p2

    .line 86
    move-object v3, p3

    .line 87
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1

    .line 92
    :goto_2
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    return-object p1
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONReader;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            "J)TT;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-wide/from16 v2, p4

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectStart()Z

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    const/4 v5, 0x0

    .line 12
    if-nez v4, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNullOrEmptyString()Z

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    return-object v5

    .line 21
    :cond_0
    move-object v7, v5

    .line 22
    move-object v8, v7

    .line 23
    move-object v9, v8

    .line 24
    move-object v10, v9

    .line 25
    move-object v11, v10

    .line 26
    move-object v12, v11

    .line 27
    const/4 v6, 0x0

    .line 28
    :goto_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectEnd()Z

    .line 29
    .line 30
    .line 31
    move-result v13

    .line 32
    if-eqz v13, :cond_15

    .line 33
    .line 34
    invoke-direct {v1, v7, v8}, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->createObject(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-nez v2, :cond_a

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    :goto_1
    iget-object v6, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->constructors:Ljava/util/List;

    .line 42
    .line 43
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-ge v3, v6, :cond_a

    .line 48
    .line 49
    iget-object v6, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->constructorParameters:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    check-cast v6, [Ljava/lang/String;

    .line 56
    .line 57
    if-eqz v6, :cond_1

    .line 58
    .line 59
    array-length v13, v6

    .line 60
    if-nez v13, :cond_2

    .line 61
    .line 62
    :cond_1
    move-object/from16 p3, v5

    .line 63
    .line 64
    goto/16 :goto_6

    .line 65
    .line 66
    :cond_2
    const/4 v13, 0x1

    .line 67
    const/4 v14, 0x0

    .line 68
    :goto_2
    array-length v15, v6

    .line 69
    const-string v4, "message"

    .line 70
    .line 71
    move-object/from16 p3, v5

    .line 72
    .line 73
    const-string v5, "cause"

    .line 74
    .line 75
    if-ge v14, v15, :cond_5

    .line 76
    .line 77
    aget-object v15, v6, v14

    .line 78
    .line 79
    if-nez v15, :cond_3

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    goto :goto_3

    .line 83
    :cond_3
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-nez v5, :cond_4

    .line 88
    .line 89
    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-nez v4, :cond_4

    .line 94
    .line 95
    invoke-interface {v9, v15}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-nez v4, :cond_4

    .line 100
    .line 101
    const/4 v13, 0x0

    .line 102
    :cond_4
    add-int/lit8 v14, v14, 0x1

    .line 103
    .line 104
    move-object/from16 v5, p3

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_5
    :goto_3
    if-nez v13, :cond_6

    .line 108
    .line 109
    goto :goto_6

    .line 110
    :cond_6
    array-length v2, v6

    .line 111
    new-array v2, v2, [Ljava/lang/Object;

    .line 112
    .line 113
    const/4 v13, 0x0

    .line 114
    :goto_4
    array-length v14, v6

    .line 115
    if-ge v13, v14, :cond_9

    .line 116
    .line 117
    aget-object v14, v6, v13

    .line 118
    .line 119
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v14, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v15

    .line 126
    if-nez v15, :cond_8

    .line 127
    .line 128
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v15

    .line 132
    if-nez v15, :cond_7

    .line 133
    .line 134
    invoke-interface {v9, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v14

    .line 138
    goto :goto_5

    .line 139
    :cond_7
    move-object v14, v7

    .line 140
    goto :goto_5

    .line 141
    :cond_8
    move-object v14, v8

    .line 142
    :goto_5
    aput-object v14, v2, v13

    .line 143
    .line 144
    add-int/lit8 v13, v13, 0x1

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_9
    iget-object v4, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->constructors:Ljava/util/List;

    .line 148
    .line 149
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    check-cast v3, Ljava/lang/reflect/Constructor;

    .line 154
    .line 155
    :try_start_0
    invoke-virtual {v3, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    check-cast v2, Ljava/lang/Throwable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    .line 161
    goto :goto_7

    .line 162
    :catchall_0
    move-exception v0

    .line 163
    new-instance v2, Lcom/alibaba/fastjson2/JSONException;

    .line 164
    .line 165
    new-instance v4, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    const-string v5, "create error, objectClass "

    .line 168
    .line 169
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    const-string v5, ", "

    .line 180
    .line 181
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    invoke-direct {v2, v3, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 192
    .line 193
    .line 194
    throw v2

    .line 195
    :goto_6
    add-int/lit8 v3, v3, 0x1

    .line 196
    .line 197
    move-object/from16 v5, p3

    .line 198
    .line 199
    goto/16 :goto_1

    .line 200
    .line 201
    :cond_a
    move-object/from16 p3, v5

    .line 202
    .line 203
    :goto_7
    if-eqz v2, :cond_14

    .line 204
    .line 205
    if-eqz v11, :cond_e

    .line 206
    .line 207
    array-length v3, v11

    .line 208
    const/4 v4, 0x0

    .line 209
    const/4 v5, 0x0

    .line 210
    :goto_8
    if-ge v4, v3, :cond_c

    .line 211
    .line 212
    aget-object v6, v11, v4

    .line 213
    .line 214
    if-nez v6, :cond_b

    .line 215
    .line 216
    add-int/lit8 v5, v5, 0x1

    .line 217
    .line 218
    :cond_b
    add-int/lit8 v4, v4, 0x1

    .line 219
    .line 220
    goto :goto_8

    .line 221
    :cond_c
    array-length v3, v11

    .line 222
    if-eqz v3, :cond_d

    .line 223
    .line 224
    array-length v3, v11

    .line 225
    if-eq v5, v3, :cond_e

    .line 226
    .line 227
    :cond_d
    invoke-virtual {v2, v11}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 228
    .line 229
    .line 230
    :cond_e
    if-eqz v12, :cond_f

    .line 231
    .line 232
    iget-object v3, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->fieldReaderStackTrace:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 233
    .line 234
    invoke-static {v12}, Lcom/alibaba/fastjson2/JSONPath;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    invoke-virtual {v0, v3, v2, v4}, Lcom/alibaba/fastjson2/JSONReader;->addResolveTask(Lcom/alibaba/fastjson2/reader/FieldReader;Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONPath;)V

    .line 239
    .line 240
    .line 241
    :cond_f
    if-eqz v9, :cond_11

    .line 242
    .line 243
    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    :cond_10
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    if-eqz v4, :cond_11

    .line 256
    .line 257
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v4

    .line 261
    check-cast v4, Ljava/util/Map$Entry;

    .line 262
    .line 263
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    check-cast v5, Ljava/lang/String;

    .line 268
    .line 269
    invoke-interface {v1, v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getFieldReader(Ljava/lang/String;)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    if-eqz v5, :cond_10

    .line 274
    .line 275
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    invoke-virtual {v5, v2, v4}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    goto :goto_9

    .line 283
    :cond_11
    if-eqz v10, :cond_13

    .line 284
    .line 285
    invoke-interface {v10}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 294
    .line 295
    .line 296
    move-result v4

    .line 297
    if-eqz v4, :cond_13

    .line 298
    .line 299
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    check-cast v4, Ljava/util/Map$Entry;

    .line 304
    .line 305
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v5

    .line 309
    check-cast v5, Ljava/lang/String;

    .line 310
    .line 311
    invoke-interface {v1, v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getFieldReader(Ljava/lang/String;)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    if-nez v5, :cond_12

    .line 316
    .line 317
    goto :goto_a

    .line 318
    :cond_12
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    check-cast v4, Ljava/lang/String;

    .line 323
    .line 324
    invoke-virtual {v5, v0, v2, v4}, Lcom/alibaba/fastjson2/reader/FieldReader;->addResolveTask(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    goto :goto_a

    .line 328
    :cond_13
    return-object v2

    .line 329
    :cond_14
    iget-object v2, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 330
    .line 331
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    const-string v3, "not support : "

    .line 336
    .line 337
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    return-object p3

    .line 353
    :cond_15
    move-object/from16 p3, v5

    .line 354
    .line 355
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameHashCode()J

    .line 356
    .line 357
    .line 358
    move-result-wide v4

    .line 359
    if-nez v6, :cond_19

    .line 360
    .line 361
    sget-wide v13, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->HASH_TYPE:J

    .line 362
    .line 363
    cmp-long v13, v4, v13

    .line 364
    .line 365
    if-nez v13, :cond_19

    .line 366
    .line 367
    invoke-virtual {v0, v2, v3}, Lcom/alibaba/fastjson2/JSONReader;->isSupportAutoType(J)Z

    .line 368
    .line 369
    .line 370
    move-result v13

    .line 371
    if-eqz v13, :cond_19

    .line 372
    .line 373
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readTypeHashCode()J

    .line 374
    .line 375
    .line 376
    move-result-wide v4

    .line 377
    iget-object v13, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 378
    .line 379
    invoke-virtual {v1, v13, v4, v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->autoType(Lcom/alibaba/fastjson2/JSONReader$Context;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 380
    .line 381
    .line 382
    move-result-object v4

    .line 383
    if-nez v4, :cond_17

    .line 384
    .line 385
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v4

    .line 389
    iget-object v5, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 390
    .line 391
    invoke-virtual {v13, v4, v5, v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(Ljava/lang/String;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    if-eqz v5, :cond_16

    .line 396
    .line 397
    move-object v4, v5

    .line 398
    goto :goto_b

    .line 399
    :cond_16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 400
    .line 401
    const-string v3, "No suitable ObjectReader found for"

    .line 402
    .line 403
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    return-object p3

    .line 421
    :cond_17
    :goto_b
    if-ne v4, v1, :cond_18

    .line 422
    .line 423
    goto/16 :goto_f

    .line 424
    .line 425
    :cond_18
    invoke-interface {v4, v0}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    return-object v0

    .line 430
    :cond_19
    sget-wide v13, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->HASH_MESSAGE:J

    .line 431
    .line 432
    cmp-long v13, v4, v13

    .line 433
    .line 434
    if-eqz v13, :cond_28

    .line 435
    .line 436
    sget-wide v13, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->HASH_DETAIL_MESSAGE:J

    .line 437
    .line 438
    cmp-long v13, v4, v13

    .line 439
    .line 440
    if-nez v13, :cond_1a

    .line 441
    .line 442
    goto/16 :goto_e

    .line 443
    .line 444
    :cond_1a
    sget-wide v13, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->HASH_LOCALIZED_MESSAGE:J

    .line 445
    .line 446
    cmp-long v13, v4, v13

    .line 447
    .line 448
    if-nez v13, :cond_1b

    .line 449
    .line 450
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    goto/16 :goto_f

    .line 454
    .line 455
    :cond_1b
    sget-wide v13, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->HASH_CAUSE:J

    .line 456
    .line 457
    cmp-long v13, v4, v13

    .line 458
    .line 459
    const-class v14, Ljava/lang/Throwable;

    .line 460
    .line 461
    if-nez v13, :cond_1d

    .line 462
    .line 463
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->isReference()Z

    .line 464
    .line 465
    .line 466
    move-result v4

    .line 467
    if-eqz v4, :cond_1c

    .line 468
    .line 469
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readReference()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    goto/16 :goto_f

    .line 473
    .line 474
    :cond_1c
    invoke-virtual {v0, v14}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/lang/Class;)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v4

    .line 478
    move-object v8, v4

    .line 479
    check-cast v8, Ljava/lang/Throwable;

    .line 480
    .line 481
    goto/16 :goto_f

    .line 482
    .line 483
    :cond_1d
    sget-wide v15, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->HASH_STACKTRACE:J

    .line 484
    .line 485
    cmp-long v13, v4, v15

    .line 486
    .line 487
    if-nez v13, :cond_1f

    .line 488
    .line 489
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->isReference()Z

    .line 490
    .line 491
    .line 492
    move-result v4

    .line 493
    if-eqz v4, :cond_1e

    .line 494
    .line 495
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readReference()Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v12

    .line 499
    goto/16 :goto_f

    .line 500
    .line 501
    :cond_1e
    const-class v4, [Ljava/lang/StackTraceElement;

    .line 502
    .line 503
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/lang/Class;)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v4

    .line 507
    move-object v11, v4

    .line 508
    check-cast v11, [Ljava/lang/StackTraceElement;

    .line 509
    .line 510
    goto :goto_f

    .line 511
    :cond_1f
    sget-wide v15, Lcom/alibaba/fastjson2/reader/ObjectReaderException;->HASH_SUPPRESSED_EXCEPTIONS:J

    .line 512
    .line 513
    cmp-long v13, v4, v15

    .line 514
    .line 515
    if-nez v13, :cond_22

    .line 516
    .line 517
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->isReference()Z

    .line 518
    .line 519
    .line 520
    move-result v4

    .line 521
    if-eqz v4, :cond_20

    .line 522
    .line 523
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readReference()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    goto :goto_f

    .line 527
    :cond_20
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->getType()B

    .line 528
    .line 529
    .line 530
    move-result v4

    .line 531
    const/16 v5, -0x6e

    .line 532
    .line 533
    if-ne v4, v5, :cond_21

    .line 534
    .line 535
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readAny()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v4

    .line 539
    check-cast v4, Ljava/util/List;

    .line 540
    .line 541
    goto :goto_f

    .line 542
    :cond_21
    invoke-virtual {v0, v14}, Lcom/alibaba/fastjson2/JSONReader;->readArray(Ljava/lang/reflect/Type;)Ljava/util/List;

    .line 543
    .line 544
    .line 545
    goto :goto_f

    .line 546
    :cond_22
    invoke-virtual {v1, v4, v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->getFieldReader(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 547
    .line 548
    .line 549
    move-result-object v4

    .line 550
    if-nez v9, :cond_23

    .line 551
    .line 552
    new-instance v9, Ljava/util/HashMap;

    .line 553
    .line 554
    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 555
    .line 556
    .line 557
    :cond_23
    if-eqz v4, :cond_24

    .line 558
    .line 559
    iget-object v5, v4, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 560
    .line 561
    goto :goto_c

    .line 562
    :cond_24
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->getFieldName()Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v5

    .line 566
    :goto_c
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->isReference()Z

    .line 567
    .line 568
    .line 569
    move-result v13

    .line 570
    if-eqz v13, :cond_26

    .line 571
    .line 572
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readReference()Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v4

    .line 576
    if-nez v10, :cond_25

    .line 577
    .line 578
    new-instance v10, Ljava/util/HashMap;

    .line 579
    .line 580
    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 581
    .line 582
    .line 583
    :cond_25
    invoke-interface {v10, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    goto :goto_f

    .line 587
    :cond_26
    if-eqz v4, :cond_27

    .line 588
    .line 589
    invoke-virtual {v4, v0}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v4

    .line 593
    goto :goto_d

    .line 594
    :cond_27
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readAny()Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v4

    .line 598
    :goto_d
    invoke-interface {v9, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    goto :goto_f

    .line 602
    :cond_28
    :goto_e
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v7

    .line 606
    :goto_f
    add-int/lit8 v6, v6, 0x1

    .line 607
    .line 608
    move-object/from16 v5, p3

    .line 609
    .line 610
    goto/16 :goto_0
.end method
