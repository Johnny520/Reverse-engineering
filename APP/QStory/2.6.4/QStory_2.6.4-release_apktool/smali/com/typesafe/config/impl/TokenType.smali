.class final enum Lcom/typesafe/config/impl/TokenType;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/typesafe/config/impl/TokenType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/typesafe/config/impl/TokenType;

.field public static final enum CLOSE_CURLY:Lcom/typesafe/config/impl/TokenType;

.field public static final enum CLOSE_SQUARE:Lcom/typesafe/config/impl/TokenType;

.field public static final enum COLON:Lcom/typesafe/config/impl/TokenType;

.field public static final enum COMMA:Lcom/typesafe/config/impl/TokenType;

.field public static final enum COMMENT:Lcom/typesafe/config/impl/TokenType;

.field public static final enum END:Lcom/typesafe/config/impl/TokenType;

.field public static final enum EQUALS:Lcom/typesafe/config/impl/TokenType;

.field public static final enum IGNORED_WHITESPACE:Lcom/typesafe/config/impl/TokenType;

.field public static final enum NEWLINE:Lcom/typesafe/config/impl/TokenType;

.field public static final enum OPEN_CURLY:Lcom/typesafe/config/impl/TokenType;

.field public static final enum OPEN_SQUARE:Lcom/typesafe/config/impl/TokenType;

.field public static final enum PLUS_EQUALS:Lcom/typesafe/config/impl/TokenType;

.field public static final enum PROBLEM:Lcom/typesafe/config/impl/TokenType;

.field public static final enum START:Lcom/typesafe/config/impl/TokenType;

.field public static final enum SUBSTITUTION:Lcom/typesafe/config/impl/TokenType;

.field public static final enum UNQUOTED_TEXT:Lcom/typesafe/config/impl/TokenType;

