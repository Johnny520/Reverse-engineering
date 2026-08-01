.class public final Lxhss/ᛷᛱᛳᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛲᛳᛳᛲ;
.implements Lxhss/ᛳᛵᛲᲁ;
.implements Lxhss/ᲇᛱᲈᛱ;


# static fields
.field public static final ᲀᲇᛳᲁ:Ljava/lang/Object;

.field public static volatile ᲇᛶᛴᲀ:Lxhss/ᛷᛱᛳᲁ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final ᛳᲁᲇᛸ:Ljava/lang/Object;

.field public ᛷᛴᛷᛱ:Ljava/lang/Object;

.field public ᲇᛴᲇᛵ:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxhss/ᛷᛱᛳᲁ;->ᲀᲇᛳᲁ:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(I)V
    .locals 5

    .line 1
    iput p1, p0, Lxhss/ᛷᛱᛳᲁ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance p1, Lxhss/ᛴᲈᛱᲁ;

    .line 19
    .line 20
    invoke-direct {p1, v1}, Lxhss/ᛴᲈᛱᲁ;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 24
    .line 25
    new-instance p1, Lxhss/ᲇᛵᛸᛲ;

    .line 26
    .line 27
    invoke-direct {p1, v1}, Lxhss/ᲇᛵᛸᛲ;-><init>(Z)V

    .line 28
    .line 29
    .line 30
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 36
    .line 37
    new-instance p1, Ljava/util/HashMap;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 43
    .line 44
    .line 45
    new-instance p1, Ljava/util/HashMap;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 51
    .line 52
    .line 53
    new-instance p1, Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 59
    .line 60
    .line 61
    new-instance p1, Lxhss/ᛳᛴᲀᲁ;

    .line 62
    .line 63
    invoke-direct {p1, p0}, Lxhss/ᛳᛴᲀᲁ;-><init>(Lxhss/ᛷᛱᛳᲁ;)V

    .line 64
    .line 65
    .line 66
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 67
    .line 68
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    new-instance p1, Lxhss/ᛱᲀᲇᛷ;

    .line 72
    .line 73
    invoke-direct {p1, p0, v1}, Lxhss/ᛱᲀᲇᛷ;-><init>(Lxhss/ᛷᛱᛳᲁ;I)V

    .line 74
    .line 75
    .line 76
    new-instance p1, Lxhss/ᛱᲀᲇᛷ;

    .line 77
    .line 78
    invoke-direct {p1, p0, v0}, Lxhss/ᛱᲀᲇᛷ;-><init>(Lxhss/ᛷᛱᛳᲁ;I)V

    .line 79
    .line 80
    .line 81
    new-instance p1, Lxhss/ᛶᛲᛵᛳ;

    .line 82
    .line 83
    invoke-direct {p1, p0, v1}, Lxhss/ᛶᛲᛵᛳ;-><init>(Lxhss/ᛷᛱᛳᲁ;I)V

    .line 84
    .line 85
    .line 86
    new-instance p1, Lxhss/ᛶᛲᛵᛳ;

    .line 87
    .line 88
    invoke-direct {p1, p0, v0}, Lxhss/ᛶᛲᛵᛳ;-><init>(Lxhss/ᛷᛱᛳᲁ;I)V

    .line 89
    .line 90
    .line 91
    new-instance p1, Lxhss/ᛵᛳᛳᲁ;

    .line 92
    .line 93
    new-instance p1, Ljava/util/ArrayDeque;

    .line 94
    .line 95
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 96
    .line 97
    .line 98
    new-instance p1, Lxhss/ᛴᲈᲀᲇ;

    .line 99
    .line 100
    const/4 v0, 0x2

    .line 101
    invoke-direct {p1, v0, p0}, Lxhss/ᛴᲈᲀᲇ;-><init>(ILjava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    .line 107
    .line 108
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    .line 109
    .line 110
    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 111
    .line 112
    .line 113
    iput-object p1, p0, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 114
    .line 115
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 116
    .line 117
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 118
    .line 119
    .line 120
    iput-object p1, p0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 121
    .line 122
    new-instance p1, Ljava/util/LinkedList;

    .line 123
    .line 124
    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    .line 125
    .line 126
    .line 127
    iput-object p1, p0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 128
    .line 129
    return-void

    .line 130
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    .line 132
    .line 133
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 134
    .line 135
    const/16 v2, 0x64

    .line 136
    .line 137
    invoke-direct {p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 138
    .line 139
    .line 140
    iput-object p1, p0, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 141
    .line 142
    const-class v2, Ljava/util/Date;

    .line 143
    .line 144
    sget-object v3, Lxhss/ᛲᛵᲇ;->ᛱᛱᛲᲇ:Lxhss/ᲀᛶᛶ;

    .line 145
    .line 146
    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    const-class v2, [I

    .line 150
    .line 151
    sget-object v3, Lxhss/ᲁᛳᛸᲀ;->ᛱᛱᛲᲇ:Lxhss/ᛸᛳᛶᛸ;

    .line 152
    .line 153
    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    const-class v2, [Ljava/lang/Integer;

    .line 157
    .line 158
    sget-object v4, Lxhss/ᲁᛳᛸᲀ;->ᛳᲁᲇᛸ:Lxhss/ᛸᛳᛶᛸ;

    .line 159
    .line 160
    invoke-virtual {p1, v2, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    const-class v2, [S

    .line 164
    .line 165
    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    const-class v2, [Ljava/lang/Short;

    .line 169
    .line 170
    invoke-virtual {p1, v2, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    const-class v2, [J

    .line 174
    .line 175
    sget-object v3, Lxhss/ᲁᛳᛸᲀ;->ᛸᛴᛶᛳ:Lxhss/ᛸᛳᛶᛸ;

    .line 176
    .line 177
    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    const-class v2, [Ljava/lang/Long;

    .line 181
    .line 182
    sget-object v3, Lxhss/ᲁᛳᛸᲀ;->ᛸᛲᲀᛵ:Lxhss/ᛸᛳᛶᛸ;

    .line 183
    .line 184
    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    const-class v2, [B

    .line 188
    .line 189
    sget-object v3, Lxhss/ᲁᛳᛸᲀ;->ᲇᛴᲇᛵ:Lxhss/ᛸᛳᛶᛸ;

    .line 190
    .line 191
    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    const-class v2, [Ljava/lang/Byte;

    .line 195
    .line 196
    sget-object v3, Lxhss/ᲁᛳᛸᲀ;->ᛷᛴᛷᛱ:Lxhss/ᛸᛳᛶᛸ;

    .line 197
    .line 198
    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    const-class v2, [C

    .line 202
    .line 203
    sget-object v3, Lxhss/ᲁᛳᛸᲀ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛳᛶᛸ;

    .line 204
    .line 205
    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    const-class v2, [Ljava/lang/Character;

    .line 209
    .line 210
    sget-object v3, Lxhss/ᲁᛳᛸᲀ;->ᲀᲇᛳᲁ:Lxhss/ᛸᛳᛶᛸ;

    .line 211
    .line 212
    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    const-class v2, [F

    .line 216
    .line 217
    sget-object v3, Lxhss/ᲁᛳᛸᲀ;->ᛸᛷᲈᲈ:Lxhss/ᛸᛳᛶᛸ;

    .line 218
    .line 219
    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    const-class v2, [Ljava/lang/Float;

    .line 223
    .line 224
    sget-object v3, Lxhss/ᲁᛳᛸᲀ;->ᲈᛳᲀ:Lxhss/ᛸᛳᛶᛸ;

    .line 225
    .line 226
    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    const-class v2, [D

    .line 230
    .line 231
    sget-object v3, Lxhss/ᲁᛳᛸᲀ;->ᛷᲁᲁ:Lxhss/ᛸᛳᛶᛸ;

    .line 232
    .line 233
    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    const-class v2, [Ljava/lang/Double;

    .line 237
    .line 238
    sget-object v3, Lxhss/ᲁᛳᛸᲀ;->ᛸᛶᲈᛶ:Lxhss/ᛸᛳᛶᛸ;

    .line 239
    .line 240
    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    const-class v2, [Z

    .line 244
    .line 245
    sget-object v3, Lxhss/ᲁᛳᛸᲀ;->ᲇᛸᛳᲁ:Lxhss/ᛸᛳᛶᛸ;

    .line 246
    .line 247
    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    const-class v2, [Ljava/lang/Boolean;

    .line 251
    .line 252
    sget-object v3, Lxhss/ᲁᛳᛸᲀ;->ᛳᲈᲈᛲ:Lxhss/ᛸᛳᛶᛸ;

    .line 253
    .line 254
    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    new-instance v2, Lxhss/ᛸᛵᛷᲁ;

    .line 258
    .line 259
    invoke-direct {v2, p0, v1}, Lxhss/ᛸᛵᛷᲁ;-><init>(Lxhss/ᛷᛱᛳᲁ;I)V

    .line 260
    .line 261
    .line 262
    iput-object v2, p0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 263
    .line 264
    new-instance v1, Lxhss/ᛸᛵᛷᲁ;

    .line 265
    .line 266
    invoke-direct {v1, p0, v0}, Lxhss/ᛸᛵᛷᲁ;-><init>(Lxhss/ᛷᛱᛳᲁ;I)V

    .line 267
    .line 268
    .line 269
    iput-object v1, p0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 270
    .line 271
    const-class p0, Lxhss/ᛳᛱᛴᲀ;

    .line 272
    .line 273
    invoke-virtual {p1, p0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    const-class p0, Lxhss/ᛷᛴᛶᛲ;

    .line 277
    .line 278
    invoke-virtual {p1, p0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    const-class p0, Lxhss/ᛸᛱᲈᛵ;

    .line 282
    .line 283
    invoke-virtual {p1, p0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    const-class p0, Lxhss/ᛸᛲᛷᲇ;

    .line 287
    .line 288
    invoke-virtual {p1, p0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    return-void

    .line 292
    nop

    .line 293
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛱᛱᛲᲇ:I

    .line 302
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 303
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 304
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 305
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛱᛱᛲᲇ:I

    .line 299
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 300
    iput-object p1, p0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 301
    iput-object p2, p0, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛱᛱᛲᲇ:I

    .line 297
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 298
    iput-object p1, p0, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛱᛱᛲᲇ:I

    .line 293
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 294
    iput-object p1, p0, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 295
    iput-object p2, p0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 296
    iput-object p3, p0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/regex/Matcher;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛱᛱᛲᲇ:I

    .line 325
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 326
    new-instance p1, Lxhss/ᲀᛸᛸᲁ;

    invoke-direct {p1, p0}, Lxhss/ᲀᛸᛸᲁ;-><init>(Lxhss/ᛷᛱᛳᲁ;)V

    iput-object p1, p0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lxhss/ᛲᛳᛳᛲ;Lxhss/ᲇᛱᲈᛸ;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 0

    const/4 p2, 0x2

    iput p2, p0, Lxhss/ᛷᛱᛳᲁ;->ᛱᛱᛲᲇ:I

    .line 306
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 307
    iput-object p1, p0, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    iput-object p3, p0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    iput-object p4, p0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lxhss/ᲇᛸᛶ;)V
    .locals 2

    const/4 v0, 0x3

    iput v0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛱᛱᛲᲇ:I

    .line 308
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 309
    iput-object p1, p0, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 310
    iget-object v0, p1, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    check-cast v0, Lxhss/ᛸᲇᲈᛶ;

    .line 311
    new-instance v1, Lxhss/ᲁᛸᛵᛳ;

    invoke-direct {v1, v0}, Lxhss/ᲁᛸᛵᛳ;-><init>(Lxhss/ᲇᲁᲀᲇ;)V

    .line 312
    iput-object v1, p0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 313
    iget-object p1, p1, Lxhss/ᲇᛸᛶ;->ᲇᛶᛴᲀ:Ljava/lang/Object;

    check-cast p1, Lxhss/ᛲᛶᲈᲀ;

    .line 314
    new-instance v0, Lxhss/ᛱᛸᛵᛱ;

    invoke-direct {v0, p1}, Lxhss/ᛱᛸᛵᛱ;-><init>(Lxhss/ᛱᲁᛷᲁ;)V

    .line 315
    iput-object v0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lxhss/ᲇᛸᛶ;Lxhss/ᛳᛴᲀᲁ;Lxhss/ᛶᛸᲀᲁ;Ljava/util/Set;)V
    .locals 7

    const/4 v0, 0x4

    iput v0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛱᛱᛲᲇ:I

    .line 316
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 317
    iput-object p2, p0, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 318
    iput-object p1, p0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 319
    iput-object p3, p0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 320
    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    .line 321
    :cond_0
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [I

    .line 322
    new-instance v1, Ljava/lang/String;

    array-length p3, p2

    const/4 p4, 0x0

    invoke-direct {v1, p2, p4, p3}, Ljava/lang/String;-><init>([III)V

    .line 323
    new-instance v6, Lxhss/ᛶᛲᛷᛵ;

    const/4 p2, 0x1

    invoke-direct {v6, v1, p2}, Lxhss/ᛶᛲᛷᛵ;-><init>(Ljava/lang/String;I)V

    .line 324
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v2, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lxhss/ᛷᛱᛳᲁ;->ᛸᛶᛴᲈ(Ljava/lang/CharSequence;IIIZLxhss/ᲈᛶᛶᛲ;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static ᛱᛱᛲᲇ(Landroid/text/Editable;Landroid/view/KeyEvent;Z)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-static {p0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, -0x1

    .line 22
    if-eq p1, v2, :cond_6

    .line 23
    .line 24
    if-eq v1, v2, :cond_6

    .line 25
    .line 26
    if-eq p1, v1, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const-class v2, Lxhss/ᛴᛸᛵᛵ;

    .line 30
    .line 31
    invoke-interface {p0, p1, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, [Lxhss/ᛴᛸᛵᛵ;

    .line 36
    .line 37
    if-eqz v1, :cond_6

    .line 38
    .line 39
    array-length v2, v1

    .line 40
    if-lez v2, :cond_6

    .line 41
    .line 42
    array-length v2, v1

    .line 43
    move v3, v0

    .line 44
    :goto_0
    if-ge v3, v2, :cond_6

    .line 45
    .line 46
    aget-object v4, v1, v3

    .line 47
    .line 48
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    if-eq v5, p1, :cond_4

    .line 59
    .line 60
    :cond_2
    if-nez p2, :cond_3

    .line 61
    .line 62
    if-eq v4, p1, :cond_4

    .line 63
    .line 64
    :cond_3
    if-le p1, v5, :cond_5

    .line 65
    .line 66
    if-ge p1, v4, :cond_5

    .line 67
    .line 68
    :cond_4
    invoke-interface {p0, v5, v4}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x1

    .line 72
    return p0

    .line 73
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_6
    :goto_1
    return v0
.end method

.method public static ᛶᲇᲈᛸ(I)Z
    .locals 1

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    invoke-static {v0, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static ᛷᛵᛵᲈ(Lxhss/ᲇᲇᲈᛷ;II)I
    .locals 3

    .line 1
    and-int/lit16 v0, p1, 0x1000

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lxhss/ᲇᲇᲈᛷ;->ᛱᛱᛲᲇ:I

    .line 7
    .line 8
    const/16 v2, 0x31

    .line 9
    .line 10
    if-ge v0, v2, :cond_0

    .line 11
    .line 12
    const-string v0, "Synthetic"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lxhss/ᲇᲇᲈᛷ;->ᛸᛲᲀᛵ(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move v0, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    if-eqz p2, :cond_1

    .line 21
    .line 22
    const-string p2, "Signature"

    .line 23
    .line 24
    invoke-virtual {p0, p2}, Lxhss/ᲇᲇᲈᛷ;->ᛸᛲᲀᛵ(Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x8

    .line 28
    .line 29
    :cond_1
    const/high16 p2, 0x20000

    .line 30
    .line 31
    and-int/2addr p1, p2

    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    const-string p1, "Deprecated"

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lxhss/ᲇᲇᲈᛷ;->ᛸᛲᲀᛵ(Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    add-int/2addr v0, v1

    .line 40
    :cond_2
    return v0
.end method

.method public static ᛷᲁᲁ(Landroid/content/Context;)Lxhss/ᛷᛱᛳᲁ;
    .locals 2

    .line 1
    sget-object v0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛷᛱᛳᲁ;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Lxhss/ᛷᛱᛳᲁ;->ᲀᲇᛳᲁ:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lxhss/ᛷᛱᛳᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛷᛱᛳᲁ;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lxhss/ᛷᛱᛳᲁ;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lxhss/ᛷᛱᛳᲁ;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lxhss/ᛷᛱᛳᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛷᛱᛳᲁ;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p0

    .line 26
    :cond_1
    :goto_2
    sget-object p0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛷᛱᛳᲁ;

    .line 27
    .line 28
    return-object p0
.end method

.method public static ᛸᛲᛷᛱ(Lxhss/ᲇᲇᲈᛷ;IILxhss/ᲇᛶᲁᛶ;)V
    .locals 3

    .line 1
    and-int/lit16 v0, p1, 0x1000

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lxhss/ᲇᲇᲈᛷ;->ᛱᛱᛲᲇ:I

    .line 7
    .line 8
    const/16 v2, 0x31

    .line 9
    .line 10
    if-ge v0, v2, :cond_0

    .line 11
    .line 12
    const-string v0, "Synthetic"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lxhss/ᲇᲇᲈᛷ;->ᛸᛲᲀᛵ(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p3, v0}, Lxhss/ᲇᛶᲁᛶ;->ᛸᛷᲈᲈ(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p3, v1}, Lxhss/ᲇᛶᲁᛶ;->ᛸᛲᲀᛵ(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    if-eqz p2, :cond_1

    .line 25
    .line 26
    const-string v0, "Signature"

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lxhss/ᲇᲇᲈᛷ;->ᛸᛲᲀᛵ(Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p3, v0}, Lxhss/ᲇᛶᲁᛶ;->ᛸᛷᲈᲈ(I)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x2

    .line 36
    invoke-virtual {p3, v0}, Lxhss/ᲇᛶᲁᛶ;->ᛸᛲᲀᛵ(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p3, p2}, Lxhss/ᲇᛶᲁᛶ;->ᛸᛷᲈᲈ(I)V

    .line 40
    .line 41
    .line 42
    :cond_1
    const/high16 p2, 0x20000

    .line 43
    .line 44
    and-int/2addr p1, p2

    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    const-string p1, "Deprecated"

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Lxhss/ᲇᲇᲈᛷ;->ᛸᛲᲀᛵ(Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-virtual {p3, p0}, Lxhss/ᲇᛶᲁᛶ;->ᛸᛷᲈᲈ(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p3, v1}, Lxhss/ᲇᛶᲁᛶ;->ᛸᛲᲀᛵ(I)V

    .line 57
    .line 58
    .line 59
    :cond_2
    return-void
.end method

.method public static ᲇᛸᛳᲁ(Lxhss/ᛸᛵᲈᲁ;Landroid/text/Editable;IIZ)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_19

    .line 3
    .line 4
    if-ltz p2, :cond_19

    .line 5
    .line 6
    if-gez p3, :cond_0

    .line 7
    .line 8
    goto/16 :goto_9

    .line 9
    .line 10
    :cond_0
    invoke-static {p1}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {p1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, -0x1

    .line 19
    if-eq v1, v3, :cond_19

    .line 20
    .line 21
    if-eq v2, v3, :cond_19

    .line 22
    .line 23
    if-eq v1, v2, :cond_1

    .line 24
    .line 25
    goto/16 :goto_9

    .line 26
    .line 27
    :cond_1
    const/4 v4, 0x1

    .line 28
    if-eqz p4, :cond_16

    .line 29
    .line 30
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 35
    .line 36
    .line 37
    move-result p4

    .line 38
    if-ltz v1, :cond_3

    .line 39
    .line 40
    if-ge p4, v1, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    if-gez p2, :cond_4

    .line 44
    .line 45
    :cond_3
    :goto_0
    move v1, v3

    .line 46
    goto :goto_3

    .line 47
    :cond_4
    :goto_1
    move p4, v0

    .line 48
    :goto_2
    if-nez p2, :cond_5

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_5
    add-int/lit8 v1, v1, -0x1

    .line 52
    .line 53
    if-gez v1, :cond_7

    .line 54
    .line 55
    if-eqz p4, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    move v1, v0

    .line 59
    goto :goto_3

    .line 60
    :cond_7
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz p4, :cond_9

    .line 65
    .line 66
    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 67
    .line 68
    .line 69
    move-result p4

    .line 70
    if-nez p4, :cond_8

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_8
    add-int/lit8 p2, p2, -0x1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_9
    invoke-static {v5}, Ljava/lang/Character;->isSurrogate(C)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-nez v6, :cond_a

    .line 81
    .line 82
    add-int/lit8 p2, p2, -0x1

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_a
    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 86
    .line 87
    .line 88
    move-result p4

    .line 89
    if-eqz p4, :cond_b

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_b
    move p4, v4

    .line 93
    goto :goto_2

    .line 94
    :goto_3
    invoke-static {p3, v0}, Ljava/lang/Math;->max(II)I

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 99
    .line 100
    .line 101
    move-result p3

    .line 102
    if-ltz v2, :cond_d

    .line 103
    .line 104
    if-ge p3, v2, :cond_c

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_c
    if-gez p2, :cond_e

    .line 108
    .line 109
    :cond_d
    :goto_4
    move p3, v3

    .line 110
    goto :goto_7

    .line 111
    :cond_e
    :goto_5
    move p4, v0

    .line 112
    :goto_6
    if-nez p2, :cond_f

    .line 113
    .line 114
    move p3, v2

    .line 115
    goto :goto_7

    .line 116
    :cond_f
    if-lt v2, p3, :cond_10

    .line 117
    .line 118
    if-eqz p4, :cond_15

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_10
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-eqz p4, :cond_12

    .line 126
    .line 127
    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 128
    .line 129
    .line 130
    move-result p4

    .line 131
    if-nez p4, :cond_11

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_11
    add-int/lit8 p2, p2, -0x1

    .line 135
    .line 136
    add-int/lit8 v2, v2, 0x1

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_12
    invoke-static {v5}, Ljava/lang/Character;->isSurrogate(C)Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    if-nez v6, :cond_13

    .line 144
    .line 145
    add-int/lit8 p2, p2, -0x1

    .line 146
    .line 147
    add-int/lit8 v2, v2, 0x1

    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_13
    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 151
    .line 152
    .line 153
    move-result p4

    .line 154
    if-eqz p4, :cond_14

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_14
    add-int/lit8 v2, v2, 0x1

    .line 158
    .line 159
    move p4, v4

    .line 160
    goto :goto_6

    .line 161
    :cond_15
    :goto_7
    if-eq v1, v3, :cond_19

    .line 162
    .line 163
    if-ne p3, v3, :cond_17

    .line 164
    .line 165
    goto :goto_9

    .line 166
    :cond_16
    sub-int/2addr v1, p2

    .line 167
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    add-int/2addr v2, p3

    .line 172
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    .line 177
    .line 178
    .line 179
    move-result p3

    .line 180
    :cond_17
    const-class p2, Lxhss/ᛴᛸᛵᛵ;

    .line 181
    .line 182
    invoke-interface {p1, v1, p3, p2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    check-cast p2, [Lxhss/ᛴᛸᛵᛵ;

    .line 187
    .line 188
    if-eqz p2, :cond_19

    .line 189
    .line 190
    array-length p4, p2

    .line 191
    if-lez p4, :cond_19

    .line 192
    .line 193
    array-length p4, p2

    .line 194
    move v2, v0

    .line 195
    :goto_8
    if-ge v2, p4, :cond_18

    .line 196
    .line 197
    aget-object v3, p2, v2

    .line 198
    .line 199
    invoke-interface {p1, v3}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    invoke-interface {p1, v3}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    invoke-static {v3, p3}, Ljava/lang/Math;->max(II)I

    .line 212
    .line 213
    .line 214
    move-result p3

    .line 215
    add-int/lit8 v2, v2, 0x1

    .line 216
    .line 217
    goto :goto_8

    .line 218
    :cond_18
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 219
    .line 220
    .line 221
    move-result p2

    .line 222
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 223
    .line 224
    .line 225
    move-result p4

    .line 226
    invoke-static {p3, p4}, Ljava/lang/Math;->min(II)I

    .line 227
    .line 228
    .line 229
    move-result p3

    .line 230
    invoke-virtual {p0}, Landroid/view/inputmethod/InputConnectionWrapper;->beginBatchEdit()Z

    .line 231
    .line 232
    .line 233
    invoke-interface {p1, p2, p3}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0}, Landroid/view/inputmethod/InputConnectionWrapper;->endBatchEdit()Z

    .line 237
    .line 238
    .line 239
    return v4

    .line 240
    :cond_19
    :goto_9
    return v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_1
    iget-object p0, p0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :pswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const/16 v1, 0x80

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 25
    .line 26
    .line 27
    const-string v1, "FragmentManager{"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p0, " in "

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string p0, "null"

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p0, "}}"

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public ᛳᛶᛷᲀ(Ljava/lang/Class;Lxhss/ᛵᛳᲈᛶ;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public ᛳᲁᲇᛸ(Lxhss/ᛸᲀᲇᛱ;)V
    .locals 4

    .line 1
    const-wide v0, -0x124791b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lxhss/ᛲᛳᛳᛲ;

    .line 12
    .line 13
    :try_start_0
    invoke-interface {v0, p1}, Lxhss/ᛲᛳᛳᛲ;->ᛳᲁᲇᛸ(Lxhss/ᛸᲀᲇᛱ;)V

    .line 14
    .line 15
    .line 16
    sget-object p1, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    new-instance v0, Lxhss/ᲈᛳᛱᲇ;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    move-object p1, v0

    .line 26
    :goto_0
    iget-object v0, p0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Ljava/lang/Class;

    .line 29
    .line 30
    iget-object p0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {p1}, Lxhss/ᛲᛲᛷ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-wide v2, -0x124821b858845L

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const/16 v0, 0x2e

    .line 58
    .line 59
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-wide v2, -0x1248f1b858845L

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {p0, p1}, Lxhss/ᲇᛱᲈᛸ;->ᛷᲁᲁ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    :cond_0
    return-void
.end method

.method public ᛳᲈᲈᛲ(Ljava/lang/CharSequence;IILxhss/ᛵᛵᲇᛷ;)Z
    .locals 6

    .line 1
    iget v0, p4, Lxhss/ᛵᛵᲇᛷ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x3

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-nez v0, :cond_4

    .line 9
    .line 10
    iget-object p0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lxhss/ᛶᛸᲀᲁ;

    .line 13
    .line 14
    invoke-virtual {p4}, Lxhss/ᛵᛵᲇᛷ;->ᛱᛱᛲᲇ()Lxhss/ᛲᲀᛴᲇ;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/16 v4, 0x8

    .line 19
    .line 20
    invoke-virtual {v0, v4}, Lxhss/ᛵᛶᛲᛵ;->ᛷᛵᛵᲈ(I)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    iget-object v5, v0, Lxhss/ᛵᛶᛲᛵ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v5, Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    iget v0, v0, Lxhss/ᛵᛶᛲᛵ;->ᛱᛱᛲᲇ:I

    .line 31
    .line 32
    add-int/2addr v4, v0

    .line 33
    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    sget-object v0, Lxhss/ᛶᛸᲀᲁ;->ᛱᛱᛲᲇ:Ljava/lang/ThreadLocal;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    if-nez v4, :cond_1

    .line 46
    .line 47
    new-instance v4, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v4}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 62
    .line 63
    .line 64
    :goto_0
    if-ge p2, p3, :cond_2

    .line 65
    .line 66
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    add-int/lit8 p2, p2, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    iget-object p0, p0, Lxhss/ᛶᛸᲀᲁ;->ᛷᛵᛵᲈ:Landroid/text/TextPaint;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->hasGlyph(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    iget p1, p4, Lxhss/ᛵᛵᲇᛷ;->ᛳᲁᲇᛸ:I

    .line 87
    .line 88
    and-int/lit8 p1, p1, 0x4

    .line 89
    .line 90
    if-eqz p0, :cond_3

    .line 91
    .line 92
    or-int/lit8 p0, p1, 0x2

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    or-int/lit8 p0, p1, 0x1

    .line 96
    .line 97
    :goto_1
    iput p0, p4, Lxhss/ᛵᛵᲇᛷ;->ᛳᲁᲇᛸ:I

    .line 98
    .line 99
    :cond_4
    iget p0, p4, Lxhss/ᛵᛵᲇᛷ;->ᛳᲁᲇᛸ:I

    .line 100
    .line 101
    and-int/lit8 p0, p0, 0x3

    .line 102
    .line 103
    if-ne p0, v1, :cond_5

    .line 104
    .line 105
    return v3

    .line 106
    :cond_5
    return v2
.end method

.method public ᛴᲈᛱᛴ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public ᛷᛴᛷᛱ()Lxhss/ᲇᲁᲀᲇ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxhss/ᲁᛸᛵᛳ;

    .line 4
    .line 5
    return-object p0
.end method

.method public ᛸᛲᲀᛵ(Z)V
    .locals 2

    .line 1
    iget-object p0, p0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxhss/ᛴᲈᛱᲁ;

    .line 4
    .line 5
    invoke-virtual {p0}, Lxhss/ᛴᲈᛱᲁ;->ᛷᛵᛵᲈ()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lxhss/ᛸᛴᛴᛶ;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    iget-object v0, v0, Lxhss/ᛸᛴᛴᛶ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛱᛳᲁ;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-virtual {v0, v1}, Lxhss/ᛷᛱᛳᲁ;->ᛸᛲᲀᛵ(Z)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-void
.end method

.method public ᛸᛴᛶᛳ(Z)V
    .locals 2

    .line 1
    iget-object p0, p0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxhss/ᛴᲈᛱᲁ;

    .line 4
    .line 5
    invoke-virtual {p0}, Lxhss/ᛴᲈᛱᲁ;->ᛷᛵᛵᲈ()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lxhss/ᛸᛴᛴᛶ;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    iget-object v0, v0, Lxhss/ᛸᛴᛴᛶ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛱᛳᲁ;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-virtual {v0, v1}, Lxhss/ᛷᛱᛳᲁ;->ᛸᛴᛶᛳ(Z)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-void
.end method

.method public ᛸᛶᛴᲈ(Ljava/lang/CharSequence;IIIZLxhss/ᲈᛶᛶᛲ;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p6

    .line 10
    .line 11
    new-instance v5, Lxhss/ᲈᲇᲇᲇ;

    .line 12
    .line 13
    iget-object v6, v0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v6, Lxhss/ᲇᛸᛶ;

    .line 16
    .line 17
    iget-object v6, v6, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v6, Lxhss/ᲈᛲᛷᛳ;

    .line 20
    .line 21
    invoke-direct {v5, v6}, Lxhss/ᲈᲇᲇᲇ;-><init>(Lxhss/ᲈᛲᛷᛳ;)V

    .line 22
    .line 23
    .line 24
    invoke-static/range {p1 .. p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v8, 0x1

    .line 30
    move v9, v6

    .line 31
    move v10, v7

    .line 32
    move v11, v8

    .line 33
    move/from16 v6, p2

    .line 34
    .line 35
    :cond_0
    :goto_0
    move v7, v6

    .line 36
    :goto_1
    const/4 v12, 0x2

    .line 37
    if-ge v6, v2, :cond_e

    .line 38
    .line 39
    if-ge v10, v3, :cond_e

    .line 40
    .line 41
    if-eqz v11, :cond_e

    .line 42
    .line 43
    iget-object v13, v5, Lxhss/ᲈᲇᲇᲇ;->ᛳᲁᲇᛸ:Lxhss/ᲈᛲᛷᛳ;

    .line 44
    .line 45
    iget-object v13, v13, Lxhss/ᲈᛲᛷᛳ;->ᛷᛵᛵᲈ:Landroid/util/SparseArray;

    .line 46
    .line 47
    invoke-virtual {v13, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v13

    .line 51
    check-cast v13, Lxhss/ᲈᛲᛷᛳ;

    .line 52
    .line 53
    iget v14, v5, Lxhss/ᲈᲇᲇᲇ;->ᛷᛵᛵᲈ:I

    .line 54
    .line 55
    const/4 v15, 0x3

    .line 56
    if-eq v14, v12, :cond_2

    .line 57
    .line 58
    if-nez v13, :cond_1

    .line 59
    .line 60
    invoke-virtual {v5}, Lxhss/ᲈᲇᲇᲇ;->ᛷᛵᛵᲈ()V

    .line 61
    .line 62
    .line 63
    :goto_2
    move v13, v8

    .line 64
    goto :goto_5

    .line 65
    :cond_1
    iput v12, v5, Lxhss/ᲈᲇᲇᲇ;->ᛷᛵᛵᲈ:I

    .line 66
    .line 67
    iput-object v13, v5, Lxhss/ᲈᲇᲇᲇ;->ᛳᲁᲇᛸ:Lxhss/ᲈᛲᛷᛳ;

    .line 68
    .line 69
    iput v8, v5, Lxhss/ᲈᲇᲇᲇ;->ᲇᛶᛴᲀ:I

    .line 70
    .line 71
    :goto_3
    move v13, v12

    .line 72
    goto :goto_5

    .line 73
    :cond_2
    if-eqz v13, :cond_3

    .line 74
    .line 75
    iput-object v13, v5, Lxhss/ᲈᲇᲇᲇ;->ᛳᲁᲇᛸ:Lxhss/ᲈᛲᛷᛳ;

    .line 76
    .line 77
    iget v13, v5, Lxhss/ᲈᲇᲇᲇ;->ᲇᛶᛴᲀ:I

    .line 78
    .line 79
    add-int/2addr v13, v8

    .line 80
    iput v13, v5, Lxhss/ᲈᲇᲇᲇ;->ᲇᛶᛴᲀ:I

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_3
    const v13, 0xfe0e

    .line 84
    .line 85
    .line 86
    if-ne v9, v13, :cond_4

    .line 87
    .line 88
    invoke-virtual {v5}, Lxhss/ᲈᲇᲇᲇ;->ᛷᛵᛵᲈ()V

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_4
    const v13, 0xfe0f

    .line 93
    .line 94
    .line 95
    if-ne v9, v13, :cond_5

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    iget-object v13, v5, Lxhss/ᲈᲇᲇᲇ;->ᛳᲁᲇᛸ:Lxhss/ᲈᛲᛷᛳ;

    .line 99
    .line 100
    iget-object v14, v13, Lxhss/ᲈᛲᛷᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛵᲇᛷ;

    .line 101
    .line 102
    if-eqz v14, :cond_8

    .line 103
    .line 104
    iget v14, v5, Lxhss/ᲈᲇᲇᲇ;->ᲇᛶᛴᲀ:I

    .line 105
    .line 106
    if-ne v14, v8, :cond_7

    .line 107
    .line 108
    invoke-virtual {v5}, Lxhss/ᲈᲇᲇᲇ;->ᛱᛱᛲᲇ()Z

    .line 109
    .line 110
    .line 111
    move-result v13

    .line 112
    if-eqz v13, :cond_6

    .line 113
    .line 114
    iget-object v13, v5, Lxhss/ᲈᲇᲇᲇ;->ᛳᲁᲇᛸ:Lxhss/ᲈᛲᛷᛳ;

    .line 115
    .line 116
    iput-object v13, v5, Lxhss/ᲈᲇᲇᲇ;->ᲇᛴᲇᛵ:Lxhss/ᲈᛲᛷᛳ;

    .line 117
    .line 118
    invoke-virtual {v5}, Lxhss/ᲈᲇᲇᲇ;->ᛷᛵᛵᲈ()V

    .line 119
    .line 120
    .line 121
    :goto_4
    move v13, v15

    .line 122
    goto :goto_5

    .line 123
    :cond_6
    invoke-virtual {v5}, Lxhss/ᲈᲇᲇᲇ;->ᛷᛵᛵᲈ()V

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_7
    iput-object v13, v5, Lxhss/ᲈᲇᲇᲇ;->ᲇᛴᲇᛵ:Lxhss/ᲈᛲᛷᛳ;

    .line 128
    .line 129
    invoke-virtual {v5}, Lxhss/ᲈᲇᲇᲇ;->ᛷᛵᛵᲈ()V

    .line 130
    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_8
    invoke-virtual {v5}, Lxhss/ᲈᲇᲇᲇ;->ᛷᛵᛵᲈ()V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :goto_5
    iput v9, v5, Lxhss/ᲈᲇᲇᲇ;->ᛷᛴᛷᛱ:I

    .line 138
    .line 139
    if-eq v13, v8, :cond_d

    .line 140
    .line 141
    if-eq v13, v12, :cond_b

    .line 142
    .line 143
    if-eq v13, v15, :cond_9

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_9
    if-nez p5, :cond_a

    .line 147
    .line 148
    iget-object v12, v5, Lxhss/ᲈᲇᲇᲇ;->ᲇᛴᲇᛵ:Lxhss/ᲈᛲᛷᛳ;

    .line 149
    .line 150
    iget-object v12, v12, Lxhss/ᲈᛲᛷᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛵᲇᛷ;

    .line 151
    .line 152
    invoke-virtual {v0, v1, v7, v6, v12}, Lxhss/ᛷᛱᛳᲁ;->ᛳᲈᲈᛲ(Ljava/lang/CharSequence;IILxhss/ᛵᛵᲇᛷ;)Z

    .line 153
    .line 154
    .line 155
    move-result v12

    .line 156
    if-nez v12, :cond_0

    .line 157
    .line 158
    :cond_a
    iget-object v11, v5, Lxhss/ᲈᲇᲇᲇ;->ᲇᛴᲇᛵ:Lxhss/ᲈᛲᛷᛳ;

    .line 159
    .line 160
    iget-object v11, v11, Lxhss/ᲈᛲᛷᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛵᲇᛷ;

    .line 161
    .line 162
    invoke-interface {v4, v1, v7, v6, v11}, Lxhss/ᲈᛶᛶᛲ;->ᛱᛱᛲᲇ(Ljava/lang/CharSequence;IILxhss/ᛵᛵᲇᛷ;)Z

    .line 163
    .line 164
    .line 165
    move-result v11

    .line 166
    add-int/lit8 v10, v10, 0x1

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :cond_b
    invoke-static {v9}, Ljava/lang/Character;->charCount(I)I

    .line 171
    .line 172
    .line 173
    move-result v12

    .line 174
    add-int/2addr v12, v6

    .line 175
    if-ge v12, v2, :cond_c

    .line 176
    .line 177
    invoke-static {v1, v12}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    move v9, v6

    .line 182
    :cond_c
    move v6, v12

    .line 183
    goto/16 :goto_1

    .line 184
    .line 185
    :cond_d
    invoke-static {v1, v7}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 186
    .line 187
    .line 188
    move-result v6

    .line 189
    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    .line 190
    .line 191
    .line 192
    move-result v6

    .line 193
    add-int/2addr v6, v7

    .line 194
    if-ge v6, v2, :cond_0

    .line 195
    .line 196
    invoke-static {v1, v6}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 197
    .line 198
    .line 199
    move-result v7

    .line 200
    move v9, v7

    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :cond_e
    iget v2, v5, Lxhss/ᲈᲇᲇᲇ;->ᛷᛵᛵᲈ:I

    .line 204
    .line 205
    if-ne v2, v12, :cond_11

    .line 206
    .line 207
    iget-object v2, v5, Lxhss/ᲈᲇᲇᲇ;->ᛳᲁᲇᛸ:Lxhss/ᲈᛲᛷᛳ;

    .line 208
    .line 209
    iget-object v2, v2, Lxhss/ᲈᛲᛷᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛵᲇᛷ;

    .line 210
    .line 211
    if-eqz v2, :cond_11

    .line 212
    .line 213
    iget v2, v5, Lxhss/ᲈᲇᲇᲇ;->ᲇᛶᛴᲀ:I

    .line 214
    .line 215
    if-gt v2, v8, :cond_f

    .line 216
    .line 217
    invoke-virtual {v5}, Lxhss/ᲈᲇᲇᲇ;->ᛱᛱᛲᲇ()Z

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    if-eqz v2, :cond_11

    .line 222
    .line 223
    :cond_f
    if-ge v10, v3, :cond_11

    .line 224
    .line 225
    if-eqz v11, :cond_11

    .line 226
    .line 227
    if-nez p5, :cond_10

    .line 228
    .line 229
    iget-object v2, v5, Lxhss/ᲈᲇᲇᲇ;->ᛳᲁᲇᛸ:Lxhss/ᲈᛲᛷᛳ;

    .line 230
    .line 231
    iget-object v2, v2, Lxhss/ᲈᛲᛷᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛵᲇᛷ;

    .line 232
    .line 233
    invoke-virtual {v0, v1, v7, v6, v2}, Lxhss/ᛷᛱᛳᲁ;->ᛳᲈᲈᛲ(Ljava/lang/CharSequence;IILxhss/ᛵᛵᲇᛷ;)Z

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    if-nez v0, :cond_11

    .line 238
    .line 239
    :cond_10
    iget-object v0, v5, Lxhss/ᲈᲇᲇᲇ;->ᛳᲁᲇᛸ:Lxhss/ᲈᛲᛷᛳ;

    .line 240
    .line 241
    iget-object v0, v0, Lxhss/ᲈᛲᛷᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛵᲇᛷ;

    .line 242
    .line 243
    invoke-interface {v4, v1, v7, v6, v0}, Lxhss/ᲈᛶᛶᛲ;->ᛱᛱᛲᲇ(Ljava/lang/CharSequence;IILxhss/ᛵᛵᲇᛷ;)Z

    .line 244
    .line 245
    .line 246
    :cond_11
    invoke-interface {v4}, Lxhss/ᲈᛶᛶᛲ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    return-object v0
.end method

.method public ᛸᛶᲈᛶ(Ljava/lang/Class;)Lxhss/ᛵᛳᲈᛶ;
    .locals 5

    .line 1
    iget-object v0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lxhss/ᛵᛳᲈᛶ;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    const-class v2, Ljava/util/List;

    .line 15
    .line 16
    const-class v3, Ljava/util/Map;

    .line 17
    .line 18
    if-eqz p1, :cond_3

    .line 19
    .line 20
    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    new-instance v1, Lxhss/ᲇᛵᲈᲇ;

    .line 27
    .line 28
    invoke-direct {v1, p0, p1}, Lxhss/ᲇᛵᲈᲇ;-><init>(Lxhss/ᛷᛱᛳᲁ;Ljava/lang/Class;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_2

    .line 37
    .line 38
    new-instance v1, Lxhss/ᲇᛵᲈᲇ;

    .line 39
    .line 40
    invoke-direct {v1, p0, p1}, Lxhss/ᲇᛵᲈᲇ;-><init>(Lxhss/ᛷᛱᛳᲁ;Ljava/lang/Class;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    :goto_0
    if-eqz v1, :cond_3

    .line 44
    .line 45
    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_4

    .line 54
    .line 55
    new-instance v1, Lxhss/ᲀᛱᛲᲀ;

    .line 56
    .line 57
    invoke-direct {v1, p0, p1}, Lxhss/ᲀᛱᛲᲀ;-><init>(Lxhss/ᛷᛱᛳᲁ;Ljava/lang/Class;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_4
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    const/4 v0, 0x0

    .line 69
    if-nez p0, :cond_7

    .line 70
    .line 71
    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-eqz p0, :cond_6

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_5

    .line 82
    .line 83
    const-class p1, Lxhss/ᛸᛲᛷᲇ;

    .line 84
    .line 85
    :cond_5
    invoke-static {p1}, Lxhss/ᛲᛴᛵᲁ;->ᛷᛵᛵᲈ(Ljava/lang/Class;)V

    .line 86
    .line 87
    .line 88
    throw v0

    .line 89
    :cond_6
    invoke-static {p1}, Lxhss/ᛲᛴᛵᲁ;->ᛷᛵᛵᲈ(Ljava/lang/Class;)V

    .line 90
    .line 91
    .line 92
    throw v0

    .line 93
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    if-eqz p0, :cond_8

    .line 98
    .line 99
    const-class p1, Lxhss/ᛸᛱᲈᛵ;

    .line 100
    .line 101
    :cond_8
    invoke-static {p1}, Lxhss/ᛲᛴᛵᲁ;->ᛷᛵᛵᲈ(Ljava/lang/Class;)V

    .line 102
    .line 103
    .line 104
    throw v0
.end method

.method public ᛸᛷᲈᲈ(Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    const-string v1, "Cannot initialize "

    .line 6
    .line 7
    invoke-static {}, Lxhss/ᛶᛱᲇᛱ;->ᛷᛵᛵᲈ()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {v2}, Lxhss/ᛱᛷᛵᛷ;->ᛳᲁᲇᛸ(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_4

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    :try_start_1
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Lxhss/ᛶᛲᛵᲁ;

    .line 45
    .line 46
    invoke-interface {v1}, Lxhss/ᛶᛲᛵᲁ;->ᛷᛵᛵᲈ()Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-nez v3, :cond_2

    .line 55
    .line 56
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_2

    .line 65
    .line 66
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, Ljava/lang/Class;

    .line 71
    .line 72
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-nez v4, :cond_1

    .line 77
    .line 78
    invoke-virtual {p0, v3, p2}, Lxhss/ᛷᛱᛳᲁ;->ᛸᛷᲈᲈ(Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    iget-object p0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p0, Landroid/content/Context;

    .line 85
    .line 86
    invoke-interface {v1, p0}, Lxhss/ᛶᛲᛵᲁ;->ᛱᛱᛲᲇ(Landroid/content/Context;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :catchall_0
    move-exception p0

    .line 98
    :try_start_2
    new-instance p1, Lxhss/ᛵᛲᛲᲇ;

    .line 99
    .line 100
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    throw p1

    .line 104
    :cond_3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 108
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 109
    .line 110
    .line 111
    return-object p0

    .line 112
    :cond_4
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    new-instance p1, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string p0, ". Cycle detected."

    .line 125
    .line 126
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 134
    .line 135
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 139
    :catchall_1
    move-exception p0

    .line 140
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 141
    .line 142
    .line 143
    throw p0
.end method

.method public ᲀᲇᛳᲁ(Lxhss/ᛵᛴᛲᛵ;)V
    .locals 4

    .line 1
    const-wide v0, -0x124991b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lxhss/ᛲᛳᛳᛲ;

    .line 12
    .line 13
    :try_start_0
    invoke-interface {v0, p1}, Lxhss/ᛲᛳᛳᛲ;->ᲀᲇᛳᲁ(Lxhss/ᛵᛴᛲᛵ;)V

    .line 14
    .line 15
    .line 16
    sget-object p1, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    new-instance v0, Lxhss/ᲈᛳᛱᲇ;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    move-object p1, v0

    .line 26
    :goto_0
    iget-object v0, p0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Ljava/lang/Class;

    .line 29
    .line 30
    iget-object p0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {p1}, Lxhss/ᛲᛲᛷ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-wide v2, -0x124a21b858845L

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const/16 v0, 0x2e

    .line 58
    .line 59
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-wide v2, -0x124ae1b858845L

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {p0, p1}, Lxhss/ᲇᛱᲈᛸ;->ᛷᲁᲁ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    :cond_0
    return-void
.end method

.method public ᲁᛲᛴᛴ(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/LinkedList;

    .line 4
    .line 5
    iget-object p0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/concurrent/locks/ReentrantLock;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 10
    .line 11
    .line 12
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->removeFirstOccurrence(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 24
    .line 25
    .line 26
    throw p1
.end method

.method public ᲇᛴᲇᛵ()Lxhss/ᛱᲁᛷᲁ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxhss/ᛱᛸᛵᛱ;

    .line 4
    .line 5
    return-object p0
.end method

.method public ᲇᛶᛴᲀ(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashSet;

    .line 4
    .line 5
    iget-object v1, p0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/content/Context;

    .line 8
    .line 9
    const v2, 0x640d001b

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    :try_start_0
    new-instance v2, Ljava/util/HashSet;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Ljava/lang/String;

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    invoke-virtual {p1, v4, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_0

    .line 53
    .line 54
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    const-class v5, Lxhss/ᛶᛲᛵᲁ;

    .line 59
    .line 60
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_0

    .line 65
    .line 66
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Ljava/lang/Class;

    .line 85
    .line 86
    invoke-virtual {p0, v0, v2}, Lxhss/ᛷᛱᛳᲁ;->ᛸᛷᲈᲈ(Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :catch_0
    move-exception p0

    .line 91
    new-instance p1, Lxhss/ᛵᛲᛲᲇ;

    .line 92
    .line 93
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    throw p1

    .line 97
    :cond_2
    return-void
.end method

.method public ᲈᛳᲀ(IILxhss/ᛷᲀᲇᲀ;)Landroid/graphics/Typeface;
    .locals 10

    .line 1
    iget-object v0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 7
    .line 8
    .line 9
    move-result v5

    .line 10
    const/4 p1, 0x0

    .line 11
    if-nez v5, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Landroid/util/TypedValue;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Landroid/util/TypedValue;

    .line 21
    .line 22
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 26
    .line 27
    :cond_1
    iget-object p0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v2, p0

    .line 30
    check-cast v2, Landroid/content/Context;

    .line 31
    .line 32
    sget-object p0, Lxhss/ᛸᛴᛵᛴ;->ᛷᛵᛵᲈ:Ljava/lang/ThreadLocal;

    .line 33
    .line 34
    invoke-virtual {v2}, Landroid/content/Context;->isRestricted()Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    :goto_0
    return-object p1

    .line 41
    :cond_2
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    const/4 p0, 0x1

    .line 46
    invoke-virtual {v4, v5, v0, p0}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 47
    .line 48
    .line 49
    const-string p0, "ResourcesCompat"

    .line 50
    .line 51
    iget-object v1, v0, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 52
    .line 53
    if-eqz v1, :cond_8

    .line 54
    .line 55
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    const-string v1, "res/"

    .line 60
    .line 61
    invoke-virtual {v6, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_3

    .line 66
    .line 67
    invoke-virtual {p3}, Lxhss/ᛷᲀᲇᲀ;->ᛷᛵᛵᲈ()V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_7

    .line 71
    .line 72
    :cond_3
    iget v1, v0, Landroid/util/TypedValue;->assetCookie:I

    .line 73
    .line 74
    sget-object v3, Lxhss/ᛱᲁᛶᲇ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲀᲈᛲ;

    .line 75
    .line 76
    invoke-static {v4, v5, v6, v1, p2}, Lxhss/ᛱᲁᛶᲇ;->ᲇᛴᲇᛵ(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v3, v1}, Lxhss/ᲇᲀᲈᛲ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Landroid/graphics/Typeface;

    .line 85
    .line 86
    if-eqz v1, :cond_4

    .line 87
    .line 88
    new-instance p0, Landroid/os/Handler;

    .line 89
    .line 90
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 95
    .line 96
    .line 97
    new-instance p1, Lxhss/ᲈᲈᛸᛳ;

    .line 98
    .line 99
    invoke-direct {p1, p3, v1}, Lxhss/ᲈᲈᛸᛳ;-><init>(Lxhss/ᛷᲀᲇᲀ;Landroid/graphics/Typeface;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 103
    .line 104
    .line 105
    move-object p1, v1

    .line 106
    goto/16 :goto_7

    .line 107
    .line 108
    :cond_4
    :try_start_0
    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    const-string v3, ".xml"

    .line 113
    .line 114
    invoke-virtual {v1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_6

    .line 119
    .line 120
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-static {v1, v4}, Lxhss/ᲀᲈᛵᛸ;->ᛶᲇᲈᛸ(Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources;)Lxhss/ᛶᛶᲈᛱ;

    .line 125
    .line 126
    .line 127
    move-result-object v3
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4

    .line 128
    if-nez v3, :cond_5

    .line 129
    .line 130
    :try_start_1
    const-string p2, "Failed to find font-family tag"

    .line 131
    .line 132
    invoke-static {p0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    invoke-virtual {p3}, Lxhss/ᛷᲀᲇᲀ;->ᛷᛵᛵᲈ()V
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 136
    .line 137
    .line 138
    goto/16 :goto_7

    .line 139
    .line 140
    :catch_0
    move-exception v0

    .line 141
    move-object p2, v0

    .line 142
    move-object v9, p3

    .line 143
    goto :goto_4

    .line 144
    :catch_1
    move-exception v0

    .line 145
    move-object p2, v0

    .line 146
    move-object v9, p3

    .line 147
    goto :goto_5

    .line 148
    :cond_5
    :try_start_2
    iget v7, v0, Landroid/util/TypedValue;->assetCookie:I
    :try_end_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4

    .line 149
    .line 150
    move v8, p2

    .line 151
    move-object v9, p3

    .line 152
    :try_start_3
    invoke-static/range {v2 .. v9}, Lxhss/ᛱᲁᛶᲇ;->ᛱᛱᛲᲇ(Landroid/content/Context;Lxhss/ᛶᛶᲈᛱ;Landroid/content/res/Resources;ILjava/lang/String;IILxhss/ᛷᲀᲇᲀ;)Landroid/graphics/Typeface;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    goto :goto_7

    .line 157
    :catch_2
    move-exception v0

    .line 158
    :goto_1
    move-object p2, v0

    .line 159
    goto :goto_4

    .line 160
    :catch_3
    move-exception v0

    .line 161
    :goto_2
    move-object p2, v0

    .line 162
    goto :goto_5

    .line 163
    :catch_4
    move-exception v0

    .line 164
    move-object v9, p3

    .line 165
    goto :goto_1

    .line 166
    :catch_5
    move-exception v0

    .line 167
    move-object v9, p3

    .line 168
    goto :goto_2

    .line 169
    :cond_6
    move v8, p2

    .line 170
    move-object v9, p3

    .line 171
    iget p2, v0, Landroid/util/TypedValue;->assetCookie:I

    .line 172
    .line 173
    invoke-static {v4, v5, v6, p2, v8}, Lxhss/ᛱᲁᛶᲇ;->ᛳᲁᲇᛸ(Landroid/content/res/Resources;ILjava/lang/String;II)Landroid/graphics/Typeface;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    if-eqz p2, :cond_7

    .line 178
    .line 179
    new-instance p3, Landroid/os/Handler;

    .line 180
    .line 181
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-direct {p3, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 186
    .line 187
    .line 188
    new-instance v0, Lxhss/ᲈᲈᛸᛳ;

    .line 189
    .line 190
    invoke-direct {v0, v9, p2}, Lxhss/ᲈᲈᛸᛳ;-><init>(Lxhss/ᛷᲀᲇᲀ;Landroid/graphics/Typeface;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p3, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 194
    .line 195
    .line 196
    :goto_3
    move-object p1, p2

    .line 197
    goto :goto_7

    .line 198
    :cond_7
    invoke-virtual {v9}, Lxhss/ᛷᲀᲇᲀ;->ᛷᛵᛵᲈ()V
    :try_end_3
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 199
    .line 200
    .line 201
    goto :goto_3

    .line 202
    :goto_4
    const-string p3, "Failed to read xml resource "

    .line 203
    .line 204
    invoke-virtual {p3, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p3

    .line 208
    invoke-static {p0, p3, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 209
    .line 210
    .line 211
    goto :goto_6

    .line 212
    :goto_5
    const-string p3, "Failed to parse xml resource "

    .line 213
    .line 214
    invoke-virtual {p3, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p3

    .line 218
    invoke-static {p0, p3, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 219
    .line 220
    .line 221
    :goto_6
    invoke-virtual {v9}, Lxhss/ᛷᲀᲇᲀ;->ᛷᛵᛵᲈ()V

    .line 222
    .line 223
    .line 224
    :goto_7
    return-object p1

    .line 225
    :cond_8
    new-instance p0, Landroid/content/res/Resources$NotFoundException;

    .line 226
    .line 227
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p2

    .line 235
    new-instance p3, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    const-string v1, "Resource \""

    .line 238
    .line 239
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    const-string p1, "\" ("

    .line 246
    .line 247
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    const-string p1, ") is not a Font: "

    .line 254
    .line 255
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    invoke-direct {p0, p1}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    throw p0
.end method
