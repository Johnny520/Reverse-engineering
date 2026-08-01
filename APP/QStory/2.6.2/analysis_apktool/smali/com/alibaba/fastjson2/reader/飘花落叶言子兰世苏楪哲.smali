.class public final synthetic Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lorg/apache/commons/lang3/tuple/Pair;

    .line 7
    .line 8
    invoke-virtual {p1}, Lorg/apache/commons/lang3/tuple/Pair;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    check-cast p1, Ljava/nio/file/Path;

    .line 14
    .line 15
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :pswitch_1
    check-cast p1, Ljava/lang/reflect/Method;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :pswitch_2
    check-cast p1, Ljava/lang/reflect/Method;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_3
    check-cast p1, Ljava/lang/StackTraceElement;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :pswitch_4
    check-cast p1, Ljava/lang/StackTraceElement;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :pswitch_5
    check-cast p1, Ljava/lang/StackTraceElement;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :pswitch_6
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 56
    .line 57
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_7
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 63
    .line 64
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :pswitch_8
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 70
    .line 71
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :pswitch_9
    check-cast p1, Ljava/lang/reflect/Field;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :pswitch_a
    check-cast p1, Ljava/lang/reflect/Field;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0

    .line 90
    :pswitch_b
    check-cast p1, Ljava/lang/reflect/Method;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :pswitch_c
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :pswitch_d
    check-cast p1, Lcom/alibaba/fastjson2/JSONObject;

    .line 105
    .line 106
    const/4 p0, 0x0

    .line 107
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏兰哲世(Lcom/alibaba/fastjson2/JSONObject;Lcom/alibaba/fastjson2/schema/JSONSchema;)Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :pswitch_e
    check-cast p1, Ljava/lang/Integer;

    .line 113
    .line 114
    new-instance p0, Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 117
    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_f
    check-cast p1, Lorg/apache/commons/compress/archivers/zip/ZipMethod;

    .line 121
    .line 122
    invoke-virtual {p1}, Lorg/apache/commons/compress/archivers/zip/ZipMethod;->getCode()I

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    return-object p0

    .line 131
    :pswitch_10
    new-instance p0, Llin/xposed/hook/loader/config/HookItemConfig;

    .line 132
    .line 133
    check-cast p1, Ljava/lang/String;

    .line 134
    .line 135
    invoke-direct {p0, p1}, Llin/xposed/hook/loader/config/HookItemConfig;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    return-object p0

    .line 139
    :pswitch_11
    check-cast p1, Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 140
    .line 141
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getDate()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    return-object p0

    .line 146
    :pswitch_12
    check-cast p1, Ljava/math/BigInteger;

    .line 147
    .line 148
    invoke-static {p1}, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Ljava/math/BigInteger;)L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世哲苏兰;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    return-object p0

    .line 153
    :pswitch_13
    new-instance p0, Ljava/util/EnumMap;

    .line 154
    .line 155
    check-cast p1, Ljava/util/Map;

    .line 156
    .line 157
    invoke-direct {p0, p1}, Ljava/util/EnumMap;-><init>(Ljava/util/Map;)V

    .line 158
    .line 159
    .line 160
    return-object p0

    .line 161
    :pswitch_14
    check-cast p1, Ljava/util/Map;

    .line 162
    .line 163
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    check-cast p0, Ljava/util/Map$Entry;

    .line 176
    .line 177
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-static {p1, p0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    return-object p0

    .line 190
    :pswitch_15
    check-cast p1, Ljava/util/NavigableMap;

    .line 191
    .line 192
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableNavigableMap(Ljava/util/NavigableMap;)Ljava/util/NavigableMap;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    return-object p0

    .line 197
    :pswitch_16
    check-cast p1, Ljava/util/SortedMap;

    .line 198
    .line 199
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableSortedMap(Ljava/util/SortedMap;)Ljava/util/SortedMap;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    return-object p0

    .line 204
    :pswitch_17
    check-cast p1, Ljava/util/Map;

    .line 205
    .line 206
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    return-object p0

    .line 211
    :pswitch_18
    check-cast p1, Ljava/util/SortedMap;

    .line 212
    .line 213
    invoke-static {p1}, Ljava/util/Collections;->synchronizedSortedMap(Ljava/util/SortedMap;)Ljava/util/SortedMap;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    return-object p0

    .line 218
    :pswitch_19
    check-cast p1, Ljava/util/NavigableMap;

    .line 219
    .line 220
    invoke-static {p1}, Ljava/util/Collections;->synchronizedNavigableMap(Ljava/util/NavigableMap;)Ljava/util/NavigableMap;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    return-object p0

    .line 225
    :pswitch_1a
    check-cast p1, Ljava/util/Map;

    .line 226
    .line 227
    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    return-object p0

    .line 232
    :pswitch_1b
    check-cast p1, Ljava/util/Collection;

    .line 233
    .line 234
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    return-object p0

    .line 247
    :pswitch_1c
    check-cast p1, Ljava/util/Collection;

    .line 248
    .line 249
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    return-object p0

    .line 262
    nop

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
