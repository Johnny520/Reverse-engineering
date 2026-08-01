.class public final synthetic Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

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
    invoke-virtual {p1}, Lorg/apache/commons/lang3/tuple/Pair;->getKey()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/lang/String;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_0
    check-cast p1, Lorg/apache/commons/lang3/tuple/Pair;

    .line 16
    .line 17
    invoke-virtual {p1}, Lorg/apache/commons/lang3/tuple/Pair;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :pswitch_1
    check-cast p1, Lcom/alibaba/fastjson2/JSONObject;

    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏兰哲世(Lcom/alibaba/fastjson2/JSONObject;Lcom/alibaba/fastjson2/schema/JSONSchema;)Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :pswitch_2
    check-cast p1, Ljava/lang/reflect/Method;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :pswitch_3
    check-cast p1, Ljava/lang/reflect/Method;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :pswitch_4
    check-cast p1, Ljava/lang/StackTraceElement;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_5
    check-cast p1, Ljava/lang/StackTraceElement;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :pswitch_6
    check-cast p1, Ljava/lang/StackTraceElement;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_7
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :pswitch_8
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 73
    .line 74
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :pswitch_9
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 80
    .line 81
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :pswitch_a
    check-cast p1, Ljava/lang/reflect/Field;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :pswitch_b
    check-cast p1, Ljava/lang/reflect/Field;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    :pswitch_c
    check-cast p1, Ljava/lang/reflect/Method;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0

    .line 107
    :pswitch_d
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0

    .line 114
    :pswitch_e
    check-cast p1, Ljava/lang/Integer;

    .line 115
    .line 116
    new-instance p0, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 119
    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_f
    check-cast p1, Lorg/apache/commons/compress/archivers/zip/ZipMethod;

    .line 123
    .line 124
    invoke-virtual {p1}, Lorg/apache/commons/compress/archivers/zip/ZipMethod;->getCode()I

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0

    .line 133
    :pswitch_10
    new-instance p0, Llin/xposed/hook/loader/config/HookItemConfig;

    .line 134
    .line 135
    check-cast p1, Ljava/lang/String;

    .line 136
    .line 137
    invoke-direct {p0, p1}, Llin/xposed/hook/loader/config/HookItemConfig;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_11
    check-cast p1, Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 142
    .line 143
    invoke-virtual {p1}, Llin/xposed/hook/javaplugin/bean/PluginInfo;->getDate()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    return-object p0

    .line 148
    :pswitch_12
    check-cast p1, Ljava/math/BigInteger;

    .line 149
    .line 150
    invoke-static {p1}, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Ljava/math/BigInteger;)L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世哲苏兰;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    return-object p0

    .line 155
    :pswitch_13
    new-instance p0, Ljava/util/EnumMap;

    .line 156
    .line 157
    check-cast p1, Ljava/util/Map;

    .line 158
    .line 159
    invoke-direct {p0, p1}, Ljava/util/EnumMap;-><init>(Ljava/util/Map;)V

    .line 160
    .line 161
    .line 162
    return-object p0

    .line 163
    :pswitch_14
    check-cast p1, Ljava/util/Map;

    .line 164
    .line 165
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    check-cast p0, Ljava/util/Map$Entry;

    .line 178
    .line 179
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-static {p1, p0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    return-object p0

    .line 192
    :pswitch_15
    check-cast p1, Ljava/util/NavigableMap;

    .line 193
    .line 194
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableNavigableMap(Ljava/util/NavigableMap;)Ljava/util/NavigableMap;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    return-object p0

    .line 199
    :pswitch_16
    check-cast p1, Ljava/util/SortedMap;

    .line 200
    .line 201
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableSortedMap(Ljava/util/SortedMap;)Ljava/util/SortedMap;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    return-object p0

    .line 206
    :pswitch_17
    check-cast p1, Ljava/util/Map;

    .line 207
    .line 208
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    return-object p0

    .line 213
    :pswitch_18
    check-cast p1, Ljava/util/SortedMap;

    .line 214
    .line 215
    invoke-static {p1}, Ljava/util/Collections;->synchronizedSortedMap(Ljava/util/SortedMap;)Ljava/util/SortedMap;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    return-object p0

    .line 220
    :pswitch_19
    check-cast p1, Ljava/util/NavigableMap;

    .line 221
    .line 222
    invoke-static {p1}, Ljava/util/Collections;->synchronizedNavigableMap(Ljava/util/NavigableMap;)Ljava/util/NavigableMap;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    return-object p0

    .line 227
    :pswitch_1a
    check-cast p1, Ljava/util/Map;

    .line 228
    .line 229
    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    return-object p0

    .line 234
    :pswitch_1b
    check-cast p1, Ljava/util/Collection;

    .line 235
    .line 236
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    return-object p0

    .line 249
    :pswitch_1c
    check-cast p1, Ljava/util/Collection;

    .line 250
    .line 251
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    return-object p0

    .line 264
    nop

    .line 265
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
