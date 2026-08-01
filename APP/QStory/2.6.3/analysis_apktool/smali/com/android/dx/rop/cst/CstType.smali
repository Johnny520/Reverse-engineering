.class public final Lcom/android/dx/rop/cst/CstType;
.super Lcom/android/dx/rop/cst/TypedConstant;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final BOOLEAN:Lcom/android/dx/rop/cst/CstType;

.field public static final BOOLEAN_ARRAY:Lcom/android/dx/rop/cst/CstType;

.field public static final BYTE:Lcom/android/dx/rop/cst/CstType;

.field public static final BYTE_ARRAY:Lcom/android/dx/rop/cst/CstType;

.field public static final CHARACTER:Lcom/android/dx/rop/cst/CstType;

.field public static final CHAR_ARRAY:Lcom/android/dx/rop/cst/CstType;

.field public static final DOUBLE:Lcom/android/dx/rop/cst/CstType;

.field public static final DOUBLE_ARRAY:Lcom/android/dx/rop/cst/CstType;

.field public static final FLOAT:Lcom/android/dx/rop/cst/CstType;

.field public static final FLOAT_ARRAY:Lcom/android/dx/rop/cst/CstType;

.field public static final INTEGER:Lcom/android/dx/rop/cst/CstType;

.field public static final INT_ARRAY:Lcom/android/dx/rop/cst/CstType;

.field public static final LONG:Lcom/android/dx/rop/cst/CstType;

.field public static final LONG_ARRAY:Lcom/android/dx/rop/cst/CstType;

.field public static final METHOD_HANDLE:Lcom/android/dx/rop/cst/CstType;

.field public static final OBJECT:Lcom/android/dx/rop/cst/CstType;

.field public static final SHORT:Lcom/android/dx/rop/cst/CstType;

.field public static final SHORT_ARRAY:Lcom/android/dx/rop/cst/CstType;

.field public static final VAR_HANDLE:Lcom/android/dx/rop/cst/CstType;

.field public static final VOID:Lcom/android/dx/rop/cst/CstType;

.field private static final interns:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Lcom/android/dx/rop/type/Type;",
            "Lcom/android/dx/rop/cst/CstType;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private descriptor:Lcom/android/dx/rop/cst/CstString;