.field public static final enum VALUE:Lcom/typesafe/config/impl/TokenType;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    new-instance v1, Lcom/typesafe/config/impl/TokenType;

    .line 2
    .line 3
    const-string v0, "START"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v0, v2}, Lcom/typesafe/config/impl/TokenType;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v1, Lcom/typesafe/config/impl/TokenType;->START:Lcom/typesafe/config/impl/TokenType;

    .line 10
    .line 11
    new-instance v2, Lcom/typesafe/config/impl/TokenType;

    .line 12
    .line 13
    const-string v0, "END"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, v0, v3}, Lcom/typesafe/config/impl/TokenType;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v2, Lcom/typesafe/config/impl/TokenType;->END:Lcom/typesafe/config/impl/TokenType;

    .line 20
    .line 21
    new-instance v3, Lcom/typesafe/config/impl/TokenType;

    .line 22
    .line 23
    const-string v0, "COMMA"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v3, v0, v4}, Lcom/typesafe/config/impl/TokenType;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lcom/typesafe/config/impl/TokenType;->COMMA:Lcom/typesafe/config/impl/TokenType;

    .line 30
    .line 31
    new-instance v4, Lcom/typesafe/config/impl/TokenType;

    .line 32
    .line 33
    const-string v0, "EQUALS"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v4, v0, v5}, Lcom/typesafe/config/impl/TokenType;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v4, Lcom/typesafe/config/impl/TokenType;->EQUALS:Lcom/typesafe/config/impl/TokenType;

    .line 40
    .line 41
    new-instance v5, Lcom/typesafe/config/impl/TokenType;

    .line 42
    .line 43
    const-string v0, "COLON"

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    invoke-direct {v5, v0, v6}, Lcom/typesafe/config/impl/TokenType;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v5, Lcom/typesafe/config/impl/TokenType;->COLON:Lcom/typesafe/config/impl/TokenType;

    .line 50
    .line 51
    new-instance v6, Lcom/typesafe/config/impl/TokenType;

    .line 52
    .line 53
    const-string v0, "OPEN_CURLY"

    .line 54
    .line 55
    const/4 v7, 0x5

    .line 56
    invoke-direct {v6, v0, v7}, Lcom/typesafe/config/impl/TokenType;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v6, Lcom/typesafe/config/impl/TokenType;->OPEN_CURLY:Lcom/typesafe/config/impl/TokenType;

    .line 60
    .line 61
    new-instance v7, Lcom/typesafe/config/impl/TokenType;

    .line 62
    .line 63
    const-string v0, "CLOSE_CURLY"

    .line 64
    .line 65
    const/4 v8, 0x6

    .line 66
    invoke-direct {v7, v0, v8}, Lcom/typesafe/config/impl/TokenType;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    sput-object v7, Lcom/typesafe/config/impl/TokenType;->CLOSE_CURLY:Lcom/typesafe/config/impl/TokenType;

    .line 70
    .line 71
    new-instance v8, Lcom/typesafe/config/impl/TokenType;

    .line 72
    .line 73
    const-string v0, "OPEN_SQUARE"

    .line 74
    .line 75
    const/4 v9, 0x7

    .line 76
    invoke-direct {v8, v0, v9}, Lcom/typesafe/config/impl/TokenType;-><init>(Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    sput-object v8, Lcom/typesafe/config/impl/TokenType;->OPEN_SQUARE:Lcom/typesafe/config/impl/TokenType;

    .line 80
    .line 81
    new-instance v9, Lcom/typesafe/config/impl/TokenType;

    .line 82
    .line 83
    const-string v0, "CLOSE_SQUARE"

    .line 84
    .line 85
    const/16 v10, 0x8

    .line 86
    .line 87
    invoke-direct {v9, v0, v10}, Lcom/typesafe/config/impl/TokenType;-><init>(Ljava/lang/String;I)V

    .line 88
    .line 89
    .line 90
    sput-object v9, Lcom/typesafe/config/impl/TokenType;->CLOSE_SQUARE:Lcom/typesafe/config/impl/TokenType;

    .line 91
    .line 92
    new-instance v10, Lcom/typesafe/config/impl/TokenType;

    .line 93
    .line 94
    const-string v0, "VALUE"

    .line 95
    .line 96
    const/16 v11, 0x9

    .line 97
    .line 98
    invoke-direct {v10, v0, v11}, Lcom/typesafe/config/impl/TokenType;-><init>(Ljava/lang/String;I)V

    .line 99
    .line 100
    .line 101
    sput-object v10, Lcom/typesafe/config/impl/TokenType;->VALUE:Lcom/typesafe/config/impl/TokenType;

    .line 102
    .line 103
    new-instance v11, Lcom/typesafe/config/impl/TokenType;

    .line 104
    .line 105
    const-string v0, "NEWLINE"

    .line 106
    .line 107
    const/16 v12, 0xa

    .line 108
    .line 109
    invoke-direct {v11, v0, v12}, Lcom/typesafe/config/impl/TokenType;-><init>(Ljava/lang/String;I)V

    .line 110
    .line 111
    .line 112
    sput-object v11, Lcom/typesafe/config/impl/TokenType;->NEWLINE:Lcom/typesafe/config/impl/TokenType;

    .line 113
    .line 114
    new-instance v12, Lcom/typesafe/config/impl/TokenType;

    .line 115
    .line 116
    const-string v0, "UNQUOTED_TEXT"

    .line 117
    .line 118
    const/16 v13, 0xb

    .line 119
    .line 120
    invoke-direct {v12, v0, v13}, Lcom/typesafe/config/impl/TokenType;-><init>(Ljava/lang/String;I)V

    .line 121
    .line 122
    .line 123
    sput-object v12, Lcom/typesafe/config/impl/TokenType;->UNQUOTED_TEXT:Lcom/typesafe/config/impl/TokenType;

    .line 124
    .line 125
    new-instance v13, Lcom/typesafe/config/impl/TokenType;

    .line 126
    .line 127
    const-string v0, "IGNORED_WHITESPACE"

    .line 128
    .line 129
    const/16 v14, 0xc

    .line 130
    .line 131
    invoke-direct {v13, v0, v14}, Lcom/typesafe/config/impl/TokenType;-><init>(Ljava/lang/String;I)V

    .line 132
    .line 133
    .line 134
    sput-object v13, Lcom/typesafe/config/impl/TokenType;->IGNORED_WHITESPACE:Lcom/typesafe/config/impl/TokenType;

    .line 135
    .line 136
    new-instance v14, Lcom/typesafe/config/impl/TokenType;

    .line 137
    .line 138
    const-string v0, "SUBSTITUTION"

    .line 139
    .line 140
    const/16 v15, 0xd

    .line 141
    .line 142
    invoke-direct {v14, v0, v15}, Lcom/typesafe/config/impl/TokenType;-><init>(Ljava/lang/String;I)V

    .line 143
    .line 144
    .line 145
    sput-object v14, Lcom/typesafe/config/impl/TokenType;->SUBSTITUTION:Lcom/typesafe/config/impl/TokenType;

    .line 146
    .line 147
    new-instance v15, Lcom/typesafe/config/impl/TokenType;

    .line 148
    .line 149
    const-string v0, "PROBLEM"

    .line 150
    .line 151
    move-object/from16 v16, v1

    .line 152
    .line 153
    const/16 v1, 0xe

    .line 154
    .line 155
    invoke-direct {v15, v0, v1}, Lcom/typesafe/config/impl/TokenType;-><init>(Ljava/lang/String;I)V

    .line 156
    .line 157
    .line 158
    sput-object v15, Lcom/typesafe/config/impl/TokenType;->PROBLEM:Lcom/typesafe/config/impl/TokenType;

    .line 159
    .line 160
    new-instance v0, Lcom/typesafe/config/impl/TokenType;

    .line 161
    .line 162
    const-string v1, "COMMENT"

    .line 163
    .line 164
    move-object/from16 v17, v2

    .line 165
    .line 166
    const/16 v2, 0xf

    .line 167
    .line 168
    invoke-direct {v0, v1, v2}, Lcom/typesafe/config/impl/TokenType;-><init>(Ljava/lang/String;I)V

    .line 169
    .line 170
    .line 171
    sput-object v0, Lcom/typesafe/config/impl/TokenType;->COMMENT:Lcom/typesafe/config/impl/TokenType;

    .line 172
    .line 173
    new-instance v1, Lcom/typesafe/config/impl/TokenType;

    .line 174
    .line 175
    const-string v2, "PLUS_EQUALS"

    .line 176
    .line 177
    move-object/from16 v18, v0

    .line 178
    .line 179
    const/16 v0, 0x10

    .line 180
    .line 181
    invoke-direct {v1, v2, v0}, Lcom/typesafe/config/impl/TokenType;-><init>(Ljava/lang/String;I)V

    .line 182
    .line 183
    .line 184
    sput-object v1, Lcom/typesafe/config/impl/TokenType;->PLUS_EQUALS:Lcom/typesafe/config/impl/TokenType;

    .line 185
    .line 186
    move-object/from16 v2, v17

    .line 187
    .line 188
    move-object/from16 v17, v1

    .line 189
    .line 190
    move-object/from16 v1, v16

    .line 191
    .line 192
    move-object/from16 v16, v18

    .line 193
    .line 194
    filled-new-array/range {v1 .. v17}, [Lcom/typesafe/config/impl/TokenType;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    sput-object v0, Lcom/typesafe/config/impl/TokenType;->$VALUES:[Lcom/typesafe/config/impl/TokenType;

    .line 199
    .line 200
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

.method public static valueOf(Ljava/lang/String;)Lcom/typesafe/config/impl/TokenType;
    .locals 1

    .line 1
    const-class v0, Lcom/typesafe/config/impl/TokenType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/typesafe/config/impl/TokenType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/typesafe/config/impl/TokenType;
    .locals 1

    .line 1
    sget-object v0, Lcom/typesafe/config/impl/TokenType;->$VALUES:[Lcom/typesafe/config/impl/TokenType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/typesafe/config/impl/TokenType;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/typesafe/config/impl/TokenType;

    .line 8
    .line 9
    return-object v0
.end method
