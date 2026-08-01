.class public abstract enum Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/HashCodeMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "ValueTransformer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;",
        ">;",
        "Lnet/bytebuddy/implementation/bytecode/StackManipulation;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

.field public static final enum BOOLEAN_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

.field public static final enum BYTE_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

.field public static final enum CHARACTER_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

.field public static final enum DOUBLE:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

.field public static final enum DOUBLE_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

.field public static final enum FLOAT:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

.field public static final enum FLOAT_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

.field public static final enum INTEGER_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

.field public static final enum LONG:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

.field public static final enum LONG_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

.field public static final enum NESTED_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

.field public static final enum REFERENCE_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

.field public static final enum REFERENCE_IDENTITY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

.field public static final enum SHORT_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;


# direct methods
.method static constructor <clinit>()V
    .locals 29

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$1;

    .line 2
    .line 3
    const-string v1, "LONG"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$1;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->LONG:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 10
    .line 11
    new-instance v1, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$2;

    .line 12
    .line 13
    const-string v3, "FLOAT"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$2;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->FLOAT:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 20
    .line 21
    new-instance v3, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$3;

    .line 22
    .line 23
    const-string v5, "DOUBLE"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$3;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->DOUBLE:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 30
    .line 31
    new-instance v5, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$4;

    .line 32
    .line 33
    const-string v7, "BOOLEAN_ARRAY"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$4;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->BOOLEAN_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 40
    .line 41
    new-instance v7, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$5;

    .line 42
    .line 43
    const-string v9, "BYTE_ARRAY"

    .line 44
    .line 45
    const/4 v10, 0x4

    .line 46
    invoke-direct {v7, v9, v10}, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$5;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v7, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->BYTE_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 50
    .line 51
    new-instance v9, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$6;

    .line 52
    .line 53
    const-string v11, "SHORT_ARRAY"

    .line 54
    .line 55
    const/4 v12, 0x5

    .line 56
    invoke-direct {v9, v11, v12}, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$6;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v9, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->SHORT_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 60
    .line 61
    new-instance v11, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$7;

    .line 62
    .line 63
    const-string v13, "CHARACTER_ARRAY"

    .line 64
    .line 65
    const/4 v14, 0x6

    .line 66
    invoke-direct {v11, v13, v14}, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$7;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    sput-object v11, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->CHARACTER_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 70
    .line 71
    new-instance v13, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$8;

    .line 72
    .line 73
    const-string v15, "INTEGER_ARRAY"

    .line 74
    .line 75
    move/from16 v16, v2

    .line 76
    .line 77
    const/4 v2, 0x7

    .line 78
    invoke-direct {v13, v15, v2}, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$8;-><init>(Ljava/lang/String;I)V

    .line 79
    .line 80
    .line 81
    sput-object v13, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->INTEGER_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 82
    .line 83
    new-instance v15, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$9;

    .line 84
    .line 85
    move/from16 v17, v2

    .line 86
    .line 87
    const-string v2, "LONG_ARRAY"

    .line 88
    .line 89
    move/from16 v18, v4

    .line 90
    .line 91
    const/16 v4, 0x8

    .line 92
    .line 93
    invoke-direct {v15, v2, v4}, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$9;-><init>(Ljava/lang/String;I)V

    .line 94
    .line 95
    .line 96
    sput-object v15, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->LONG_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 97
    .line 98
    new-instance v2, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$10;

    .line 99
    .line 100
    move/from16 v19, v4

    .line 101
    .line 102
    const-string v4, "FLOAT_ARRAY"

    .line 103
    .line 104
    move/from16 v20, v6

    .line 105
    .line 106
    const/16 v6, 0x9

    .line 107
    .line 108
    invoke-direct {v2, v4, v6}, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$10;-><init>(Ljava/lang/String;I)V

    .line 109
    .line 110
    .line 111
    sput-object v2, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->FLOAT_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 112
    .line 113
    new-instance v4, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$11;

    .line 114
    .line 115
    move/from16 v21, v6

    .line 116
    .line 117
    const-string v6, "DOUBLE_ARRAY"

    .line 118
    .line 119
    move/from16 v22, v8

    .line 120
    .line 121
    const/16 v8, 0xa

    .line 122
    .line 123
    invoke-direct {v4, v6, v8}, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$11;-><init>(Ljava/lang/String;I)V

    .line 124
    .line 125
    .line 126
    sput-object v4, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->DOUBLE_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 127
    .line 128
    new-instance v6, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$12;

    .line 129
    .line 130
    move/from16 v23, v8

    .line 131
    .line 132
    const-string v8, "REFERENCE_ARRAY"

    .line 133
    .line 134
    move/from16 v24, v10

    .line 135
    .line 136
    const/16 v10, 0xb

    .line 137
    .line 138
    invoke-direct {v6, v8, v10}, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$12;-><init>(Ljava/lang/String;I)V

    .line 139
    .line 140
    .line 141
    sput-object v6, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->REFERENCE_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 142
    .line 143
    new-instance v8, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$13;

    .line 144
    .line 145
    move/from16 v25, v10

    .line 146
    .line 147
    const-string v10, "NESTED_ARRAY"

    .line 148
    .line 149
    move/from16 v26, v12

    .line 150
    .line 151
    const/16 v12, 0xc

    .line 152
    .line 153
    invoke-direct {v8, v10, v12}, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$13;-><init>(Ljava/lang/String;I)V

    .line 154
    .line 155
    .line 156
    sput-object v8, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->NESTED_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 157
    .line 158
    new-instance v10, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$14;

    .line 159
    .line 160
    move/from16 v27, v12

    .line 161
    .line 162
    const-string v12, "REFERENCE_IDENTITY"

    .line 163
    .line 164
    move/from16 v28, v14

    .line 165
    .line 166
    const/16 v14, 0xd

    .line 167
    .line 168
    invoke-direct {v10, v12, v14}, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer$14;-><init>(Ljava/lang/String;I)V

    .line 169
    .line 170
    .line 171
    sput-object v10, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->REFERENCE_IDENTITY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 172
    .line 173
    const/16 v12, 0xe

    .line 174
    .line 175
    new-array v12, v12, [Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 176
    .line 177
    aput-object v0, v12, v16

    .line 178
    .line 179
    aput-object v1, v12, v18

    .line 180
    .line 181
    aput-object v3, v12, v20

    .line 182
    .line 183
    aput-object v5, v12, v22

    .line 184
    .line 185
    aput-object v7, v12, v24

    .line 186
    .line 187
    aput-object v9, v12, v26

    .line 188
    .line 189
    aput-object v11, v12, v28

    .line 190
    .line 191
    aput-object v13, v12, v17

    .line 192
    .line 193
    aput-object v15, v12, v19

    .line 194
    .line 195
    aput-object v2, v12, v21

    .line 196
    .line 197
    aput-object v4, v12, v23

    .line 198
    .line 199
    aput-object v6, v12, v25

    .line 200
    .line 201
    aput-object v8, v12, v27

    .line 202
    .line 203
    aput-object v10, v12, v14

    .line 204
    .line 205
    sput-object v12, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->$VALUES:[Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 206
    .line 207
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

.method public synthetic constructor <init>(Ljava/lang/String;ILnet/bytebuddy/implementation/HashCodeMethod$1;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_e

    .line 8
    .line 9
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_e

    .line 16
    .line 17
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_e

    .line 24
    .line 25
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_e

    .line 32
    .line 33
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    :cond_0
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    sget-object p0, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->LONG:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_1
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 55
    .line 56
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    sget-object p0, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->FLOAT:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 63
    .line 64
    return-object p0

    .line 65
    :cond_2
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 66
    .line 67
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    sget-object p0, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->DOUBLE:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_3
    const-class v0, [Z

    .line 77
    .line 78
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    sget-object p0, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->BOOLEAN_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 85
    .line 86
    return-object p0

    .line 87
    :cond_4
    const-class v0, [B

    .line 88
    .line 89
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_5

    .line 94
    .line 95
    sget-object p0, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->BYTE_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 96
    .line 97
    return-object p0

    .line 98
    :cond_5
    const-class v0, [S

    .line 99
    .line 100
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_6

    .line 105
    .line 106
    sget-object p0, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->SHORT_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 107
    .line 108
    return-object p0

    .line 109
    :cond_6
    const-class v0, [C

    .line 110
    .line 111
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_7

    .line 116
    .line 117
    sget-object p0, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->CHARACTER_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 118
    .line 119
    return-object p0

    .line 120
    :cond_7
    const-class v0, [I

    .line 121
    .line 122
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_8

    .line 127
    .line 128
    sget-object p0, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->INTEGER_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 129
    .line 130
    return-object p0

    .line 131
    :cond_8
    const-class v0, [J

    .line 132
    .line 133
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_9

    .line 138
    .line 139
    sget-object p0, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->LONG_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 140
    .line 141
    return-object p0

    .line 142
    :cond_9
    const-class v0, [F

    .line 143
    .line 144
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_a

    .line 149
    .line 150
    sget-object p0, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->FLOAT_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 151
    .line 152
    return-object p0

    .line 153
    :cond_a
    const-class v0, [D

    .line 154
    .line 155
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_b

    .line 160
    .line 161
    sget-object p0, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->DOUBLE_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 162
    .line 163
    return-object p0

    .line 164
    :cond_b
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_d

    .line 169
    .line 170
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->getComponentType()Lnet/bytebuddy/description/type/TypeDefinition;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 175
    .line 176
    .line 177
    move-result p0

    .line 178
    if-eqz p0, :cond_c

    .line 179
    .line 180
    sget-object p0, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->NESTED_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 181
    .line 182
    return-object p0

    .line 183
    :cond_c
    sget-object p0, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->REFERENCE_ARRAY:Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 184
    .line 185
    return-object p0

    .line 186
    :cond_d
    invoke-static {}, Lnet/bytebuddy/implementation/HashCodeMethod;->access$000()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-interface {v0, p0}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;->virtual(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    return-object p0

    .line 203
    :cond_e
    :goto_0
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;

    .line 204
    .line 205
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->$VALUES:[Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/HashCodeMethod$ValueTransformer;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public isValid()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