.field private final type:Lcom/android/dx/rop/type/Type;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    const/16 v1, 0x3e8

    .line 4
    .line 5
    const/high16 v2, 0x3f400000    # 0.75f

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IF)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/android/dx/rop/cst/CstType;->interns:Ljava/util/concurrent/ConcurrentMap;

    .line 11
    .line 12
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 13
    .line 14
    sget-object v1, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 15
    .line 16
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/android/dx/rop/cst/CstType;->OBJECT:Lcom/android/dx/rop/cst/CstType;

    .line 20
    .line 21
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 22
    .line 23
    sget-object v1, Lcom/android/dx/rop/type/Type;->BOOLEAN_CLASS:Lcom/android/dx/rop/type/Type;

    .line 24
    .line 25
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lcom/android/dx/rop/cst/CstType;->BOOLEAN:Lcom/android/dx/rop/cst/CstType;

    .line 29
    .line 30
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 31
    .line 32
    sget-object v1, Lcom/android/dx/rop/type/Type;->BYTE_CLASS:Lcom/android/dx/rop/type/Type;

    .line 33
    .line 34
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Lcom/android/dx/rop/cst/CstType;->BYTE:Lcom/android/dx/rop/cst/CstType;

    .line 38
    .line 39
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 40
    .line 41
    sget-object v1, Lcom/android/dx/rop/type/Type;->CHARACTER_CLASS:Lcom/android/dx/rop/type/Type;

    .line 42
    .line 43
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lcom/android/dx/rop/cst/CstType;->CHARACTER:Lcom/android/dx/rop/cst/CstType;

    .line 47
    .line 48
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 49
    .line 50
    sget-object v1, Lcom/android/dx/rop/type/Type;->DOUBLE_CLASS:Lcom/android/dx/rop/type/Type;

    .line 51
    .line 52
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Lcom/android/dx/rop/cst/CstType;->DOUBLE:Lcom/android/dx/rop/cst/CstType;

    .line 56
    .line 57
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 58
    .line 59
    sget-object v1, Lcom/android/dx/rop/type/Type;->FLOAT_CLASS:Lcom/android/dx/rop/type/Type;

    .line 60
    .line 61
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 62
    .line 63
    .line 64
    sput-object v0, Lcom/android/dx/rop/cst/CstType;->FLOAT:Lcom/android/dx/rop/cst/CstType;

    .line 65
    .line 66
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 67
    .line 68
    sget-object v1, Lcom/android/dx/rop/type/Type;->LONG_CLASS:Lcom/android/dx/rop/type/Type;

    .line 69
    .line 70
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 71
    .line 72
    .line 73
    sput-object v0, Lcom/android/dx/rop/cst/CstType;->LONG:Lcom/android/dx/rop/cst/CstType;

    .line 74
    .line 75
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 76
    .line 77
    sget-object v1, Lcom/android/dx/rop/type/Type;->INTEGER_CLASS:Lcom/android/dx/rop/type/Type;

    .line 78
    .line 79
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 80
    .line 81
    .line 82
    sput-object v0, Lcom/android/dx/rop/cst/CstType;->INTEGER:Lcom/android/dx/rop/cst/CstType;

    .line 83
    .line 84
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 85
    .line 86
    sget-object v1, Lcom/android/dx/rop/type/Type;->SHORT_CLASS:Lcom/android/dx/rop/type/Type;

    .line 87
    .line 88
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 89
    .line 90
    .line 91
    sput-object v0, Lcom/android/dx/rop/cst/CstType;->SHORT:Lcom/android/dx/rop/cst/CstType;

    .line 92
    .line 93
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 94
    .line 95
    sget-object v1, Lcom/android/dx/rop/type/Type;->VOID_CLASS:Lcom/android/dx/rop/type/Type;

    .line 96
    .line 97
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 98
    .line 99
    .line 100
    sput-object v0, Lcom/android/dx/rop/cst/CstType;->VOID:Lcom/android/dx/rop/cst/CstType;

    .line 101
    .line 102
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 103
    .line 104
    sget-object v1, Lcom/android/dx/rop/type/Type;->BOOLEAN_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 105
    .line 106
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 107
    .line 108
    .line 109
    sput-object v0, Lcom/android/dx/rop/cst/CstType;->BOOLEAN_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 110
    .line 111
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 112
    .line 113
    sget-object v1, Lcom/android/dx/rop/type/Type;->BYTE_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 114
    .line 115
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 116
    .line 117
    .line 118
    sput-object v0, Lcom/android/dx/rop/cst/CstType;->BYTE_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 119
    .line 120
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 121
    .line 122
    sget-object v1, Lcom/android/dx/rop/type/Type;->CHAR_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 123
    .line 124
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 125
    .line 126
    .line 127
    sput-object v0, Lcom/android/dx/rop/cst/CstType;->CHAR_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 128
    .line 129
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 130
    .line 131
    sget-object v1, Lcom/android/dx/rop/type/Type;->DOUBLE_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 132
    .line 133
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 134
    .line 135
    .line 136
    sput-object v0, Lcom/android/dx/rop/cst/CstType;->DOUBLE_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 137
    .line 138
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 139
    .line 140
    sget-object v1, Lcom/android/dx/rop/type/Type;->FLOAT_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 141
    .line 142
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 143
    .line 144
    .line 145
    sput-object v0, Lcom/android/dx/rop/cst/CstType;->FLOAT_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 146
    .line 147
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 148
    .line 149
    sget-object v1, Lcom/android/dx/rop/type/Type;->LONG_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 150
    .line 151
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 152
    .line 153
    .line 154
    sput-object v0, Lcom/android/dx/rop/cst/CstType;->LONG_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 155
    .line 156
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 157
    .line 158
    sget-object v1, Lcom/android/dx/rop/type/Type;->INT_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 159
    .line 160
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 161
    .line 162
    .line 163
    sput-object v0, Lcom/android/dx/rop/cst/CstType;->INT_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 164
    .line 165
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 166
    .line 167
    sget-object v1, Lcom/android/dx/rop/type/Type;->SHORT_ARRAY:Lcom/android/dx/rop/type/Type;

    .line 168
    .line 169
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 170
    .line 171
    .line 172
    sput-object v0, Lcom/android/dx/rop/cst/CstType;->SHORT_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 173
    .line 174
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 175
    .line 176
    sget-object v1, Lcom/android/dx/rop/type/Type;->METHOD_HANDLE:Lcom/android/dx/rop/type/Type;

    .line 177
    .line 178
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 179
    .line 180
    .line 181
    sput-object v0, Lcom/android/dx/rop/cst/CstType;->METHOD_HANDLE:Lcom/android/dx/rop/cst/CstType;

    .line 182
    .line 183
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 184
    .line 185
    sget-object v1, Lcom/android/dx/rop/type/Type;->VAR_HANDLE:Lcom/android/dx/rop/type/Type;

    .line 186
    .line 187
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 188
    .line 189
    .line 190
    sput-object v0, Lcom/android/dx/rop/cst/CstType;->VAR_HANDLE:Lcom/android/dx/rop/cst/CstType;

    .line 191
    .line 192
    invoke-static {}, Lcom/android/dx/rop/cst/CstType;->initInterns()V

    .line 193
    .line 194
    .line 195
    return-void
