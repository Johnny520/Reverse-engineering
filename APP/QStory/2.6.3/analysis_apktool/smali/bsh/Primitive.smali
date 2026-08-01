.class public final Lbsh/Primitive;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbsh/Primitive$Special;
    }
.end annotation


# static fields
.field public static final FALSE:Lbsh/Primitive;

.field private static final INTEGER_MAX:Ljava/math/BigInteger;

.field private static final INTEGER_MIN:Ljava/math/BigInteger;

.field static final LONG_MAX:Ljava/math/BigInteger;

.field static final LONG_MIN:Ljava/math/BigInteger;

.field public static final NULL:Lbsh/Primitive;

.field public static final TRUE:Lbsh/Primitive;

.field public static final VOID:Lbsh/Primitive;

.field public static final ZERO_BIG_DECIMAL:Lbsh/Primitive;

.field public static final ZERO_BIG_INTEGER:Lbsh/Primitive;

.field public static final ZERO_BYTE:Lbsh/Primitive;

.field public static final ZERO_CHAR:Lbsh/Primitive;

.field public static final ZERO_DOUBLE:Lbsh/Primitive;

.field public static final ZERO_FLOAT:Lbsh/Primitive;

.field public static final ZERO_INT:Lbsh/Primitive;

.field public static final ZERO_LONG:Lbsh/Primitive;

.field public static final ZERO_SHORT:Lbsh/Primitive;

.field private static final serialVersionUID:J = 0x1L

.field static final wrapperMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field


