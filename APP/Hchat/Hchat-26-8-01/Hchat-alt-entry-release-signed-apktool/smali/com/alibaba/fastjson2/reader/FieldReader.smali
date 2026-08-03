.class public abstract Lcom/alibaba/fastjson2/reader/FieldReader;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/alibaba/fastjson2/reader/FieldReader;",
        ">;"
    }
.end annotation


# instance fields
.field public final defaultValue:Ljava/lang/Object;

.field public final features:J

.field public final field:Ljava/lang/reflect/Field;

.field public final fieldClass:Ljava/lang/Class;

.field final fieldClassSerializable:Z

.field public final fieldName:Ljava/lang/String;

.field final fieldNameHash:J

.field final fieldNameHashLCase:J

.field protected final fieldOffset:J

.field public final fieldType:Ljava/lang/reflect/Type;

.field public final format:Ljava/lang/String;

.field itemClass:Ljava/lang/Class;

.field volatile itemReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field itemType:Ljava/lang/reflect/Type;

.field public final locale:Ljava/util/Locale;

.field public final method:Ljava/lang/reflect/Method;

.field final noneStaticMemberClass:Z

.field public final ordinal:I

.field final readOnly:Z

.field volatile reader:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field volatile referenceCache:Lcom/alibaba/fastjson2/JSONPath;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-wide/from16 v2, p5

    .line 6
    .line 7
    move-object/from16 v4, p10

    .line 8
    .line 9
    move-object/from16 v5, p11

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    move-object/from16 v6, p1

    .line 15
    .line 16
    iput-object v6, v0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 17
    .line 18
    move-object/from16 v7, p2

    .line 19
    .line 20
    iput-object v7, v0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldType:Ljava/lang/reflect/Type;

    .line 21
    .line 22
    iput-object v1, v0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 23
    .line 24
    const-class v7, Ljava/util/List;

    .line 25
    .line 26
    const-class v8, Ljava/lang/String;

    .line 27
    .line 28
    const/4 v9, 0x0

    .line 29
    const/4 v10, 0x1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    .line 33
    .line 34
    .line 35
    move-result v11

    .line 36
    if-nez v11, :cond_0

    .line 37
    .line 38
    if-eq v1, v8, :cond_0

    .line 39
    .line 40
    if-eq v1, v7, :cond_0

    .line 41
    .line 42
    const-class v11, Ljava/io/Serializable;

    .line 43
    .line 44
    invoke-virtual {v11, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 45
    .line 46
    .line 47
    move-result v11

    .line 48
    if-nez v11, :cond_0

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Class;->getModifiers()I

    .line 51
    .line 52
    .line 53
    move-result v11

    .line 54
    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isInterface(I)Z

    .line 55
    .line 56
    .line 57
    move-result v11

    .line 58
    if-eqz v11, :cond_1

    .line 59
    .line 60
    :cond_0
    move v11, v10

    .line 61
    goto :goto_0

    .line 62
    :cond_1
    move v11, v9

    .line 63
    :goto_0
    iput-boolean v11, v0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClassSerializable:Z

    .line 64
    .line 65
    iput-wide v2, v0, Lcom/alibaba/fastjson2/reader/FieldReader;->features:J

    .line 66
    .line 67
    invoke-static {v6}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 68
    .line 69
    .line 70
    move-result-wide v11

    .line 71
    iput-wide v11, v0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 72
    .line 73
    invoke-static {v6}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64LCase(Ljava/lang/String;)J

    .line 74
    .line 75
    .line 76
    move-result-wide v11

    .line 77
    iput-wide v11, v0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 78
    .line 79
    move/from16 v6, p4

    .line 80
    .line 81
    iput v6, v0, Lcom/alibaba/fastjson2/reader/FieldReader;->ordinal:I

    .line 82
    .line 83
    move-object/from16 v6, p7

    .line 84
    .line 85
    iput-object v6, v0, Lcom/alibaba/fastjson2/reader/FieldReader;->format:Ljava/lang/String;

    .line 86
    .line 87
    move-object/from16 v6, p8

    .line 88
    .line 89
    iput-object v6, v0, Lcom/alibaba/fastjson2/reader/FieldReader;->locale:Ljava/util/Locale;

    .line 90
    .line 91
    move-object/from16 v6, p9

    .line 92
    .line 93
    iput-object v6, v0, Lcom/alibaba/fastjson2/reader/FieldReader;->defaultValue:Ljava/lang/Object;

    .line 94
    .line 95
    iput-object v4, v0, Lcom/alibaba/fastjson2/reader/FieldReader;->method:Ljava/lang/reflect/Method;

    .line 96
    .line 97
    iput-object v5, v0, Lcom/alibaba/fastjson2/reader/FieldReader;->field:Ljava/lang/reflect/Field;

    .line 98
    .line 99
    const-wide/16 v11, 0x0

    .line 100
    .line 101
    if-eqz v5, :cond_2

    .line 102
    .line 103
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    if-nez v6, :cond_3

    .line 112
    .line 113
    :cond_2
    const-wide/high16 v13, 0x100000000000000L

    .line 114
    .line 115
    and-long/2addr v13, v2

    .line 116
    cmp-long v6, v13, v11

    .line 117
    .line 118
    if-eqz v6, :cond_4

    .line 119
    .line 120
    :cond_3
    move v6, v10

    .line 121
    goto :goto_1

    .line 122
    :cond_4
    move v6, v9

    .line 123
    :goto_1
    iput-boolean v6, v0, Lcom/alibaba/fastjson2/reader/FieldReader;->readOnly:Z

    .line 124
    .line 125
    const-wide/16 v13, -0x1

    .line 126
    .line 127
    if-eqz v5, :cond_5

    .line 128
    .line 129
    const-wide/high16 v15, 0x80000000000000L

    .line 130
    .line 131
    and-long/2addr v2, v15

    .line 132
    cmp-long v2, v2, v11

    .line 133
    .line 134
    if-nez v2, :cond_5

    .line 135
    .line 136
    sget-object v2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 137
    .line 138
    invoke-virtual {v2, v5}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 139
    .line 140
    .line 141
    move-result-wide v2

    .line 142
    goto :goto_2

    .line 143
    :cond_5
    move-wide v2, v13

    .line 144
    :goto_2
    iput-wide v2, v0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldOffset:J

    .line 145
    .line 146
    cmp-long v2, v2, v13

    .line 147
    .line 148
    if-nez v2, :cond_6

    .line 149
    .line 150
    if-eqz v5, :cond_6

    .line 151
    .line 152
    if-nez v4, :cond_6

    .line 153
    .line 154
    :try_start_0
    invoke-virtual {v5, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 155
    .line 156
    .line 157
    :catchall_0
    :cond_6
    if-eqz v1, :cond_a

    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    if-nez v2, :cond_a

    .line 164
    .line 165
    if-eq v1, v8, :cond_a

    .line 166
    .line 167
    if-eq v1, v7, :cond_a

    .line 168
    .line 169
    const-class v2, Ljava/util/Map;

    .line 170
    .line 171
    if-eq v1, v2, :cond_a

    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/lang/Class;->isEnum()Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-eqz v2, :cond_7

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_7
    if-eqz v4, :cond_8

    .line 181
    .line 182
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    goto :goto_3

    .line 187
    :cond_8
    if-eqz v5, :cond_9

    .line 188
    .line 189
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    goto :goto_3

    .line 194
    :cond_9
    const/4 v2, 0x0

    .line 195
    :goto_3
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/BeanUtils;->isNoneStaticMemberClass(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 196
    .line 197
    .line 198
    move-result v9

    .line 199
    :cond_a
    :goto_4
    iput-boolean v9, v0, Lcom/alibaba/fastjson2/reader/FieldReader;->noneStaticMemberClass:Z

    .line 200
    .line 201
    return-void
.end method

.method public static createFormattedObjectReader(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;Ljava/util/Locale;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 3

    .line 1
    if-eqz p2, :cond_e

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_e

    .line 8
    .line 9
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, -0x1

    .line 21
    sparse-switch v1, :sswitch_data_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :sswitch_0
    const-string v1, "java.sql.Timestamp"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v2, 0x4

    .line 35
    goto :goto_0

    .line 36
    :sswitch_1
    const-string v1, "java.sql.Time"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v2, 0x3

    .line 46
    goto :goto_0

    .line 47
    :sswitch_2
    const-string v1, "java.sql.Date"

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    const/4 v2, 0x2

    .line 57
    goto :goto_0

    .line 58
    :sswitch_3
    const-string v1, "[B"

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_3

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    const/4 v2, 0x1

    .line 68
    goto :goto_0

    .line 69
    :sswitch_4
    const-string v1, "byte[]"

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_4

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_4
    const/4 v2, 0x0

    .line 79
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 80
    .line 81
    .line 82
    const-class v0, Ljava/util/Calendar;

    .line 83
    .line 84
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_5

    .line 89
    .line 90
    invoke-static {p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplCalendar;->of(Ljava/lang/String;Ljava/util/Locale;)Lcom/alibaba/fastjson2/reader/ObjectReaderImplCalendar;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0

    .line 95
    :cond_5
    const-class v0, Ljava/util/Date;

    .line 96
    .line 97
    if-ne p1, v0, :cond_6

    .line 98
    .line 99
    invoke-static {p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;->of(Ljava/lang/String;Ljava/util/Locale;)Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :cond_6
    const-class v0, Ljava/time/ZonedDateTime;

    .line 105
    .line 106
    if-ne p1, v0, :cond_7

    .line 107
    .line 108
    invoke-static {p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplZonedDateTime;->of(Ljava/lang/String;Ljava/util/Locale;)Lcom/alibaba/fastjson2/reader/ObjectReaderImplZonedDateTime;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0

    .line 113
    :cond_7
    const-class v0, Ljava/time/LocalDateTime;

    .line 114
    .line 115
    if-ne p1, v0, :cond_8

    .line 116
    .line 117
    new-instance p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplLocalDateTime;

    .line 118
    .line 119
    invoke-direct {p0, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplLocalDateTime;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 120
    .line 121
    .line 122
    return-object p0

    .line 123
    :cond_8
    const-class v0, Ljava/time/LocalDate;

    .line 124
    .line 125
    if-ne p1, v0, :cond_9

    .line 126
    .line 127
    invoke-static {p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplLocalDate;->of(Ljava/lang/String;Ljava/util/Locale;)Lcom/alibaba/fastjson2/reader/ObjectReaderImplLocalDate;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0

    .line 132
    :cond_9
    const-class v0, Ljava/time/LocalTime;

    .line 133
    .line 134
    if-ne p1, v0, :cond_a

    .line 135
    .line 136
    new-instance p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplLocalTime;

    .line 137
    .line 138
    invoke-direct {p0, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplLocalTime;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 139
    .line 140
    .line 141
    return-object p0

    .line 142
    :cond_a
    const-class v0, Ljava/time/Instant;

    .line 143
    .line 144
    if-ne p1, v0, :cond_b

    .line 145
    .line 146
    invoke-static {p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInstant;->of(Ljava/lang/String;Ljava/util/Locale;)Lcom/alibaba/fastjson2/reader/ObjectReaderImplInstant;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0

    .line 151
    :cond_b
    const-class v0, Ljava/time/OffsetTime;

    .line 152
    .line 153
    if-ne p1, v0, :cond_c

    .line 154
    .line 155
    invoke-static {p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplOffsetTime;->of(Ljava/lang/String;Ljava/util/Locale;)Lcom/alibaba/fastjson2/reader/ObjectReaderImplOffsetTime;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    return-object p0

    .line 160
    :cond_c
    const-class v0, Ljava/time/OffsetDateTime;

    .line 161
    .line 162
    if-ne p1, v0, :cond_d

    .line 163
    .line 164
    invoke-static {p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplOffsetDateTime;->of(Ljava/lang/String;Ljava/util/Locale;)Lcom/alibaba/fastjson2/reader/ObjectReaderImplOffsetDateTime;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    return-object p0

    .line 169
    :cond_d
    const-class v0, Ljava/util/Optional;

    .line 170
    .line 171
    if-ne p1, v0, :cond_e

    .line 172
    .line 173
    invoke-static {p0, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplOptional;->of(Ljava/lang/reflect/Type;Ljava/lang/String;Ljava/util/Locale;)Lcom/alibaba/fastjson2/reader/ObjectReaderImplOptional;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    return-object p0

    .line 178
    :pswitch_0
    new-instance p0, Lcom/alibaba/fastjson2/util/JdbcSupport$TimestampReader;

    .line 179
    .line 180
    invoke-direct {p0, p2, p3}, Lcom/alibaba/fastjson2/util/JdbcSupport$TimestampReader;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 181
    .line 182
    .line 183
    return-object p0

    .line 184
    :pswitch_1
    new-instance p0, Lcom/alibaba/fastjson2/util/JdbcSupport$TimeReader;

    .line 185
    .line 186
    invoke-direct {p0, p2, p3}, Lcom/alibaba/fastjson2/util/JdbcSupport$TimeReader;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 187
    .line 188
    .line 189
    return-object p0

    .line 190
    :pswitch_2
    new-instance p0, Lcom/alibaba/fastjson2/util/JdbcSupport$DateReader;

    .line 191
    .line 192
    invoke-direct {p0, p2, p3}, Lcom/alibaba/fastjson2/util/JdbcSupport$DateReader;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 193
    .line 194
    .line 195
    return-object p0

    .line 196
    :pswitch_3
    new-instance p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt8Array;

    .line 197
    .line 198
    invoke-direct {p0, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInt8Array;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    return-object p0

    .line 202
    :cond_e
    const/4 p0, 0x0

    .line 203
    return-object p0

    .line 204
    nop

    .line 205
    :sswitch_data_0
    .sparse-switch
        -0x51e5b596 -> :sswitch_4
        0xb47 -> :sswitch_3
        0x40d5de3a -> :sswitch_2
        0x40dd4159 -> :sswitch_1
        0x4aad720a -> :sswitch_0
    .end sparse-switch

    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static needCompareToActualFieldClass(Ljava/lang/Class;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method


# virtual methods
.method public accept(Ljava/lang/Object;B)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;B)V"
        }
    .end annotation

    .line 9
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public accept(Ljava/lang/Object;C)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;C)V"
        }
    .end annotation

    .line 13
    invoke-static {p2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public accept(Ljava/lang/Object;D)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;D)V"
        }
    .end annotation

    .line 15
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public accept(Ljava/lang/Object;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;F)V"
        }
    .end annotation

    .line 14
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public accept(Ljava/lang/Object;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)V"
        }
    .end annotation

    .line 11
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public accept(Ljava/lang/Object;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;J)V"
        }
    .end annotation

    .line 12
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public abstract accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation
.end method

.method public accept(Ljava/lang/Object;S)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;S)V"
        }
    .end annotation

    .line 10
    invoke-static {p2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public accept(Ljava/lang/Object;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Z)V"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public acceptAny(Ljava/lang/Object;Ljava/lang/Object;J)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Object;",
            "J)V"
        }
    .end annotation

    .line 1
    move-wide v5, p3

    .line 2
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 3
    .line 4
    const-wide/16 v1, 0x0

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    if-eqz p2, :cond_5

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v7

    .line 14
    invoke-virtual {p0, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->supportAcceptType(Ljava/lang/Class;)Z

    .line 15
    .line 16
    .line 17
    move-result v8

    .line 18
    if-nez v8, :cond_5

    .line 19
    .line 20
    const-class v8, Ljava/lang/String;

    .line 21
    .line 22
    if-ne v7, v8, :cond_0

    .line 23
    .line 24
    iget-object v8, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 25
    .line 26
    const-class v9, Ljava/util/Date;

    .line 27
    .line 28
    if-ne v8, v9, :cond_3

    .line 29
    .line 30
    move-object v8, p2

    .line 31
    move v9, v3

    .line 32
    goto :goto_2

    .line 33
    :cond_0
    const-class v8, Ljava/lang/Integer;

    .line 34
    .line 35
    if-ne v7, v8, :cond_3

    .line 36
    .line 37
    iget-object v8, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 38
    .line 39
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 40
    .line 41
    if-eq v8, v9, :cond_1

    .line 42
    .line 43
    const-class v9, Ljava/lang/Boolean;

    .line 44
    .line 45
    if-ne v8, v9, :cond_3

    .line 46
    .line 47
    :cond_1
    sget-object v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->NonZeroNumberCastToBooleanAsTrue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 48
    .line 49
    iget-wide v8, v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 50
    .line 51
    and-long/2addr v8, v5

    .line 52
    cmp-long v8, v8, v1

    .line 53
    .line 54
    if-eqz v8, :cond_3

    .line 55
    .line 56
    move-object v8, p2

    .line 57
    check-cast v8, Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-eqz v8, :cond_2

    .line 64
    .line 65
    move v8, v4

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    move v8, v3

    .line 68
    :goto_0
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    :goto_1
    move v9, v4

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    move-object v8, p2

    .line 75
    goto :goto_1

    .line 76
    :goto_2
    iget-object v10, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 77
    .line 78
    if-eq v7, v10, :cond_4

    .line 79
    .line 80
    if-eqz v9, :cond_4

    .line 81
    .line 82
    invoke-virtual {v0, v7, v10}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getTypeConvert(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    if-eqz v7, :cond_4

    .line 87
    .line 88
    invoke-interface {v7, v8}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    goto :goto_3

    .line 93
    :cond_4
    move-object v7, v8

    .line 94
    goto :goto_3

    .line 95
    :cond_5
    move-object v7, p2

    .line 96
    move v9, v4

    .line 97
    :goto_3
    if-eqz v7, :cond_d

    .line 98
    .line 99
    iget-object v8, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldType:Ljava/lang/reflect/Type;

    .line 100
    .line 101
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    if-ne v8, v10, :cond_6

    .line 106
    .line 107
    goto/16 :goto_7

    .line 108
    .line 109
    :cond_6
    instance-of v8, v7, Lcom/alibaba/fastjson2/JSONObject;

    .line 110
    .line 111
    if-eqz v8, :cond_8

    .line 112
    .line 113
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportSmartMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 114
    .line 115
    iget-wide v8, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 116
    .line 117
    and-long/2addr v5, v8

    .line 118
    cmp-long v1, v5, v1

    .line 119
    .line 120
    if-eqz v1, :cond_7

    .line 121
    .line 122
    new-array v1, v4, [Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 123
    .line 124
    aput-object v0, v1, v3

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_7
    new-array v1, v3, [Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 128
    .line 129
    :goto_4
    check-cast v7, Lcom/alibaba/fastjson2/JSONObject;

    .line 130
    .line 131
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldType:Ljava/lang/reflect/Type;

    .line 132
    .line 133
    invoke-virtual {v7, v0, v1}, Lcom/alibaba/fastjson2/JSONObject;->to(Ljava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    goto/16 :goto_7

    .line 138
    .line 139
    :cond_8
    instance-of v3, v7, Lcom/alibaba/fastjson2/JSONArray;

    .line 140
    .line 141
    if-eqz v3, :cond_9

    .line 142
    .line 143
    check-cast v7, Lcom/alibaba/fastjson2/JSONArray;

    .line 144
    .line 145
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldType:Ljava/lang/reflect/Type;

    .line 146
    .line 147
    invoke-virtual {v7, v0, p3, p4}, Lcom/alibaba/fastjson2/JSONArray;->to(Ljava/lang/reflect/Type;J)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    goto :goto_7

    .line 152
    :cond_9
    cmp-long v1, v5, v1

    .line 153
    .line 154
    if-nez v1, :cond_b

    .line 155
    .line 156
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 157
    .line 158
    invoke-virtual {v1, v7}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-nez v1, :cond_b

    .line 163
    .line 164
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->format:Ljava/lang/String;

    .line 165
    .line 166
    if-nez v1, :cond_b

    .line 167
    .line 168
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/reader/FieldReader;->getInitReader()Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    if-eqz v1, :cond_a

    .line 173
    .line 174
    invoke-static {v7}, Lcom/alibaba/fastjson2/JSON;->toJSONString(Ljava/lang/Object;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v0}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONReader;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    const/4 v3, 0x0

    .line 183
    const/4 v4, 0x0

    .line 184
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    :goto_5
    move-object v7, v0

    .line 189
    goto :goto_7

    .line 190
    :cond_a
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 191
    .line 192
    invoke-static {v7, v1, v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->cast(Ljava/lang/Object;Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    goto :goto_5

    .line 197
    :cond_b
    if-eqz v9, :cond_d

    .line 198
    .line 199
    invoke-static {v7}, Lcom/alibaba/fastjson2/JSON;->toJSONString(Ljava/lang/Object;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-static {p3, p4}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext(J)Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/lang/String;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    :try_start_0
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/reader/FieldReader;->getObjectReader(Lcom/alibaba/fastjson2/JSONReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 216
    .line 217
    const/4 v3, 0x0

    .line 218
    move-wide v5, p3

    .line 219
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 223
    if-eqz v2, :cond_d

    .line 224
    .line 225
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    .line 226
    .line 227
    .line 228
    goto :goto_7

    .line 229
    :catchall_0
    move-exception v0

    .line 230
    move-object v1, v0

    .line 231
    if-eqz v2, :cond_c

    .line 232
    .line 233
    :try_start_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 234
    .line 235
    .line 236
    goto :goto_6

    .line 237
    :catchall_1
    move-exception v0

    .line 238
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 239
    .line 240
    .line 241
    :cond_c
    :goto_6
    throw v1

    .line 242
    :cond_d
    :goto_7
    invoke-virtual {p0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    return-void
.end method

.method public acceptDefaultValue(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->defaultValue:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public acceptExtra(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public addResolveTask(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->referenceCache:Lcom/alibaba/fastjson2/JSONPath;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->referenceCache:Lcom/alibaba/fastjson2/JSONPath;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONPath;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->referenceCache:Lcom/alibaba/fastjson2/JSONPath;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-static {p3}, Lcom/alibaba/fastjson2/JSONPath;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->referenceCache:Lcom/alibaba/fastjson2/JSONPath;

    .line 25
    .line 26
    :goto_0
    invoke-virtual {p1, p0, p2, p3}, Lcom/alibaba/fastjson2/JSONReader;->addResolveTask(Lcom/alibaba/fastjson2/reader/FieldReader;Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONPath;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public addResolveTask(Lcom/alibaba/fastjson2/JSONReader;Ljava/util/List;ILjava/lang/String;)V
    .locals 0

    .line 30
    invoke-static {p4}, Lcom/alibaba/fastjson2/JSONPath;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath;

    move-result-object p4

    invoke-virtual {p1, p2, p3, p4}, Lcom/alibaba/fastjson2/JSONReader;->addResolveTask(Ljava/util/Collection;ILcom/alibaba/fastjson2/JSONPath;)V

    return-void
.end method

.method public checkObjectAutoType(Lcom/alibaba/fastjson2/JSONReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public compareTo(Lcom/alibaba/fastjson2/reader/FieldReader;)I
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p1, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    iget v3, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->ordinal:I

    .line 14
    .line 15
    iget p1, p1, Lcom/alibaba/fastjson2/reader/FieldReader;->ordinal:I

    .line 16
    .line 17
    if-ge v3, p1, :cond_0

    .line 18
    .line 19
    return v1

    .line 20
    :cond_0
    if-le v3, p1, :cond_1

    .line 21
    .line 22
    return v2

    .line 23
    :cond_1
    return v0

    .line 24
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/reader/FieldReader;->isReadOnly()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->isReadOnly()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const/4 v4, 0x0

    .line 33
    if-ne v0, v3, :cond_3

    .line 34
    .line 35
    move v0, v4

    .line 36
    goto :goto_0

    .line 37
    :cond_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/reader/FieldReader;->isReadOnly()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_4

    .line 42
    .line 43
    move v0, v2

    .line 44
    goto :goto_0

    .line 45
    :cond_4
    move v0, v1

    .line 46
    :goto_0
    if-eqz v0, :cond_5

    .line 47
    .line 48
    goto/16 :goto_9

    .line 49
    .line 50
    :cond_5
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->field:Ljava/lang/reflect/Field;

    .line 51
    .line 52
    if-eqz v3, :cond_6

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_6
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->method:Ljava/lang/reflect/Method;

    .line 56
    .line 57
    :goto_1
    iget-object v5, p1, Lcom/alibaba/fastjson2/reader/FieldReader;->field:Ljava/lang/reflect/Field;

    .line 58
    .line 59
    if-eqz v5, :cond_7

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_7
    iget-object v5, p1, Lcom/alibaba/fastjson2/reader/FieldReader;->method:Ljava/lang/reflect/Method;

    .line 63
    .line 64
    :goto_2
    if-eqz v3, :cond_9

    .line 65
    .line 66
    if-eqz v5, :cond_9

    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    if-eq v6, v7, :cond_9

    .line 77
    .line 78
    invoke-interface {v5}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-interface {v3}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    if-eq v3, v5, :cond_9

    .line 87
    .line 88
    invoke-virtual {v3, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-eqz v6, :cond_8

    .line 93
    .line 94
    return v2

    .line 95
    :cond_8
    invoke-virtual {v5, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_9

    .line 100
    .line 101
    return v1

    .line 102
    :cond_9
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->field:Ljava/lang/reflect/Field;

    .line 103
    .line 104
    const-class v5, Ljava/lang/Object;

    .line 105
    .line 106
    if-eqz v3, :cond_c

    .line 107
    .line 108
    iget-object v6, p1, Lcom/alibaba/fastjson2/reader/FieldReader;->field:Ljava/lang/reflect/Field;

    .line 109
    .line 110
    if-eqz v6, :cond_c

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    iget-object v6, p1, Lcom/alibaba/fastjson2/reader/FieldReader;->field:Ljava/lang/reflect/Field;

    .line 117
    .line 118
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    :goto_3
    if-eqz v7, :cond_b

    .line 127
    .line 128
    if-eq v7, v5, :cond_b

    .line 129
    .line 130
    if-ne v7, v6, :cond_a

    .line 131
    .line 132
    return v2

    .line 133
    :cond_a
    invoke-virtual {v7}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    goto :goto_3

    .line 138
    :cond_b
    invoke-virtual {v6}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    if-eqz v6, :cond_c

    .line 143
    .line 144
    if-eq v6, v5, :cond_c

    .line 145
    .line 146
    if-ne v6, v3, :cond_b

    .line 147
    .line 148
    return v1

    .line 149
    :cond_c
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->method:Ljava/lang/reflect/Method;

    .line 150
    .line 151
    if-eqz v3, :cond_1e

    .line 152
    .line 153
    iget-object v6, p1, Lcom/alibaba/fastjson2/reader/FieldReader;->method:Ljava/lang/reflect/Method;

    .line 154
    .line 155
    if-eqz v6, :cond_1e

    .line 156
    .line 157
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    iget-object v6, p1, Lcom/alibaba/fastjson2/reader/FieldReader;->method:Ljava/lang/reflect/Method;

    .line 162
    .line 163
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    :goto_4
    if-eqz v7, :cond_e

    .line 172
    .line 173
    if-eq v7, v5, :cond_e

    .line 174
    .line 175
    if-ne v7, v6, :cond_d

    .line 176
    .line 177
    return v1

    .line 178
    :cond_d
    invoke-virtual {v7}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    goto :goto_4

    .line 183
    :cond_e
    invoke-virtual {v6}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    :goto_5
    if-eqz v7, :cond_10

    .line 188
    .line 189
    if-eq v7, v5, :cond_10

    .line 190
    .line 191
    if-ne v7, v3, :cond_f

    .line 192
    .line 193
    return v2

    .line 194
    :cond_f
    invoke-virtual {v7}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    goto :goto_5

    .line 199
    :cond_10
    iget-object v7, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->method:Ljava/lang/reflect/Method;

    .line 200
    .line 201
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    iget-object v8, p1, Lcom/alibaba/fastjson2/reader/FieldReader;->method:Ljava/lang/reflect/Method;

    .line 206
    .line 207
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    move-result-object v8

    .line 211
    array-length v9, v7

    .line 212
    const/4 v10, 0x0

    .line 213
    if-ne v9, v2, :cond_1c

    .line 214
    .line 215
    array-length v9, v8

    .line 216
    if-ne v9, v2, :cond_1c

    .line 217
    .line 218
    aget-object v7, v7, v4

    .line 219
    .line 220
    aget-object v8, v8, v4

    .line 221
    .line 222
    if-eq v7, v8, :cond_1c

    .line 223
    .line 224
    invoke-virtual {v7, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 225
    .line 226
    .line 227
    move-result v9

    .line 228
    if-eqz v9, :cond_11

    .line 229
    .line 230
    return v2

    .line 231
    :cond_11
    invoke-virtual {v8, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 232
    .line 233
    .line 234
    move-result v9

    .line 235
    if-eqz v9, :cond_12

    .line 236
    .line 237
    return v1

    .line 238
    :cond_12
    const-class v9, Ljava/util/Collection;

    .line 239
    .line 240
    invoke-virtual {v9, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 241
    .line 242
    .line 243
    move-result v11

    .line 244
    if-eqz v11, :cond_13

    .line 245
    .line 246
    invoke-virtual {v9, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 247
    .line 248
    .line 249
    move-result v11

    .line 250
    if-nez v11, :cond_13

    .line 251
    .line 252
    return v2

    .line 253
    :cond_13
    invoke-virtual {v9, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 254
    .line 255
    .line 256
    move-result v11

    .line 257
    if-eqz v11, :cond_14

    .line 258
    .line 259
    invoke-virtual {v9, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 260
    .line 261
    .line 262
    move-result v9

    .line 263
    if-nez v9, :cond_14

    .line 264
    .line 265
    return v1

    .line 266
    :cond_14
    invoke-static {v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->needCompareToActualFieldClass(Ljava/lang/Class;)Z

    .line 267
    .line 268
    .line 269
    move-result v9

    .line 270
    if-nez v9, :cond_15

    .line 271
    .line 272
    invoke-static {v8}, Lcom/alibaba/fastjson2/reader/FieldReader;->needCompareToActualFieldClass(Ljava/lang/Class;)Z

    .line 273
    .line 274
    .line 275
    move-result v9

    .line 276
    if-eqz v9, :cond_1a

    .line 277
    .line 278
    :cond_15
    :try_start_0
    iget-object v9, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 279
    .line 280
    invoke-virtual {v3, v9}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 288
    if-nez v3, :cond_16

    .line 289
    .line 290
    :try_start_1
    iget-object v9, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 291
    .line 292
    invoke-virtual {v6, v9}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 293
    .line 294
    .line 295
    move-result-object v6

    .line 296
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    move-result-object v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1

    .line 300
    goto :goto_6

    .line 301
    :catch_0
    move-object v3, v10

    .line 302
    :catch_1
    :cond_16
    :goto_6
    if-eqz v3, :cond_1a

    .line 303
    .line 304
    :goto_7
    if-eqz v7, :cond_18

    .line 305
    .line 306
    if-eq v7, v5, :cond_18

    .line 307
    .line 308
    if-ne v7, v3, :cond_17

    .line 309
    .line 310
    return v1

    .line 311
    :cond_17
    invoke-virtual {v7}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    move-result-object v7

    .line 315
    goto :goto_7

    .line 316
    :cond_18
    :goto_8
    if-eqz v8, :cond_1a

    .line 317
    .line 318
    if-eq v8, v5, :cond_1a

    .line 319
    .line 320
    if-ne v8, v3, :cond_19

    .line 321
    .line 322
    return v2

    .line 323
    :cond_19
    invoke-virtual {v8}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    move-result-object v8

    .line 327
    goto :goto_8

    .line 328
    :cond_1a
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->method:Ljava/lang/reflect/Method;

    .line 329
    .line 330
    const-class v5, Lcom/alibaba/fastjson2/annotation/JSONField;

    .line 331
    .line 332
    invoke-static {v3, v5}, Lcom/alibaba/fastjson2/util/BeanUtils;->findAnnotation(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    check-cast v3, Lcom/alibaba/fastjson2/annotation/JSONField;

    .line 337
    .line 338
    iget-object v6, p1, Lcom/alibaba/fastjson2/reader/FieldReader;->method:Ljava/lang/reflect/Method;

    .line 339
    .line 340
    invoke-static {v6, v5}, Lcom/alibaba/fastjson2/util/BeanUtils;->findAnnotation(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 341
    .line 342
    .line 343
    move-result-object v5

    .line 344
    check-cast v5, Lcom/alibaba/fastjson2/annotation/JSONField;

    .line 345
    .line 346
    if-eqz v3, :cond_1b

    .line 347
    .line 348
    if-nez v5, :cond_1b

    .line 349
    .line 350
    return v1

    .line 351
    :cond_1b
    if-nez v3, :cond_1c

    .line 352
    .line 353
    if-eqz v5, :cond_1c

    .line 354
    .line 355
    return v2

    .line 356
    :cond_1c
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->method:Ljava/lang/reflect/Method;

    .line 357
    .line 358
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    iget-object v5, p1, Lcom/alibaba/fastjson2/reader/FieldReader;->method:Ljava/lang/reflect/Method;

    .line 363
    .line 364
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v5

    .line 368
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v6

    .line 372
    if-nez v6, :cond_1e

    .line 373
    .line 374
    invoke-static {v3, v10}, Lcom/alibaba/fastjson2/util/BeanUtils;->setterName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v3

    .line 378
    invoke-static {v5, v10}, Lcom/alibaba/fastjson2/util/BeanUtils;->setterName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v5

    .line 382
    iget-object v6, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 383
    .line 384
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v6

    .line 388
    if-eqz v6, :cond_1d

    .line 389
    .line 390
    iget-object v6, p1, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 391
    .line 392
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v6

    .line 396
    if-nez v6, :cond_1d

    .line 397
    .line 398
    return v2

    .line 399
    :cond_1d
    iget-object v6, p1, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 400
    .line 401
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result v5

    .line 405
    if-eqz v5, :cond_1e

    .line 406
    .line 407
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 408
    .line 409
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v3

    .line 413
    if-nez v3, :cond_1e

    .line 414
    .line 415
    return v1

    .line 416
    :cond_1e
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/reader/FieldReader;->getInitReader()Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->getInitReader()Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 421
    .line 422
    .line 423
    move-result-object v5

    .line 424
    if-eqz v3, :cond_1f

    .line 425
    .line 426
    if-nez v5, :cond_1f

    .line 427
    .line 428
    return v1

    .line 429
    :cond_1f
    if-nez v3, :cond_20

    .line 430
    .line 431
    if-eqz v5, :cond_20

    .line 432
    .line 433
    return v2

    .line 434
    :cond_20
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 435
    .line 436
    iget-object p1, p1, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 437
    .line 438
    invoke-virtual {v3}, Ljava/lang/Class;->isPrimitive()Z

    .line 439
    .line 440
    .line 441
    move-result v5

    .line 442
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 443
    .line 444
    .line 445
    move-result v6

    .line 446
    if-eqz v5, :cond_21

    .line 447
    .line 448
    if-nez v6, :cond_21

    .line 449
    .line 450
    return v1

    .line 451
    :cond_21
    if-nez v5, :cond_22

    .line 452
    .line 453
    if-eqz v6, :cond_22

    .line 454
    .line 455
    return v2

    .line 456
    :cond_22
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    const-string v5, "java."

    .line 461
    .line 462
    invoke-virtual {v3, v5, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 463
    .line 464
    .line 465
    move-result v3

    .line 466
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object p1

    .line 470
    invoke-virtual {p1, v5, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 471
    .line 472
    .line 473
    move-result p1

    .line 474
    if-eqz v3, :cond_23

    .line 475
    .line 476
    if-nez p1, :cond_23

    .line 477
    .line 478
    return v1

    .line 479
    :cond_23
    if-nez v3, :cond_24

    .line 480
    .line 481
    if-eqz p1, :cond_24

    .line 482
    .line 483
    return v2

    .line 484
    :cond_24
    :goto_9
    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 485
    check-cast p1, Lcom/alibaba/fastjson2/reader/FieldReader;

    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->compareTo(Lcom/alibaba/fastjson2/reader/FieldReader;)I

    move-result p1

    return p1
.end method

.method public getInitReader()Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public getItemClass()Ljava/lang/Class;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->itemType:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->itemClass:Ljava/lang/Class;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->itemClass:Ljava/lang/Class;

    .line 16
    .line 17
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->itemClass:Ljava/lang/Class;

    .line 18
    .line 19
    return-object v0
.end method

.method public getItemClassHash()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/reader/FieldReader;->getItemClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    return-wide v0
.end method

.method public getItemObjectReader(Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->itemReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->itemReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->itemType:Ljava/lang/reflect/Type;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->itemReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 15
    .line 16
    return-object p1
.end method

.method public getItemObjectReader(Lcom/alibaba/fastjson2/JSONReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 0

    .line 17
    iget-object p1, p1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->getItemObjectReader(Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p1

    return-object p1
.end method

.method public getItemType()Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->itemType:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    return-object v0
.end method

.method public getObjectReader(Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->reader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    if-eqz v0, :cond_0

    .line 34
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->reader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    return-object p1

    .line 35
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldType:Ljava/lang/reflect/Type;

    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p1

    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->reader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    return-object p1
.end method

.method public getObjectReader(Lcom/alibaba/fastjson2/JSONReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->reader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    if-eqz v0, :cond_0

    .line 37
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->reader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    return-object p1

    .line 38
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldType:Ljava/lang/reflect/Type;

    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p1

    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->reader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    return-object p1
.end method

.method public getObjectReader(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->reader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->reader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->features:J

    .line 9
    .line 10
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 11
    .line 12
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 13
    .line 14
    and-long/2addr v0, v2

    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    :goto_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldType:Ljava/lang/reflect/Type;

    .line 25
    .line 26
    invoke-virtual {p1, v1, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->reader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 31
    .line 32
    return-object p1
.end method

.method public isReadOnly()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->readOnly:Z

    .line 2
    .line 3
    return v0
.end method

.method public isUnwrapped()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->features:J

    .line 2
    .line 3
    const-wide/high16 v2, 0x2000000000000L

    .line 4
    .line 5
    and-long/2addr v0, v2

    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method public processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->skipValue()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public abstract readFieldValue(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;
.end method

.method public abstract readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONReader;",
            "TT;)V"
        }
    .end annotation
.end method

.method public readFieldValueJSONB(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONReader;",
            "TT;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public supportAcceptType(Ljava/lang/Class;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    return p1

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->method:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->field:Ljava/lang/reflect/Field;

    .line 7
    .line 8
    :goto_0
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 16
    .line 17
    return-object v0
.end method
