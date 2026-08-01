.class final enum Lcom/alibaba/fastjson2/JSONPathFilter$Operator;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/alibaba/fastjson2/JSONPathFilter$Operator;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

.field public static final enum AND:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

.field public static final enum BETWEEN:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

.field public static final enum CONTAINS:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

.field public static final enum ENDS_WITH:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

.field public static final enum EQ:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

.field public static final enum GE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

.field public static final enum GT:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

.field public static final enum IN:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

.field public static final enum LE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

.field public static final enum LIKE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

.field public static final enum LT:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

.field public static final enum NE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

.field public static final enum NOT_BETWEEN:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

.field public static final enum NOT_CONTAINS:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

.field public static final enum NOT_IN:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

.field public static final enum NOT_LIKE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

.field public static final enum NOT_RLIKE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

.field public static final enum OR:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

.field public static final enum REG_MATCH:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

.field public static final enum RLIKE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

.field public static final enum STARTS_WITH:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;


# direct methods
.method private static synthetic $values()[Lcom/alibaba/fastjson2/JSONPathFilter$Operator;
    .locals 22

    .line 1
    sget-object v1, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->EQ:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 2
    .line 3
    sget-object v2, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->NE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 4
    .line 5
    sget-object v3, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->GT:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 6
    .line 7
    sget-object v4, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->GE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 8
    .line 9
    sget-object v5, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->LT:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 10
    .line 11
    sget-object v6, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->LE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 12
    .line 13
    sget-object v7, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->LIKE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 14
    .line 15
    sget-object v8, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->NOT_LIKE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 16
    .line 17
    sget-object v9, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->RLIKE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 18
    .line 19
    sget-object v10, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->NOT_RLIKE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 20
    .line 21
    sget-object v11, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->IN:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 22
    .line 23
    sget-object v12, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->NOT_IN:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 24
    .line 25
    sget-object v13, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->BETWEEN:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 26
    .line 27
    sget-object v14, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->NOT_BETWEEN:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 28
    .line 29
    sget-object v15, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->AND:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 30
    .line 31
    sget-object v16, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->OR:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 32
    .line 33
    sget-object v17, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->REG_MATCH:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 34
    .line 35
    sget-object v18, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->STARTS_WITH:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 36
    .line 37
    sget-object v19, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->ENDS_WITH:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 38
    .line 39
    sget-object v20, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->CONTAINS:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 40
    .line 41
    sget-object v21, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->NOT_CONTAINS:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 42
    .line 43
    filled-new-array/range {v1 .. v21}, [Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 2
    .line 3
    const-string v1, "EQ"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->EQ:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 10
    .line 11
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 12
    .line 13
    const-string v1, "NE"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->NE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 20
    .line 21
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 22
    .line 23
    const-string v1, "GT"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->GT:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 30
    .line 31
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 32
    .line 33
    const-string v1, "GE"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->GE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 40
    .line 41
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 42
    .line 43
    const-string v1, "LT"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->LT:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 50
    .line 51
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 52
    .line 53
    const-string v1, "LE"

    .line 54
    .line 55
    const/4 v2, 0x5

    .line 56
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->LE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 60
    .line 61
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 62
    .line 63
    const-string v1, "LIKE"

    .line 64
    .line 65
    const/4 v2, 0x6

    .line 66
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    sput-object v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->LIKE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 70
    .line 71
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 72
    .line 73
    const-string v1, "NOT_LIKE"

    .line 74
    .line 75
    const/4 v2, 0x7

    .line 76
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;-><init>(Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    sput-object v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->NOT_LIKE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 80
    .line 81
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 82
    .line 83
    const-string v1, "RLIKE"

    .line 84
    .line 85
    const/16 v2, 0x8

    .line 86
    .line 87
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;-><init>(Ljava/lang/String;I)V

    .line 88
    .line 89
    .line 90
    sput-object v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->RLIKE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 91
    .line 92
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 93
    .line 94
    const-string v1, "NOT_RLIKE"

    .line 95
    .line 96
    const/16 v2, 0x9

    .line 97
    .line 98
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;-><init>(Ljava/lang/String;I)V

    .line 99
    .line 100
    .line 101
    sput-object v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->NOT_RLIKE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 102
    .line 103
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 104
    .line 105
    const-string v1, "IN"

    .line 106
    .line 107
    const/16 v2, 0xa

    .line 108
    .line 109
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;-><init>(Ljava/lang/String;I)V

    .line 110
    .line 111
    .line 112
    sput-object v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->IN:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 113
    .line 114
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 115
    .line 116
    const-string v1, "NOT_IN"

    .line 117
    .line 118
    const/16 v2, 0xb

    .line 119
    .line 120
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;-><init>(Ljava/lang/String;I)V

    .line 121
    .line 122
    .line 123
    sput-object v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->NOT_IN:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 124
    .line 125
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 126
    .line 127
    const-string v1, "BETWEEN"

    .line 128
    .line 129
    const/16 v2, 0xc

    .line 130
    .line 131
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;-><init>(Ljava/lang/String;I)V

    .line 132
    .line 133
    .line 134
    sput-object v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->BETWEEN:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 135
    .line 136
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 137
    .line 138
    const-string v1, "NOT_BETWEEN"

    .line 139
    .line 140
    const/16 v2, 0xd

    .line 141
    .line 142
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;-><init>(Ljava/lang/String;I)V

    .line 143
    .line 144
    .line 145
    sput-object v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->NOT_BETWEEN:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 146
    .line 147
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 148
    .line 149
    const-string v1, "AND"

    .line 150
    .line 151
    const/16 v2, 0xe

    .line 152
    .line 153
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;-><init>(Ljava/lang/String;I)V

    .line 154
    .line 155
    .line 156
    sput-object v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->AND:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 157
    .line 158
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 159
    .line 160
    const-string v1, "OR"

    .line 161
    .line 162
    const/16 v2, 0xf

    .line 163
    .line 164
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;-><init>(Ljava/lang/String;I)V

    .line 165
    .line 166
    .line 167
    sput-object v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->OR:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 168
    .line 169
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 170
    .line 171
    const-string v1, "REG_MATCH"

    .line 172
    .line 173
    const/16 v2, 0x10

    .line 174
    .line 175
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;-><init>(Ljava/lang/String;I)V

    .line 176
    .line 177
    .line 178
    sput-object v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->REG_MATCH:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 179
    .line 180
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 181
    .line 182
    const-string v1, "STARTS_WITH"

    .line 183
    .line 184
    const/16 v2, 0x11

    .line 185
    .line 186
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;-><init>(Ljava/lang/String;I)V

    .line 187
    .line 188
    .line 189
    sput-object v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->STARTS_WITH:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 190
    .line 191
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 192
    .line 193
    const-string v1, "ENDS_WITH"

    .line 194
    .line 195
    const/16 v2, 0x12

    .line 196
    .line 197
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;-><init>(Ljava/lang/String;I)V

    .line 198
    .line 199
    .line 200
    sput-object v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->ENDS_WITH:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 201
    .line 202
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 203
    .line 204
    const-string v1, "CONTAINS"

    .line 205
    .line 206
    const/16 v2, 0x13

    .line 207
    .line 208
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;-><init>(Ljava/lang/String;I)V

    .line 209
    .line 210
    .line 211
    sput-object v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->CONTAINS:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 212
    .line 213
    new-instance v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 214
    .line 215
    const-string v1, "NOT_CONTAINS"

    .line 216
    .line 217
    const/16 v2, 0x14

    .line 218
    .line 219
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;-><init>(Ljava/lang/String;I)V

    .line 220
    .line 221
    .line 222
    sput-object v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->NOT_CONTAINS:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 223
    .line 224
    invoke-static {}, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->$values()[Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    sput-object v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->$VALUES:[Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 229
    .line 230
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPathFilter$Operator;
    .locals 1

    .line 1
    const-class v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/alibaba/fastjson2/JSONPathFilter$Operator;
    .locals 1

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->$VALUES:[Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_1
    const-string p0, "not contains"

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_2
    const-string p0, "contains"

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_3
    const-string p0, "ends with"

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_4
    const-string p0, "starts with"

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_5
    const-string p0, "or"

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_6
    const-string p0, "and"

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_7
    const-string p0, "not between"

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_8
    const-string p0, "between"

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_9
    const-string p0, "not rlike"

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_a
    const-string p0, "rlike"

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_b
    const-string p0, "not like"

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_c
    const-string p0, "like"

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_d
    const-string p0, "<="

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_e
    const-string p0, "<"

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_f
    const-string p0, ">="

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_10
    const-string p0, ">"

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_11
    const-string p0, "!="

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_12
    const-string p0, "=="

    .line 65
    .line 66
    return-object p0

    .line 67
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
        :pswitch_0
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