# instance fields
.field private value:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbsh/Primitive;->wrapperMap:Ljava/util/Map;

    .line 7
    .line 8
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 9
    .line 10
    const-class v2, Ljava/lang/Void;

    .line 11
    .line 12
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    const-class v4, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    sget-object v5, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    const-class v6, Ljava/lang/Byte;

    .line 25
    .line 26
    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    sget-object v7, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 30
    .line 31
    const-class v8, Ljava/lang/Short;

    .line 32
    .line 33
    invoke-interface {v0, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    sget-object v9, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 37
    .line 38
    const-class v10, Ljava/lang/Character;

    .line 39
    .line 40
    invoke-interface {v0, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    const-class v12, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-interface {v0, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    sget-object v13, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 51
    .line 52
    const-class v14, Ljava/lang/Long;

    .line 53
    .line 54
    invoke-interface {v0, v13, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    sget-object v15, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 58
    .line 59
    move-object/from16 v16, v13

    .line 60
    .line 61
    const-class v13, Ljava/lang/Float;

    .line 62
    .line 63
    invoke-interface {v0, v15, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-object/from16 v17, v13

    .line 67
    .line 68
    sget-object v13, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 69
    .line 70
    move-object/from16 v18, v15

    .line 71
    .line 72
    const-class v15, Ljava/lang/Double;

    .line 73
    .line 74
    invoke-interface {v0, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    invoke-interface {v0, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    invoke-interface {v0, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    invoke-interface {v0, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-object/from16 v1, v16

    .line 96
    .line 97
    invoke-interface {v0, v14, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-object/from16 v2, v17

    .line 101
    .line 102
    move-object/from16 v1, v18

    .line 103
    .line 104
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    invoke-interface {v0, v15, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    const-class v1, Ljava/math/BigInteger;

    .line 111
    .line 112
    invoke-interface {v0, v1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    const-class v1, Ljava/math/BigDecimal;

    .line 116
    .line 117
    invoke-interface {v0, v1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    new-instance v0, Lbsh/Primitive;

    .line 121
    .line 122
    const/4 v1, 0x1

    .line 123
    invoke-direct {v0, v1}, Lbsh/Primitive;-><init>(Z)V

    .line 124
    .line 125
    .line 126
    sput-object v0, Lbsh/Primitive;->TRUE:Lbsh/Primitive;

    .line 127
    .line 128
    new-instance v0, Lbsh/Primitive;

    .line 129
    .line 130
    const/4 v1, 0x0

    .line 131
    invoke-direct {v0, v1}, Lbsh/Primitive;-><init>(Z)V

    .line 132
    .line 133
    .line 134
    sput-object v0, Lbsh/Primitive;->FALSE:Lbsh/Primitive;

    .line 135
    .line 136
    new-instance v0, Lbsh/Primitive;

    .line 137
    .line 138
    invoke-direct {v0, v1}, Lbsh/Primitive;-><init>(C)V

    .line 139
    .line 140
    .line 141
    sput-object v0, Lbsh/Primitive;->ZERO_CHAR:Lbsh/Primitive;

    .line 142
    .line 143
    new-instance v0, Lbsh/Primitive;

    .line 144
    .line 145
    invoke-direct {v0, v1}, Lbsh/Primitive;-><init>(B)V

    .line 146
    .line 147
    .line 148
    sput-object v0, Lbsh/Primitive;->ZERO_BYTE:Lbsh/Primitive;

    .line 149
    .line 150
    new-instance v0, Lbsh/Primitive;

    .line 151
    .line 152
    invoke-direct {v0, v1}, Lbsh/Primitive;-><init>(S)V

    .line 153
    .line 154
    .line 155
    sput-object v0, Lbsh/Primitive;->ZERO_SHORT:Lbsh/Primitive;

    .line 156
    .line 157
    new-instance v0, Lbsh/Primitive;

    .line 158
    .line 159
    invoke-direct {v0, v1}, Lbsh/Primitive;-><init>(I)V

    .line 160
    .line 161
    .line 162
    sput-object v0, Lbsh/Primitive;->ZERO_INT:Lbsh/Primitive;

    .line 163
    .line 164
    new-instance v0, Lbsh/Primitive;

    .line 165
    .line 166
    const-wide/16 v1, 0x0

    .line 167
    .line 168
    invoke-direct {v0, v1, v2}, Lbsh/Primitive;-><init>(J)V

    .line 169
    .line 170
    .line 171
    sput-object v0, Lbsh/Primitive;->ZERO_LONG:Lbsh/Primitive;

    .line 172
    .line 173
    new-instance v0, Lbsh/Primitive;

    .line 174
    .line 175
    const/4 v1, 0x0

    .line 176
    invoke-direct {v0, v1}, Lbsh/Primitive;-><init>(F)V

    .line 177
    .line 178
    .line 179
    sput-object v0, Lbsh/Primitive;->ZERO_FLOAT:Lbsh/Primitive;

    .line 180
    .line 181
    new-instance v0, Lbsh/Primitive;

    .line 182
    .line 183
    const-wide/16 v1, 0x0

    .line 184
    .line 185
    invoke-direct {v0, v1, v2}, Lbsh/Primitive;-><init>(D)V

    .line 186
    .line 187
    .line 188
    sput-object v0, Lbsh/Primitive;->ZERO_DOUBLE:Lbsh/Primitive;

    .line 189
    .line 190
    new-instance v0, Lbsh/Primitive;

    .line 191
    .line 192
    sget-object v1, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 193
    .line 194
    invoke-direct {v0, v1}, Lbsh/Primitive;-><init>(Ljava/math/BigInteger;)V

    .line 195
    .line 196
    .line 197
    sput-object v0, Lbsh/Primitive;->ZERO_BIG_INTEGER:Lbsh/Primitive;

    .line 198
    .line 199
    new-instance v0, Lbsh/Primitive;

    .line 200
    .line 201
    sget-object v1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 202
    .line 203
    invoke-direct {v0, v1}, Lbsh/Primitive;-><init>(Ljava/math/BigDecimal;)V

    .line 204
    .line 205
    .line 206
    sput-object v0, Lbsh/Primitive;->ZERO_BIG_DECIMAL:Lbsh/Primitive;

    .line 207
    .line 208
    new-instance v0, Lbsh/Primitive;

    .line 209
    .line 210
    sget-object v1, Lbsh/Primitive$Special;->NULL_VALUE:Lbsh/Primitive$Special;

    .line 211
    .line 212
    invoke-direct {v0, v1}, Lbsh/Primitive;-><init>(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    sput-object v0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 216
    .line 217
    new-instance v0, Lbsh/Primitive;

    .line 218
    .line 219
    sget-object v1, Lbsh/Primitive$Special;->VOID_TYPE:Lbsh/Primitive$Special;

    .line 220
    .line 221
    invoke-direct {v0, v1}, Lbsh/Primitive;-><init>(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    sput-object v0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 225
    .line 226
    const-wide/32 v0, 0x7fffffff

    .line 227
    .line 228
    .line 229
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    sput-object v0, Lbsh/Primitive;->INTEGER_MAX:Ljava/math/BigInteger;

    .line 234
    .line 235
    const-wide/32 v0, -0x80000000

    .line 236
    .line 237
    .line 238
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    sput-object v0, Lbsh/Primitive;->INTEGER_MIN:Ljava/math/BigInteger;

    .line 243
    .line 244
    const-wide v0, 0x7fffffffffffffffL

    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    sput-object v0, Lbsh/Primitive;->LONG_MAX:Ljava/math/BigInteger;

    .line 254
    .line 255
    const-wide/high16 v0, -0x8000000000000000L

    .line 256
    .line 257
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    sput-object v0, Lbsh/Primitive;->LONG_MIN:Ljava/math/BigInteger;

    .line 262
    .line 263
    return-void
.end method

.method public constructor <init>(B)V
    .locals 0

    .line 19
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    invoke-direct {p0, p1}, Lbsh/Primitive;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(C)V
    .locals 0

    .line 21
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    invoke-direct {p0, p1}, Lbsh/Primitive;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(D)V
    .locals 0

    .line 25
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-direct {p0, p1}, Lbsh/Primitive;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(F)V
    .locals 0

    .line 24
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-direct {p0, p1}, Lbsh/Primitive;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 22
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Lbsh/Primitive;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 23
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-direct {p0, p1}, Lbsh/Primitive;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 28
    iput-object p1, p0, Lbsh/Primitive;->value:Ljava/lang/Object;

    return-void

    .line 29
    :cond_0
    const-string p0, "Use Primitve.NULL instead of Primitive(null)"

    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Ljava/math/BigDecimal;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/math/BigDecimal;->scale()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-virtual {p1, v0}, Ljava/math/BigDecimal;->setScale(I)Ljava/math/BigDecimal;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    invoke-direct {p0, p1}, Lbsh/Primitive;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Ljava/math/BigInteger;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Lbsh/Primitive;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(S)V
    .locals 0

    .line 20
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    invoke-direct {p0, p1}, Lbsh/Primitive;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 18
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    invoke-direct {p0, p1}, Lbsh/Primitive;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public static boxType(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lbsh/Primitive;->wrapperMap:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    const-string v0, "Not a primitive type: "

    .line 19
    .line 20
    invoke-static {p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世苏兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method

.method public static castNumber(Ljava/lang/Class;Ljava/lang/Number;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Number;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1f

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lbsh/Primitive;->unboxType(Ljava/lang/Class;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-ne p0, v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_3

    .line 18
    .line 19
    :cond_0
    const-class v0, Ljava/lang/Byte;

    .line 20
    .line 21
    if-eq p0, v0, :cond_1

    .line 22
    .line 23
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    if-ne p0, v0, :cond_2

    .line 26
    .line 27
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/16 v1, 0xff

    .line 32
    .line 33
    if-gt v0, v1, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/16 v1, -0x80

    .line 40
    .line 41
    if-lt v0, v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_2
    const-class v0, Ljava/lang/Short;

    .line 53
    .line 54
    if-eq p0, v0, :cond_3

    .line 55
    .line 56
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 57
    .line 58
    if-ne p0, v0, :cond_4

    .line 59
    .line 60
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const/16 v1, 0x7fff

    .line 65
    .line 66
    if-gt v0, v1, :cond_4

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    const/16 v1, -0x8000

    .line 73
    .line 74
    if-lt v0, v1, :cond_4

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :cond_4
    const-class v0, Ljava/lang/Character;

    .line 86
    .line 87
    if-eq p0, v0, :cond_5

    .line 88
    .line 89
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 90
    .line 91
    if-ne p0, v0, :cond_6

    .line 92
    .line 93
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    const v1, 0xffff

    .line 98
    .line 99
    .line 100
    if-gt v0, v1, :cond_6

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-ltz v0, :cond_6

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    int-to-char p0, p0

    .line 113
    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0

    .line 118
    :cond_6
    const-class v0, Ljava/lang/Integer;

    .line 119
    .line 120
    if-eq p0, v0, :cond_7

    .line 121
    .line 122
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 123
    .line 124
    if-ne p0, v0, :cond_9

    .line 125
    .line 126
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 127
    .line 128
    .line 129
    move-result-wide v0

    .line 130
    const-wide/32 v2, 0x7fffffff

    .line 131
    .line 132
    .line 133
    cmp-long v0, v0, v2

    .line 134
    .line 135
    if-gtz v0, :cond_9

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 138
    .line 139
    .line 140
    move-result-wide v0

    .line 141
    const-wide/32 v2, -0x80000000

    .line 142
    .line 143
    .line 144
    cmp-long v0, v0, v2

    .line 145
    .line 146
    if-ltz v0, :cond_9

    .line 147
    .line 148
    instance-of p0, p1, Ljava/lang/Byte;

    .line 149
    .line 150
    if-eqz p0, :cond_8

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    invoke-static {p0}, Ljava/lang/Byte;->toUnsignedInt(B)I

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    return-object p0

    .line 165
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 166
    .line 167
    .line 168
    move-result p0

    .line 169
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    return-object p0

    .line 174
    :cond_9
    const-class v0, Ljava/lang/Float;

    .line 175
    .line 176
    if-eq p0, v0, :cond_a

    .line 177
    .line 178
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 179
    .line 180
    if-ne p0, v0, :cond_b

    .line 181
    .line 182
    :cond_a
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-nez v0, :cond_b

    .line 191
    .line 192
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 193
    .line 194
    .line 195
    move-result p0

    .line 196
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    return-object p0

    .line 201
    :cond_b
    const-class v0, Ljava/lang/Double;

    .line 202
    .line 203
    if-eq p0, v0, :cond_c

    .line 204
    .line 205
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 206
    .line 207
    if-ne p0, v0, :cond_d

    .line 208
    .line 209
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 210
    .line 211
    .line 212
    move-result-wide v0

    .line 213
    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    if-nez v0, :cond_d

    .line 218
    .line 219
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 220
    .line 221
    .line 222
    move-result-wide p0

    .line 223
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    return-object p0

    .line 228
    :cond_d
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 229
    .line 230
    .line 231
    move-result-wide v0

    .line 232
    const-wide/16 v2, 0x0

    .line 233
    .line 234
    cmpl-double v0, v0, v2

    .line 235
    .line 236
    const-class v1, Ljava/math/BigDecimal;

    .line 237
    .line 238
    const-class v2, Ljava/math/BigInteger;

    .line 239
    .line 240
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 241
    .line 242
    const-class v4, Ljava/lang/Long;

    .line 243
    .line 244
    const/4 v5, 0x1

    .line 245
    if-nez v0, :cond_11

    .line 246
    .line 247
    if-eq p0, v4, :cond_10

    .line 248
    .line 249
    if-ne p0, v3, :cond_e

    .line 250
    .line 251
    goto :goto_0

    .line 252
    :cond_e
    if-ne p0, v2, :cond_f

    .line 253
    .line 254
    sget-object p0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 255
    .line 256
    return-object p0

    .line 257
    :cond_f
    if-ne p0, v1, :cond_1e

    .line 258
    .line 259
    sget-object p0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 260
    .line 261
    invoke-virtual {p0, v5}, Ljava/math/BigDecimal;->setScale(I)Ljava/math/BigDecimal;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    return-object p0

    .line 266
    :cond_10
    :goto_0
    const-wide/16 p0, 0x0

    .line 267
    .line 268
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    return-object p0

    .line 273
    :cond_11
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 274
    .line 275
    .line 276
    move-result-wide v6

    .line 277
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 278
    .line 279
    cmpl-double v0, v6, v8

    .line 280
    .line 281
    if-nez v0, :cond_15

    .line 282
    .line 283
    if-eq p0, v4, :cond_14

    .line 284
    .line 285
    if-ne p0, v3, :cond_12

    .line 286
    .line 287
    goto :goto_1

    .line 288
    :cond_12
    if-ne p0, v2, :cond_13

    .line 289
    .line 290
    sget-object p0, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    .line 291
    .line 292
    return-object p0

    .line 293
    :cond_13
    if-ne p0, v1, :cond_1e

    .line 294
    .line 295
    sget-object p0, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 296
    .line 297
    invoke-virtual {p0, v5}, Ljava/math/BigDecimal;->setScale(I)Ljava/math/BigDecimal;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    return-object p0

    .line 302
    :cond_14
    :goto_1
    const-wide/16 p0, 0x1

    .line 303
    .line 304
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 305
    .line 306
    .line 307
    move-result-object p0

    .line 308
    return-object p0

    .line 309
    :cond_15
    if-ne p0, v1, :cond_18

    .line 310
    .line 311
    instance-of p0, p1, Ljava/math/BigInteger;

    .line 312
    .line 313
    if-eqz p0, :cond_16

    .line 314
    .line 315
    new-instance p0, Ljava/math/BigDecimal;

    .line 316
    .line 317
    check-cast p1, Ljava/math/BigInteger;

    .line 318
    .line 319
    invoke-direct {p0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {p0, v5}, Ljava/math/BigDecimal;->setScale(I)Ljava/math/BigDecimal;

    .line 323
    .line 324
    .line 325
    move-result-object p0

    .line 326
    return-object p0

    .line 327
    :cond_16
    invoke-static {p1}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result p0

    .line 331
    if-eqz p0, :cond_17

    .line 332
    .line 333
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 334
    .line 335
    .line 336
    move-result-wide p0

    .line 337
    invoke-static {p0, p1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    return-object p0

    .line 342
    :cond_17
    new-instance p0, Ljava/math/BigDecimal;

    .line 343
    .line 344
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 345
    .line 346
    .line 347
    move-result-wide v0

    .line 348
    invoke-direct {p0, v0, v1}, Ljava/math/BigDecimal;-><init>(J)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {p0, v5}, Ljava/math/BigDecimal;->setScale(I)Ljava/math/BigDecimal;

    .line 352
    .line 353
    .line 354
    move-result-object p0

    .line 355
    return-object p0

    .line 356
    :cond_18
    instance-of v0, p1, Ljava/math/BigInteger;

    .line 357
    .line 358
    if-eqz v0, :cond_19

    .line 359
    .line 360
    move-object v0, p1

    .line 361
    check-cast v0, Ljava/math/BigInteger;

    .line 362
    .line 363
    goto :goto_2

    .line 364
    :cond_19
    instance-of v0, p1, Ljava/math/BigDecimal;

    .line 365
    .line 366
    if-eqz v0, :cond_1a

    .line 367
    .line 368
    move-object v0, p1

    .line 369
    check-cast v0, Ljava/math/BigDecimal;

    .line 370
    .line 371
    invoke-virtual {v0}, Ljava/math/BigDecimal;->toBigInteger()Ljava/math/BigInteger;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    goto :goto_2

    .line 376
    :cond_1a
    invoke-static {p1}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    if-eqz v0, :cond_1b

    .line 381
    .line 382
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 383
    .line 384
    .line 385
    move-result-wide v0

    .line 386
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    invoke-virtual {v0}, Ljava/math/BigDecimal;->toBigInteger()Ljava/math/BigInteger;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    goto :goto_2

    .line 395
    :cond_1b
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 396
    .line 397
    .line 398
    move-result-wide v0

    .line 399
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    :goto_2
    if-eq p0, v4, :cond_1c

    .line 404
    .line 405
    if-ne p0, v3, :cond_1d

    .line 406
    .line 407
    :cond_1c
    sget-object v1, Lbsh/Primitive;->LONG_MIN:Ljava/math/BigInteger;

    .line 408
    .line 409
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 410
    .line 411
    .line 412
    move-result v1

    .line 413
    if-ltz v1, :cond_1d

    .line 414
    .line 415
    sget-object v1, Lbsh/Primitive;->LONG_MAX:Ljava/math/BigInteger;

    .line 416
    .line 417
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 418
    .line 419
    .line 420
    move-result v1

    .line 421
    if-gtz v1, :cond_1d

    .line 422
    .line 423
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 424
    .line 425
    .line 426
    move-result-wide p0

    .line 427
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 428
    .line 429
    .line 430
    move-result-object p0

    .line 431
    return-object p0

    .line 432
    :cond_1d
    if-ne p0, v2, :cond_1e

    .line 433
    .line 434
    return-object v0

    .line 435
    :cond_1e
    new-instance v0, Lbsh/InterpreterError;

    .line 436
    .line 437
    new-instance v1, Ljava/lang/StringBuilder;

    .line 438
    .line 439
    const-string v2, "cannot assign number "

    .line 440
    .line 441
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object p0

    .line 451
    const-string p1, " to type "

    .line 452
    .line 453
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object p0

    .line 463
    invoke-direct {v0, p0}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    throw v0

    .line 467
    :cond_1f
    :goto_3
    return-object p1
.end method

.method public static castNumberStrictJava(Ljava/lang/Class;Ljava/lang/Number;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Number;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const-class v0, Ljava/lang/Byte;

    .line 2
    .line 3
    if-eq p0, v0, :cond_d

    .line 4
    .line 5
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_6

    .line 10
    .line 11
    :cond_0
    const-class v0, Ljava/lang/Short;

    .line 12
    .line 13
    if-eq p0, v0, :cond_c

    .line 14
    .line 15
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    if-ne p0, v0, :cond_1

    .line 18
    .line 19
    goto :goto_5

    .line 20
    :cond_1
    const-class v0, Ljava/lang/Character;

    .line 21
    .line 22
    if-eq p0, v0, :cond_b

    .line 23
    .line 24
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 25
    .line 26
    if-ne p0, v0, :cond_2

    .line 27
    .line 28
    goto :goto_4

    .line 29
    :cond_2
    const-class v0, Ljava/lang/Integer;

    .line 30
    .line 31
    if-eq p0, v0, :cond_a

    .line 32
    .line 33
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    if-ne p0, v0, :cond_3

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_3
    const-class v0, Ljava/lang/Long;

    .line 39
    .line 40
    if-eq p0, v0, :cond_9

    .line 41
    .line 42
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 43
    .line 44
    if-ne p0, v0, :cond_4

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_4
    const-class v0, Ljava/lang/Float;

    .line 48
    .line 49
    if-eq p0, v0, :cond_8

    .line 50
    .line 51
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 52
    .line 53
    if-ne p0, v0, :cond_5

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_5
    const-class v0, Ljava/lang/Double;

    .line 57
    .line 58
    if-eq p0, v0, :cond_7

    .line 59
    .line 60
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    if-ne p0, v0, :cond_6

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_6
    invoke-static {p0, p1}, Lbsh/Primitive;->castNumber(Ljava/lang/Class;Ljava/lang/Number;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :cond_7
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 71
    .line 72
    .line 73
    move-result-wide p0

    .line 74
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :cond_8
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :cond_9
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 89
    .line 90
    .line 91
    move-result-wide p0

    .line 92
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :cond_a
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    :cond_b
    :goto_4
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    int-to-char p0, p0

    .line 111
    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0

    .line 116
    :cond_c
    :goto_5
    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :cond_d
    :goto_6
    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0
.end method

.method public static castPrimitive(Ljava/lang/Class;Ljava/lang/Class;Lbsh/Primitive;ZI)Lbsh/Primitive;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Lbsh/Primitive;",
            "ZI)",
            "Lbsh/Primitive;"
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p1, v0, :cond_1

    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    sget-object p0, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰:Lbsh/Primitive;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    invoke-static {p0}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/Class;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string p1, "void value"

    .line 16
    .line 17
    invoke-static {p0, p1, v1, p4}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Lbsh/UtilEvalError;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    throw p0

    .line 22
    :cond_1
    if-nez p3, :cond_2

    .line 23
    .line 24
    invoke-virtual {p2}, Lbsh/Primitive;->isNumber()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-static {p0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/Class;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    new-instance p1, Lbsh/Primitive;

    .line 37
    .line 38
    invoke-virtual {p2}, Lbsh/Primitive;->numberValue()Ljava/lang/Number;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-static {p0, p2}, Lbsh/Primitive;->castNumber(Ljava/lang/Class;Ljava/lang/Number;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-direct {p1, p0}, Lbsh/Primitive;-><init>(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_c

    .line 55
    .line 56
    if-nez p1, :cond_4

    .line 57
    .line 58
    sget-object v0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 59
    .line 60
    invoke-virtual {v0, p2}, Lbsh/Primitive;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_4

    .line 65
    .line 66
    if-eqz p3, :cond_3

    .line 67
    .line 68
    sget-object p0, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏兰哲:Lbsh/Primitive;

    .line 69
    .line 70
    return-object p0

    .line 71
    :cond_3
    invoke-static {p0}, Lbsh/Primitive;->getDefaultValue(Ljava/lang/Class;)Lbsh/Primitive;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_4
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 77
    .line 78
    if-ne p0, v0, :cond_6

    .line 79
    .line 80
    if-eqz p3, :cond_5

    .line 81
    .line 82
    sget-object p0, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏兰哲:Lbsh/Primitive;

    .line 83
    .line 84
    return-object p0

    .line 85
    :cond_5
    new-instance p1, Lbsh/Primitive;

    .line 86
    .line 87
    invoke-static {p0, p2}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-direct {p1, p0}, Lbsh/Primitive;-><init>(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    return-object p1

    .line 95
    :cond_6
    if-eqz p3, :cond_8

    .line 96
    .line 97
    if-ne p1, v0, :cond_8

    .line 98
    .line 99
    if-eq p0, v0, :cond_7

    .line 100
    .line 101
    sget-object p0, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰:Lbsh/Primitive;

    .line 102
    .line 103
    return-object p0

    .line 104
    :cond_7
    sget-object p0, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏兰哲:Lbsh/Primitive;

    .line 105
    .line 106
    return-object p0

    .line 107
    :cond_8
    const/4 v0, 0x1

    .line 108
    if-ne p4, v0, :cond_a

    .line 109
    .line 110
    invoke-static {p0, p1}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 111
    .line 112
    .line 113
    move-result p4

    .line 114
    if-nez p4, :cond_a

    .line 115
    .line 116
    invoke-static {p0, p1}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-eqz p1, :cond_9

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_9
    if-eqz p3, :cond_a

    .line 124
    .line 125
    sget-object p0, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰:Lbsh/Primitive;

    .line 126
    .line 127
    return-object p0

    .line 128
    :cond_a
    :goto_0
    if-eqz p3, :cond_b

    .line 129
    .line 130
    sget-object p0, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏兰哲:Lbsh/Primitive;

    .line 131
    .line 132
    return-object p0

    .line 133
    :cond_b
    new-instance p1, Lbsh/Primitive;

    .line 134
    .line 135
    invoke-static {p0, p2}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-direct {p1, p0}, Lbsh/Primitive;-><init>(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    return-object p1

    .line 143
    :cond_c
    if-nez p1, :cond_e

    .line 144
    .line 145
    if-eqz p3, :cond_d

    .line 146
    .line 147
    sget-object p0, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏兰哲:Lbsh/Primitive;

    .line 148
    .line 149
    return-object p0

    .line 150
    :cond_d
    sget-object p0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 151
    .line 152
    return-object p0

    .line 153
    :cond_e
    if-eqz p3, :cond_f

    .line 154
    .line 155
    sget-object p0, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰:Lbsh/Primitive;

    .line 156
    .line 157
    return-object p0

    .line 158
    :cond_f
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    const-string p1, "object type "

    .line 163
    .line 164
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    const-string p1, "primitive value"

    .line 169
    .line 170
    invoke-static {p0, p1, v1, p4}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Lbsh/UtilEvalError;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    throw p0
.end method

.method public static castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lbsh/Primitive;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-static {p1}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p0}, Lbsh/Primitive;->isWrapperType(Ljava/lang/Class;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const-string p1, "invalid type in castWrapper: "

    .line 29
    .line 30
    invoke-static {p0, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世苏兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_2
    :goto_0
    instance-of v0, p1, Ljava/lang/Character;

    .line 39
    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    check-cast p1, Ljava/lang/Character;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :cond_3
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 53
    .line 54
    if-ne p0, v0, :cond_9

    .line 55
    .line 56
    instance-of p0, p1, Ljava/lang/Boolean;

    .line 57
    .line 58
    if-eqz p0, :cond_4

    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_4
    instance-of p0, p1, Ljava/lang/String;

    .line 62
    .line 63
    const/4 v0, 0x1

    .line 64
    if-eqz p0, :cond_5

    .line 65
    .line 66
    const-string p0, ""

    .line 67
    .line 68
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    xor-int/2addr p0, v0

    .line 77
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :cond_5
    instance-of p0, p1, Ljava/lang/Number;

    .line 83
    .line 84
    const/4 v1, 0x0

    .line 85
    if-eqz p0, :cond_7

    .line 86
    .line 87
    check-cast p1, Ljava/lang/Number;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    if-eqz p0, :cond_6

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_6
    move v0, v1

    .line 97
    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0

    .line 102
    :cond_7
    if-eqz p1, :cond_8

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_8
    move v0, v1

    .line 106
    :goto_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :cond_9
    if-nez p1, :cond_a

    .line 112
    .line 113
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_a

    .line 118
    .line 119
    invoke-static {p0}, Lbsh/Primitive;->getDefaultValue(Ljava/lang/Class;)Lbsh/Primitive;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-static {p1}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    :cond_a
    instance-of v0, p1, Ljava/lang/String;

    .line 128
    .line 129
    if-eqz v0, :cond_b

    .line 130
    .line 131
    :try_start_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 136
    .line 137
    .line 138
    move-result-wide v2

    .line 139
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 140
    .line 141
    .line 142
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 143
    goto :goto_3

    .line 144
    :catch_0
    move-exception p0

    .line 145
    new-instance v0, Lbsh/InterpreterError;

    .line 146
    .line 147
    new-instance v1, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    const-string v2, "cannot cast string \""

    .line 150
    .line 151
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string p1, "\" to number"

    .line 158
    .line 159
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-direct {v0, p1, p0}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 167
    .line 168
    .line 169
    throw v0

    .line 170
    :cond_b
    :goto_3
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 171
    .line 172
    if-eqz v0, :cond_c

    .line 173
    .line 174
    check-cast p1, Ljava/lang/Boolean;

    .line 175
    .line 176
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    :cond_c
    instance-of v0, p1, Ljava/lang/Number;

    .line 185
    .line 186
    if-eqz v0, :cond_d

    .line 187
    .line 188
    check-cast p1, Ljava/lang/Number;

    .line 189
    .line 190
    invoke-static {p0, p1}, Lbsh/Primitive;->castNumber(Ljava/lang/Class;Ljava/lang/Number;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    return-object p0

    .line 195
    :cond_d
    new-instance p0, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    invoke-static {p1}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/Object;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    const-string v0, " :"

    .line 205
    .line 206
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-static {p1}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    const-string p1, "bad type in cast "

    .line 221
    .line 222
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    return-object v1
.end method

.method public static getDefaultValue(Ljava/lang/Class;)Lbsh/Primitive;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lbsh/Primitive;"
        }
    .end annotation

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 7
    .line 8
    if-eq v0, p0, :cond_12

    .line 9
    .line 10
    const-class v0, Ljava/lang/Boolean;

    .line 11
    .line 12
    if-ne v0, p0, :cond_1

    .line 13
    .line 14
    goto/16 :goto_7

    .line 15
    .line 16
    :cond_1
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 17
    .line 18
    if-eq v0, p0, :cond_11

    .line 19
    .line 20
    const-class v0, Ljava/lang/Character;

    .line 21
    .line 22
    if-ne v0, p0, :cond_2

    .line 23
    .line 24
    goto :goto_6

    .line 25
    :cond_2
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    if-eq v0, p0, :cond_10

    .line 28
    .line 29
    const-class v0, Ljava/lang/Byte;

    .line 30
    .line 31
    if-ne v0, p0, :cond_3

    .line 32
    .line 33
    goto :goto_5

    .line 34
    :cond_3
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 35
    .line 36
    if-eq v0, p0, :cond_f

    .line 37
    .line 38
    const-class v0, Ljava/lang/Short;

    .line 39
    .line 40
    if-ne v0, p0, :cond_4

    .line 41
    .line 42
    goto :goto_4

    .line 43
    :cond_4
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    if-eq v0, p0, :cond_e

    .line 46
    .line 47
    const-class v0, Ljava/lang/Integer;

    .line 48
    .line 49
    if-ne v0, p0, :cond_5

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_5
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 53
    .line 54
    if-eq v0, p0, :cond_d

    .line 55
    .line 56
    const-class v0, Ljava/lang/Long;

    .line 57
    .line 58
    if-ne v0, p0, :cond_6

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_6
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 62
    .line 63
    if-eq v0, p0, :cond_c

    .line 64
    .line 65
    const-class v0, Ljava/lang/Float;

    .line 66
    .line 67
    if-ne v0, p0, :cond_7

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_7
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 71
    .line 72
    if-eq v0, p0, :cond_b

    .line 73
    .line 74
    const-class v0, Ljava/lang/Double;

    .line 75
    .line 76
    if-ne v0, p0, :cond_8

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_8
    const-class v0, Ljava/math/BigInteger;

    .line 80
    .line 81
    if-ne v0, p0, :cond_9

    .line 82
    .line 83
    sget-object p0, Lbsh/Primitive;->ZERO_BIG_INTEGER:Lbsh/Primitive;

    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_9
    const-class v0, Ljava/math/BigDecimal;

    .line 87
    .line 88
    if-ne v0, p0, :cond_a

    .line 89
    .line 90
    sget-object p0, Lbsh/Primitive;->ZERO_BIG_DECIMAL:Lbsh/Primitive;

    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_a
    sget-object p0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 94
    .line 95
    return-object p0

    .line 96
    :cond_b
    :goto_0
    sget-object p0, Lbsh/Primitive;->ZERO_DOUBLE:Lbsh/Primitive;

    .line 97
    .line 98
    return-object p0

    .line 99
    :cond_c
    :goto_1
    sget-object p0, Lbsh/Primitive;->ZERO_FLOAT:Lbsh/Primitive;

    .line 100
    .line 101
    return-object p0

    .line 102
    :cond_d
    :goto_2
    sget-object p0, Lbsh/Primitive;->ZERO_LONG:Lbsh/Primitive;

    .line 103
    .line 104
    return-object p0

    .line 105
    :cond_e
    :goto_3
    sget-object p0, Lbsh/Primitive;->ZERO_INT:Lbsh/Primitive;

    .line 106
    .line 107
    return-object p0

    .line 108
    :cond_f
    :goto_4
    sget-object p0, Lbsh/Primitive;->ZERO_SHORT:Lbsh/Primitive;

    .line 109
    .line 110
    return-object p0

    .line 111
    :cond_10
    :goto_5
    sget-object p0, Lbsh/Primitive;->ZERO_BYTE:Lbsh/Primitive;

    .line 112
    .line 113
    return-object p0

    .line 114
    :cond_11
    :goto_6
    sget-object p0, Lbsh/Primitive;->ZERO_CHAR:Lbsh/Primitive;

    .line 115
    .line 116
    return-object p0

    .line 117
    :cond_12
    :goto_7
    sget-object p0, Lbsh/Primitive;->FALSE:Lbsh/Primitive;

    .line 118
    .line 119
    return-object p0
.end method

.method public static isWrapperType(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object v0, Lbsh/Primitive;->wrapperMap:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Primitive;->value:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, Lbsh/Primitive$Special;->NULL_VALUE:Lbsh/Primitive$Special;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    sget-object p0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 8
    .line 9
    :cond_0
    return-object p0
.end method

.method public static shrinkWrap(Ljava/lang/Object;)Lbsh/Primitive;
    .locals 3

    .line 1
    instance-of v0, p0, Ljava/lang/Number;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-static {p0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    instance-of v1, p0, Ljava/lang/Float;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    new-instance p0, Lbsh/Primitive;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-direct {p0, v0}, Lbsh/Primitive;-><init>(F)V

    .line 25
    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    invoke-static {v1, v2}, Ljava/lang/Double;->isInfinite(D)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    new-instance p0, Lbsh/Primitive;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    invoke-direct {p0, v0, v1}, Lbsh/Primitive;-><init>(D)V

    .line 45
    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_1
    new-instance v0, Lbsh/Primitive;

    .line 49
    .line 50
    check-cast p0, Ljava/math/BigDecimal;

    .line 51
    .line 52
    invoke-direct {v0, p0}, Lbsh/Primitive;-><init>(Ljava/math/BigDecimal;)V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_2
    instance-of v1, p0, Ljava/math/BigInteger;

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    check-cast p0, Ljava/math/BigInteger;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    :goto_0
    sget-object v0, Lbsh/Primitive;->INTEGER_MIN:Ljava/math/BigInteger;

    .line 72
    .line 73
    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-ltz v0, :cond_4

    .line 78
    .line 79
    sget-object v0, Lbsh/Primitive;->INTEGER_MAX:Ljava/math/BigInteger;

    .line 80
    .line 81
    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-gtz v0, :cond_4

    .line 86
    .line 87
    new-instance v0, Lbsh/Primitive;

    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/math/BigInteger;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    invoke-direct {v0, p0}, Lbsh/Primitive;-><init>(I)V

    .line 94
    .line 95
    .line 96
    return-object v0

    .line 97
    :cond_4
    sget-object v0, Lbsh/Primitive;->LONG_MIN:Ljava/math/BigInteger;

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-ltz v0, :cond_5

    .line 104
    .line 105
    sget-object v0, Lbsh/Primitive;->LONG_MAX:Ljava/math/BigInteger;

    .line 106
    .line 107
    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-gtz v0, :cond_5

    .line 112
    .line 113
    new-instance v0, Lbsh/Primitive;

    .line 114
    .line 115
    invoke-virtual {p0}, Ljava/math/BigInteger;->longValue()J

    .line 116
    .line 117
    .line 118
    move-result-wide v1

    .line 119
    invoke-direct {v0, v1, v2}, Lbsh/Primitive;-><init>(J)V

    .line 120
    .line 121
    .line 122
    return-object v0

    .line 123
    :cond_5
    new-instance v0, Lbsh/Primitive;

    .line 124
    .line 125
    invoke-direct {v0, p0}, Lbsh/Primitive;-><init>(Ljava/math/BigInteger;)V

    .line 126
    .line 127
    .line 128
    return-object v0

    .line 129
    :cond_6
    const-string p0, "Can only shrink wrap Number types"

    .line 130
    .line 131
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    const/4 p0, 0x0

    .line 135
    return-object p0
.end method

.method public static unboxType(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lbsh/Primitive;->wrapperMap:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Class;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    if-ne v0, p0, :cond_1

    .line 18
    .line 19
    :cond_0
    return-object v0

    .line 20
    :cond_1
    const-string v0, "Not a primitive wrapper type: "

    .line 21
    .line 22
    invoke-static {p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世苏兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return-object p0
.end method

.method public static unwrap(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 24
    sget-object v0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 25
    :cond_0
    instance-of v0, p0, Lbsh/Primitive;

    if-eqz v0, :cond_1

    .line 26
    check-cast p0, Lbsh/Primitive;

    invoke-virtual {p0}, Lbsh/Primitive;->getValue()Ljava/lang/Object;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static unwrap([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    array-length v0, p0

    .line 6
    new-array v0, v0, [Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    array-length v2, p0

    .line 10
    if-ge v1, v2, :cond_1

    .line 11
    .line 12
    aget-object v2, p0, v1

    .line 13
    .line 14
    invoke-static {v2}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    aput-object v2, v0, v1

    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return-object v0
.end method

.method public static wrap(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    if-nez p0, :cond_1

    .line 9
    .line 10
    sget-object p0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_1
    sget-object v0, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_3

    .line 20
    .line 21
    const-class v0, Ljava/math/BigInteger;

    .line 22
    .line 23
    if-eq p1, v0, :cond_3

    .line 24
    .line 25
    const-class v0, Ljava/math/BigDecimal;

    .line 26
    .line 27
    if-ne p1, v0, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    return-object p0

    .line 31
    :cond_3
    :goto_0
    instance-of p1, p0, Ljava/lang/Boolean;

    .line 32
    .line 33
    if-eqz p1, :cond_5

    .line 34
    .line 35
    check-cast p0, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_4

    .line 42
    .line 43
    sget-object p0, Lbsh/Primitive;->TRUE:Lbsh/Primitive;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_4
    sget-object p0, Lbsh/Primitive;->FALSE:Lbsh/Primitive;

    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p1}, Lbsh/Primitive;->isWrapperType(Ljava/lang/Class;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_6

    .line 58
    .line 59
    new-instance p1, Lbsh/Primitive;

    .line 60
    .line 61
    invoke-direct {p1, p0}, Lbsh/Primitive;-><init>(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-object p1

    .line 65
    :cond_6
    return-object p0
.end method

.method public static wrap([Ljava/lang/Object;[Ljava/lang/Class;)[Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            "[",
            "Ljava/lang/Class<",
            "*>;)[",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 66
    :cond_0
    array-length v0, p0

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 67
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    .line 68
    aget-object v2, p0, v1

    aget-object v3, p1, v1

    invoke-static {v2, v3}, Lbsh/Primitive;->wrap(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public castToType(Ljava/lang/Class;I)Lbsh/Primitive;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;I)",
            "Lbsh/Primitive;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lbsh/Primitive;->getType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {p1, v0, p0, v1, p2}, Lbsh/Primitive;->castPrimitive(Ljava/lang/Class;Ljava/lang/Class;Lbsh/Primitive;ZI)Lbsh/Primitive;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    instance-of v0, p1, Lbsh/Primitive;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    sget-object v0, Lbsh/Primitive;->wrapperMap:Ljava/util/Map;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Lbsh/Primitive;

    .line 19
    .line 20
    invoke-direct {v0, p1}, Lbsh/Primitive;-><init>(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    move-object p1, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return v1

    .line 26
    :cond_1
    :goto_0
    check-cast p1, Lbsh/Primitive;

    .line 27
    .line 28
    invoke-virtual {p1}, Lbsh/Primitive;->isNumber()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_a

    .line 33
    .line 34
    invoke-virtual {p0}, Lbsh/Primitive;->isNumber()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_a

    .line 39
    .line 40
    invoke-virtual {p0}, Lbsh/Primitive;->getType()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-class v2, Ljava/math/BigDecimal;

    .line 45
    .line 46
    if-ne v0, v2, :cond_2

    .line 47
    .line 48
    iget-object p0, p0, Lbsh/Primitive;->value:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-virtual {p1}, Lbsh/Primitive;->numberValue()Ljava/lang/Number;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {v2, p1}, Lbsh/Primitive;->castNumber(Ljava/lang/Class;Ljava/lang/Number;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    return p0

    .line 63
    :cond_2
    invoke-virtual {p1}, Lbsh/Primitive;->getType()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-ne v0, v2, :cond_3

    .line 68
    .line 69
    iget-object p1, p1, Lbsh/Primitive;->value:Ljava/lang/Object;

    .line 70
    .line 71
    invoke-virtual {p0}, Lbsh/Primitive;->numberValue()Ljava/lang/Number;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {v2, p0}, Lbsh/Primitive;->castNumber(Ljava/lang/Class;Ljava/lang/Number;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    return p0

    .line 84
    :cond_3
    iget-object v0, p0, Lbsh/Primitive;->value:Ljava/lang/Object;

    .line 85
    .line 86
    invoke-static {v0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    const/4 v2, 0x1

    .line 91
    if-nez v0, :cond_8

    .line 92
    .line 93
    iget-object v0, p1, Lbsh/Primitive;->value:Ljava/lang/Object;

    .line 94
    .line 95
    invoke-static {v0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_4

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    invoke-virtual {p0}, Lbsh/Primitive;->getType()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    const-class v3, Ljava/math/BigInteger;

    .line 107
    .line 108
    if-ne v0, v3, :cond_5

    .line 109
    .line 110
    iget-object p0, p0, Lbsh/Primitive;->value:Ljava/lang/Object;

    .line 111
    .line 112
    invoke-virtual {p1}, Lbsh/Primitive;->numberValue()Ljava/lang/Number;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-static {v3, p1}, Lbsh/Primitive;->castNumber(Ljava/lang/Class;Ljava/lang/Number;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    return p0

    .line 125
    :cond_5
    invoke-virtual {p1}, Lbsh/Primitive;->getType()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    if-ne v0, v3, :cond_6

    .line 130
    .line 131
    iget-object p1, p1, Lbsh/Primitive;->value:Ljava/lang/Object;

    .line 132
    .line 133
    invoke-virtual {p0}, Lbsh/Primitive;->numberValue()Ljava/lang/Number;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-static {v3, p0}, Lbsh/Primitive;->castNumber(Ljava/lang/Class;Ljava/lang/Number;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    return p0

    .line 146
    :cond_6
    invoke-virtual {p0}, Lbsh/Primitive;->numberValue()Ljava/lang/Number;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 151
    .line 152
    .line 153
    move-result-wide v3

    .line 154
    invoke-virtual {p1}, Lbsh/Primitive;->numberValue()Ljava/lang/Number;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 159
    .line 160
    .line 161
    move-result-wide p0

    .line 162
    cmp-long p0, v3, p0

    .line 163
    .line 164
    if-nez p0, :cond_7

    .line 165
    .line 166
    return v2

    .line 167
    :cond_7
    return v1

    .line 168
    :cond_8
    :goto_1
    invoke-virtual {p0}, Lbsh/Primitive;->numberValue()Ljava/lang/Number;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 173
    .line 174
    .line 175
    move-result-wide v3

    .line 176
    invoke-virtual {p1}, Lbsh/Primitive;->numberValue()Ljava/lang/Number;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 181
    .line 182
    .line 183
    move-result-wide p0

    .line 184
    cmpl-double p0, v3, p0

    .line 185
    .line 186
    if-nez p0, :cond_9

    .line 187
    .line 188
    return v2

    .line 189
    :cond_9
    return v1

    .line 190
    :cond_a
    iget-object p0, p0, Lbsh/Primitive;->value:Ljava/lang/Object;

    .line 191
    .line 192
    iget-object p1, p1, Lbsh/Primitive;->value:Ljava/lang/Object;

    .line 193
    .line 194
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result p0

    .line 198
    return p0
.end method

.method public getType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    sget-object v0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 9
    .line 10
    if-ne p0, v0, :cond_1

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :cond_1
    iget-object p0, p0, Lbsh/Primitive;->value:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0}, Lbsh/Primitive;->unboxType(Ljava/lang/Class;)Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Lbsh/Primitive;->value:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v0, Lbsh/Primitive$Special;->NULL_VALUE:Lbsh/Primitive$Special;

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    sget-object v0, Lbsh/Primitive$Special;->VOID_TYPE:Lbsh/Primitive$Special;

    .line 10
    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_1
    const-string p0, "attempt to unwrap void type"

    .line 15
    .line 16
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/Primitive;->value:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-int/lit8 p0, p0, 0x15

    .line 8
    .line 9
    return p0
.end method

.method public isNumber()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Primitive;->value:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/Boolean;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    sget-object v1, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 8
    .line 9
    if-eq p0, v1, :cond_0

    .line 10
    .line 11
    sget-object v1, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 12
    .line 13
    if-eq p0, v1, :cond_0

    .line 14
    .line 15
    invoke-static {v0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public numberValue()Ljava/lang/Number;
    .locals 1

    .line 1
    iget-object p0, p0, Lbsh/Primitive;->value:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/lang/Character;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Ljava/lang/Character;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Character;->charValue()C

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_0
    instance-of v0, p0, Ljava/lang/Number;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    check-cast p0, Ljava/lang/Number;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_1
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    check-cast p0, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_2
    const-string p0, "Primitive not a number"

    .line 40
    .line 41
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x0

    .line 45
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Lbsh/Primitive;->value:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v0, Lbsh/Primitive$Special;->NULL_VALUE:Lbsh/Primitive$Special;

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const-string p0, "null"

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object v0, Lbsh/Primitive$Special;->VOID_TYPE:Lbsh/Primitive$Special;

    .line 11
    .line 12
    if-ne p0, v0, :cond_1

    .line 13
    .line 14
    const-string p0, "void"

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
