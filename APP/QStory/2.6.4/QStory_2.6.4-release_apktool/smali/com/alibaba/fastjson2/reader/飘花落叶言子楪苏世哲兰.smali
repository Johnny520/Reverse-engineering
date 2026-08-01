.class public abstract Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final 飘花落叶言子世楪兰哲苏:J

.field public final 飘花落叶言子世楪兰苏哲:J

.field public final 飘花落叶言子世楪哲兰苏:Z

.field public final 飘花落叶言子世楪哲苏兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

.field public final 飘花落叶言子世楪苏兰哲:Ljava/util/Locale;

.field public final 飘花落叶言子世楪苏哲兰:Ljava/lang/Object;

.field public volatile 飘花落叶言子世苏兰哲楪:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

.field public 飘花落叶言子世苏兰楪哲:Ljava/lang/reflect/Type;

.field public final 飘花落叶言子世苏哲兰楪:Z

.field public final 飘花落叶言子世苏哲楪兰:Z

.field public volatile 飘花落叶言子世苏楪兰哲:Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;

.field public volatile 飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

.field public final 飘花落叶言子楪兰世哲苏:J

.field public final 飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

.field public final 飘花落叶言子楪兰哲世苏:Ljava/lang/reflect/Field;

.field public final 飘花落叶言子楪兰哲苏世:J

.field public final 飘花落叶言子楪兰苏世哲:Ljava/lang/String;

.field public final 飘花落叶言子楪兰苏哲世:Ljava/lang/reflect/Method;

.field public final 飘花落叶言子楪哲兰世苏:Ljava/lang/String;

.field public final 飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

