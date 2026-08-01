.class public abstract Lxhss/ᛵᲇᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛱᛱᛲᲇ:Lxhss/ᛳᛱᛲᲀ;

.field public static final ᛳᲁᲇᛸ:Lxhss/ᛷᛱᛳᲁ;

.field public static final ᛷᛵᛵᲈ:Lxhss/ᲇᛳᛶ;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    sget-object v0, Lxhss/ᲇᛳᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲇᛳᛶ;

    .line 2
    .line 3
    sput-object v0, Lxhss/ᛵᲇᛶ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛳᛶ;

    .line 4
    .line 5
    new-instance v0, Lxhss/ᛳᛱᛲᲀ;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, v1}, Lxhss/ᛳᛱᛲᲀ;-><init>(I)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, v0, Lxhss/ᛳᛱᛲᲀ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v1, Ljava/util/LinkedList;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, v0, Lxhss/ᛳᛱᛲᲀ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 24
    .line 25
    new-instance v1, Lxhss/ᲁᛶᛸᛲ;

    .line 26
    .line 27
    const/16 v2, 0x13

    .line 28
    .line 29
    invoke-direct {v1, v2}, Lxhss/ᲁᛶᛸᛲ;-><init>(I)V

    .line 30
    .line 31
    .line 32
    const-class v2, Ljava/lang/String;

    .line 33
    .line 34
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v0, v1, v2}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛶᛴᲈ(Lxhss/ᲁᛶᛸᛲ;[Ljava/lang/Class;)V

    .line 39
    .line 40
    .line 41
    new-instance v1, Lxhss/ᲁᛶᛸᛲ;

    .line 42
    .line 43
    const/4 v2, 0x2

    .line 44
    invoke-direct {v1, v2}, Lxhss/ᲁᛶᛸᛲ;-><init>(I)V

    .line 45
    .line 46
    .line 47
    const-class v2, Ljava/lang/Double;

    .line 48
    .line 49
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v0, v1, v2}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛶᛴᲈ(Lxhss/ᲁᛶᛸᛲ;[Ljava/lang/Class;)V

    .line 54
    .line 55
    .line 56
    new-instance v1, Lxhss/ᲁᛶᛸᛲ;

    .line 57
    .line 58
    const/4 v2, 0x3

    .line 59
    invoke-direct {v1, v2}, Lxhss/ᲁᛶᛸᛲ;-><init>(I)V

    .line 60
    .line 61
    .line 62
    const-class v2, Ljava/util/Date;

    .line 63
    .line 64
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v0, v1, v2}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛶᛴᲈ(Lxhss/ᲁᛶᛸᛲ;[Ljava/lang/Class;)V

    .line 69
    .line 70
    .line 71
    new-instance v1, Lxhss/ᲁᛶᛸᛲ;

    .line 72
    .line 73
    const/4 v2, 0x4

    .line 74
    invoke-direct {v1, v2}, Lxhss/ᲁᛶᛸᛲ;-><init>(I)V

    .line 75
    .line 76
    .line 77
    const-class v2, Ljava/lang/Float;

    .line 78
    .line 79
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v0, v1, v2}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛶᛴᲈ(Lxhss/ᲁᛶᛸᛲ;[Ljava/lang/Class;)V

    .line 84
    .line 85
    .line 86
    const-class v7, Ljava/math/BigInteger;

    .line 87
    .line 88
    const-class v8, Ljava/math/BigDecimal;

    .line 89
    .line 90
    const-class v3, Ljava/lang/Integer;

    .line 91
    .line 92
    const-class v4, Ljava/lang/Long;

    .line 93
    .line 94
    const-class v5, Ljava/lang/Byte;

    .line 95
    .line 96
    const-class v6, Ljava/lang/Short;

    .line 97
    .line 98
    filled-new-array/range {v3 .. v8}, [Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    sget-object v2, Lxhss/ᛳᛱᛲᲀ;->ᲇᛸᛳᲁ:Lxhss/ᲁᛶᛸᛲ;

    .line 103
    .line 104
    invoke-virtual {v0, v2, v1}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛶᛴᲈ(Lxhss/ᲁᛶᛸᛲ;[Ljava/lang/Class;)V

    .line 105
    .line 106
    .line 107
    const-class v1, Ljava/lang/Boolean;

    .line 108
    .line 109
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {v0, v2, v1}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛶᛴᲈ(Lxhss/ᲁᛶᛸᛲ;[Ljava/lang/Class;)V

    .line 114
    .line 115
    .line 116
    new-instance v1, Lxhss/ᲁᛶᛸᛲ;

    .line 117
    .line 118
    const/4 v3, 0x5

    .line 119
    invoke-direct {v1, v3}, Lxhss/ᲁᛶᛸᛲ;-><init>(I)V

    .line 120
    .line 121
    .line 122
    const-class v3, [I

    .line 123
    .line 124
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-virtual {v0, v1, v3}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛶᛴᲈ(Lxhss/ᲁᛶᛸᛲ;[Ljava/lang/Class;)V

    .line 129
    .line 130
    .line 131
    new-instance v1, Lxhss/ᲁᛶᛸᛲ;

    .line 132
    .line 133
    const/4 v3, 0x6

    .line 134
    invoke-direct {v1, v3}, Lxhss/ᲁᛶᛸᛲ;-><init>(I)V

    .line 135
    .line 136
    .line 137
    const-class v4, [S

    .line 138
    .line 139
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-virtual {v0, v1, v4}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛶᛴᲈ(Lxhss/ᲁᛶᛸᛲ;[Ljava/lang/Class;)V

    .line 144
    .line 145
    .line 146
    new-instance v1, Lxhss/ᲁᛶᛸᛲ;

    .line 147
    .line 148
    const/4 v4, 0x7

    .line 149
    invoke-direct {v1, v4}, Lxhss/ᲁᛶᛸᛲ;-><init>(I)V

    .line 150
    .line 151
    .line 152
    const-class v4, [J

    .line 153
    .line 154
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    invoke-virtual {v0, v1, v4}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛶᛴᲈ(Lxhss/ᲁᛶᛸᛲ;[Ljava/lang/Class;)V

    .line 159
    .line 160
    .line 161
    new-instance v1, Lxhss/ᲁᛶᛸᛲ;

    .line 162
    .line 163
    const/16 v4, 0x8

    .line 164
    .line 165
    invoke-direct {v1, v4}, Lxhss/ᲁᛶᛸᛲ;-><init>(I)V

    .line 166
    .line 167
    .line 168
    const-class v4, [F

    .line 169
    .line 170
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-virtual {v0, v1, v4}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛶᛴᲈ(Lxhss/ᲁᛶᛸᛲ;[Ljava/lang/Class;)V

    .line 175
    .line 176
    .line 177
    new-instance v1, Lxhss/ᲁᛶᛸᛲ;

    .line 178
    .line 179
    const/16 v4, 0x9

    .line 180
    .line 181
    invoke-direct {v1, v4}, Lxhss/ᲁᛶᛸᛲ;-><init>(I)V

    .line 182
    .line 183
    .line 184
    const-class v4, [D

    .line 185
    .line 186
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    invoke-virtual {v0, v1, v4}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛶᛴᲈ(Lxhss/ᲁᛶᛸᛲ;[Ljava/lang/Class;)V

    .line 191
    .line 192
    .line 193
    new-instance v1, Lxhss/ᲁᛶᛸᛲ;

    .line 194
    .line 195
    const/16 v4, 0xa

    .line 196
    .line 197
    invoke-direct {v1, v4}, Lxhss/ᲁᛶᛸᛲ;-><init>(I)V

    .line 198
    .line 199
    .line 200
    const-class v4, [Z

    .line 201
    .line 202
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    invoke-virtual {v0, v1, v4}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛶᛴᲈ(Lxhss/ᲁᛶᛸᛲ;[Ljava/lang/Class;)V

    .line 207
    .line 208
    .line 209
    const-class v1, Lxhss/ᲁᲇᛶᛶ;

    .line 210
    .line 211
    sget-object v4, Lxhss/ᛳᛱᛲᲀ;->ᲇᛶᛴᲀ:Lxhss/ᲁᛶᛸᛲ;

    .line 212
    .line 213
    invoke-virtual {v0, v1, v4}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛲᛷᛱ(Ljava/lang/Class;Lxhss/ᲁᛶᛸᛲ;)V

    .line 214
    .line 215
    .line 216
    const-class v1, Lxhss/ᛶᛴᲀᛵ;

    .line 217
    .line 218
    sget-object v4, Lxhss/ᛳᛱᛲᲀ;->ᛷᛴᛷᛱ:Lxhss/ᲁᛶᛸᛲ;

    .line 219
    .line 220
    invoke-virtual {v0, v1, v4}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛲᛷᛱ(Ljava/lang/Class;Lxhss/ᲁᛶᛸᛲ;)V

    .line 221
    .line 222
    .line 223
    const-class v1, Lxhss/ᛳᛱᛴᲀ;

    .line 224
    .line 225
    sget-object v4, Lxhss/ᛳᛱᛲᲀ;->ᲀᲇᛳᲁ:Lxhss/ᲁᛶᛸᛲ;

    .line 226
    .line 227
    invoke-virtual {v0, v1, v4}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛲᛷᛱ(Ljava/lang/Class;Lxhss/ᲁᛶᛸᛲ;)V

    .line 228
    .line 229
    .line 230
    const-class v1, Lxhss/ᛷᛴᛶᛲ;

    .line 231
    .line 232
    sget-object v4, Lxhss/ᛳᛱᛲᲀ;->ᛸᛴᛶᛳ:Lxhss/ᲁᛶᛸᛲ;

    .line 233
    .line 234
    invoke-virtual {v0, v1, v4}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛲᛷᛱ(Ljava/lang/Class;Lxhss/ᲁᛶᛸᛲ;)V

    .line 235
    .line 236
    .line 237
    const-class v1, Ljava/util/Map;

    .line 238
    .line 239
    sget-object v4, Lxhss/ᛳᛱᛲᲀ;->ᲈᛳᲀ:Lxhss/ᲁᛶᛸᛲ;

    .line 240
    .line 241
    invoke-virtual {v0, v1, v4}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛲᛷᛱ(Ljava/lang/Class;Lxhss/ᲁᛶᛸᛲ;)V

    .line 242
    .line 243
    .line 244
    const-class v1, Ljava/lang/Iterable;

    .line 245
    .line 246
    sget-object v4, Lxhss/ᛳᛱᛲᲀ;->ᛸᛲᲀᛵ:Lxhss/ᲁᛶᛸᛲ;

    .line 247
    .line 248
    invoke-virtual {v0, v1, v4}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛲᛷᛱ(Ljava/lang/Class;Lxhss/ᲁᛶᛸᛲ;)V

    .line 249
    .line 250
    .line 251
    const-class v1, Ljava/lang/Enum;

    .line 252
    .line 253
    sget-object v4, Lxhss/ᛳᛱᛲᲀ;->ᛸᛷᲈᲈ:Lxhss/ᲁᛶᛸᛲ;

    .line 254
    .line 255
    invoke-virtual {v0, v1, v4}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛲᛷᛱ(Ljava/lang/Class;Lxhss/ᲁᛶᛸᛲ;)V

    .line 256
    .line 257
    .line 258
    const-class v1, Ljava/lang/Number;

    .line 259
    .line 260
    invoke-virtual {v0, v1, v2}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛲᛷᛱ(Ljava/lang/Class;Lxhss/ᲁᛶᛸᛲ;)V

    .line 261
    .line 262
    .line 263
    sput-object v0, Lxhss/ᛵᲇᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛳᛱᛲᲀ;

    .line 264
    .line 265
    new-instance v0, Lxhss/ᛷᛱᛳᲁ;

    .line 266
    .line 267
    invoke-direct {v0, v3}, Lxhss/ᛷᛱᛳᲁ;-><init>(I)V

    .line 268
    .line 269
    .line 270
    sput-object v0, Lxhss/ᛵᲇᛶ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛱᛳᲁ;

    .line 271
    .line 272
    return-void
.end method

.method public static ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/StringBuilder;Lxhss/ᲇᛳᛶ;)V
    .locals 8

    .line 1
    const-string v0, "null"

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, Lxhss/ᛵᲇᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛳᛱᛲᲀ;

    .line 14
    .line 15
    iget-object v3, v2, Lxhss/ᛳᛱᛲᲀ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    invoke-virtual {v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Lxhss/ᲁᛶᛸᛲ;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    if-nez v3, :cond_5

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    sget-object v3, Lxhss/ᛳᛱᛲᲀ;->ᛸᛶᲈᛶ:Lxhss/ᲁᛶᛸᛲ;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    iget-object v5, v2, Lxhss/ᛳᛱᛲᲀ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v5, Ljava/util/LinkedList;

    .line 44
    .line 45
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-eqz v6, :cond_3

    .line 54
    .line 55
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    check-cast v6, Lxhss/ᛲᲈᛶᲀ;

    .line 60
    .line 61
    iget-object v7, v6, Lxhss/ᛲᲈᛶᲀ;->ᛷᛵᛵᲈ:Ljava/lang/Class;

    .line 62
    .line 63
    invoke-virtual {v7, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    if-eqz v7, :cond_2

    .line 68
    .line 69
    iget-object v3, v6, Lxhss/ᛲᲈᛶᲀ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛶᛸᛲ;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    move-object v3, v4

    .line 73
    :goto_0
    if-nez v3, :cond_4

    .line 74
    .line 75
    sget-object v3, Lxhss/ᛳᛱᛲᲀ;->ᛷᲁᲁ:Lxhss/ᲁᛶᛸᛲ;

    .line 76
    .line 77
    :cond_4
    :goto_1
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v2, v3, v1}, Lxhss/ᛳᛱᛲᲀ;->ᛸᛶᛴᲈ(Lxhss/ᲁᛶᛸᛲ;[Ljava/lang/Class;)V

    .line 82
    .line 83
    .line 84
    :cond_5
    iget v1, v3, Lxhss/ᲁᛶᛸᛲ;->ᛷᛵᛵᲈ:I

    .line 85
    .line 86
    const/16 v2, 0x5d

    .line 87
    .line 88
    const/16 v3, 0x5b

    .line 89
    .line 90
    const/16 v5, 0x2c

    .line 91
    .line 92
    const/4 v6, 0x0

    .line 93
    const/4 v7, 0x1

    .line 94
    packed-switch v1, :pswitch_data_0

    .line 95
    .line 96
    .line 97
    check-cast p0, Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {p2, p0, p1}, Lxhss/ᲇᛳᛶ;->ᛷᛵᛵᲈ(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 100
    .line 101
    .line 102
    goto/16 :goto_15

    .line 103
    .line 104
    :pswitch_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 109
    .line 110
    .line 111
    goto/16 :goto_15

    .line 112
    .line 113
    :pswitch_1
    check-cast p0, Ljava/util/Map;

    .line 114
    .line 115
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    const/16 v0, 0x7b

    .line 119
    .line 120
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 121
    .line 122
    .line 123
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_8

    .line 136
    .line 137
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    check-cast v0, Ljava/util/Map$Entry;

    .line 142
    .line 143
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    if-nez v1, :cond_6

    .line 148
    .line 149
    iget-boolean v2, p2, Lxhss/ᲇᛳᛶ;->ᛷᛵᛵᲈ:Z

    .line 150
    .line 151
    if-eqz v2, :cond_6

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_6
    if-eqz v7, :cond_7

    .line 155
    .line 156
    move v7, v6

    .line 157
    goto :goto_3

    .line 158
    :cond_7
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 159
    .line 160
    .line 161
    :goto_3
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {v0, v1, p1, p2}, Lxhss/ᛳᛱᛲᲀ;->ᛴᲈᛱᛴ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/StringBuilder;Lxhss/ᲇᛳᛶ;)V

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_8
    const/16 p0, 0x7d

    .line 174
    .line 175
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 176
    .line 177
    .line 178
    goto/16 :goto_15

    .line 179
    .line 180
    :pswitch_2
    check-cast p0, Ljava/lang/Enum;

    .line 181
    .line 182
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    invoke-virtual {p2, p0, p1}, Lxhss/ᲇᛳᛶ;->ᛷᛵᛵᲈ(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 187
    .line 188
    .line 189
    goto/16 :goto_15

    .line 190
    .line 191
    :pswitch_3
    check-cast p0, Ljava/lang/Iterable;

    .line 192
    .line 193
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 197
    .line 198
    .line 199
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-eqz v1, :cond_b

    .line 208
    .line 209
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    if-eqz v7, :cond_9

    .line 214
    .line 215
    move v7, v6

    .line 216
    goto :goto_5

    .line 217
    :cond_9
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 218
    .line 219
    .line 220
    :goto_5
    if-nez v1, :cond_a

    .line 221
    .line 222
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 223
    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_a
    invoke-static {v1, p1, p2}, Lxhss/ᛵᲇᛶ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/StringBuilder;Lxhss/ᲇᛳᛶ;)V

    .line 227
    .line 228
    .line 229
    goto :goto_4

    .line 230
    :cond_b
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 231
    .line 232
    .line 233
    goto/16 :goto_15

    .line 234
    .line 235
    :pswitch_4
    check-cast p0, Lxhss/ᛷᛴᛶᛲ;

    .line 236
    .line 237
    invoke-interface {p0}, Lxhss/ᛷᛴᛶᛲ;->ᛳᲁᲇᛸ()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 242
    .line 243
    .line 244
    goto/16 :goto_15

    .line 245
    .line 246
    :pswitch_5
    check-cast p0, Lxhss/ᛳᛱᛴᲀ;

    .line 247
    .line 248
    invoke-interface {p0, p2}, Lxhss/ᛳᛱᛴᲀ;->ᛷᛵᛵᲈ(Lxhss/ᲇᛳᛶ;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 253
    .line 254
    .line 255
    goto/16 :goto_15

    .line 256
    .line 257
    :pswitch_6
    check-cast p0, Lxhss/ᲁᲇᛶᛶ;

    .line 258
    .line 259
    invoke-interface {p0, p1, p2}, Lxhss/ᲁᲇᛶᛶ;->ᛱᛱᛲᲇ(Ljava/lang/StringBuilder;Lxhss/ᲇᛳᛶ;)V

    .line 260
    .line 261
    .line 262
    goto/16 :goto_15

    .line 263
    .line 264
    :pswitch_7
    check-cast p0, Lxhss/ᲁᲇᛶᛶ;

    .line 265
    .line 266
    invoke-interface {p0, p1}, Lxhss/ᛶᛴᲀᛵ;->ᲇᛴᲇᛵ(Ljava/lang/StringBuilder;)V

    .line 267
    .line 268
    .line 269
    goto/16 :goto_15

    .line 270
    .line 271
    :pswitch_8
    check-cast p0, [Z

    .line 272
    .line 273
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 277
    .line 278
    .line 279
    array-length p2, p0

    .line 280
    move v0, v6

    .line 281
    :goto_6
    if-ge v6, p2, :cond_d

    .line 282
    .line 283
    aget-boolean v1, p0, v6

    .line 284
    .line 285
    if-eqz v0, :cond_c

    .line 286
    .line 287
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 288
    .line 289
    .line 290
    goto :goto_7

    .line 291
    :cond_c
    move v0, v7

    .line 292
    :goto_7
    invoke-static {v1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 297
    .line 298
    .line 299
    add-int/lit8 v6, v6, 0x1

    .line 300
    .line 301
    goto :goto_6

    .line 302
    :cond_d
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 303
    .line 304
    .line 305
    goto/16 :goto_15

    .line 306
    .line 307
    :pswitch_9
    check-cast p0, [D

    .line 308
    .line 309
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 313
    .line 314
    .line 315
    array-length p2, p0

    .line 316
    move v0, v6

    .line 317
    :goto_8
    if-ge v6, p2, :cond_f

    .line 318
    .line 319
    aget-wide v3, p0, v6

    .line 320
    .line 321
    if-eqz v0, :cond_e

    .line 322
    .line 323
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 324
    .line 325
    .line 326
    goto :goto_9

    .line 327
    :cond_e
    move v0, v7

    .line 328
    :goto_9
    invoke-static {v3, v4}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 333
    .line 334
    .line 335
    add-int/lit8 v6, v6, 0x1

    .line 336
    .line 337
    goto :goto_8

    .line 338
    :cond_f
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 339
    .line 340
    .line 341
    goto/16 :goto_15

    .line 342
    .line 343
    :pswitch_a
    check-cast p0, [F

    .line 344
    .line 345
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 349
    .line 350
    .line 351
    array-length p2, p0

    .line 352
    move v0, v6

    .line 353
    :goto_a
    if-ge v6, p2, :cond_11

    .line 354
    .line 355
    aget v1, p0, v6

    .line 356
    .line 357
    if-eqz v0, :cond_10

    .line 358
    .line 359
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 360
    .line 361
    .line 362
    goto :goto_b

    .line 363
    :cond_10
    move v0, v7

    .line 364
    :goto_b
    invoke-static {v1}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 369
    .line 370
    .line 371
    add-int/lit8 v6, v6, 0x1

    .line 372
    .line 373
    goto :goto_a

    .line 374
    :cond_11
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 375
    .line 376
    .line 377
    goto/16 :goto_15

    .line 378
    .line 379
    :pswitch_b
    check-cast p0, [J

    .line 380
    .line 381
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 385
    .line 386
    .line 387
    array-length p2, p0

    .line 388
    move v0, v6

    .line 389
    :goto_c
    if-ge v6, p2, :cond_13

    .line 390
    .line 391
    aget-wide v3, p0, v6

    .line 392
    .line 393
    if-eqz v0, :cond_12

    .line 394
    .line 395
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 396
    .line 397
    .line 398
    goto :goto_d

    .line 399
    :cond_12
    move v0, v7

    .line 400
    :goto_d
    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 405
    .line 406
    .line 407
    add-int/lit8 v6, v6, 0x1

    .line 408
    .line 409
    goto :goto_c

    .line 410
    :cond_13
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 411
    .line 412
    .line 413
    goto/16 :goto_15

    .line 414
    .line 415
    :pswitch_c
    check-cast p0, [S

    .line 416
    .line 417
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 421
    .line 422
    .line 423
    array-length p2, p0

    .line 424
    move v0, v6

    .line 425
    :goto_e
    if-ge v6, p2, :cond_15

    .line 426
    .line 427
    aget-short v1, p0, v6

    .line 428
    .line 429
    if-eqz v0, :cond_14

    .line 430
    .line 431
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 432
    .line 433
    .line 434
    goto :goto_f

    .line 435
    :cond_14
    move v0, v7

    .line 436
    :goto_f
    invoke-static {v1}, Ljava/lang/Short;->toString(S)Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 441
    .line 442
    .line 443
    add-int/lit8 v6, v6, 0x1

    .line 444
    .line 445
    goto :goto_e

    .line 446
    :cond_15
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 447
    .line 448
    .line 449
    goto/16 :goto_15

    .line 450
    .line 451
    :pswitch_d
    check-cast p0, [I

    .line 452
    .line 453
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 454
    .line 455
    .line 456
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 457
    .line 458
    .line 459
    array-length p2, p0

    .line 460
    move v0, v6

    .line 461
    :goto_10
    if-ge v6, p2, :cond_17

    .line 462
    .line 463
    aget v1, p0, v6

    .line 464
    .line 465
    if-eqz v0, :cond_16

    .line 466
    .line 467
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 468
    .line 469
    .line 470
    goto :goto_11

    .line 471
    :cond_16
    move v0, v7

    .line 472
    :goto_11
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 477
    .line 478
    .line 479
    add-int/lit8 v6, v6, 0x1

    .line 480
    .line 481
    goto :goto_10

    .line 482
    :cond_17
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 483
    .line 484
    .line 485
    goto/16 :goto_15

    .line 486
    .line 487
    :pswitch_e
    check-cast p0, Ljava/lang/Float;

    .line 488
    .line 489
    invoke-virtual {p0}, Ljava/lang/Float;->isInfinite()Z

    .line 490
    .line 491
    .line 492
    move-result p2

    .line 493
    if-eqz p2, :cond_18

    .line 494
    .line 495
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 496
    .line 497
    .line 498
    goto :goto_15

    .line 499
    :cond_18
    invoke-virtual {p0}, Ljava/lang/Float;->toString()Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object p0

    .line 503
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 504
    .line 505
    .line 506
    goto :goto_15

    .line 507
    :pswitch_f
    check-cast p0, Ljava/util/Date;

    .line 508
    .line 509
    const/16 v0, 0x22

    .line 510
    .line 511
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 512
    .line 513
    .line 514
    invoke-virtual {p0}, Ljava/util/Date;->toString()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object p0

    .line 518
    if-nez p0, :cond_19

    .line 519
    .line 520
    goto :goto_12

    .line 521
    :cond_19
    iget-object p2, p2, Lxhss/ᲇᛳᛶ;->ᲇᛴᲇᛵ:Lxhss/ᛸᲁᛵᲀ;

    .line 522
    .line 523
    invoke-interface {p2, p0, p1}, Lxhss/ᛸᲁᛵᲀ;->ᛳᲁᲇᛸ(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 524
    .line 525
    .line 526
    :goto_12
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 527
    .line 528
    .line 529
    goto :goto_15

    .line 530
    :pswitch_10
    check-cast p0, Ljava/lang/Double;

    .line 531
    .line 532
    invoke-virtual {p0}, Ljava/lang/Double;->isInfinite()Z

    .line 533
    .line 534
    .line 535
    move-result p2

    .line 536
    if-eqz p2, :cond_1a

    .line 537
    .line 538
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 539
    .line 540
    .line 541
    goto :goto_15

    .line 542
    :cond_1a
    invoke-virtual {p0}, Ljava/lang/Double;->toString()Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object p0

    .line 546
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 547
    .line 548
    .line 549
    goto :goto_15

    .line 550
    :pswitch_11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 551
    .line 552
    .line 553
    move-result-object p0

    .line 554
    invoke-static {p0}, Lxhss/ᛲᛴᛵᲁ;->ᛷᛵᛵᲈ(Ljava/lang/Class;)V

    .line 555
    .line 556
    .line 557
    throw v4

    .line 558
    :pswitch_12
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 562
    .line 563
    .line 564
    check-cast p0, [Ljava/lang/Object;

    .line 565
    .line 566
    array-length v0, p0

    .line 567
    move v1, v6

    .line 568
    :goto_13
    if-ge v6, v0, :cond_1c

    .line 569
    .line 570
    aget-object v3, p0, v6

    .line 571
    .line 572
    if-eqz v1, :cond_1b

    .line 573
    .line 574
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 575
    .line 576
    .line 577
    goto :goto_14

    .line 578
    :cond_1b
    move v1, v7

    .line 579
    :goto_14
    invoke-static {v3, p1, p2}, Lxhss/ᛵᲇᛶ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/StringBuilder;Lxhss/ᲇᛳᛶ;)V

    .line 580
    .line 581
    .line 582
    add-int/lit8 v6, v6, 0x1

    .line 583
    .line 584
    goto :goto_13

    .line 585
    :cond_1c
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 586
    .line 587
    .line 588
    :goto_15
    return-void

    .line 589
    :pswitch_data_0
    .packed-switch 0x0
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
