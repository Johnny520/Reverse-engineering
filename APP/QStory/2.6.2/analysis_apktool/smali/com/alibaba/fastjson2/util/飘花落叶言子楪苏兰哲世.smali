.class public final Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/ClassLoader;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏兰哲世;

.field public static final 飘花落叶言子楪世哲苏兰:Ljava/util/HashMap;

.field public static final 飘花落叶言子楪世苏兰哲:Ljava/security/ProtectionDomain;


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 86

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:Ljava/util/HashMap;

    .line 7
    .line 8
    new-instance v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏兰哲世;

    .line 9
    .line 10
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-class v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏兰哲世;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v1, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :goto_0
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏兰哲世;-><init>(Ljava/lang/ClassLoader;)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏兰哲世;

    .line 38
    .line 39
    const-class v84, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世苏兰哲;

    .line 40
    .line 41
    const-class v85, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世苏哲兰;

    .line 42
    .line 43
    const-class v2, Ljava/lang/Object;

    .line 44
    .line 45
    const-class v3, Ljava/lang/reflect/Type;

    .line 46
    .line 47
    const-class v4, Ljava/lang/reflect/Field;

    .line 48
    .line 49
    const-class v5, Ljava/lang/reflect/Method;

    .line 50
    .line 51
    const-class v6, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;

    .line 52
    .line 53
    const-class v7, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;

    .line 54
    .line 55
    const-class v8, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 56
    .line 57
    const-class v9, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 58
    .line 59
    const-class v10, Lcom/alibaba/fastjson2/reader/飘花落叶言子世兰苏楪哲;

    .line 60
    .line 61
    const-class v11, Lcom/alibaba/fastjson2/reader/飘花落叶言子世兰苏哲楪;

    .line 62
    .line 63
    const-class v12, Lcom/alibaba/fastjson2/reader/飘花落叶言子世兰哲楪苏;

    .line 64
    .line 65
    const-class v13, Lcom/alibaba/fastjson2/reader/飘花落叶言子世兰哲苏楪;

    .line 66
    .line 67
    const-class v14, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪世哲兰;

    .line 68
    .line 69
    const-class v15, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪世兰哲;

    .line 70
    .line 71
    const-class v16, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪世兰哲;

    .line 72
    .line 73
    const-class v17, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪哲世兰;

    .line 74
    .line 75
    const-class v18, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪哲兰世;

    .line 76
    .line 77
    const-class v19, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰世哲;

    .line 78
    .line 79
    const-class v20, Lcom/alibaba/fastjson2/reader/飘花落叶言子世哲兰苏楪;

    .line 80
    .line 81
    const-class v21, Lcom/alibaba/fastjson2/reader/飘花落叶言子世兰楪苏哲;

    .line 82
    .line 83
    const-class v22, Lcom/alibaba/fastjson2/reader/飘花落叶言子世兰楪哲苏;

    .line 84
    .line 85
    const-class v23, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;

    .line 86
    .line 87
    const-class v24, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;

    .line 88
    .line 89
    const-class v25, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 90
    .line 91
    const-class v26, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;

    .line 92
    .line 93
    const-class v27, L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世兰苏哲;

    .line 94
    .line 95
    const-class v28, L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世哲兰苏;

    .line 96
    .line 97
    const-class v29, L飘花落叶言楪子苏世哲兰/飘花落叶言子楪世哲苏兰;

    .line 98
    .line 99
    const-class v30, L飘花落叶言楪子苏世哲兰/飘花落叶言子楪苏世哲兰;

    .line 100
    .line 101
    const-class v31, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 102
    .line 103
    const-class v32, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏世哲兰楪;

    .line 104
    .line 105
    const-class v33, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏世兰楪哲;

    .line 106
    .line 107
    const-class v34, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏世兰哲楪;

    .line 108
    .line 109
    const-class v35, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏哲楪世兰;

    .line 110
    .line 111
    const-class v36, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏哲楪兰世;

    .line 112
    .line 113
    const-class v37, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏哲世楪兰;

    .line 114
    .line 115
    const-class v38, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏哲世兰楪;

    .line 116
    .line 117
    const-class v39, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏哲兰楪世;

    .line 118
    .line 119
    const-class v40, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏哲兰世楪;

    .line 120
    .line 121
    const-class v41, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏世楪哲兰;

    .line 122
    .line 123
    const-class v42, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏世楪兰哲;

    .line 124
    .line 125
    const-class v43, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏世哲楪兰;

    .line 126
    .line 127
    const-class v44, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪哲世;

    .line 128
    .line 129
    const-class v45, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;

    .line 130
    .line 131
    const-class v46, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;

    .line 132
    .line 133
    const-class v47, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;

    .line 134
    .line 135
    const-class v48, Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 136
    .line 137
    const-class v49, Ljava/util/Collection;

    .line 138
    .line 139
    const-class v50, Ljava/util/Set;

    .line 140
    .line 141
    const-class v51, Ljava/util/List;

    .line 142
    .line 143
    const-class v52, Ljava/util/ArrayList;

    .line 144
    .line 145
    const-class v53, Ljava/util/LinkedList;

    .line 146
    .line 147
    const-class v54, Ljava/util/Map;

    .line 148
    .line 149
    const-class v55, Ljava/util/HashMap;

    .line 150
    .line 151
    const-class v56, Ljava/util/LinkedHashMap;

    .line 152
    .line 153
    const-class v57, Ljava/util/EnumSet;

    .line 154
    .line 155
    const-class v58, Ljava/util/Optional;

    .line 156
    .line 157
    const-class v59, Ljava/util/OptionalInt;

    .line 158
    .line 159
    const-class v60, Ljava/util/OptionalLong;

    .line 160
    .line 161
    const-class v61, Ljava/util/Date;

    .line 162
    .line 163
    const-class v62, Ljava/util/Calendar;

    .line 164
    .line 165
    const-class v63, Ljava/util/concurrent/ConcurrentHashMap;

    .line 166
    .line 167
    const-class v64, Ljava/util/function/Supplier;

    .line 168
    .line 169
    const-class v65, Ljava/util/function/Consumer;

    .line 170
    .line 171
    const-class v66, Ljava/lang/Exception;

    .line 172
    .line 173
    const-class v67, Ljava/lang/Enum;

    .line 174
    .line 175
    const-class v68, Ljava/lang/Class;

    .line 176
    .line 177
    const-class v69, Ljava/lang/Boolean;

    .line 178
    .line 179
    const-class v70, Ljava/lang/Byte;

    .line 180
    .line 181
    const-class v71, Ljava/lang/Short;

    .line 182
    .line 183
    const-class v72, Ljava/lang/Integer;

    .line 184
    .line 185
    const-class v73, Ljava/lang/Long;

    .line 186
    .line 187
    const-class v74, Ljava/lang/Float;

    .line 188
    .line 189
    const-class v75, Ljava/lang/Double;

    .line 190
    .line 191
    const-class v76, Ljava/lang/String;

    .line 192
    .line 193
    const-class v77, Ljava/math/BigInteger;

    .line 194
    .line 195
    const-class v78, Ljava/math/BigDecimal;

    .line 196
    .line 197
    const-class v79, Ljava/time/Instant;

    .line 198
    .line 199
    const-class v80, Ljava/time/LocalTime;

    .line 200
    .line 201
    const-class v81, Ljava/time/LocalDate;

    .line 202
    .line 203
    const-class v82, Ljava/time/LocalDateTime;

    .line 204
    .line 205
    const-class v83, Ljava/time/ZonedDateTime;

    .line 206
    .line 207
    filled-new-array/range {v2 .. v85}, [Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    const/4 v1, 0x0

    .line 212
    move v2, v1

    .line 213
    :goto_1
    const/16 v3, 0x54

    .line 214
    .line 215
    if-ge v2, v3, :cond_1

    .line 216
    .line 217
    aget-object v3, v0, v2

    .line 218
    .line 219
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:Ljava/util/HashMap;

    .line 220
    .line 221
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    add-int/lit8 v2, v2, 0x1

    .line 229
    .line 230
    goto :goto_1

    .line 231
    :cond_1
    const-string v0, "java.sql.Timestamp"

    .line 232
    .line 233
    const-string v2, "java.sql.Date"

    .line 234
    .line 235
    const-string v3, "sun.misc.Unsafe"

    .line 236
    .line 237
    filled-new-array {v3, v0, v2}, [Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    :goto_2
    const/4 v2, 0x3

    .line 242
    if-ge v1, v2, :cond_2

    .line 243
    .line 244
    aget-object v2, v0, v1

    .line 245
    .line 246
    :try_start_1
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:Ljava/util/HashMap;

    .line 251
    .line 252
    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 253
    .line 254
    .line 255
    :catch_1
    add-int/lit8 v1, v1, 0x1

    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_2
    new-instance v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏兰世哲;

    .line 259
    .line 260
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 261
    .line 262
    .line 263
    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    check-cast v0, Ljava/security/ProtectionDomain;

    .line 268
    .line 269
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Ljava/security/ProtectionDomain;

    .line 270
    .line 271
    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/lang/ClassLoader;-><init>(Ljava/lang/ClassLoader;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final loadClass(Ljava/lang/String;Z)Ljava/lang/Class;
    .locals 1

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Class;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/Class;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    :try_start_0
    invoke-super {p0, p1, p2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;Z)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    return-object p0

    .line 28
    :catch_0
    move-exception p2

    .line 29
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    if-eq v0, p0, :cond_2

    .line 40
    .line 41
    :try_start_1
    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 45
    return-object p0

    .line 46
    :catch_1
    :cond_2
    throw p2
.end method

.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    :goto_0
    if-eqz p0, :cond_2

    .line 10
    .line 11
    if-ne p0, p1, :cond_1

    .line 12
    .line 13
    return v0

    .line 14
    :cond_1
    invoke-virtual {p0}, Ljava/lang/ClassLoader;->getParent()Ljava/lang/ClassLoader;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    goto :goto_0

    .line 19
    :cond_2
    const/4 p0, 0x1

    .line 20
    return p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/String;I[B)Ljava/lang/Class;
    .locals 6

    .line 1
    const/4 v3, 0x0

    .line 2
    sget-object v5, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Ljava/security/ProtectionDomain;

    .line 3
    .line 4
    move-object v0, p0

    .line 5
    move-object v1, p1

    .line 6
    move v4, p2

    .line 7
    move-object v2, p3

    .line 8
    invoke-virtual/range {v0 .. v5}, Ljava/lang/ClassLoader;->defineClass(Ljava/lang/String;[BIILjava/security/ProtectionDomain;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method