.field public final 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Lcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    const/4 v0, 0x1

    .line 12
    if-eqz p3, :cond_1

    .line 13
    .line 14
    const-class v1, Ljava/io/Serializable;

    .line 15
    .line 16
    invoke-virtual {v1, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p3}, Ljava/lang/Class;->getModifiers()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isInterface(I)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    invoke-static {p3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子世哲楪兰苏(Ljava/lang/Class;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    invoke-virtual {p3}, Ljava/lang/Class;->isPrimitive()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    :cond_0
    move v1, v0

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move v1, p2

    .line 47
    :goto_0
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪哲兰苏:Z

    .line 48
    .line 49
    iput-wide p5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 50
    .line 51
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    iput-wide v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪兰苏哲:J

    .line 56
    .line 57
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)J

    .line 58
    .line 59
    .line 60
    move-result-wide v1

    .line 61
    iput-wide v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪兰哲苏:J

    .line 62
    .line 63
    iput p4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 64
    .line 65
    iput-object p7, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏世哲:Ljava/lang/String;

    .line 66
    .line 67
    iput-object p8, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏兰哲:Ljava/util/Locale;

    .line 68
    .line 69
    iput-object p9, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏哲兰:Ljava/lang/Object;

    .line 70
    .line 71
    iput-object p10, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪哲苏兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 72
    .line 73
    iput-object p11, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/reflect/Method;

    .line 74
    .line 75
    iput-object p12, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏:Ljava/lang/reflect/Field;

    .line 76
    .line 77
    if-eqz p11, :cond_2

    .line 78
    .line 79
    invoke-virtual {p11}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-nez p1, :cond_2

    .line 84
    .line 85
    :goto_1
    move p1, v0

    .line 86
    goto :goto_2

    .line 87
    :cond_2
    if-eqz p12, :cond_3

    .line 88
    .line 89
    invoke-virtual {p12}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    invoke-static {p1}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_3

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    move p1, p2

    .line 101
    :goto_2
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏哲兰楪:Z

    .line 102
    .line 103
    const-wide/16 p7, -0x1

    .line 104
    .line 105
    if-eqz p12, :cond_4

    .line 106
    .line 107
    const-wide/high16 p9, 0x80000000000000L

    .line 108
    .line 109
    and-long p4, p5, p9

    .line 110
    .line 111
    const-wide/16 p9, 0x0

    .line 112
    .line 113
    cmp-long p1, p4, p9

    .line 114
    .line 115
    if-nez p1, :cond_4

    .line 116
    .line 117
    sget-object p1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 118
    .line 119
    invoke-virtual {p1, p12}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 120
    .line 121
    .line 122
    move-result-wide p4

    .line 123
    goto :goto_3

    .line 124
    :cond_4
    move-wide p4, p7

    .line 125
    :goto_3
    iput-wide p4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲苏世:J

    .line 126
    .line 127
    cmp-long p1, p4, p7

    .line 128
    .line 129
    if-nez p1, :cond_5

    .line 130
    .line 131
    if-eqz p12, :cond_5

    .line 132
    .line 133
    if-nez p11, :cond_5

    .line 134
    .line 135
    :try_start_0
    invoke-virtual {p12, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    .line 137
    .line 138
    goto :goto_4

    .line 139
    :catchall_0
    sget-object p1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪兰苏哲:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 142
    .line 143
    .line 144
    :cond_5
    :goto_4
    if-eqz p11, :cond_6

    .line 145
    .line 146
    invoke-virtual {p11}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    goto :goto_5

    .line 151
    :cond_6
    if-eqz p12, :cond_7

    .line 152
    .line 153
    invoke-virtual {p12}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    goto :goto_5

    .line 158
    :cond_7
    const/4 p1, 0x0

    .line 159
    :goto_5
    sget-object p4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:[Ljava/lang/reflect/Type;

    .line 160
    .line 161
    if-eqz p3, :cond_e

    .line 162
    .line 163
    invoke-virtual {p3}, Ljava/lang/Class;->isPrimitive()Z

    .line 164
    .line 165
    .line 166
    move-result p4

    .line 167
    if-nez p4, :cond_e

    .line 168
    .line 169
    const-class p4, Ljava/lang/String;

    .line 170
    .line 171
    if-eq p3, p4, :cond_e

    .line 172
    .line 173
    const-class p4, Ljava/util/List;

    .line 174
    .line 175
    if-ne p3, p4, :cond_8

    .line 176
    .line 177
    goto :goto_6

    .line 178
    :cond_8
    invoke-virtual {p3}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    move-result-object p4

    .line 182
    if-nez p4, :cond_9

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_9
    if-eqz p1, :cond_a

    .line 186
    .line 187
    invoke-virtual {p1, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    if-nez p1, :cond_a

    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_a
    sget-object p1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 195
    .line 196
    invoke-virtual {p1, p3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p5

    .line 200
    check-cast p5, [Ljava/lang/reflect/Constructor;

    .line 201
    .line 202
    if-nez p5, :cond_b

    .line 203
    .line 204
    invoke-virtual {p3}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 205
    .line 206
    .line 207
    move-result-object p5

    .line 208
    invoke-virtual {p1, p3, p5}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    :cond_b
    array-length p1, p5

    .line 212
    if-nez p1, :cond_c

    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_c
    aget-object p1, p5, p2

    .line 216
    .line 217
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterCount()I

    .line 218
    .line 219
    .line 220
    move-result p3

    .line 221
    if-nez p3, :cond_d

    .line 222
    .line 223
    goto :goto_6

    .line 224
    :cond_d
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    aget-object p1, p1, p2

    .line 229
    .line 230
    invoke-virtual {p4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result p2

    .line 234
    :cond_e
    :goto_6
    iput-boolean p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏哲楪兰:Z

    .line 235
    .line 236
    return-void
.end method

.method public static 飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;Ljava/util/Locale;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;
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
    invoke-static {p0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世(Ljava/lang/reflect/Type;)Ljava/lang/String;

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
    new-instance p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世苏楪兰;

    .line 91
    .line 92
    invoke-direct {p0, p2, p3}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 93
    .line 94
    .line 95
    return-object p0

    .line 96
    :cond_5
    const-class v0, Ljava/time/ZonedDateTime;

    .line 97
    .line 98
    if-ne p1, v0, :cond_6

    .line 99
    .line 100
    new-instance p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世哲兰苏;

    .line 101
    .line 102
    invoke-direct {p0, p2, p3}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 103
    .line 104
    .line 105
    return-object p0

    .line 106
    :cond_6
    const-class v0, Ljava/time/LocalDateTime;

    .line 107
    .line 108
    if-ne p1, v0, :cond_7

    .line 109
    .line 110
    new-instance p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世哲苏楪;

    .line 111
    .line 112
    invoke-direct {p0, p2, p3}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 113
    .line 114
    .line 115
    return-object p0

    .line 116
    :cond_7
    const-class v0, Ljava/time/LocalDate;

    .line 117
    .line 118
    if-ne p1, v0, :cond_8

    .line 119
    .line 120
    new-instance p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世哲楪苏;

    .line 121
    .line 122
    invoke-direct {p0, p2, p3}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 123
    .line 124
    .line 125
    return-object p0

    .line 126
    :cond_8
    const-class v0, Ljava/time/LocalTime;

    .line 127
    .line 128
    if-ne p1, v0, :cond_9

    .line 129
    .line 130
    new-instance p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏楪世哲;

    .line 131
    .line 132
    invoke-direct {p0, p2, p3}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 133
    .line 134
    .line 135
    return-object p0

    .line 136
    :cond_9
    const-class v0, Ljava/time/Instant;

    .line 137
    .line 138
    if-ne p1, v0, :cond_a

    .line 139
    .line 140
    new-instance p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰世楪苏;

    .line 141
    .line 142
    invoke-direct {p0, p2, p3}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 143
    .line 144
    .line 145
    return-object p0

    .line 146
    :cond_a
    const-class v0, Ljava/time/OffsetTime;

    .line 147
    .line 148
    if-ne p1, v0, :cond_b

    .line 149
    .line 150
    new-instance p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲世苏楪;

    .line 151
    .line 152
    invoke-direct {p0, p2, p3}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 153
    .line 154
    .line 155
    return-object p0

    .line 156
    :cond_b
    const-class v0, Ljava/time/OffsetDateTime;

    .line 157
    .line 158
    if-ne p1, v0, :cond_c

    .line 159
    .line 160
    new-instance p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲世楪苏;

    .line 161
    .line 162
    invoke-direct {p0, p2, p3}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 163
    .line 164
    .line 165
    return-object p0

    .line 166
    :cond_c
    const-class v0, Ljava/util/Optional;

    .line 167
    .line 168
    if-ne p1, v0, :cond_d

    .line 169
    .line 170
    new-instance p1, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;

    .line 171
    .line 172
    invoke-direct {p1, p0, p2, p3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰哲苏楪世;-><init>(Ljava/lang/reflect/Type;Ljava/lang/String;Ljava/util/Locale;)V

    .line 173
    .line 174
    .line 175
    return-object p1

    .line 176
    :cond_d
    const-class p0, Ljava/util/Date;

    .line 177
    .line 178
    if-ne p1, p0, :cond_e

    .line 179
    .line 180
    new-instance p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏楪世兰;

    .line 181
    .line 182
    invoke-direct {p0, p2, p3}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 183
    .line 184
    .line 185
    return-object p0

    .line 186
    :pswitch_0
    check-cast p0, Ljava/lang/Class;

    .line 187
    .line 188
    new-instance p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪哲苏兰;

    .line 189
    .line 190
    invoke-direct {p0, p2, p3}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 191
    .line 192
    .line 193
    return-object p0

    .line 194
    :pswitch_1
    check-cast p0, Ljava/lang/Class;

    .line 195
    .line 196
    new-instance p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪苏哲兰;

    .line 197
    .line 198
    invoke-direct {p0, p2, p3}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 199
    .line 200
    .line 201
    return-object p0

    .line 202
    :pswitch_2
    check-cast p0, Ljava/lang/Class;

    .line 203
    .line 204
    new-instance p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰哲苏世;

    .line 205
    .line 206
    invoke-direct {p0, p2, p3}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 207
    .line 208
    .line 209
    return-object p0

    .line 210
    :pswitch_3
    new-instance p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪苏哲世;

    .line 211
    .line 212
    invoke-direct {p0, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪苏哲世;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    return-object p0

    .line 216
    :cond_e
    const/4 p0, 0x0

    .line 217
    return-object p0

    .line 218
    nop

    .line 219
    :sswitch_data_0
    .sparse-switch
        -0x51e5b596 -> :sswitch_4
        0xb47 -> :sswitch_3
        0x40d5de3a -> :sswitch_2
        0x40dd4159 -> :sswitch_1
        0x4aad720a -> :sswitch_0
    .end sparse-switch

    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static 飘花落叶言子楪苏哲世兰(Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    sget-object p0, Lcom/alibaba/fastjson2/PropertyNamingStrategy;->CamelCase:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {v0, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子世苏楪哲兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    sget-object p0, Lcom/alibaba/fastjson2/PropertyNamingStrategy;->CamelCase:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {v0, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子世兰苏楪哲(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏:Ljava/lang/reflect/Field;

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
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_1
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 16
    .line 17
    return-object p0
.end method

.method public 飘花落叶言子世楪苏哲兰(Ljava/lang/Class;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final 飘花落叶言子楪世兰哲苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪兰哲:Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪兰哲:Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪兰哲:Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {p3}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪兰哲:Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;

    .line 23
    .line 24
    :goto_0
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    new-instance v0, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 34
    .line 35
    :cond_1
    iget-object p1, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/ArrayList;

    .line 36
    .line 37
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世苏兰;

    .line 38
    .line 39
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 40
    .line 41
    invoke-direct {v0, p0, p2, v1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世苏兰;-><init>(Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;Ljava/lang/Object;Ljava/lang/Object;Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public 飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏哲兰:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public 飘花落叶言子楪世哲苏兰(JLjava/lang/Object;Ljava/lang/Object;)V
    .locals 13

    .line 1
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v7, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 9
    .line 10
    const/4 v8, 0x1

    .line 11
    if-eqz p4, :cond_5

    .line 12
    .line 13
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v9

    .line 17
    invoke-virtual {p0, v9}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏哲兰(Ljava/lang/Class;)Z

    .line 18
    .line 19
    .line 20
    move-result v10

    .line 21
    if-nez v10, :cond_5

    .line 22
    .line 23
    const-class v10, Ljava/lang/String;

    .line 24
    .line 25
    if-ne v9, v10, :cond_0

    .line 26
    .line 27
    const-class v10, Ljava/util/Date;

    .line 28
    .line 29
    if-ne v7, v10, :cond_3

    .line 30
    .line 31
    move-object/from16 v10, p4

    .line 32
    .line 33
    move v11, v4

    .line 34
    goto :goto_2

    .line 35
    :cond_0
    const-class v10, Ljava/lang/Integer;

    .line 36
    .line 37
    if-ne v9, v10, :cond_3

    .line 38
    .line 39
    sget-object v10, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 40
    .line 41
    if-eq v7, v10, :cond_1

    .line 42
    .line 43
    const-class v10, Ljava/lang/Boolean;

    .line 44
    .line 45
    if-ne v7, v10, :cond_3

    .line 46
    .line 47
    :cond_1
    sget-object v10, Lcom/alibaba/fastjson2/JSONReader$Feature;->NonZeroNumberCastToBooleanAsTrue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 48
    .line 49
    iget-wide v10, v10, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 50
    .line 51
    and-long/2addr v10, p1

    .line 52
    cmp-long v10, v10, v2

    .line 53
    .line 54
    if-eqz v10, :cond_3

    .line 55
    .line 56
    move-object/from16 v10, p4

    .line 57
    .line 58
    check-cast v10, Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result v10

    .line 64
    if-eqz v10, :cond_2

    .line 65
    .line 66
    move v10, v8

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    move v10, v4

    .line 69
    :goto_0
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    :goto_1
    move v11, v8

    .line 74
    goto :goto_2

    .line 75
    :cond_3
    move-object/from16 v10, p4

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :goto_2
    if-eq v9, v7, :cond_4

    .line 79
    .line 80
    if-eqz v11, :cond_4

    .line 81
    .line 82
    invoke-virtual {v1, v9, v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏兰世哲(Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    if-eqz v9, :cond_4

    .line 87
    .line 88
    invoke-interface {v9, v10}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    goto :goto_3

    .line 93
    :cond_4
    move-object v9, v10

    .line 94
    goto :goto_3

    .line 95
    :cond_5
    move-object/from16 v9, p4

    .line 96
    .line 97
    move v11, v8

    .line 98
    :goto_3
    if-eqz v9, :cond_8

    .line 99
    .line 100
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v10

    .line 104
    iget-object v12, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 105
    .line 106
    if-eq v12, v10, :cond_8

    .line 107
    .line 108
    const-class v10, Ljava/lang/Object;

    .line 109
    .line 110
    if-ne v12, v10, :cond_6

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_6
    instance-of v10, v9, Lcom/alibaba/fastjson2/JSONObject;

    .line 114
    .line 115
    if-eqz v10, :cond_9

    .line 116
    .line 117
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportSmartMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 118
    .line 119
    iget-wide v10, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 120
    .line 121
    and-long v5, p1, v10

    .line 122
    .line 123
    cmp-long v2, v5, v2

    .line 124
    .line 125
    if-eqz v2, :cond_7

    .line 126
    .line 127
    new-array v2, v8, [Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 128
    .line 129
    aput-object v1, v2, v4

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_7
    new-array v2, v4, [Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 133
    .line 134
    :goto_4
    check-cast v9, Lcom/alibaba/fastjson2/JSONObject;

    .line 135
    .line 136
    invoke-virtual {v9, v12, v2}, Lcom/alibaba/fastjson2/JSONObject;->to(Ljava/lang/reflect/Type;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v9

    .line 140
    :cond_8
    :goto_5
    move-object/from16 v1, p3

    .line 141
    .line 142
    goto/16 :goto_8

    .line 143
    .line 144
    :cond_9
    instance-of v4, v9, Lcom/alibaba/fastjson2/JSONArray;

    .line 145
    .line 146
    if-eqz v4, :cond_a

    .line 147
    .line 148
    check-cast v9, Lcom/alibaba/fastjson2/JSONArray;

    .line 149
    .line 150
    invoke-virtual {v9, v12, p1, p2}, Lcom/alibaba/fastjson2/JSONArray;->to(Ljava/lang/reflect/Type;J)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v9

    .line 154
    goto :goto_5

    .line 155
    :cond_a
    cmp-long v2, p1, v2

    .line 156
    .line 157
    if-eqz v2, :cond_b

    .line 158
    .line 159
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportSmartMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 160
    .line 161
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 162
    .line 163
    cmp-long v2, p1, v2

    .line 164
    .line 165
    if-nez v2, :cond_d

    .line 166
    .line 167
    :cond_b
    invoke-virtual {v7, v9}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-nez v2, :cond_d

    .line 172
    .line 173
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏世哲:Ljava/lang/String;

    .line 174
    .line 175
    if-nez v2, :cond_d

    .line 176
    .line 177
    move-object v2, v1

    .line 178
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世()Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    if-eqz v1, :cond_c

    .line 183
    .line 184
    invoke-static {v9}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子苏世哲兰(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 193
    .line 194
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 195
    .line 196
    move-wide v5, p1

    .line 197
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    :goto_6
    move-object v9, v1

    .line 202
    goto :goto_5

    .line 203
    :cond_c
    invoke-static {v9, v12, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    goto :goto_6

    .line 208
    :cond_d
    if-eqz v11, :cond_8

    .line 209
    .line 210
    invoke-static {v9}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    new-instance v3, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 219
    .line 220
    invoke-direct {v3, v2, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;-><init>(Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;J)V

    .line 221
    .line 222
    .line 223
    invoke-static {v1, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子苏世兰哲(Ljava/lang/String;Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    :try_start_0
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 232
    .line 233
    const/4 v3, 0x0

    .line 234
    move-wide v5, p1

    .line 235
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 239
    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    .line 240
    .line 241
    .line 242
    goto :goto_5

    .line 243
    :catchall_0
    move-exception v0

    .line 244
    move-object v1, v0

    .line 245
    :try_start_1
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 246
    .line 247
    .line 248
    goto :goto_7

    .line 249
    :catchall_1
    move-exception v0

    .line 250
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 251
    .line 252
    .line 253
    :goto_7
    throw v1

    .line 254
    :goto_8
    invoke-virtual {p0, v1, v9}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    return-void
.end method

.method public abstract 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V
.end method

.method public abstract 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;J)V
.end method

.method public 飘花落叶言子楪兰世哲苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲兰子苏世()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public 飘花落叶言子楪兰世苏哲()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏哲兰楪:Z

    .line 2
    .line 3
    return p0
.end method

.method public abstract 飘花落叶言子楪兰哲世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;)V
.end method

.method public 飘花落叶言子楪兰哲苏世(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public abstract 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/lang/Object;
.end method

.method public final 飘花落叶言子楪哲世兰苏(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏兰哲楪:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏兰哲楪:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏兰楪哲:Ljava/lang/reflect/Type;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏兰哲楪:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 15
    .line 16
    return-object p1
.end method

.method public 飘花落叶言子楪哲兰世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰世楪哲(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 15
    .line 16
    return-object p1
.end method

.method public final 飘花落叶言子楪哲兰苏世(Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

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
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 25
    .line 26
    invoke-virtual {p1, v1, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 31
    .line 32
    return-object p1
.end method

.method public 飘花落叶言子楪哲苏兰世(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 15
    .line 16
    return-object p1
.end method

.method public final 飘花落叶言子楪苏世哲兰(Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏:Ljava/lang/reflect/Field;

    .line 8
    .line 9
    iget-object v4, v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/reflect/Method;

    .line 10
    .line 11
    iget-object v5, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v5, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v6, -0x1

    .line 18
    const/4 v7, 0x1

    .line 19
    if-eqz v2, :cond_2

    .line 20
    .line 21
    iget v1, v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 22
    .line 23
    iget v0, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 24
    .line 25
    if-ge v0, v1, :cond_0

    .line 26
    .line 27
    goto/16 :goto_d

    .line 28
    .line 29
    :cond_0
    if-le v0, v1, :cond_1

    .line 30
    .line 31
    goto/16 :goto_e

    .line 32
    .line 33
    :cond_1
    return v2

    .line 34
    :cond_2
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲()Z

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    const/4 v9, 0x0

    .line 43
    if-ne v2, v8, :cond_3

    .line 44
    .line 45
    move v2, v9

    .line 46
    goto :goto_0

    .line 47
    :cond_3
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_4

    .line 52
    .line 53
    move v2, v7

    .line 54
    goto :goto_0

    .line 55
    :cond_4
    move v2, v6

    .line 56
    :goto_0
    if-eqz v2, :cond_5

    .line 57
    .line 58
    goto/16 :goto_f

    .line 59
    .line 60
    :cond_5
    iget-object v8, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏:Ljava/lang/reflect/Field;

    .line 61
    .line 62
    iget-object v10, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/reflect/Method;

    .line 63
    .line 64
    if-eqz v8, :cond_6

    .line 65
    .line 66
    move-object v11, v8

    .line 67
    goto :goto_1

    .line 68
    :cond_6
    move-object v11, v10

    .line 69
    :goto_1
    if-eqz v3, :cond_7

    .line 70
    .line 71
    move-object v12, v3

    .line 72
    goto :goto_2

    .line 73
    :cond_7
    move-object v12, v4

    .line 74
    :goto_2
    if-eqz v11, :cond_9

    .line 75
    .line 76
    if-eqz v12, :cond_9

    .line 77
    .line 78
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v13

    .line 82
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v14

    .line 86
    if-eq v13, v14, :cond_9

    .line 87
    .line 88
    invoke-interface {v12}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v12

    .line 92
    invoke-interface {v11}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v11

    .line 96
    if-eq v11, v12, :cond_9

    .line 97
    .line 98
    invoke-virtual {v11, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 99
    .line 100
    .line 101
    move-result v13

    .line 102
    if-eqz v13, :cond_8

    .line 103
    .line 104
    goto/16 :goto_e

    .line 105
    .line 106
    :cond_8
    invoke-virtual {v12, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 107
    .line 108
    .line 109
    move-result v11

    .line 110
    if-eqz v11, :cond_9

    .line 111
    .line 112
    goto/16 :goto_d

    .line 113
    .line 114
    :cond_9
    const-class v11, Ljava/lang/Object;

    .line 115
    .line 116
    if-eqz v8, :cond_c

    .line 117
    .line 118
    if-eqz v3, :cond_c

    .line 119
    .line 120
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-virtual {v8}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-result-object v12

    .line 132
    :goto_3
    if-eqz v12, :cond_b

    .line 133
    .line 134
    if-eq v12, v11, :cond_b

    .line 135
    .line 136
    if-ne v12, v3, :cond_a

    .line 137
    .line 138
    goto/16 :goto_e

    .line 139
    .line 140
    :cond_a
    invoke-virtual {v12}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object v12

    .line 144
    goto :goto_3

    .line 145
    :cond_b
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    if-eqz v3, :cond_c

    .line 150
    .line 151
    if-eq v3, v11, :cond_c

    .line 152
    .line 153
    if-ne v3, v8, :cond_b

    .line 154
    .line 155
    goto/16 :goto_d

    .line 156
    .line 157
    :cond_c
    if-eqz v10, :cond_23

    .line 158
    .line 159
    if-eqz v4, :cond_23

    .line 160
    .line 161
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    if-eq v3, v8, :cond_10

    .line 170
    .line 171
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    move-result-object v12

    .line 175
    :goto_4
    if-eqz v12, :cond_e

    .line 176
    .line 177
    if-eq v12, v11, :cond_e

    .line 178
    .line 179
    if-ne v12, v8, :cond_d

    .line 180
    .line 181
    goto/16 :goto_d

    .line 182
    .line 183
    :cond_d
    invoke-virtual {v12}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    move-result-object v12

    .line 187
    goto :goto_4

    .line 188
    :cond_e
    invoke-virtual {v8}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    move-result-object v12

    .line 192
    :goto_5
    if-eqz v12, :cond_10

    .line 193
    .line 194
    if-eq v12, v11, :cond_10

    .line 195
    .line 196
    if-ne v12, v3, :cond_f

    .line 197
    .line 198
    goto/16 :goto_e

    .line 199
    .line 200
    :cond_f
    invoke-virtual {v12}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    move-result-object v12

    .line 204
    goto :goto_5

    .line 205
    :cond_10
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 206
    .line 207
    .line 208
    move-result v12

    .line 209
    const/4 v13, 0x0

    .line 210
    if-ne v12, v7, :cond_1f

    .line 211
    .line 212
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 213
    .line 214
    .line 215
    move-result v12

    .line 216
    if-ne v12, v7, :cond_1f

    .line 217
    .line 218
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    move-result-object v12

    .line 222
    aget-object v12, v12, v9

    .line 223
    .line 224
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    move-result-object v14

    .line 228
    aget-object v14, v14, v9

    .line 229
    .line 230
    if-eq v12, v14, :cond_1f

    .line 231
    .line 232
    invoke-virtual {v12, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 233
    .line 234
    .line 235
    move-result v15

    .line 236
    if-eqz v15, :cond_11

    .line 237
    .line 238
    goto/16 :goto_e

    .line 239
    .line 240
    :cond_11
    invoke-virtual {v14, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 241
    .line 242
    .line 243
    move-result v15

    .line 244
    if-eqz v15, :cond_12

    .line 245
    .line 246
    goto/16 :goto_d

    .line 247
    .line 248
    :cond_12
    const-class v15, Ljava/util/Collection;

    .line 249
    .line 250
    invoke-virtual {v15, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 251
    .line 252
    .line 253
    move-result v16

    .line 254
    if-eqz v16, :cond_13

    .line 255
    .line 256
    invoke-virtual {v15, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 257
    .line 258
    .line 259
    move-result v16

    .line 260
    if-nez v16, :cond_13

    .line 261
    .line 262
    goto/16 :goto_e

    .line 263
    .line 264
    :cond_13
    invoke-virtual {v15, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 265
    .line 266
    .line 267
    move-result v16

    .line 268
    if-eqz v16, :cond_14

    .line 269
    .line 270
    invoke-virtual {v15, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 271
    .line 272
    .line 273
    move-result v15

    .line 274
    if-nez v15, :cond_14

    .line 275
    .line 276
    goto/16 :goto_d

    .line 277
    .line 278
    :cond_14
    invoke-virtual {v12}, Ljava/lang/Class;->isEnum()Z

    .line 279
    .line 280
    .line 281
    move-result v15

    .line 282
    if-nez v15, :cond_16

    .line 283
    .line 284
    invoke-virtual {v12}, Ljava/lang/Class;->isInterface()Z

    .line 285
    .line 286
    .line 287
    move-result v15

    .line 288
    if-eqz v15, :cond_15

    .line 289
    .line 290
    goto :goto_6

    .line 291
    :cond_15
    invoke-virtual {v14}, Ljava/lang/Class;->isEnum()Z

    .line 292
    .line 293
    .line 294
    move-result v15

    .line 295
    if-nez v15, :cond_16

    .line 296
    .line 297
    invoke-virtual {v14}, Ljava/lang/Class;->isInterface()Z

    .line 298
    .line 299
    .line 300
    move-result v15

    .line 301
    if-eqz v15, :cond_1b

    .line 302
    .line 303
    :cond_16
    :goto_6
    :try_start_0
    invoke-virtual {v3, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 311
    if-nez v3, :cond_17

    .line 312
    .line 313
    :try_start_1
    invoke-virtual {v8, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 314
    .line 315
    .line 316
    move-result-object v8

    .line 317
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    move-result-object v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1

    .line 321
    goto :goto_7

    .line 322
    :catch_0
    move-object v3, v13

    .line 323
    :catch_1
    :cond_17
    :goto_7
    if-eqz v3, :cond_1b

    .line 324
    .line 325
    :goto_8
    if-eqz v12, :cond_19

    .line 326
    .line 327
    if-eq v12, v11, :cond_19

    .line 328
    .line 329
    if-ne v12, v3, :cond_18

    .line 330
    .line 331
    goto/16 :goto_d

    .line 332
    .line 333
    :cond_18
    invoke-virtual {v12}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    move-result-object v12

    .line 337
    goto :goto_8

    .line 338
    :cond_19
    :goto_9
    if-eqz v14, :cond_1b

    .line 339
    .line 340
    if-eq v14, v11, :cond_1b

    .line 341
    .line 342
    if-ne v14, v3, :cond_1a

    .line 343
    .line 344
    goto/16 :goto_e

    .line 345
    .line 346
    :cond_1a
    invoke-virtual {v14}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    move-result-object v14

    .line 350
    goto :goto_9

    .line 351
    :cond_1b
    const-class v3, L飘花落叶言楪子苏哲世兰/飘花落叶言子楪世哲兰苏;

    .line 352
    .line 353
    invoke-static {v10, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 354
    .line 355
    .line 356
    move-result-object v8

    .line 357
    check-cast v8, L飘花落叶言楪子苏哲世兰/飘花落叶言子楪世哲兰苏;

    .line 358
    .line 359
    invoke-static {v4, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/AnnotatedElement;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    check-cast v3, L飘花落叶言楪子苏哲世兰/飘花落叶言子楪世哲兰苏;

    .line 364
    .line 365
    if-eqz v8, :cond_1c

    .line 366
    .line 367
    move v8, v7

    .line 368
    goto :goto_a

    .line 369
    :cond_1c
    move v8, v9

    .line 370
    :goto_a
    if-nez v3, :cond_1d

    .line 371
    .line 372
    move v9, v7

    .line 373
    :cond_1d
    if-ne v8, v9, :cond_1f

    .line 374
    .line 375
    if-eqz v8, :cond_1e

    .line 376
    .line 377
    goto :goto_b

    .line 378
    :cond_1e
    move v6, v7

    .line 379
    :goto_b
    return v6

    .line 380
    :cond_1f
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v3

    .line 384
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v4

    .line 388
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v8

    .line 392
    if-nez v8, :cond_23

    .line 393
    .line 394
    const-string v8, "set"

    .line 395
    .line 396
    invoke-virtual {v3, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 397
    .line 398
    .line 399
    move-result v9

    .line 400
    invoke-virtual {v4, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 401
    .line 402
    .line 403
    move-result v8

    .line 404
    if-eq v9, v8, :cond_21

    .line 405
    .line 406
    if-eqz v9, :cond_20

    .line 407
    .line 408
    goto :goto_c

    .line 409
    :cond_20
    move v6, v7

    .line 410
    :goto_c
    return v6

    .line 411
    :cond_21
    invoke-static {v3, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子世兰苏楪哲(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    invoke-static {v4, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子世兰苏楪哲(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v4

    .line 419
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    iget-object v5, v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 424
    .line 425
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v4

    .line 429
    if-eq v3, v4, :cond_23

    .line 430
    .line 431
    if-eqz v3, :cond_22

    .line 432
    .line 433
    move v6, v7

    .line 434
    :cond_22
    return v6

    .line 435
    :cond_23
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世()Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 436
    .line 437
    .line 438
    move-result-object v3

    .line 439
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世()Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 440
    .line 441
    .line 442
    move-result-object v4

    .line 443
    if-eqz v3, :cond_24

    .line 444
    .line 445
    if-nez v4, :cond_24

    .line 446
    .line 447
    goto :goto_d

    .line 448
    :cond_24
    if-nez v3, :cond_25

    .line 449
    .line 450
    if-eqz v4, :cond_25

    .line 451
    .line 452
    goto :goto_e

    .line 453
    :cond_25
    iget-object v1, v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 454
    .line 455
    iget-object v0, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 456
    .line 457
    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    .line 458
    .line 459
    .line 460
    move-result v3

    .line 461
    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    .line 462
    .line 463
    .line 464
    move-result v4

    .line 465
    if-eqz v3, :cond_26

    .line 466
    .line 467
    if-nez v4, :cond_26

    .line 468
    .line 469
    goto :goto_d

    .line 470
    :cond_26
    if-nez v3, :cond_27

    .line 471
    .line 472
    if-eqz v4, :cond_27

    .line 473
    .line 474
    goto :goto_e

    .line 475
    :cond_27
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    const-string v3, "java."

    .line 480
    .line 481
    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 482
    .line 483
    .line 484
    move-result v0

    .line 485
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 490
    .line 491
    .line 492
    move-result v1

    .line 493
    if-eqz v0, :cond_28

    .line 494
    .line 495
    if-nez v1, :cond_28

    .line 496
    .line 497
    :goto_d
    return v6

    .line 498
    :cond_28
    if-nez v0, :cond_29

    .line 499
    .line 500
    if-eqz v1, :cond_29

    .line 501
    .line 502
    :goto_e
    return v7

    .line 503
    :cond_29
    :goto_f
    return v2
.end method

.method public 飘花落叶言子楪苏兰哲世()Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public 飘花落叶言子楪苏哲兰世()Ljava/util/function/BiConsumer;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method
