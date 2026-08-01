.class public final Lnh0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lnh0;

.field public static final β:Ljava/util/Set;

.field public static volatile γ:Landroid/content/Context;

.field public static final δ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static volatile ε:Ljava/lang/ref/WeakReference;

.field public static volatile ζ:Ljava/lang/String;

.field public static volatile η:Ljava/lang/String;

.field public static volatile θ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lnh0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lnh0;->α:Lnh0;

    .line 7
    .line 8
    const-string v10, "share_text"

    .line 9
    .line 10
    const-string v11, "content"

    .line 11
    .line 12
    const-string v1, "text"

    .line 13
    .line 14
    const-string v2, "title"

    .line 15
    .line 16
    const-string v3, "description"

    .line 17
    .line 18
    const-string v4, "desc"

    .line 19
    .line 20
    const-string v5, "tips"

    .line 21
    .line 22
    const-string v6, "hint"

    .line 23
    .line 24
    const-string v7, "msgHint"

    .line 25
    .line 26
    const-string v8, "push_detail"

    .line 27
    .line 28
    const-string v9, "room_description"

    .line 29
    .line 30
    filled-new-array/range {v1 .. v11}, [Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lnh0;->β:Ljava/util/Set;

    .line 39
    .line 40
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lnh0;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 46
    .line 47
    const-string v0, ""

    .line 48
    .line 49
    sput-object v0, Lnh0;->η:Ljava/lang/String;

    .line 50
    .line 51
    return-void
.end method

.method public static Α(Ljava/lang/Object;)Ljava/lang/String;
    .locals 11

    .line 1
    sget-object v2, Lch0;->α:Lch0;

    .line 2
    .line 3
    invoke-static {p0}, Lnh0;->ξ(Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v3, Lch0;->β:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Lch0;->β(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lbh0;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-static {p0, v0}, Lch0;->δ(Ljava/lang/Object;Lbh0;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v4, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    :goto_0
    if-eqz v0, :cond_6

    .line 48
    .line 49
    const-class v5, Ljava/lang/Object;

    .line 50
    .line 51
    invoke-virtual {v0, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-nez v5, :cond_6

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance v6, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    array-length v7, v5

    .line 70
    const/4 v8, 0x0

    .line 71
    :goto_1
    if-ge v8, v7, :cond_4

    .line 72
    .line 73
    aget-object v9, v5, v8

    .line 74
    .line 75
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 76
    .line 77
    .line 78
    move-result v10

    .line 79
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    if-nez v10, :cond_3

    .line 84
    .line 85
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    invoke-virtual {v10}, Ljava/lang/Class;->isPrimitive()Z

    .line 90
    .line 91
    .line 92
    move-result v10

    .line 93
    if-eqz v10, :cond_2

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_2
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    :cond_3
    :goto_2
    add-int/lit8 v8, v8, 0x1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-eqz v6, :cond_5

    .line 111
    .line 112
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    check-cast v6, Ljava/lang/reflect/Field;

    .line 117
    .line 118
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    goto :goto_0

    .line 127
    :cond_6
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    :cond_7
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    const/4 v5, 0x0

    .line 136
    if-eqz v0, :cond_b

    .line 137
    .line 138
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    move-object v6, v0

    .line 143
    check-cast v6, Ljava/lang/reflect/Field;

    .line 144
    .line 145
    const/4 v0, 0x1

    .line 146
    :try_start_0
    invoke-virtual {v6, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v6, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    goto :goto_5

    .line 154
    :catchall_0
    move-exception v0

    .line 155
    new-instance v7, Leo1;

    .line 156
    .line 157
    invoke-direct {v7, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    move-object v0, v7

    .line 161
    :goto_5
    instance-of v7, v0, Leo1;

    .line 162
    .line 163
    if-eqz v7, :cond_8

    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_8
    move-object v5, v0

    .line 167
    :goto_6
    if-nez v5, :cond_9

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_9
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-static {v0}, Lch0;->α(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    if-nez v0, :cond_a

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_a
    new-instance v5, Lbh0;

    .line 182
    .line 183
    invoke-direct {v5, v6, v0}, Lbh0;-><init>(Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 184
    .line 185
    .line 186
    invoke-static {p0, v5}, Lch0;->δ(Ljava/lang/Object;Lbh0;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    if-eqz v0, :cond_7

    .line 191
    .line 192
    :cond_b
    if-eqz v5, :cond_c

    .line 193
    .line 194
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-virtual {v3, v0, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    invoke-static {p0, v5}, Lch0;->δ(Ljava/lang/Object;Lbh0;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    if-eqz p0, :cond_c

    .line 206
    .line 207
    goto :goto_7

    .line 208
    :cond_c
    new-instance p0, Lf7;

    .line 209
    .line 210
    const/4 v0, 0x1

    .line 211
    invoke-direct {p0, v0, v1}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    new-instance v0, Lng;

    .line 215
    .line 216
    const/4 v6, 0x0

    .line 217
    const/16 v7, 0xd

    .line 218
    .line 219
    const/4 v1, 0x1

    .line 220
    const-class v3, Lch0;

    .line 221
    .line 222
    const-string v4, "invokeConversationGetter"

    .line 223
    .line 224
    const-string v5, "invokeConversationGetter(Ljava/lang/Object;)Ljava/lang/String;"

    .line 225
    .line 226
    invoke-direct/range {v0 .. v7}, Lng;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 227
    .line 228
    .line 229
    invoke-static {p0, v0}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    invoke-static {p0}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    check-cast p0, Ljava/lang/String;

    .line 238
    .line 239
    if-eqz p0, :cond_d

    .line 240
    .line 241
    goto :goto_7

    .line 242
    :cond_d
    const-string p0, ""

    .line 243
    .line 244
    :goto_7
    return-object p0
.end method

.method public static Β(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    const/4 v0, 0x5

    .line 10
    if-le p0, v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_1
    instance-of v0, p1, Lorg/json/JSONObject;

    .line 18
    .line 19
    if-nez v0, :cond_e

    .line 20
    .line 21
    instance-of v0, p1, Lorg/json/JSONArray;

    .line 22
    .line 23
    if-nez v0, :cond_e

    .line 24
    .line 25
    instance-of v0, p1, Ljava/lang/String;

    .line 26
    .line 27
    if-nez v0, :cond_e

    .line 28
    .line 29
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_2
    instance-of v0, p1, Ljava/lang/Number;

    .line 35
    .line 36
    if-eqz v0, :cond_6

    .line 37
    .line 38
    instance-of p0, p1, Ljava/lang/Double;

    .line 39
    .line 40
    if-eqz p0, :cond_3

    .line 41
    .line 42
    move-object p0, p1

    .line 43
    check-cast p0, Ljava/lang/Number;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    const-wide v2, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    cmpg-double p0, v0, v2

    .line 59
    .line 60
    if-gtz p0, :cond_4

    .line 61
    .line 62
    :cond_3
    instance-of p0, p1, Ljava/lang/Float;

    .line 63
    .line 64
    if-eqz p0, :cond_5

    .line 65
    .line 66
    move-object p0, p1

    .line 67
    check-cast p0, Ljava/lang/Number;

    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 78
    .line 79
    .line 80
    cmpg-float p0, p0, v0

    .line 81
    .line 82
    if-gtz p0, :cond_4

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0

    .line 90
    :cond_5
    :goto_0
    check-cast p1, Ljava/io/Serializable;

    .line 91
    .line 92
    return-object p1

    .line 93
    :cond_6
    instance-of v0, p1, Ljava/util/Map;

    .line 94
    .line 95
    if-eqz v0, :cond_9

    .line 96
    .line 97
    new-instance v0, Lorg/json/JSONObject;

    .line 98
    .line 99
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 100
    .line 101
    .line 102
    check-cast p1, Ljava/util/Map;

    .line 103
    .line 104
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    :cond_7
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-eqz v1, :cond_8

    .line 117
    .line 118
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    check-cast v1, Ljava/util/Map$Entry;

    .line 123
    .line 124
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    if-eqz v2, :cond_7

    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    add-int/lit8 v3, p0, 0x1

    .line 139
    .line 140
    invoke-static {v3, v1}, Lnh0;->Β(ILjava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_8
    return-object v0

    .line 149
    :cond_9
    instance-of v0, p1, Ljava/lang/Iterable;

    .line 150
    .line 151
    if-eqz v0, :cond_b

    .line 152
    .line 153
    new-instance v0, Lorg/json/JSONArray;

    .line 154
    .line 155
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 156
    .line 157
    .line 158
    check-cast p1, Ljava/lang/Iterable;

    .line 159
    .line 160
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-eqz v1, :cond_a

    .line 169
    .line 170
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    add-int/lit8 v2, p0, 0x1

    .line 175
    .line 176
    invoke-static {v2, v1}, Lnh0;->Β(ILjava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_a
    return-object v0

    .line 185
    :cond_b
    instance-of v0, p1, [Ljava/lang/Object;

    .line 186
    .line 187
    if-eqz v0, :cond_d

    .line 188
    .line 189
    new-instance v0, Lorg/json/JSONArray;

    .line 190
    .line 191
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 192
    .line 193
    .line 194
    check-cast p1, [Ljava/lang/Object;

    .line 195
    .line 196
    array-length v1, p1

    .line 197
    const/4 v2, 0x0

    .line 198
    :goto_3
    if-ge v2, v1, :cond_c

    .line 199
    .line 200
    aget-object v3, p1, v2

    .line 201
    .line 202
    add-int/lit8 v4, p0, 0x1

    .line 203
    .line 204
    invoke-static {v4, v3}, Lnh0;->Β(ILjava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 209
    .line 210
    .line 211
    add-int/lit8 v2, v2, 0x1

    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_c
    return-object v0

    .line 215
    :cond_d
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    return-object p0

    .line 220
    :cond_e
    return-object p1
.end method

.method public static final α(Lnh0;Ljava/lang/Object;)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lnh0;->Α(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v0, Lnh0;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    check-cast v0, Ljava/lang/Iterable;

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Ljava/util/Map$Entry;

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    if-ne v2, p1, :cond_1

    .line 54
    .line 55
    :cond_2
    sget-object v2, Lnh0;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v2, v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    sget-object v0, Lnh0;->ε:Ljava/lang/ref/WeakReference;

    .line 70
    .line 71
    const/4 v1, 0x0

    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    goto :goto_1

    .line 79
    :cond_4
    move-object v0, v1

    .line 80
    :goto_1
    if-ne v0, p1, :cond_9

    .line 81
    .line 82
    sput-object v1, Lnh0;->ε:Ljava/lang/ref/WeakReference;

    .line 83
    .line 84
    sget-object p1, Lnh0;->ζ:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {p1, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-nez p1, :cond_5

    .line 91
    .line 92
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_6

    .line 97
    .line 98
    :cond_5
    sput-object v1, Lnh0;->ζ:Ljava/lang/String;

    .line 99
    .line 100
    :cond_6
    sget-object p1, Lnh0;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    check-cast p1, Ljava/lang/Iterable;

    .line 110
    .line 111
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    :cond_7
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_9

    .line 120
    .line 121
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    check-cast v0, Ljava/util/Map$Entry;

    .line 126
    .line 127
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    if-nez v2, :cond_8

    .line 138
    .line 139
    sget-object v2, Lnh0;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 140
    .line 141
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {v2, v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_8
    sget-object v3, Lnh0;->ε:Ljava/lang/ref/WeakReference;

    .line 154
    .line 155
    if-nez v3, :cond_7

    .line 156
    .line 157
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    check-cast v0, Ljava/lang/String;

    .line 162
    .line 163
    sput-object v0, Lnh0;->ζ:Ljava/lang/String;

    .line 164
    .line 165
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 166
    .line 167
    invoke-direct {v0, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    sput-object v0, Lnh0;->ε:Ljava/lang/ref/WeakReference;

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_9
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    if-eqz p1, :cond_a

    .line 178
    .line 179
    const-string p0, "unknown"

    .line 180
    .line 181
    :cond_a
    new-instance p1, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    const-string v0, "release conversationId="

    .line 184
    .line 185
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    const/4 p1, 0x4

    .line 196
    const-string v0, "rfae3094b732ade5a"

    .line 197
    .line 198
    invoke-static {v0, p0, v1, p1, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    return-void
.end method

.method public static β(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    invoke-static {p0, p1, v0}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    new-instance p1, Leo1;

    .line 11
    .line 12
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    move-object p0, p1

    .line 16
    :goto_0
    instance-of p1, p0, Leo1;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    :cond_0
    return-object p0
.end method

.method public static γ(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const-string v0, "hasMoreMessage"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lnh0;->β(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    instance-of v0, p0, Ljava/lang/Number;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    check-cast p0, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    instance-of v0, p0, Ljava/lang/String;

    .line 33
    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    move-object v0, p0

    .line 37
    check-cast v0, Ljava/lang/String;

    .line 38
    .line 39
    const-string v2, "true"

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_3

    .line 46
    .line 47
    const-string v0, "1"

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    const/4 p0, 0x0

    .line 57
    return p0

    .line 58
    :cond_3
    :goto_0
    return v1
.end method

.method public static δ(Ljava/lang/Object;Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lnh0;->β(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Ljava/lang/Integer;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    instance-of p1, p0, Ljava/lang/Number;

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    check-cast p0, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_1
    instance-of p1, p0, Ljava/lang/String;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    check-cast p0, Ljava/lang/String;

    .line 32
    .line 33
    const/16 p1, 0xa

    .line 34
    .line 35
    invoke-static {p0, p1}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-eqz p0, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    :cond_2
    const/4 p0, 0x0

    .line 47
    return p0
.end method

.method public static ε(Ljava/lang/Object;Ljava/lang/String;)J
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lnh0;->β(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Ljava/lang/Long;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 12
    .line 13
    .line 14
    move-result-wide p0

    .line 15
    return-wide p0

    .line 16
    :cond_0
    instance-of p1, p0, Ljava/lang/Number;

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    check-cast p0, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 23
    .line 24
    .line 25
    move-result-wide p0

    .line 26
    return-wide p0

    .line 27
    :cond_1
    instance-of p1, p0, Ljava/lang/String;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    check-cast p0, Ljava/lang/String;

    .line 32
    .line 33
    const/16 p1, 0xa

    .line 34
    .line 35
    invoke-static {p0, p1}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-eqz p0, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 42
    .line 43
    .line 44
    move-result-wide p0

    .line 45
    return-wide p0

    .line 46
    :cond_2
    const-wide/16 p0, 0x0

    .line 47
    .line 48
    return-wide p0
.end method

.method public static ζ(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    new-array v0, v0, [Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {p0, p1, v0}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of p1, p0, Ljava/util/Map;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    check-cast p0, Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object p0, v1

    .line 19
    goto :goto_1

    .line 20
    :goto_0
    new-instance p1, Leo1;

    .line 21
    .line 22
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    move-object p0, p1

    .line 26
    :goto_1
    instance-of p1, p0, Leo1;

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    move-object v1, p0

    .line 32
    :goto_2
    check-cast v1, Ljava/util/Map;

    .line 33
    .line 34
    return-object v1
.end method

.method public static η(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    .line 6
    .line 7
    invoke-static {p0, p1, v1}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    move-object p0, v2

    .line 21
    :goto_0
    if-nez p0, :cond_1

    .line 22
    .line 23
    move-object p0, v0

    .line 24
    goto :goto_2

    .line 25
    :goto_1
    new-instance p1, Leo1;

    .line 26
    .line 27
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    move-object p0, p1

    .line 31
    :cond_1
    :goto_2
    instance-of p1, p0, Leo1;

    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    goto :goto_3

    .line 36
    :cond_2
    move-object v2, p0

    .line 37
    :goto_3
    check-cast v2, Ljava/lang/String;

    .line 38
    .line 39
    if-nez v2, :cond_3

    .line 40
    .line 41
    goto :goto_4

    .line 42
    :cond_3
    move-object v0, v2

    .line 43
    :goto_4
    return-object v0
.end method

.method public static final θ(Ljava/util/LinkedHashMap;Ljava/lang/Object;Lum1;Lum1;)I
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/util/AbstractMap;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Lnh0;->ξ(Ljava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_5

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, Lnh0;->ρ(Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {p0, v2}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-nez v3, :cond_4

    .line 32
    .line 33
    const-string v3, "getCreatedAt"

    .line 34
    .line 35
    invoke-static {v1, v3}, Lnh0;->ε(Ljava/lang/Object;Ljava/lang/String;)J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    invoke-static {v3, v4}, Lnh0;->σ(J)J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    const-wide/16 v5, 0x0

    .line 44
    .line 45
    cmp-long v5, v3, v5

    .line 46
    .line 47
    if-lez v5, :cond_4

    .line 48
    .line 49
    iget-object v5, p2, Lum1;->ε:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v5, Ljava/lang/Long;

    .line 52
    .line 53
    if-eqz v5, :cond_1

    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 56
    .line 57
    .line 58
    move-result-wide v5

    .line 59
    cmp-long v7, v5, v3

    .line 60
    .line 61
    if-lez v7, :cond_0

    .line 62
    .line 63
    move-wide v5, v3

    .line 64
    :cond_0
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    :goto_1
    iput-object v5, p2, Lum1;->ε:Ljava/lang/Object;

    .line 74
    .line 75
    iget-object v5, p3, Lum1;->ε:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v5, Ljava/lang/Long;

    .line 78
    .line 79
    if-eqz v5, :cond_3

    .line 80
    .line 81
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 82
    .line 83
    .line 84
    move-result-wide v5

    .line 85
    cmp-long v7, v5, v3

    .line 86
    .line 87
    if-gez v7, :cond_2

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_2
    move-wide v3, v5

    .line 91
    :cond_3
    :goto_2
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    iput-object v3, p3, Lum1;->ε:Ljava/lang/Object;

    .line 96
    .line 97
    :cond_4
    invoke-interface {p0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_5
    invoke-virtual {p0}, Ljava/util/AbstractMap;->size()I

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    sub-int/2addr p0, v0

    .line 106
    return p0
.end method

.method public static ι(Ljava/lang/Object;Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;I)V
    .locals 6

    .line 1
    if-eqz p0, :cond_8

    .line 2
    .line 3
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 4
    .line 5
    if-eq p0, v0, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x6

    .line 8
    if-le p3, v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_3

    .line 11
    .line 12
    :cond_0
    instance-of v0, p0, Lorg/json/JSONObject;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/16 v2, 0x7d0

    .line 16
    .line 17
    if-eqz v0, :cond_5

    .line 18
    .line 19
    check-cast p0, Lorg/json/JSONObject;

    .line 20
    .line 21
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_8

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    instance-of v5, v4, Ljava/lang/String;

    .line 45
    .line 46
    if-eqz v5, :cond_4

    .line 47
    .line 48
    check-cast v4, Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v4}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-lez v5, :cond_2

    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-gt v5, v2, :cond_2

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    move-object v4, v1

    .line 72
    :goto_1
    if-eqz v4, :cond_1

    .line 73
    .line 74
    sget-object v5, Lnh0;->β:Ljava/util/Set;

    .line 75
    .line 76
    invoke-interface {v5, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_3

    .line 81
    .line 82
    invoke-interface {p1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    invoke-interface {p2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    add-int/lit8 v3, p3, 0x1

    .line 91
    .line 92
    invoke-static {v4, p1, p2, v3}, Lnh0;->ι(Ljava/lang/Object;Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;I)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_5
    instance-of v0, p0, Lorg/json/JSONArray;

    .line 97
    .line 98
    if-eqz v0, :cond_6

    .line 99
    .line 100
    check-cast p0, Lorg/json/JSONArray;

    .line 101
    .line 102
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    const/4 v1, 0x0

    .line 107
    :goto_2
    if-ge v1, v0, :cond_8

    .line 108
    .line 109
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    add-int/lit8 v3, p3, 0x1

    .line 114
    .line 115
    invoke-static {v2, p1, p2, v3}, Lnh0;->ι(Ljava/lang/Object;Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;I)V

    .line 116
    .line 117
    .line 118
    add-int/lit8 v1, v1, 0x1

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_6
    instance-of p1, p0, Ljava/lang/String;

    .line 122
    .line 123
    if-eqz p1, :cond_8

    .line 124
    .line 125
    check-cast p0, Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-lez p1, :cond_7

    .line 140
    .line 141
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-gt p1, v2, :cond_7

    .line 146
    .line 147
    move-object v1, p0

    .line 148
    :cond_7
    if-eqz v1, :cond_8

    .line 149
    .line 150
    invoke-interface {p2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    :cond_8
    :goto_3
    return-void
.end method

.method public static λ()Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Lnh0;->ε:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v1

    .line 12
    :goto_0
    sget-object v2, Lnh0;->ζ:Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    invoke-static {v0}, Lnh0;->Α(Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-nez v4, :cond_1

    .line 25
    .line 26
    sget-object v1, Lnh0;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 27
    .line 28
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    sput-object v3, Lnh0;->ζ:Ljava/lang/String;

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_1
    const-string v0, "findLatestLogic latest invalid, clear latest"

    .line 40
    .line 41
    const/4 v3, 0x4

    .line 42
    const-string v4, "rfae3094b732ade5a"

    .line 43
    .line 44
    invoke-static {v4, v0, v1, v3, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    sput-object v1, Lnh0;->ε:Ljava/lang/ref/WeakReference;

    .line 48
    .line 49
    sput-object v1, Lnh0;->ζ:Ljava/lang/String;

    .line 50
    .line 51
    :cond_2
    if-eqz v2, :cond_7

    .line 52
    .line 53
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    sget-object v0, Lnh0;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 67
    .line 68
    if-eqz v3, :cond_4

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    goto :goto_1

    .line 75
    :cond_4
    move-object v4, v1

    .line 76
    :goto_1
    if-eqz v4, :cond_6

    .line 77
    .line 78
    invoke-static {v4}, Lnh0;->Α(Ljava/lang/Object;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    if-nez v6, :cond_5

    .line 87
    .line 88
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 89
    .line 90
    invoke-direct {v0, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    sput-object v0, Lnh0;->ε:Ljava/lang/ref/WeakReference;

    .line 94
    .line 95
    sput-object v5, Lnh0;->ζ:Ljava/lang/String;

    .line 96
    .line 97
    return-object v4

    .line 98
    :cond_5
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_6
    if-eqz v3, :cond_7

    .line 103
    .line 104
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    :cond_7
    :goto_2
    sget-object v0, Lnh0;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    check-cast v0, Ljava/lang/Iterable;

    .line 117
    .line 118
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    :cond_8
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-eqz v2, :cond_a

    .line 127
    .line 128
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    check-cast v2, Ljava/util/Map$Entry;

    .line 133
    .line 134
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 139
    .line 140
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    if-nez v3, :cond_9

    .line 145
    .line 146
    sget-object v3, Lnh0;->δ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 147
    .line 148
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-virtual {v3, v4, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_9
    invoke-static {v3}, Lnh0;->Α(Ljava/lang/Object;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    if-nez v4, :cond_8

    .line 169
    .line 170
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 171
    .line 172
    invoke-direct {v0, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    sput-object v0, Lnh0;->ε:Ljava/lang/ref/WeakReference;

    .line 176
    .line 177
    sput-object v2, Lnh0;->ζ:Ljava/lang/String;

    .line 178
    .line 179
    return-object v3

    .line 180
    :cond_a
    return-object v1
.end method

.method public static μ(J)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    const-string v1, "yyyy-MM-dd HH:mm:ss"

    .line 4
    .line 5
    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ljava/util/Date;

    .line 11
    .line 12
    invoke-direct {v1, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public static ν()Lgh0;
    .locals 5

    .line 1
    sget-boolean v0, Lnh0;->θ:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    sget-object v0, Lnh0;->η:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v0, v2

    .line 17
    :goto_0
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const-string v3, "\uff1a"

    .line 20
    .line 21
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move-object v0, v2

    .line 27
    :goto_1
    if-nez v0, :cond_2

    .line 28
    .line 29
    const-string v0, ""

    .line 30
    .line 31
    :cond_2
    new-instance v3, Lgh0;

    .line 32
    .line 33
    const-string v4, "\u5f53\u524d\u6296\u97f3\u7248\u672c\u6682\u4e0d\u652f\u6301\u804a\u5929\u5bfc\u51fa"

    .line 34
    .line 35
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-direct {v3, v2, v0, v1}, Lgh0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    return-object v3

    .line 43
    :cond_3
    invoke-static {}, Lnh0;->λ()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-nez v0, :cond_4

    .line 48
    .line 49
    new-instance v0, Lgh0;

    .line 50
    .line 51
    const-string v3, "\u8bf7\u5148\u6253\u5f00\u5e76\u505c\u7559\u5728\u4e00\u4e2a\u804a\u5929\u4f1a\u8bdd\u9875\u9762"

    .line 52
    .line 53
    invoke-direct {v0, v2, v3, v1}, Lgh0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 54
    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_4
    invoke-static {v0}, Lnh0;->Α(Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-nez v3, :cond_5

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_5
    move-object v0, v2

    .line 69
    :goto_2
    if-nez v0, :cond_6

    .line 70
    .line 71
    new-instance v0, Lgh0;

    .line 72
    .line 73
    const-string v3, "\u5f53\u524d\u804a\u5929\u4f1a\u8bdd\u4fe1\u606f\u5c1a\u672a\u51c6\u5907\u5b8c\u6210"

    .line 74
    .line 75
    invoke-direct {v0, v2, v3, v1}, Lgh0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    return-object v0

    .line 79
    :cond_6
    new-instance v1, Lgh0;

    .line 80
    .line 81
    const/4 v2, 0x1

    .line 82
    const-string v3, "\u5df2\u8bc6\u522b\u5f53\u524d\u804a\u5929\u4f1a\u8bdd"

    .line 83
    .line 84
    invoke-direct {v1, v0, v3, v2}, Lgh0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 85
    .line 86
    .line 87
    return-object v1
.end method

.method public static ξ(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    .line 1
    const-string v0, "getMessageList"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lnh0;->β(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of v0, p0, Ljava/util/List;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p0, Ljava/util/List;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object p0, v1

    .line 16
    :goto_0
    if-eqz p0, :cond_1

    .line 17
    .line 18
    invoke-static {p0}, Lxh;->Ж(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :cond_1
    if-nez v1, :cond_2

    .line 23
    .line 24
    sget-object p0, Ljz;->ε:Ljz;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_2
    return-object v1
.end method

.method public static ο(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p0, Ljava/lang/CharSequence;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    check-cast v0, Ljava/lang/CharSequence;

    .line 10
    .line 11
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_4

    .line 16
    .line 17
    const-string v0, "[]"

    .line 18
    .line 19
    const-string v1, "null"

    .line 20
    .line 21
    const-string v2, "{}"

    .line 22
    .line 23
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-nez p0, :cond_4

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    instance-of v0, p0, Ljava/util/Collection;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    check-cast p0, Ljava/util/Collection;

    .line 47
    .line 48
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_4

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    instance-of v0, p0, Ljava/util/Map;

    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    check-cast p0, Ljava/util/Map;

    .line 60
    .line 61
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-nez p0, :cond_4

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    instance-of v0, p0, [Ljava/lang/Object;

    .line 69
    .line 70
    if-eqz v0, :cond_5

    .line 71
    .line 72
    check-cast p0, [Ljava/lang/Object;

    .line 73
    .line 74
    array-length p0, p0

    .line 75
    if-nez p0, :cond_5

    .line 76
    .line 77
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 78
    return p0

    .line 79
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 80
    return p0
.end method

.method public static π(Ljava/lang/Class;Ljava/lang/String;La80;)V
    .locals 2

    .line 1
    sget-object v0, Lxq0;->α:Lxq0;

    .line 2
    .line 3
    new-instance v1, Lqg;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2}, Lqg;-><init>(Ljava/lang/String;La80;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0, p1, v1}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/util/Collection;

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const-string p0, "\u672a\u627e\u5230 ChatListLogic#"

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Lγ;->λ(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static ρ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "getUuid"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lnh0;->η(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const-string p0, "uuid:"

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    const-string v0, "getMsgId"

    .line 21
    .line 22
    invoke-static {p0, v0}, Lnh0;->ε(Ljava/lang/Object;Ljava/lang/String;)J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    const-wide/16 v2, 0x0

    .line 27
    .line 28
    cmp-long v2, v0, v2

    .line 29
    .line 30
    if-lez v2, :cond_1

    .line 31
    .line 32
    const-string p0, "msgId:"

    .line 33
    .line 34
    invoke-static {v0, v1, p0}, Lnx;->ε(JLjava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    new-instance v1, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v2, "identity:"

    .line 54
    .line 55
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v0, ":"

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method

.method public static σ(J)J
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p0, v0

    .line 4
    .line 5
    if-gtz v2, :cond_0

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    const-wide v0, 0x2540be400L

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    cmp-long v0, p0, v0

    .line 14
    .line 15
    if-gez v0, :cond_1

    .line 16
    .line 17
    const-wide/16 v0, 0x3e8

    .line 18
    .line 19
    mul-long/2addr p0, v0

    .line 20
    :cond_1
    return-wide p0
.end method

.method public static τ(Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception v0

    .line 8
    new-instance v1, Leo1;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    move-object v0, v1

    .line 14
    :goto_0
    instance-of v1, v0, Leo1;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    move-object v0, v2

    .line 20
    :cond_0
    check-cast v0, Lorg/json/JSONObject;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    :try_start_1
    new-instance v0, Lorg/json/JSONArray;

    .line 25
    .line 26
    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :catchall_1
    move-exception p0

    .line 31
    new-instance v0, Leo1;

    .line 32
    .line 33
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    :goto_1
    instance-of p0, v0, Leo1;

    .line 37
    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_1
    move-object v2, v0

    .line 42
    :goto_2
    return-object v2
.end method

.method public static υ(Lp70;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lr0;

    .line 11
    .line 12
    const/4 v2, 0x5

    .line 13
    invoke-direct {v1, v2, p0}, Lr0;-><init>(ILp70;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static φ(Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/Map;)V
    .locals 3

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    new-instance p2, Lorg/json/JSONObject;

    .line 4
    .line 5
    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    .line 13
    .line 14
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_4

    .line 30
    .line 31
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/util/Map$Entry;

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-nez v1, :cond_3

    .line 58
    .line 59
    :cond_2
    const-string v1, ""

    .line 60
    .line 61
    :cond_3
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_4
    invoke-virtual {p0, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public static χ(Leh0;ILθ;)V
    .locals 8

    .line 1
    iget-object p0, p0, Leh0;->γ:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljh0;

    .line 11
    .line 12
    const-string v6, "\u6ca1\u6709\u7b26\u5408\u5f53\u524d\u6761\u4ef6\u7684\u6d88\u606f"

    .line 13
    .line 14
    const/16 v7, 0x10

    .line 15
    .line 16
    sget-object v1, Lkh0;->η:Lkh0;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    move v2, p1

    .line 22
    invoke-direct/range {v0 .. v7}, Ljh0;-><init>(Lkh0;ILjava/lang/Long;Ljava/lang/Long;ILjava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2, v0}, Lθ;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static ψ(Leh0;ILjava/lang/String;ILjava/lang/String;Lθ;)V
    .locals 9

    .line 1
    new-instance v0, Ljh0;

    .line 2
    .line 3
    iget-object v3, p0, Leh0;->α:Ljava/lang/Long;

    .line 4
    .line 5
    iget-object v4, p0, Leh0;->β:Ljava/lang/Long;

    .line 6
    .line 7
    iget-object p0, p0, Leh0;->γ:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v7

    .line 13
    sget-object v1, Lkh0;->η:Lkh0;

    .line 14
    .line 15
    move v2, p1

    .line 16
    move-object v5, p2

    .line 17
    move v6, p3

    .line 18
    move-object v8, p4

    .line 19
    invoke-direct/range {v0 .. v8}, Ljh0;-><init>(Lkh0;ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;IILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p5, v0}, Lθ;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static ω(Landroid/content/Context;)Landroid/content/Context;
    .locals 4

    .line 1
    const-string v0, "currentApplication"

    .line 2
    .line 3
    const-string v1, "android.app.ActivityThread"

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object p0, Lnh0;->γ:Landroid/content/Context;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    const/4 p0, 0x0

    .line 20
    :try_start_0
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2, v0, p0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const/4 v3, 0x1

    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, p0, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    instance-of v3, v2, Landroid/app/Application;

    .line 37
    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    check-cast v2, Landroid/app/Application;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception v2

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    move-object v2, p0

    .line 46
    goto :goto_1

    .line 47
    :goto_0
    :try_start_1
    new-instance v3, Leo1;

    .line 48
    .line 49
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    move-object v2, v3

    .line 53
    :goto_1
    instance-of v3, v2, Leo1;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    move-object v2, p0

    .line 58
    :cond_3
    check-cast v2, Landroid/app/Application;

    .line 59
    .line 60
    if-eqz v2, :cond_4

    .line 61
    .line 62
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 63
    .line 64
    .line 65
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 66
    goto :goto_3

    .line 67
    :catchall_1
    move-exception v2

    .line 68
    goto :goto_2

    .line 69
    :cond_4
    move-object v2, p0

    .line 70
    goto :goto_3

    .line 71
    :goto_2
    new-instance v3, Leo1;

    .line 72
    .line 73
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    move-object v2, v3

    .line 77
    :goto_3
    instance-of v3, v2, Leo1;

    .line 78
    .line 79
    if-eqz v3, :cond_5

    .line 80
    .line 81
    move-object v2, p0

    .line 82
    :cond_5
    check-cast v2, Landroid/content/Context;

    .line 83
    .line 84
    if-eqz v2, :cond_6

    .line 85
    .line 86
    return-object v2

    .line 87
    :cond_6
    :try_start_2
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    const/4 v2, 0x0

    .line 92
    new-array v2, v2, [Ljava/lang/Object;

    .line 93
    .line 94
    invoke-static {v1, v0, v2}, Lqe0;->β(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    instance-of v1, v0, Landroid/content/Context;

    .line 99
    .line 100
    if-eqz v1, :cond_7

    .line 101
    .line 102
    check-cast v0, Landroid/content/Context;

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :catchall_2
    move-exception v0

    .line 106
    goto :goto_5

    .line 107
    :cond_7
    move-object v0, p0

    .line 108
    :goto_4
    if-eqz v0, :cond_8

    .line 109
    .line 110
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 111
    .line 112
    .line 113
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 114
    goto :goto_6

    .line 115
    :cond_8
    move-object v0, p0

    .line 116
    goto :goto_6

    .line 117
    :goto_5
    new-instance v1, Leo1;

    .line 118
    .line 119
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    move-object v0, v1

    .line 123
    :goto_6
    instance-of v1, v0, Leo1;

    .line 124
    .line 125
    if-eqz v1, :cond_9

    .line 126
    .line 127
    move-object v0, p0

    .line 128
    :cond_9
    check-cast v0, Landroid/content/Context;

    .line 129
    .line 130
    if-eqz v0, :cond_a

    .line 131
    .line 132
    return-object v0

    .line 133
    :cond_a
    return-object p0
.end method


# virtual methods
.method public final κ(Landroid/content/Context;Ljava/lang/Object;Lih0;Ln;Lθ;)Llh0;
    .locals 37

    .line 1
    move-object/from16 v1, p2

    .line 2
    .line 3
    move-object/from16 v6, p3

    .line 4
    .line 5
    move-object/from16 v7, p5

    .line 6
    .line 7
    iget v0, v6, Lih0;->ζ:I

    .line 8
    .line 9
    iget-boolean v8, v6, Lih0;->α:Z

    .line 10
    .line 11
    iget-object v9, v6, Lih0;->δ:Lhh0;

    .line 12
    .line 13
    const/4 v10, 0x0

    .line 14
    const/4 v11, 0x1

    .line 15
    if-gt v11, v0, :cond_36

    .line 16
    .line 17
    const/16 v2, 0x1f5

    .line 18
    .line 19
    if-ge v0, v2, :cond_36

    .line 20
    .line 21
    iget-wide v2, v6, Lih0;->ε:J

    .line 22
    .line 23
    const-wide/16 v4, 0x3e8

    .line 24
    .line 25
    cmp-long v0, v4, v2

    .line 26
    .line 27
    if-gtz v0, :cond_35

    .line 28
    .line 29
    const-wide/32 v4, 0xea61

    .line 30
    .line 31
    .line 32
    cmp-long v0, v2, v4

    .line 33
    .line 34
    if-gez v0, :cond_35

    .line 35
    .line 36
    invoke-virtual/range {p4 .. p4}, Ln;->Ζ()V

    .line 37
    .line 38
    .line 39
    invoke-static {v1}, Lnh0;->Α(Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_0

    .line 48
    .line 49
    move-object v12, v0

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move-object v12, v10

    .line 52
    :goto_0
    if-eqz v12, :cond_34

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    const-string v3, "rfae3094b732ade5a"

    .line 56
    .line 57
    if-eqz v8, :cond_f

    .line 58
    .line 59
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 60
    .line 61
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 62
    .line 63
    .line 64
    new-instance v0, Lum1;

    .line 65
    .line 66
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 67
    .line 68
    .line 69
    const-wide/16 v16, 0x0

    .line 70
    .line 71
    new-instance v14, Lum1;

    .line 72
    .line 73
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-static {v5, v1, v0, v14}, Lnh0;->θ(Ljava/util/LinkedHashMap;Ljava/lang/Object;Lum1;Lum1;)I

    .line 77
    .line 78
    .line 79
    new-instance v18, Ljh0;

    .line 80
    .line 81
    invoke-virtual {v5}, Ljava/util/AbstractMap;->size()I

    .line 82
    .line 83
    .line 84
    move-result v20

    .line 85
    iget-object v15, v0, Lum1;->ε:Ljava/lang/Object;

    .line 86
    .line 87
    move-object/from16 v21, v15

    .line 88
    .line 89
    check-cast v21, Ljava/lang/Long;

    .line 90
    .line 91
    iget-object v15, v14, Lum1;->ε:Ljava/lang/Object;

    .line 92
    .line 93
    move-object/from16 v22, v15

    .line 94
    .line 95
    check-cast v22, Ljava/lang/Long;

    .line 96
    .line 97
    const-string v24, "\u6b63\u5728\u8bfb\u53d6\u66f4\u65e9\u7684\u804a\u5929\u8bb0\u5f55"

    .line 98
    .line 99
    const/16 v25, 0x70

    .line 100
    .line 101
    sget-object v27, Lkh0;->ε:Lkh0;

    .line 102
    .line 103
    const/16 v23, 0x0

    .line 104
    .line 105
    move-object/from16 v19, v27

    .line 106
    .line 107
    invoke-direct/range {v18 .. v25}, Ljh0;-><init>(Lkh0;ILjava/lang/Long;Ljava/lang/Long;ILjava/lang/String;I)V

    .line 108
    .line 109
    .line 110
    move-object/from16 v15, v18

    .line 111
    .line 112
    invoke-virtual {v7, v15}, Lθ;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5}, Ljava/util/AbstractMap;->size()I

    .line 116
    .line 117
    .line 118
    move-result v15

    .line 119
    move/from16 v20, v2

    .line 120
    .line 121
    move-object/from16 v19, v14

    .line 122
    .line 123
    move-wide/from16 v13, v16

    .line 124
    .line 125
    :goto_1
    invoke-virtual/range {p4 .. p4}, Ln;->Ζ()V

    .line 126
    .line 127
    .line 128
    invoke-static {v1}, Lnh0;->γ(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v21

    .line 132
    const-string v11, "\u5df2\u52a0\u8f7d\u5230\u4f1a\u8bdd\u6700\u65e9\u6d88\u606f"

    .line 133
    .line 134
    const-string v4, ", size="

    .line 135
    .line 136
    if-nez v21, :cond_1

    .line 137
    .line 138
    invoke-virtual {v5}, Ljava/util/AbstractMap;->size()I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    new-instance v1, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string v15, "fullLoad stop, hasMoreMessage=false, round="

    .line 145
    .line 146
    invoke-direct {v1, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    const/4 v1, 0x4

    .line 163
    invoke-static {v3, v0, v10, v1, v10}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    new-instance v0, Lmh0;

    .line 167
    .line 168
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    check-cast v4, Ljava/lang/Iterable;

    .line 176
    .line 177
    invoke-static {v4}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    const/4 v5, 0x1

    .line 182
    invoke-direct {v0, v4, v5, v11}, Lmh0;-><init>(Ljava/util/List;ZLjava/lang/String;)V

    .line 183
    .line 184
    .line 185
    move-object v2, v7

    .line 186
    move/from16 v34, v8

    .line 187
    .line 188
    move-object/from16 v21, v9

    .line 189
    .line 190
    move-object/from16 v23, v12

    .line 191
    .line 192
    const/4 v8, 0x2

    .line 193
    move-object v12, v3

    .line 194
    goto/16 :goto_12

    .line 195
    .line 196
    :cond_1
    move/from16 v21, v2

    .line 197
    .line 198
    const/16 v23, 0x4

    .line 199
    .line 200
    iget v2, v6, Lih0;->ζ:I

    .line 201
    .line 202
    const-string v10, "DYHelperExportFull"

    .line 203
    .line 204
    move-object/from16 v25, v0

    .line 205
    .line 206
    :try_start_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    move/from16 v26, v2

    .line 211
    .line 212
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_2

    .line 221
    .line 222
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 223
    .line 224
    const-string v0, "loadOld"

    .line 225
    .line 226
    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    filled-new-array {v2, v10}, [Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-static {v1, v0, v2}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 235
    .line 236
    .line 237
    move-object v10, v5

    .line 238
    move/from16 v34, v8

    .line 239
    .line 240
    move-object/from16 v21, v9

    .line 241
    .line 242
    move-object/from16 v35, v11

    .line 243
    .line 244
    move-object/from16 v23, v12

    .line 245
    .line 246
    move-object/from16 v9, v25

    .line 247
    .line 248
    move-object v12, v3

    .line 249
    move-object v11, v4

    .line 250
    goto/16 :goto_7

    .line 251
    .line 252
    :catchall_0
    move-exception v0

    .line 253
    move-object v10, v5

    .line 254
    :goto_2
    move-object v2, v7

    .line 255
    move/from16 v34, v8

    .line 256
    .line 257
    move-object/from16 v21, v9

    .line 258
    .line 259
    move-object/from16 v23, v12

    .line 260
    .line 261
    const/4 v8, 0x2

    .line 262
    move-object v12, v3

    .line 263
    goto/16 :goto_f

    .line 264
    .line 265
    :catch_0
    move-object v10, v5

    .line 266
    :goto_3
    move-object v2, v7

    .line 267
    move/from16 v34, v8

    .line 268
    .line 269
    move-object/from16 v21, v9

    .line 270
    .line 271
    move-object/from16 v23, v12

    .line 272
    .line 273
    const/4 v8, 0x2

    .line 274
    move-object v12, v3

    .line 275
    goto/16 :goto_10

    .line 276
    .line 277
    :cond_2
    move-object v2, v5

    .line 278
    :try_start_1
    new-instance v5, Ljava/util/concurrent/CountDownLatch;

    .line 279
    .line 280
    const/4 v10, 0x1

    .line 281
    invoke-direct {v5, v10}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 282
    .line 283
    .line 284
    move-object v10, v3

    .line 285
    :try_start_2
    new-instance v3, Lqm1;

    .line 286
    .line 287
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 288
    .line 289
    .line 290
    move-object v0, v4

    .line 291
    new-instance v4, Lum1;

    .line 292
    .line 293
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 294
    .line 295
    .line 296
    move/from16 v34, v8

    .line 297
    .line 298
    :try_start_3
    new-instance v8, Landroid/os/Handler;

    .line 299
    .line 300
    move-object/from16 v28, v0

    .line 301
    .line 302
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    invoke-direct {v8, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 307
    .line 308
    .line 309
    new-instance v0, Lm9;
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 310
    .line 311
    move-object/from16 v21, v9

    .line 312
    .line 313
    move-object/from16 v35, v11

    .line 314
    .line 315
    move-object/from16 v23, v12

    .line 316
    .line 317
    move-object/from16 v9, v25

    .line 318
    .line 319
    move-object/from16 v11, v28

    .line 320
    .line 321
    move-object v12, v10

    .line 322
    move-object v10, v2

    .line 323
    move/from16 v2, v26

    .line 324
    .line 325
    :try_start_4
    invoke-direct/range {v0 .. v5}, Lm9;-><init>(Ljava/lang/Object;ILqm1;Lum1;Ljava/util/concurrent/CountDownLatch;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v8, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 329
    .line 330
    .line 331
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 332
    .line 333
    const-wide/16 v7, 0x3

    .line 334
    .line 335
    :try_start_5
    invoke-virtual {v5, v7, v8, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    iget-object v2, v4, Lum1;->ε:Ljava/lang/Object;

    .line 340
    .line 341
    if-eqz v2, :cond_3

    .line 342
    .line 343
    const-string v4, "callLoadOldOnMain error"

    .line 344
    .line 345
    check-cast v2, Ljava/lang/Throwable;

    .line 346
    .line 347
    invoke-static {v12, v4, v2}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 348
    .line 349
    .line 350
    goto :goto_6

    .line 351
    :catchall_1
    move-exception v0

    .line 352
    move-object/from16 v2, p5

    .line 353
    .line 354
    :goto_4
    const/4 v8, 0x2

    .line 355
    goto/16 :goto_f

    .line 356
    .line 357
    :catch_1
    move-object/from16 v2, p5

    .line 358
    .line 359
    :goto_5
    const/4 v8, 0x2

    .line 360
    goto/16 :goto_10

    .line 361
    .line 362
    :cond_3
    :goto_6
    if-eqz v0, :cond_e

    .line 363
    .line 364
    iget-boolean v0, v3, Lqm1;->ε:Z
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 365
    .line 366
    if-eqz v0, :cond_e

    .line 367
    .line 368
    :goto_7
    iget-wide v2, v6, Lih0;->ε:J

    .line 369
    .line 370
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 371
    .line 372
    .line 373
    move-result-wide v4

    .line 374
    const-wide/16 v30, 0x3e8

    .line 375
    .line 376
    const-wide/32 v32, 0xea60

    .line 377
    .line 378
    .line 379
    move-wide/from16 v28, v2

    .line 380
    .line 381
    invoke-static/range {v28 .. v33}, Lj81;->ξ(JJJ)J

    .line 382
    .line 383
    .line 384
    move-result-wide v2

    .line 385
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 386
    .line 387
    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 388
    .line 389
    .line 390
    move-result-wide v2

    .line 391
    add-long/2addr v2, v4

    .line 392
    :goto_8
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 393
    .line 394
    .line 395
    move-result-wide v4

    .line 396
    cmp-long v0, v4, v2

    .line 397
    .line 398
    if-gez v0, :cond_4

    .line 399
    .line 400
    invoke-virtual/range {p4 .. p4}, Ln;->Ζ()V

    .line 401
    .line 402
    .line 403
    invoke-static {v1}, Lnh0;->ξ(Ljava/lang/Object;)Ljava/util/List;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    if-gt v0, v15, :cond_4

    .line 412
    .line 413
    invoke-static {v1}, Lnh0;->γ(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    if-nez v0, :cond_5

    .line 418
    .line 419
    :cond_4
    move-object/from16 v0, v19

    .line 420
    .line 421
    goto :goto_9

    .line 422
    :cond_5
    const-wide/16 v4, 0x64

    .line 423
    .line 424
    :try_start_6
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_2

    .line 425
    .line 426
    .line 427
    goto :goto_8

    .line 428
    :catch_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 433
    .line 434
    .line 435
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 436
    .line 437
    const-string v1, "\u804a\u5929\u8bb0\u5f55\u52a0\u8f7d\u7ebf\u7a0b\u5df2\u4e2d\u65ad"

    .line 438
    .line 439
    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    throw v0

    .line 443
    :goto_9
    invoke-static {v10, v1, v9, v0}, Lnh0;->θ(Ljava/util/LinkedHashMap;Ljava/lang/Object;Lum1;Lum1;)I

    .line 444
    .line 445
    .line 446
    move-result v2

    .line 447
    invoke-virtual {v10}, Ljava/util/AbstractMap;->size()I

    .line 448
    .line 449
    .line 450
    move-result v3

    .line 451
    invoke-static {v1}, Lnh0;->γ(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    move-result v4

    .line 455
    new-instance v5, Ljava/lang/StringBuilder;

    .line 456
    .line 457
    const-string v7, "fullLoad round="

    .line 458
    .line 459
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v5, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 469
    .line 470
    .line 471
    const-string v7, ", lastSize="

    .line 472
    .line 473
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    const-string v7, ", added="

    .line 480
    .line 481
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 485
    .line 486
    .line 487
    const-string v7, ", hasMore="

    .line 488
    .line 489
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v5

    .line 499
    const/4 v7, 0x4

    .line 500
    const/4 v8, 0x0

    .line 501
    invoke-static {v12, v5, v8, v7, v8}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 502
    .line 503
    .line 504
    if-ltz v2, :cond_d

    .line 505
    .line 506
    if-lez v2, :cond_6

    .line 507
    .line 508
    const/4 v5, 0x0

    .line 509
    goto :goto_a

    .line 510
    :cond_6
    const/16 v22, 0x1

    .line 511
    .line 512
    add-int/lit8 v20, v20, 0x1

    .line 513
    .line 514
    move/from16 v5, v20

    .line 515
    .line 516
    :goto_a
    if-nez v4, :cond_7

    .line 517
    .line 518
    sget-object v4, Lfh0;->ζ:Lfh0;

    .line 519
    .line 520
    goto :goto_b

    .line 521
    :cond_7
    const/4 v4, 0x3

    .line 522
    if-lt v5, v4, :cond_8

    .line 523
    .line 524
    sget-object v4, Lfh0;->η:Lfh0;

    .line 525
    .line 526
    goto :goto_b

    .line 527
    :cond_8
    sget-object v4, Lfh0;->ε:Lfh0;

    .line 528
    .line 529
    :goto_b
    iget-object v7, v9, Lum1;->ε:Ljava/lang/Object;

    .line 530
    .line 531
    if-lez v2, :cond_9

    .line 532
    .line 533
    new-instance v26, Ljh0;

    .line 534
    .line 535
    move-object/from16 v29, v7

    .line 536
    .line 537
    check-cast v29, Ljava/lang/Long;

    .line 538
    .line 539
    iget-object v2, v0, Lum1;->ε:Ljava/lang/Object;

    .line 540
    .line 541
    move-object/from16 v30, v2

    .line 542
    .line 543
    check-cast v30, Ljava/lang/Long;

    .line 544
    .line 545
    const-string v32, "\u6b63\u5728\u8bfb\u53d6\u66f4\u65e9\u7684\u804a\u5929\u8bb0\u5f55"

    .line 546
    .line 547
    const/16 v33, 0x70

    .line 548
    .line 549
    const/16 v31, 0x0

    .line 550
    .line 551
    move/from16 v28, v3

    .line 552
    .line 553
    invoke-direct/range {v26 .. v33}, Ljh0;-><init>(Lkh0;ILjava/lang/Long;Ljava/lang/Long;ILjava/lang/String;I)V

    .line 554
    .line 555
    .line 556
    move-object/from16 v2, p5

    .line 557
    .line 558
    move-object/from16 v3, v26

    .line 559
    .line 560
    invoke-virtual {v2, v3}, Lθ;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    goto :goto_c

    .line 564
    :cond_9
    move-object/from16 v2, p5

    .line 565
    .line 566
    move/from16 v28, v3

    .line 567
    .line 568
    new-instance v26, Ljh0;

    .line 569
    .line 570
    move-object/from16 v29, v7

    .line 571
    .line 572
    check-cast v29, Ljava/lang/Long;

    .line 573
    .line 574
    iget-object v3, v0, Lum1;->ε:Ljava/lang/Object;

    .line 575
    .line 576
    move-object/from16 v30, v3

    .line 577
    .line 578
    check-cast v30, Ljava/lang/Long;

    .line 579
    .line 580
    const-string v3, "\u6b63\u5728\u786e\u8ba4\u662f\u5426\u8fd8\u6709\u66f4\u65e9\u6d88\u606f\uff08"

    .line 581
    .line 582
    const-string v7, "/3\uff09"

    .line 583
    .line 584
    invoke-static {v3, v5, v7}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object v32

    .line 588
    const/16 v33, 0x70

    .line 589
    .line 590
    const/16 v31, 0x0

    .line 591
    .line 592
    invoke-direct/range {v26 .. v33}, Ljh0;-><init>(Lkh0;ILjava/lang/Long;Ljava/lang/Long;ILjava/lang/String;I)V

    .line 593
    .line 594
    .line 595
    move-object/from16 v3, v26

    .line 596
    .line 597
    invoke-virtual {v2, v3}, Lθ;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    :goto_c
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 601
    .line 602
    .line 603
    move-result v3

    .line 604
    if-eqz v3, :cond_c

    .line 605
    .line 606
    const/4 v4, 0x1

    .line 607
    if-eq v3, v4, :cond_b

    .line 608
    .line 609
    const/4 v8, 0x2

    .line 610
    if-ne v3, v8, :cond_a

    .line 611
    .line 612
    invoke-virtual {v10}, Ljava/util/AbstractMap;->size()I

    .line 613
    .line 614
    .line 615
    move-result v0

    .line 616
    new-instance v1, Ljava/lang/StringBuilder;

    .line 617
    .line 618
    const-string v3, "fullLoad stop, noGrowth="

    .line 619
    .line 620
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 621
    .line 622
    .line 623
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 624
    .line 625
    .line 626
    const-string v3, ", round="

    .line 627
    .line 628
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v1, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 632
    .line 633
    .line 634
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    const/4 v1, 0x4

    .line 645
    const/4 v3, 0x0

    .line 646
    invoke-static {v12, v0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 647
    .line 648
    .line 649
    new-instance v0, Lmh0;

    .line 650
    .line 651
    invoke-virtual {v10}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 656
    .line 657
    .line 658
    check-cast v1, Ljava/lang/Iterable;

    .line 659
    .line 660
    invoke-static {v1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 661
    .line 662
    .line 663
    move-result-object v1

    .line 664
    const-string v4, "\u5df2\u8fde\u7eed\u786e\u8ba4\u6ca1\u6709\u66f4\u65e9\u6d88\u606f"

    .line 665
    .line 666
    const/4 v5, 0x1

    .line 667
    invoke-direct {v0, v1, v5, v4}, Lmh0;-><init>(Ljava/util/List;ZLjava/lang/String;)V

    .line 668
    .line 669
    .line 670
    goto/16 :goto_12

    .line 671
    .line 672
    :cond_a
    const/4 v3, 0x0

    .line 673
    invoke-static {}, Lγ;->κ()V

    .line 674
    .line 675
    .line 676
    return-object v3

    .line 677
    :cond_b
    move v5, v4

    .line 678
    const/4 v8, 0x2

    .line 679
    new-instance v0, Lmh0;

    .line 680
    .line 681
    invoke-virtual {v10}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 682
    .line 683
    .line 684
    move-result-object v1

    .line 685
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 686
    .line 687
    .line 688
    check-cast v1, Ljava/lang/Iterable;

    .line 689
    .line 690
    invoke-static {v1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 691
    .line 692
    .line 693
    move-result-object v1

    .line 694
    move-object/from16 v3, v35

    .line 695
    .line 696
    invoke-direct {v0, v1, v5, v3}, Lmh0;-><init>(Ljava/util/List;ZLjava/lang/String;)V

    .line 697
    .line 698
    .line 699
    goto/16 :goto_12

    .line 700
    .line 701
    :cond_c
    const/4 v8, 0x2

    .line 702
    const-wide/16 v3, 0x1

    .line 703
    .line 704
    add-long/2addr v13, v3

    .line 705
    move-object/from16 v19, v0

    .line 706
    .line 707
    move-object v7, v2

    .line 708
    move/from16 v20, v5

    .line 709
    .line 710
    move-object v0, v9

    .line 711
    move-object v5, v10

    .line 712
    move-object v3, v12

    .line 713
    move-object/from16 v9, v21

    .line 714
    .line 715
    move-object/from16 v12, v23

    .line 716
    .line 717
    move/from16 v15, v28

    .line 718
    .line 719
    move/from16 v8, v34

    .line 720
    .line 721
    const/4 v2, 0x0

    .line 722
    const/4 v10, 0x0

    .line 723
    const/4 v11, 0x1

    .line 724
    goto/16 :goto_1

    .line 725
    .line 726
    :cond_d
    const-string v0, "\u65b0\u589e\u6d88\u606f\u6570\u91cf\u4e0d\u80fd\u4e3a\u8d1f\u6570"

    .line 727
    .line 728
    invoke-static {v0}, Lγ;->ν(Ljava/lang/String;)V

    .line 729
    .line 730
    .line 731
    const/16 v24, 0x0

    .line 732
    .line 733
    return-object v24

    .line 734
    :cond_e
    move-object/from16 v2, p5

    .line 735
    .line 736
    const/4 v8, 0x2

    .line 737
    goto :goto_11

    .line 738
    :catchall_2
    move-exception v0

    .line 739
    move-object v2, v7

    .line 740
    goto/16 :goto_4

    .line 741
    .line 742
    :catch_3
    move-object v2, v7

    .line 743
    goto/16 :goto_5

    .line 744
    .line 745
    :catchall_3
    move-exception v0

    .line 746
    :goto_d
    move-object/from16 v21, v9

    .line 747
    .line 748
    move-object/from16 v23, v12

    .line 749
    .line 750
    const/4 v8, 0x2

    .line 751
    move-object v12, v10

    .line 752
    move-object v10, v2

    .line 753
    move-object v2, v7

    .line 754
    goto :goto_f

    .line 755
    :catch_4
    :goto_e
    move-object/from16 v21, v9

    .line 756
    .line 757
    move-object/from16 v23, v12

    .line 758
    .line 759
    const/4 v8, 0x2

    .line 760
    move-object v12, v10

    .line 761
    move-object v10, v2

    .line 762
    move-object v2, v7

    .line 763
    goto :goto_10

    .line 764
    :catchall_4
    move-exception v0

    .line 765
    move/from16 v34, v8

    .line 766
    .line 767
    goto :goto_d

    .line 768
    :catch_5
    move/from16 v34, v8

    .line 769
    .line 770
    goto :goto_e

    .line 771
    :catchall_5
    move-exception v0

    .line 772
    move-object v10, v2

    .line 773
    goto/16 :goto_2

    .line 774
    .line 775
    :catch_6
    move-object v10, v2

    .line 776
    goto/16 :goto_3

    .line 777
    .line 778
    :goto_f
    const-string v1, "callLoadOldOnMain failed"

    .line 779
    .line 780
    invoke-static {v12, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 781
    .line 782
    .line 783
    goto :goto_11

    .line 784
    :goto_10
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 789
    .line 790
    .line 791
    :goto_11
    const-string v0, "fullLoad loadOld failed, round="

    .line 792
    .line 793
    invoke-static {v13, v14, v0}, Lnx;->ε(JLjava/lang/String;)Ljava/lang/String;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    const/4 v1, 0x4

    .line 798
    const/4 v3, 0x0

    .line 799
    invoke-static {v12, v0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 800
    .line 801
    .line 802
    new-instance v0, Lmh0;

    .line 803
    .line 804
    invoke-virtual {v10}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 805
    .line 806
    .line 807
    move-result-object v1

    .line 808
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 809
    .line 810
    .line 811
    check-cast v1, Ljava/lang/Iterable;

    .line 812
    .line 813
    invoke-static {v1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 814
    .line 815
    .line 816
    move-result-object v1

    .line 817
    const-string v3, "\u6682\u65f6\u65e0\u6cd5\u8bfb\u53d6\u66f4\u65e9\u7684\u6d88\u606f\uff0c\u5df2\u4fdd\u5b58\u5f53\u524d\u7ed3\u679c"

    .line 818
    .line 819
    const/4 v4, 0x0

    .line 820
    invoke-direct {v0, v1, v4, v3}, Lmh0;-><init>(Ljava/util/List;ZLjava/lang/String;)V

    .line 821
    .line 822
    .line 823
    :goto_12
    const/4 v5, 0x1

    .line 824
    :goto_13
    move-object v4, v0

    .line 825
    goto :goto_14

    .line 826
    :cond_f
    move-object v2, v7

    .line 827
    move/from16 v34, v8

    .line 828
    .line 829
    move-object/from16 v21, v9

    .line 830
    .line 831
    move-object/from16 v23, v12

    .line 832
    .line 833
    const/4 v8, 0x2

    .line 834
    const-wide/16 v16, 0x0

    .line 835
    .line 836
    move-object v12, v3

    .line 837
    new-instance v0, Lmh0;

    .line 838
    .line 839
    invoke-static {v1}, Lnh0;->ξ(Ljava/lang/Object;)Ljava/util/List;

    .line 840
    .line 841
    .line 842
    move-result-object v1

    .line 843
    const-string v3, "\u5df2\u5bfc\u51fa\u5f53\u524d\u9875\u9762\u5df2\u52a0\u8f7d\u7684\u6d88\u606f"

    .line 844
    .line 845
    const/4 v5, 0x1

    .line 846
    invoke-direct {v0, v1, v5, v3}, Lmh0;-><init>(Ljava/util/List;ZLjava/lang/String;)V

    .line 847
    .line 848
    .line 849
    goto :goto_13

    .line 850
    :goto_14
    invoke-virtual/range {p4 .. p4}, Ln;->Ζ()V

    .line 851
    .line 852
    .line 853
    new-instance v0, Lf7;

    .line 854
    .line 855
    iget-object v3, v4, Lmh0;->α:Ljava/util/List;

    .line 856
    .line 857
    invoke-direct {v0, v5, v3}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 858
    .line 859
    .line 860
    new-instance v1, Lθ;

    .line 861
    .line 862
    const/16 v7, 0x12

    .line 863
    .line 864
    invoke-direct {v1, v7, v6}, Lθ;-><init>(ILjava/lang/Object;)V

    .line 865
    .line 866
    .line 867
    new-instance v7, Ly30;

    .line 868
    .line 869
    invoke-direct {v7, v0, v5, v1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 870
    .line 871
    .line 872
    new-instance v26, Lng;

    .line 873
    .line 874
    const/16 v32, 0x0

    .line 875
    .line 876
    const/16 v33, 0xe

    .line 877
    .line 878
    const/16 v27, 0x1

    .line 879
    .line 880
    const-class v29, Lnh0;

    .line 881
    .line 882
    const-string v30, "messageKey"

    .line 883
    .line 884
    const-string v31, "messageKey(Ljava/lang/Object;)Ljava/lang/String;"

    .line 885
    .line 886
    move-object/from16 v28, p0

    .line 887
    .line 888
    invoke-direct/range {v26 .. v33}, Lng;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 889
    .line 890
    .line 891
    move-object/from16 v0, v26

    .line 892
    .line 893
    new-instance v1, Lqt;

    .line 894
    .line 895
    const/16 v5, 0x1a

    .line 896
    .line 897
    invoke-direct {v1, v5}, Lqt;-><init>(I)V

    .line 898
    .line 899
    .line 900
    new-instance v5, Lye;

    .line 901
    .line 902
    const/16 v9, 0xb

    .line 903
    .line 904
    invoke-direct {v5, v9, v1}, Lye;-><init>(ILjava/lang/Object;)V

    .line 905
    .line 906
    .line 907
    new-instance v1, Lye;

    .line 908
    .line 909
    const/16 v9, 0xc

    .line 910
    .line 911
    invoke-direct {v1, v9, v5}, Lye;-><init>(ILjava/lang/Object;)V

    .line 912
    .line 913
    .line 914
    new-instance v5, Ljava/util/ArrayList;

    .line 915
    .line 916
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 917
    .line 918
    .line 919
    new-instance v9, Lbu;

    .line 920
    .line 921
    invoke-interface {v7}, Lss1;->iterator()Ljava/util/Iterator;

    .line 922
    .line 923
    .line 924
    move-result-object v7

    .line 925
    invoke-direct {v9, v7, v0}, Lbu;-><init>(Ljava/util/Iterator;La80;)V

    .line 926
    .line 927
    .line 928
    :goto_15
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 929
    .line 930
    .line 931
    move-result v0

    .line 932
    if-eqz v0, :cond_10

    .line 933
    .line 934
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 935
    .line 936
    .line 937
    move-result-object v0

    .line 938
    invoke-interface {v5, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 939
    .line 940
    .line 941
    goto :goto_15

    .line 942
    :cond_10
    invoke-static {v5, v1}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 943
    .line 944
    .line 945
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 946
    .line 947
    .line 948
    move-result-object v0

    .line 949
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 950
    .line 951
    .line 952
    move-result v1

    .line 953
    if-nez v1, :cond_11

    .line 954
    .line 955
    sget-object v0, Ljz;->ε:Ljz;

    .line 956
    .line 957
    :goto_16
    move-object v9, v0

    .line 958
    goto :goto_18

    .line 959
    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 960
    .line 961
    .line 962
    move-result-object v1

    .line 963
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 964
    .line 965
    .line 966
    move-result v5

    .line 967
    if-nez v5, :cond_12

    .line 968
    .line 969
    invoke-static {v1}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 970
    .line 971
    .line 972
    move-result-object v0

    .line 973
    goto :goto_16

    .line 974
    :cond_12
    invoke-static {v1}, Llz1;->φ(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 975
    .line 976
    .line 977
    move-result-object v1

    .line 978
    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 979
    .line 980
    .line 981
    move-result v5

    .line 982
    if-eqz v5, :cond_13

    .line 983
    .line 984
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 985
    .line 986
    .line 987
    move-result-object v5

    .line 988
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 989
    .line 990
    .line 991
    goto :goto_17

    .line 992
    :cond_13
    move-object v9, v1

    .line 993
    :goto_18
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 994
    .line 995
    sget-object v1, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 996
    .line 997
    const-string v5, "yyyy-MM"

    .line 998
    .line 999
    invoke-direct {v0, v5, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 1000
    .line 1001
    .line 1002
    new-instance v5, Ljava/text/SimpleDateFormat;

    .line 1003
    .line 1004
    const-string v7, "yyyy\u5e74MM\u6708"

    .line 1005
    .line 1006
    invoke-direct {v5, v7, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 1007
    .line 1008
    .line 1009
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 1010
    .line 1011
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1012
    .line 1013
    .line 1014
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 1015
    .line 1016
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1017
    .line 1018
    .line 1019
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v10

    .line 1023
    const/4 v11, 0x0

    .line 1024
    const/4 v13, 0x0

    .line 1025
    :goto_19
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1026
    .line 1027
    .line 1028
    move-result v14

    .line 1029
    if-eqz v14, :cond_1a

    .line 1030
    .line 1031
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v14

    .line 1035
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1036
    .line 1037
    .line 1038
    const-string v15, "getCreatedAt"

    .line 1039
    .line 1040
    invoke-static {v14, v15}, Lnh0;->ε(Ljava/lang/Object;Ljava/lang/String;)J

    .line 1041
    .line 1042
    .line 1043
    move-result-wide v18

    .line 1044
    move-object/from16 p0, v9

    .line 1045
    .line 1046
    invoke-static/range {v18 .. v19}, Lnh0;->σ(J)J

    .line 1047
    .line 1048
    .line 1049
    move-result-wide v8

    .line 1050
    cmp-long v18, v8, v16

    .line 1051
    .line 1052
    if-lez v18, :cond_18

    .line 1053
    .line 1054
    new-instance v15, Ljava/util/Date;

    .line 1055
    .line 1056
    invoke-direct {v15, v8, v9}, Ljava/util/Date;-><init>(J)V

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v0, v15}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v19

    .line 1063
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual {v5, v15}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v15

    .line 1070
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1071
    .line 1072
    .line 1073
    if-eqz v11, :cond_15

    .line 1074
    .line 1075
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 1076
    .line 1077
    .line 1078
    move-result-wide v26

    .line 1079
    cmp-long v11, v26, v8

    .line 1080
    .line 1081
    if-lez v11, :cond_14

    .line 1082
    .line 1083
    move-wide/from16 v26, v8

    .line 1084
    .line 1085
    :cond_14
    invoke-static/range {v26 .. v27}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v11

    .line 1089
    goto :goto_1a

    .line 1090
    :cond_15
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v11

    .line 1094
    :goto_1a
    if-eqz v13, :cond_17

    .line 1095
    .line 1096
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 1097
    .line 1098
    .line 1099
    move-result-wide v26

    .line 1100
    cmp-long v13, v26, v8

    .line 1101
    .line 1102
    if-gez v13, :cond_16

    .line 1103
    .line 1104
    goto :goto_1b

    .line 1105
    :cond_16
    move-wide/from16 v8, v26

    .line 1106
    .line 1107
    :cond_17
    :goto_1b
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v8

    .line 1111
    move-object v13, v8

    .line 1112
    :goto_1c
    move-object/from16 v8, v19

    .line 1113
    .line 1114
    goto :goto_1d

    .line 1115
    :cond_18
    const-string v19, "unknown"

    .line 1116
    .line 1117
    const-string v15, "\u65f6\u95f4\u672a\u77e5"

    .line 1118
    .line 1119
    goto :goto_1c

    .line 1120
    :goto_1d
    invoke-virtual {v1, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v9

    .line 1124
    if-nez v9, :cond_19

    .line 1125
    .line 1126
    new-instance v9, Ljava/util/ArrayList;

    .line 1127
    .line 1128
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1129
    .line 1130
    .line 1131
    invoke-interface {v1, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1132
    .line 1133
    .line 1134
    :cond_19
    check-cast v9, Ljava/util/List;

    .line 1135
    .line 1136
    invoke-interface {v9, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1137
    .line 1138
    .line 1139
    invoke-interface {v7, v8, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1140
    .line 1141
    .line 1142
    const/4 v8, 0x2

    .line 1143
    move-object/from16 v9, p0

    .line 1144
    .line 1145
    goto :goto_19

    .line 1146
    :cond_1a
    move-object/from16 p0, v9

    .line 1147
    .line 1148
    new-instance v0, Ljava/util/ArrayList;

    .line 1149
    .line 1150
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 1151
    .line 1152
    .line 1153
    move-result v5

    .line 1154
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v1

    .line 1161
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v1

    .line 1165
    :goto_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1166
    .line 1167
    .line 1168
    move-result v5

    .line 1169
    if-eqz v5, :cond_1c

    .line 1170
    .line 1171
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v5

    .line 1175
    check-cast v5, Ljava/util/Map$Entry;

    .line 1176
    .line 1177
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v8

    .line 1181
    check-cast v8, Ljava/lang/String;

    .line 1182
    .line 1183
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v5

    .line 1187
    check-cast v5, Ljava/util/List;

    .line 1188
    .line 1189
    new-instance v9, Ldh0;

    .line 1190
    .line 1191
    invoke-virtual {v7, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v10

    .line 1195
    check-cast v10, Ljava/lang/String;

    .line 1196
    .line 1197
    if-nez v10, :cond_1b

    .line 1198
    .line 1199
    move-object v10, v8

    .line 1200
    :cond_1b
    invoke-static {v5}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v5

    .line 1204
    invoke-direct {v9, v8, v10, v5}, Ldh0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 1205
    .line 1206
    .line 1207
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1208
    .line 1209
    .line 1210
    goto :goto_1e

    .line 1211
    :cond_1c
    new-instance v1, Leh0;

    .line 1212
    .line 1213
    invoke-direct {v1, v11, v13, v0}, Leh0;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/ArrayList;)V

    .line 1214
    .line 1215
    .line 1216
    new-instance v26, Ljh0;

    .line 1217
    .line 1218
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    .line 1219
    .line 1220
    .line 1221
    move-result v28

    .line 1222
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1223
    .line 1224
    .line 1225
    move-result v31

    .line 1226
    const-string v32, "\u6d88\u606f\u8bfb\u53d6\u5b8c\u6210\uff0c\u6b63\u5728\u6309\u6708\u4efd\u6574\u7406"

    .line 1227
    .line 1228
    const/16 v33, 0x30

    .line 1229
    .line 1230
    sget-object v27, Lkh0;->ζ:Lkh0;

    .line 1231
    .line 1232
    move-object/from16 v29, v11

    .line 1233
    .line 1234
    move-object/from16 v30, v13

    .line 1235
    .line 1236
    invoke-direct/range {v26 .. v33}, Ljh0;-><init>(Lkh0;ILjava/lang/Long;Ljava/lang/Long;ILjava/lang/String;I)V

    .line 1237
    .line 1238
    .line 1239
    move-object/from16 v0, v26

    .line 1240
    .line 1241
    invoke-virtual {v2, v0}, Lθ;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1242
    .line 1243
    .line 1244
    invoke-virtual/range {p4 .. p4}, Ln;->Ζ()V

    .line 1245
    .line 1246
    .line 1247
    iget-object v0, v6, Lih0;->γ:Ljava/lang/Long;

    .line 1248
    .line 1249
    new-instance v5, Ljava/text/SimpleDateFormat;

    .line 1250
    .line 1251
    sget-object v7, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 1252
    .line 1253
    const-string v8, "yyyyMMdd_HHmmss"

    .line 1254
    .line 1255
    invoke-direct {v5, v8, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 1256
    .line 1257
    .line 1258
    new-instance v8, Ljava/util/Date;

    .line 1259
    .line 1260
    invoke-direct {v8}, Ljava/util/Date;-><init>()V

    .line 1261
    .line 1262
    .line 1263
    invoke-virtual {v5, v8}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v5

    .line 1267
    const-string v8, "[^a-zA-Z0-9_\\-]"

    .line 1268
    .line 1269
    invoke-static {v8}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v8

    .line 1273
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1274
    .line 1275
    .line 1276
    move-object/from16 v10, v23

    .line 1277
    .line 1278
    invoke-virtual {v8, v10}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v8

    .line 1282
    const-string v9, "_"

    .line 1283
    .line 1284
    invoke-virtual {v8, v9}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v8

    .line 1288
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1289
    .line 1290
    .line 1291
    const/4 v11, 0x1

    .line 1292
    new-array v13, v11, [C

    .line 1293
    .line 1294
    const/16 v11, 0x5f

    .line 1295
    .line 1296
    const/16 v25, 0x0

    .line 1297
    .line 1298
    aput-char v11, v13, v25

    .line 1299
    .line 1300
    invoke-static {v8, v13}, Lq02;->В(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v8

    .line 1304
    const/16 v11, 0x30

    .line 1305
    .line 1306
    invoke-static {v8, v11}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v8

    .line 1310
    invoke-static {v8}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1311
    .line 1312
    .line 1313
    move-result v11

    .line 1314
    if-eqz v11, :cond_1d

    .line 1315
    .line 1316
    const-string v8, "conversation"

    .line 1317
    .line 1318
    :cond_1d
    if-eqz v34, :cond_1e

    .line 1319
    .line 1320
    const-string v11, "full"

    .line 1321
    .line 1322
    goto :goto_1f

    .line 1323
    :cond_1e
    const-string v11, "loaded"

    .line 1324
    .line 1325
    :goto_1f
    iget-object v13, v6, Lih0;->β:Ljava/lang/Long;

    .line 1326
    .line 1327
    const-string v14, ""

    .line 1328
    .line 1329
    if-nez v13, :cond_20

    .line 1330
    .line 1331
    if-eqz v0, :cond_1f

    .line 1332
    .line 1333
    goto :goto_21

    .line 1334
    :cond_1f
    move-object/from16 p2, v1

    .line 1335
    .line 1336
    move-object v0, v14

    .line 1337
    :goto_20
    move-object/from16 v13, v21

    .line 1338
    .line 1339
    goto :goto_22

    .line 1340
    :cond_20
    :goto_21
    const-string v15, "yyyyMMdd"

    .line 1341
    .line 1342
    move-object/from16 v16, v0

    .line 1343
    .line 1344
    move-object/from16 p2, v1

    .line 1345
    .line 1346
    if-eqz v13, :cond_21

    .line 1347
    .line 1348
    invoke-virtual {v13}, Ljava/lang/Number;->longValue()J

    .line 1349
    .line 1350
    .line 1351
    move-result-wide v0

    .line 1352
    new-instance v13, Ljava/text/SimpleDateFormat;

    .line 1353
    .line 1354
    invoke-direct {v13, v15, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 1355
    .line 1356
    .line 1357
    new-instance v2, Ljava/util/Date;

    .line 1358
    .line 1359
    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 1360
    .line 1361
    .line 1362
    invoke-virtual {v13, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v0

    .line 1366
    if-nez v0, :cond_22

    .line 1367
    .line 1368
    :cond_21
    const-string v0, "start"

    .line 1369
    .line 1370
    :cond_22
    if-eqz v16, :cond_23

    .line 1371
    .line 1372
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->longValue()J

    .line 1373
    .line 1374
    .line 1375
    move-result-wide v1

    .line 1376
    new-instance v13, Ljava/text/SimpleDateFormat;

    .line 1377
    .line 1378
    invoke-direct {v13, v15, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 1379
    .line 1380
    .line 1381
    new-instance v7, Ljava/util/Date;

    .line 1382
    .line 1383
    invoke-direct {v7, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 1384
    .line 1385
    .line 1386
    invoke-virtual {v13, v7}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v1

    .line 1390
    if-nez v1, :cond_24

    .line 1391
    .line 1392
    :cond_23
    const-string v1, "end"

    .line 1393
    .line 1394
    :cond_24
    invoke-static {v9, v0, v9, v1}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v0

    .line 1398
    goto :goto_20

    .line 1399
    :goto_22
    iget-object v1, v13, Lhh0;->ζ:Ljava/lang/String;

    .line 1400
    .line 1401
    const-string v2, "chat_"

    .line 1402
    .line 1403
    invoke-static {v2, v8, v9, v11, v0}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v0

    .line 1407
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1408
    .line 1409
    .line 1410
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1411
    .line 1412
    .line 1413
    const-string v2, "."

    .line 1414
    .line 1415
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1416
    .line 1417
    .line 1418
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1419
    .line 1420
    .line 1421
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v8

    .line 1425
    iget-object v11, v13, Lhh0;->η:Ljava/lang/String;

    .line 1426
    .line 1427
    new-instance v0, La9;

    .line 1428
    .line 1429
    move-object/from16 v2, p2

    .line 1430
    .line 1431
    move-object/from16 v7, p5

    .line 1432
    .line 1433
    move-object v5, v6

    .line 1434
    move-object v1, v10

    .line 1435
    move-object/from16 v6, p4

    .line 1436
    .line 1437
    invoke-direct/range {v0 .. v7}, La9;-><init>(Ljava/lang/String;Leh0;Ljava/util/List;Lmh0;Lih0;Ln;Lθ;)V

    .line 1438
    .line 1439
    .line 1440
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v1

    .line 1444
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1445
    .line 1446
    .line 1447
    invoke-static {v1}, Lyh;->Ρ(Landroid/content/Context;)Landroid/net/Uri;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v6

    .line 1451
    if-eqz v6, :cond_33

    .line 1452
    .line 1453
    invoke-static {v1, v6}, Lcw1;->δ(Landroid/content/Context;Landroid/net/Uri;)Lcw1;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v6

    .line 1457
    invoke-virtual {v6}, Lcw1;->ε()Z

    .line 1458
    .line 1459
    .line 1460
    move-result v7

    .line 1461
    if-eqz v7, :cond_25

    .line 1462
    .line 1463
    invoke-virtual {v6}, Lcw1;->α()Z

    .line 1464
    .line 1465
    .line 1466
    move-result v7

    .line 1467
    if-eqz v7, :cond_25

    .line 1468
    .line 1469
    goto :goto_23

    .line 1470
    :cond_25
    const/4 v6, 0x0

    .line 1471
    :goto_23
    if-eqz v6, :cond_32

    .line 1472
    .line 1473
    const-string v7, "\u804a\u5929\u8bb0\u5f55"

    .line 1474
    .line 1475
    invoke-virtual {v6, v7}, Lcw1;->β(Ljava/lang/String;)Lcw1;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v15

    .line 1479
    if-eqz v15, :cond_27

    .line 1480
    .line 1481
    invoke-virtual {v15}, Lcw1;->ε()Z

    .line 1482
    .line 1483
    .line 1484
    move-result v16

    .line 1485
    if-eqz v16, :cond_26

    .line 1486
    .line 1487
    invoke-virtual {v15}, Lcw1;->α()Z

    .line 1488
    .line 1489
    .line 1490
    move-result v16

    .line 1491
    if-eqz v16, :cond_26

    .line 1492
    .line 1493
    goto :goto_24

    .line 1494
    :cond_26
    const/4 v15, 0x0

    .line 1495
    :goto_24
    if-eqz v15, :cond_27

    .line 1496
    .line 1497
    move-object/from16 p1, v1

    .line 1498
    .line 1499
    move-object/from16 p2, v3

    .line 1500
    .line 1501
    goto :goto_28

    .line 1502
    :cond_27
    iget-object v15, v6, Lcw1;->ζ:Ljava/lang/Object;

    .line 1503
    .line 1504
    check-cast v15, Landroid/content/Context;

    .line 1505
    .line 1506
    iget-object v6, v6, Lcw1;->η:Ljava/lang/Object;

    .line 1507
    .line 1508
    check-cast v6, Landroid/net/Uri;

    .line 1509
    .line 1510
    move-object/from16 p1, v1

    .line 1511
    .line 1512
    const-string v1, "vnd.android.document/directory"

    .line 1513
    .line 1514
    move-object/from16 p2, v3

    .line 1515
    .line 1516
    :try_start_7
    invoke-virtual {v15}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v3

    .line 1520
    invoke-static {v3, v6, v1, v7}, Landroid/provider/DocumentsContract;->createDocument(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    .line 1524
    goto :goto_25

    .line 1525
    :catch_7
    const/4 v1, 0x0

    .line 1526
    :goto_25
    if-eqz v1, :cond_28

    .line 1527
    .line 1528
    new-instance v3, Lcw1;

    .line 1529
    .line 1530
    const/4 v6, 0x1

    .line 1531
    invoke-direct {v3, v15, v6, v1}, Lcw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1532
    .line 1533
    .line 1534
    goto :goto_26

    .line 1535
    :cond_28
    const/4 v3, 0x0

    .line 1536
    :goto_26
    if-eqz v3, :cond_31

    .line 1537
    .line 1538
    invoke-virtual {v3}, Lcw1;->ε()Z

    .line 1539
    .line 1540
    .line 1541
    move-result v1

    .line 1542
    if-eqz v1, :cond_29

    .line 1543
    .line 1544
    invoke-virtual {v3}, Lcw1;->α()Z

    .line 1545
    .line 1546
    .line 1547
    move-result v1

    .line 1548
    if-eqz v1, :cond_29

    .line 1549
    .line 1550
    goto :goto_27

    .line 1551
    :cond_29
    const/4 v3, 0x0

    .line 1552
    :goto_27
    if-eqz v3, :cond_31

    .line 1553
    .line 1554
    move-object v15, v3

    .line 1555
    :goto_28
    const/16 v1, 0x2e

    .line 1556
    .line 1557
    const/4 v3, 0x6

    .line 1558
    const/4 v6, 0x0

    .line 1559
    invoke-static {v8, v1, v6, v3}, Lq02;->й(Ljava/lang/String;CII)I

    .line 1560
    .line 1561
    .line 1562
    move-result v1

    .line 1563
    if-lez v1, :cond_2a

    .line 1564
    .line 1565
    invoke-virtual {v8, v6, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v3

    .line 1569
    goto :goto_29

    .line 1570
    :cond_2a
    move-object v3, v8

    .line 1571
    :goto_29
    if-lez v1, :cond_2b

    .line 1572
    .line 1573
    invoke-virtual {v8, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v14

    .line 1577
    :cond_2b
    move-object v6, v8

    .line 1578
    const/4 v1, 0x2

    .line 1579
    :goto_2a
    invoke-virtual {v15, v6}, Lcw1;->β(Ljava/lang/String;)Lcw1;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v7

    .line 1583
    if-eqz v7, :cond_2c

    .line 1584
    .line 1585
    add-int/lit8 v6, v1, 0x1

    .line 1586
    .line 1587
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1588
    .line 1589
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 1590
    .line 1591
    .line 1592
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1593
    .line 1594
    .line 1595
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1596
    .line 1597
    .line 1598
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1599
    .line 1600
    .line 1601
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1602
    .line 1603
    .line 1604
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v1

    .line 1608
    move/from16 v36, v6

    .line 1609
    .line 1610
    move-object v6, v1

    .line 1611
    move/from16 v1, v36

    .line 1612
    .line 1613
    goto :goto_2a

    .line 1614
    :cond_2c
    iget-object v1, v15, Lcw1;->ζ:Ljava/lang/Object;

    .line 1615
    .line 1616
    check-cast v1, Landroid/content/Context;

    .line 1617
    .line 1618
    iget-object v3, v15, Lcw1;->η:Ljava/lang/Object;

    .line 1619
    .line 1620
    check-cast v3, Landroid/net/Uri;

    .line 1621
    .line 1622
    :try_start_8
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 1623
    .line 1624
    .line 1625
    move-result-object v7

    .line 1626
    invoke-static {v7, v3, v11, v6}, Landroid/provider/DocumentsContract;->createDocument(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v3
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8

    .line 1630
    goto :goto_2b

    .line 1631
    :catch_8
    const/4 v3, 0x0

    .line 1632
    :goto_2b
    if-eqz v3, :cond_2d

    .line 1633
    .line 1634
    new-instance v6, Lcw1;

    .line 1635
    .line 1636
    const/4 v11, 0x1

    .line 1637
    invoke-direct {v6, v1, v11, v3}, Lcw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1638
    .line 1639
    .line 1640
    goto :goto_2c

    .line 1641
    :cond_2d
    const/4 v6, 0x0

    .line 1642
    :goto_2c
    if-eqz v6, :cond_30

    .line 1643
    .line 1644
    :try_start_9
    iget-object v1, v6, Lcw1;->η:Ljava/lang/Object;

    .line 1645
    .line 1646
    check-cast v1, Landroid/net/Uri;

    .line 1647
    .line 1648
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v3

    .line 1652
    const-string v7, "w"

    .line 1653
    .line 1654
    invoke-virtual {v3, v1, v7}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;Ljava/lang/String;)Ljava/io/OutputStream;

    .line 1655
    .line 1656
    .line 1657
    move-result-object v3

    .line 1658
    if-eqz v3, :cond_2f

    .line 1659
    .line 1660
    new-instance v7, Ljava/io/OutputStreamWriter;

    .line 1661
    .line 1662
    sget-object v9, Lmf;->α:Ljava/nio/charset/Charset;

    .line 1663
    .line 1664
    invoke-direct {v7, v3, v9}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 1665
    .line 1666
    .line 1667
    new-instance v3, Ljava/io/BufferedWriter;

    .line 1668
    .line 1669
    const/16 v9, 0x2000

    .line 1670
    .line 1671
    invoke-direct {v3, v7, v9}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 1672
    .line 1673
    .line 1674
    :try_start_a
    invoke-virtual {v0, v3}, La9;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1675
    .line 1676
    .line 1677
    invoke-virtual {v3}, Ljava/io/BufferedWriter;->flush()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 1678
    .line 1679
    .line 1680
    :try_start_b
    invoke-interface {v3}, Ljava/io/Closeable;->close()V

    .line 1681
    .line 1682
    .line 1683
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1684
    .line 1685
    .line 1686
    iget-object v0, v6, Lcw1;->ζ:Ljava/lang/Object;

    .line 1687
    .line 1688
    check-cast v0, Landroid/content/Context;

    .line 1689
    .line 1690
    iget-object v3, v6, Lcw1;->η:Ljava/lang/Object;

    .line 1691
    .line 1692
    check-cast v3, Landroid/net/Uri;

    .line 1693
    .line 1694
    const-string v7, "_display_name"

    .line 1695
    .line 1696
    invoke-static {v0, v3, v7}, Lbd;->Ν(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 1697
    .line 1698
    .line 1699
    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 1700
    if-nez v0, :cond_2e

    .line 1701
    .line 1702
    move-object/from16 v27, v8

    .line 1703
    .line 1704
    goto :goto_2d

    .line 1705
    :cond_2e
    move-object/from16 v27, v0

    .line 1706
    .line 1707
    :goto_2d
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    .line 1708
    .line 1709
    .line 1710
    move-result v0

    .line 1711
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1712
    .line 1713
    const-string v6, "export done, conversationId="

    .line 1714
    .line 1715
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1716
    .line 1717
    .line 1718
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1719
    .line 1720
    .line 1721
    const-string v6, ", format="

    .line 1722
    .line 1723
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1724
    .line 1725
    .line 1726
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1727
    .line 1728
    .line 1729
    const-string v6, ", messages="

    .line 1730
    .line 1731
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1732
    .line 1733
    .line 1734
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1735
    .line 1736
    .line 1737
    const-string v0, ", complete="

    .line 1738
    .line 1739
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1740
    .line 1741
    .line 1742
    iget-boolean v0, v4, Lmh0;->β:Z

    .line 1743
    .line 1744
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 1745
    .line 1746
    .line 1747
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1748
    .line 1749
    .line 1750
    move-result-object v0

    .line 1751
    const/4 v3, 0x0

    .line 1752
    const/4 v7, 0x4

    .line 1753
    invoke-static {v12, v0, v3, v7, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1754
    .line 1755
    .line 1756
    new-instance v25, Llh0;

    .line 1757
    .line 1758
    iget-object v0, v5, Lih0;->δ:Lhh0;

    .line 1759
    .line 1760
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    .line 1761
    .line 1762
    .line 1763
    move-result v29

    .line 1764
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 1765
    .line 1766
    .line 1767
    move-result v30

    .line 1768
    iget-object v3, v2, Leh0;->γ:Ljava/util/ArrayList;

    .line 1769
    .line 1770
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 1771
    .line 1772
    .line 1773
    move-result v35

    .line 1774
    iget-boolean v3, v4, Lmh0;->β:Z

    .line 1775
    .line 1776
    iget-object v4, v4, Lmh0;->γ:Ljava/lang/String;

    .line 1777
    .line 1778
    iget-object v5, v2, Leh0;->α:Ljava/lang/Long;

    .line 1779
    .line 1780
    iget-object v2, v2, Leh0;->β:Ljava/lang/Long;

    .line 1781
    .line 1782
    move-object/from16 v28, v0

    .line 1783
    .line 1784
    move-object/from16 v26, v1

    .line 1785
    .line 1786
    move-object/from16 v34, v2

    .line 1787
    .line 1788
    move/from16 v31, v3

    .line 1789
    .line 1790
    move-object/from16 v32, v4

    .line 1791
    .line 1792
    move-object/from16 v33, v5

    .line 1793
    .line 1794
    invoke-direct/range {v25 .. v35}, Llh0;-><init>(Landroid/net/Uri;Ljava/lang/String;Lhh0;IIZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;I)V

    .line 1795
    .line 1796
    .line 1797
    return-object v25

    .line 1798
    :catchall_6
    move-exception v0

    .line 1799
    goto :goto_2e

    .line 1800
    :catchall_7
    move-exception v0

    .line 1801
    move-object v1, v0

    .line 1802
    :try_start_c
    throw v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 1803
    :catchall_8
    move-exception v0

    .line 1804
    :try_start_d
    invoke-static {v3, v1}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1805
    .line 1806
    .line 1807
    throw v0

    .line 1808
    :cond_2f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1809
    .line 1810
    const-string v1, "\u7cfb\u7edf\u6587\u6863\u63d0\u4f9b\u8005\u65e0\u6cd5\u521b\u5efa\u8f93\u51fa\u6d41"

    .line 1811
    .line 1812
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1813
    .line 1814
    .line 1815
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 1816
    :goto_2e
    :try_start_e
    iget-object v1, v6, Lcw1;->ζ:Ljava/lang/Object;

    .line 1817
    .line 1818
    check-cast v1, Landroid/content/Context;

    .line 1819
    .line 1820
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 1821
    .line 1822
    .line 1823
    move-result-object v1

    .line 1824
    iget-object v2, v6, Lcw1;->η:Ljava/lang/Object;

    .line 1825
    .line 1826
    check-cast v2, Landroid/net/Uri;

    .line 1827
    .line 1828
    invoke-static {v1, v2}, Landroid/provider/DocumentsContract;->deleteDocument(Landroid/content/ContentResolver;Landroid/net/Uri;)Z
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_9
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    .line 1829
    .line 1830
    .line 1831
    :catch_9
    :catchall_9
    throw v0

    .line 1832
    :cond_30
    const-string v0, "\u7cfb\u7edf\u6587\u6863\u63d0\u4f9b\u8005\u65e0\u6cd5\u521b\u5efa\u5bfc\u51fa\u6587\u4ef6"

    .line 1833
    .line 1834
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 1835
    .line 1836
    .line 1837
    const/16 v24, 0x0

    .line 1838
    .line 1839
    return-object v24

    .line 1840
    :cond_31
    const/16 v24, 0x0

    .line 1841
    .line 1842
    const-string v0, "\u65e0\u6cd5\u5728\u6240\u9009\u76ee\u5f55\u4e2d\u521b\u5efa\u201c\u804a\u5929\u8bb0\u5f55\u201d\u6587\u4ef6\u5939"

    .line 1843
    .line 1844
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 1845
    .line 1846
    .line 1847
    return-object v24

    .line 1848
    :cond_32
    new-instance v0, Lvh;

    .line 1849
    .line 1850
    const-string v1, "\u4fdd\u5b58\u76ee\u5f55\u6388\u6743\u5df2\u5931\u6548\uff0c\u8bf7\u91cd\u65b0\u9009\u62e9"

    .line 1851
    .line 1852
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1853
    .line 1854
    .line 1855
    throw v0

    .line 1856
    :cond_33
    new-instance v0, Lvh;

    .line 1857
    .line 1858
    const-string v1, "\u8bf7\u5148\u9009\u62e9\u804a\u5929\u8bb0\u5f55\u4fdd\u5b58\u76ee\u5f55"

    .line 1859
    .line 1860
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1861
    .line 1862
    .line 1863
    throw v0

    .line 1864
    :cond_34
    move-object/from16 v24, v10

    .line 1865
    .line 1866
    const-string v0, "\u5f53\u524d\u4f1a\u8bdd ID \u5c1a\u672a\u51c6\u5907\u5b8c\u6210"

    .line 1867
    .line 1868
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 1869
    .line 1870
    .line 1871
    return-object v24

    .line 1872
    :cond_35
    move-object/from16 v24, v10

    .line 1873
    .line 1874
    const-string v0, "\u5355\u6b21\u6d88\u606f\u7b49\u5f85\u65f6\u95f4\u5fc5\u987b\u5728 1 \u5230 60 \u79d2\u4e4b\u95f4"

    .line 1875
    .line 1876
    invoke-static {v0}, Lγ;->ν(Ljava/lang/String;)V

    .line 1877
    .line 1878
    .line 1879
    return-object v24

    .line 1880
    :cond_36
    move-object/from16 v24, v10

    .line 1881
    .line 1882
    const-string v0, "\u6bcf\u9875\u6d88\u606f\u6570\u5fc5\u987b\u5728 1 \u5230 500 \u4e4b\u95f4"

    .line 1883
    .line 1884
    invoke-static {v0}, Lγ;->ν(Ljava/lang/String;)V

    .line 1885
    .line 1886
    .line 1887
    return-object v24
.end method