.end method

.method public constructor <init>(Lcom/android/dx/rop/type/Type;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/android/dx/rop/cst/TypedConstant;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    sget-object v1, Lcom/android/dx/rop/type/Type;->KNOWN_NULL:Lcom/android/dx/rop/type/Type;

    .line 8
    .line 9
    if-eq p1, v1, :cond_0

    .line 10
    .line 11
    iput-object p1, p0, Lcom/android/dx/rop/cst/CstType;->type:Lcom/android/dx/rop/type/Type;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/android/dx/rop/cst/CstType;->descriptor:Lcom/android/dx/rop/cst/CstString;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const-string p0, "KNOWN_NULL is not representable"

    .line 17
    .line 18
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0

    .line 22
    :cond_1
    const-string p0, "type == null"

    .line 23
    .line 24
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0
.end method

.method public static clearInternTable()V
    .locals 1

    .line 1
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->interns:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/android/dx/rop/cst/CstType;->initInterns()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static forBoxedPrimitiveType(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/cst/CstType;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->getBasicType()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-string v0, "not primitive: "

    .line 9
    .line 10
    invoke-static {p0, v0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    sget-object p0, Lcom/android/dx/rop/cst/CstType;->SHORT:Lcom/android/dx/rop/cst/CstType;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_1
    sget-object p0, Lcom/android/dx/rop/cst/CstType;->LONG:Lcom/android/dx/rop/cst/CstType;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_2
    sget-object p0, Lcom/android/dx/rop/cst/CstType;->INTEGER:Lcom/android/dx/rop/cst/CstType;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_3
    sget-object p0, Lcom/android/dx/rop/cst/CstType;->FLOAT:Lcom/android/dx/rop/cst/CstType;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_4
    sget-object p0, Lcom/android/dx/rop/cst/CstType;->DOUBLE:Lcom/android/dx/rop/cst/CstType;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_5
    sget-object p0, Lcom/android/dx/rop/cst/CstType;->CHARACTER:Lcom/android/dx/rop/cst/CstType;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_6
    sget-object p0, Lcom/android/dx/rop/cst/CstType;->BYTE:Lcom/android/dx/rop/cst/CstType;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_7
    sget-object p0, Lcom/android/dx/rop/cst/CstType;->BOOLEAN:Lcom/android/dx/rop/cst/CstType;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_8
    sget-object p0, Lcom/android/dx/rop/cst/CstType;->VOID:Lcom/android/dx/rop/cst/CstType;

    .line 40
    .line 41
    return-object p0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
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

.method private static initInterns()V
    .locals 1

    .line 1
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->OBJECT:Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/android/dx/rop/cst/CstType;->internInitial(Lcom/android/dx/rop/cst/CstType;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->BOOLEAN:Lcom/android/dx/rop/cst/CstType;

    .line 7
    .line 8
    invoke-static {v0}, Lcom/android/dx/rop/cst/CstType;->internInitial(Lcom/android/dx/rop/cst/CstType;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->BYTE:Lcom/android/dx/rop/cst/CstType;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/android/dx/rop/cst/CstType;->internInitial(Lcom/android/dx/rop/cst/CstType;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->CHARACTER:Lcom/android/dx/rop/cst/CstType;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/android/dx/rop/cst/CstType;->internInitial(Lcom/android/dx/rop/cst/CstType;)V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->DOUBLE:Lcom/android/dx/rop/cst/CstType;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/android/dx/rop/cst/CstType;->internInitial(Lcom/android/dx/rop/cst/CstType;)V

    .line 24
    .line 25
    .line 26
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->FLOAT:Lcom/android/dx/rop/cst/CstType;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/android/dx/rop/cst/CstType;->internInitial(Lcom/android/dx/rop/cst/CstType;)V

    .line 29
    .line 30
    .line 31
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->LONG:Lcom/android/dx/rop/cst/CstType;

    .line 32
    .line 33
    invoke-static {v0}, Lcom/android/dx/rop/cst/CstType;->internInitial(Lcom/android/dx/rop/cst/CstType;)V

    .line 34
    .line 35
    .line 36
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->INTEGER:Lcom/android/dx/rop/cst/CstType;

    .line 37
    .line 38
    invoke-static {v0}, Lcom/android/dx/rop/cst/CstType;->internInitial(Lcom/android/dx/rop/cst/CstType;)V

    .line 39
    .line 40
    .line 41
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->SHORT:Lcom/android/dx/rop/cst/CstType;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/android/dx/rop/cst/CstType;->internInitial(Lcom/android/dx/rop/cst/CstType;)V

    .line 44
    .line 45
    .line 46
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->VOID:Lcom/android/dx/rop/cst/CstType;

    .line 47
    .line 48
    invoke-static {v0}, Lcom/android/dx/rop/cst/CstType;->internInitial(Lcom/android/dx/rop/cst/CstType;)V

    .line 49
    .line 50
    .line 51
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->BOOLEAN_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 52
    .line 53
    invoke-static {v0}, Lcom/android/dx/rop/cst/CstType;->internInitial(Lcom/android/dx/rop/cst/CstType;)V

    .line 54
    .line 55
    .line 56
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->BYTE_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 57
    .line 58
    invoke-static {v0}, Lcom/android/dx/rop/cst/CstType;->internInitial(Lcom/android/dx/rop/cst/CstType;)V

    .line 59
    .line 60
    .line 61
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->CHAR_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 62
    .line 63
    invoke-static {v0}, Lcom/android/dx/rop/cst/CstType;->internInitial(Lcom/android/dx/rop/cst/CstType;)V

    .line 64
    .line 65
    .line 66
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->DOUBLE_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 67
    .line 68
    invoke-static {v0}, Lcom/android/dx/rop/cst/CstType;->internInitial(Lcom/android/dx/rop/cst/CstType;)V

    .line 69
    .line 70
    .line 71
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->FLOAT_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 72
    .line 73
    invoke-static {v0}, Lcom/android/dx/rop/cst/CstType;->internInitial(Lcom/android/dx/rop/cst/CstType;)V

    .line 74
    .line 75
    .line 76
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->LONG_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 77
    .line 78
    invoke-static {v0}, Lcom/android/dx/rop/cst/CstType;->internInitial(Lcom/android/dx/rop/cst/CstType;)V

    .line 79
    .line 80
    .line 81
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->INT_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 82
    .line 83
    invoke-static {v0}, Lcom/android/dx/rop/cst/CstType;->internInitial(Lcom/android/dx/rop/cst/CstType;)V

    .line 84
    .line 85
    .line 86
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->SHORT_ARRAY:Lcom/android/dx/rop/cst/CstType;

    .line 87
    .line 88
    invoke-static {v0}, Lcom/android/dx/rop/cst/CstType;->internInitial(Lcom/android/dx/rop/cst/CstType;)V

    .line 89
    .line 90
    .line 91
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->METHOD_HANDLE:Lcom/android/dx/rop/cst/CstType;

    .line 92
    .line 93
    invoke-static {v0}, Lcom/android/dx/rop/cst/CstType;->internInitial(Lcom/android/dx/rop/cst/CstType;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public static intern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/cst/CstType;
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/android/dx/rop/cst/CstType;-><init>(Lcom/android/dx/rop/type/Type;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/android/dx/rop/cst/CstType;->interns:Ljava/util/concurrent/ConcurrentMap;

    .line 7
    .line 8
    invoke-interface {v1, p0, v0}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lcom/android/dx/rop/cst/CstType;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    return-object v0
.end method

.method private static internInitial(Lcom/android/dx/rop/cst/CstType;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/android/dx/rop/cst/CstType;->interns:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstType;->getClassType()Lcom/android/dx/rop/type/Type;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1, p0}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string v0, "Attempted re-init of "

    .line 15
    .line 16
    invoke-static {p0, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public compareTo0(Lcom/android/dx/rop/cst/Constant;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstType;->type:Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->getDescriptor()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p1, Lcom/android/dx/rop/cst/CstType;

    .line 8
    .line 9
    iget-object p1, p1, Lcom/android/dx/rop/cst/CstType;->type:Lcom/android/dx/rop/type/Type;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/android/dx/rop/type/Type;->getDescriptor()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstType;->type:Lcom/android/dx/rop/type/Type;

    .line 8
    .line 9
    check-cast p1, Lcom/android/dx/rop/cst/CstType;

    .line 10
    .line 11
    iget-object p1, p1, Lcom/android/dx/rop/cst/CstType;->type:Lcom/android/dx/rop/type/Type;

    .line 12
    .line 13
    if-ne p0, p1, :cond_1

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_1
    return v1
.end method

.method public getClassType()Lcom/android/dx/rop/type/Type;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstType;->type:Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDescriptor()Lcom/android/dx/rop/cst/CstString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/cst/CstType;->descriptor:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/android/dx/rop/cst/CstString;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/android/dx/rop/cst/CstType;->type:Lcom/android/dx/rop/type/Type;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Type;->getDescriptor()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/android/dx/rop/cst/CstType;->descriptor:Lcom/android/dx/rop/cst/CstString;

    .line 17
    .line 18
    :cond_0
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstType;->descriptor:Lcom/android/dx/rop/cst/CstString;

    .line 19
    .line 20
    return-object p0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstType;->getDescriptor()Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/16 v0, 0x2f

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/16 v2, 0x5b

    .line 16
    .line 17
    invoke-virtual {p0, v2}, Ljava/lang/String;->lastIndexOf(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, -0x1

    .line 22
    if-ne v1, v3, :cond_0

    .line 23
    .line 24
    const-string p0, "default"

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x2

    .line 28
    .line 29
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const/16 v1, 0x2e

    .line 34
    .line 35
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public getType()Lcom/android/dx/rop/type/Type;
    .locals 0

    .line 1
    sget-object p0, Lcom/android/dx/rop/type/Type;->CLASS:Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstType;->type:Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isCategory2()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstType;->type:Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "type{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/16 p0, 0x7d

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public typeName()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "type"

    .line 2
    .line 3
    return-object p0
.end method
