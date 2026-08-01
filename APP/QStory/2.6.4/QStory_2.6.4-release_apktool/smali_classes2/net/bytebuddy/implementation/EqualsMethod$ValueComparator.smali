.class public abstract enum Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/EqualsMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "ValueComparator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;",
        ">;",
        "Lnet/bytebuddy/implementation/bytecode/StackManipulation;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

.field public static final enum BOOLEAN_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

.field public static final enum BYTE_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

.field public static final enum CHARACTER_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

.field public static final enum DOUBLE:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

.field public static final enum DOUBLE_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

.field public static final enum FLOAT:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

.field public static final enum FLOAT_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

.field public static final enum INTEGER_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

.field public static final enum LONG:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

.field public static final enum LONG_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

.field public static final enum NESTED_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

.field public static final enum REFERENCE_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

.field public static final enum SHORT_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;


# direct methods
.method static constructor <clinit>()V
    .locals 27

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$1;

    .line 2
    .line 3
    const-string v1, "LONG"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$1;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->LONG:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 10
    .line 11
    new-instance v1, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$2;

    .line 12
    .line 13
    const-string v3, "FLOAT"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$2;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->FLOAT:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 20
    .line 21
    new-instance v3, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$3;

    .line 22
    .line 23
    const-string v5, "DOUBLE"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$3;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->DOUBLE:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 30
    .line 31
    new-instance v5, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$4;

    .line 32
    .line 33
    const-string v7, "BOOLEAN_ARRAY"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$4;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->BOOLEAN_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 40
    .line 41
    new-instance v7, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$5;

    .line 42
    .line 43
    const-string v9, "BYTE_ARRAY"

    .line 44
    .line 45
    const/4 v10, 0x4

    .line 46
    invoke-direct {v7, v9, v10}, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$5;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v7, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->BYTE_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 50
    .line 51
    new-instance v9, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$6;

    .line 52
    .line 53
    const-string v11, "SHORT_ARRAY"

    .line 54
    .line 55
    const/4 v12, 0x5

    .line 56
    invoke-direct {v9, v11, v12}, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$6;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v9, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->SHORT_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 60
    .line 61
    new-instance v11, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$7;

    .line 62
    .line 63
    const-string v13, "CHARACTER_ARRAY"

    .line 64
    .line 65
    const/4 v14, 0x6

    .line 66
    invoke-direct {v11, v13, v14}, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$7;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    sput-object v11, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->CHARACTER_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 70
    .line 71
    new-instance v13, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$8;

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
    invoke-direct {v13, v15, v2}, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$8;-><init>(Ljava/lang/String;I)V

    .line 79
    .line 80
    .line 81
    sput-object v13, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->INTEGER_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 82
    .line 83
    new-instance v15, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$9;

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
    invoke-direct {v15, v2, v4}, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$9;-><init>(Ljava/lang/String;I)V

    .line 94
    .line 95
    .line 96
    sput-object v15, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->LONG_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 97
    .line 98
    new-instance v2, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$10;

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
    invoke-direct {v2, v4, v6}, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$10;-><init>(Ljava/lang/String;I)V

    .line 109
    .line 110
    .line 111
    sput-object v2, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->FLOAT_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 112
    .line 113
    new-instance v4, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$11;

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
    invoke-direct {v4, v6, v8}, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$11;-><init>(Ljava/lang/String;I)V

    .line 124
    .line 125
    .line 126
    sput-object v4, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->DOUBLE_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 127
    .line 128
    new-instance v6, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$12;

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
    invoke-direct {v6, v8, v10}, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$12;-><init>(Ljava/lang/String;I)V

    .line 139
    .line 140
    .line 141
    sput-object v6, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->REFERENCE_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 142
    .line 143
    new-instance v8, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$13;

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
    invoke-direct {v8, v10, v12}, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator$13;-><init>(Ljava/lang/String;I)V

    .line 154
    .line 155
    .line 156
    sput-object v8, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->NESTED_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 157
    .line 158
    const/16 v10, 0xd

    .line 159
    .line 160
    new-array v10, v10, [Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 161
    .line 162
    aput-object v0, v10, v16

    .line 163
    .line 164
    aput-object v1, v10, v18

    .line 165
    .line 166
    aput-object v3, v10, v20

    .line 167
    .line 168
    aput-object v5, v10, v22

    .line 169
    .line 170
    aput-object v7, v10, v24

    .line 171
    .line 172
    aput-object v9, v10, v26

    .line 173
    .line 174
    aput-object v11, v10, v14

    .line 175
    .line 176
    aput-object v13, v10, v17

    .line 177
    .line 178
    aput-object v15, v10, v19

    .line 179
    .line 180
    aput-object v2, v10, v21

    .line 181
    .line 182
    aput-object v4, v10, v23

    .line 183
    .line 184
    aput-object v6, v10, v25

    .line 185
    .line 186
    aput-object v8, v10, v12

    .line 187
    .line 188
    sput-object v10, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->$VALUES:[Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 189
    .line 190
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

.method public synthetic constructor <init>(Ljava/lang/String;ILnet/bytebuddy/implementation/EqualsMethod$1;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 5

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
    goto/16 :goto_1

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
    const/4 v1, 0x1

    .line 50
    const/4 v2, 0x0

    .line 51
    const/4 v3, 0x2

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 55
    .line 56
    invoke-static {}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->onNonZeroInteger()Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    new-array v3, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 61
    .line 62
    sget-object v4, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->LONG:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 63
    .line 64
    aput-object v4, v3, v2

    .line 65
    .line 66
    aput-object v0, v3, v1

    .line 67
    .line 68
    invoke-direct {p0, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 69
    .line 70
    .line 71
    return-object p0

    .line 72
    :cond_1
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 73
    .line 74
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 81
    .line 82
    invoke-static {}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->onNonZeroInteger()Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    new-array v3, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 87
    .line 88
    sget-object v4, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->FLOAT:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 89
    .line 90
    aput-object v4, v3, v2

    .line 91
    .line 92
    aput-object v0, v3, v1

    .line 93
    .line 94
    invoke-direct {p0, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 95
    .line 96
    .line 97
    return-object p0

    .line 98
    :cond_2
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 99
    .line 100
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_3

    .line 105
    .line 106
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 107
    .line 108
    invoke-static {}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->onNonZeroInteger()Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    new-array v3, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 113
    .line 114
    sget-object v4, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->DOUBLE:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 115
    .line 116
    aput-object v4, v3, v2

    .line 117
    .line 118
    aput-object v0, v3, v1

    .line 119
    .line 120
    invoke-direct {p0, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 121
    .line 122
    .line 123
    return-object p0

    .line 124
    :cond_3
    const-class v0, [Z

    .line 125
    .line 126
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-eqz v0, :cond_4

    .line 131
    .line 132
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 133
    .line 134
    invoke-static {}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->onZeroInteger()Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    new-array v3, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 139
    .line 140
    sget-object v4, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->BOOLEAN_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 141
    .line 142
    aput-object v4, v3, v2

    .line 143
    .line 144
    aput-object v0, v3, v1

    .line 145
    .line 146
    invoke-direct {p0, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 147
    .line 148
    .line 149
    return-object p0

    .line 150
    :cond_4
    const-class v0, [B

    .line 151
    .line 152
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_5

    .line 157
    .line 158
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 159
    .line 160
    invoke-static {}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->onZeroInteger()Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    new-array v3, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 165
    .line 166
    sget-object v4, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->BYTE_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 167
    .line 168
    aput-object v4, v3, v2

    .line 169
    .line 170
    aput-object v0, v3, v1

    .line 171
    .line 172
    invoke-direct {p0, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 173
    .line 174
    .line 175
    return-object p0

    .line 176
    :cond_5
    const-class v0, [S

    .line 177
    .line 178
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-eqz v0, :cond_6

    .line 183
    .line 184
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 185
    .line 186
    invoke-static {}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->onZeroInteger()Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    new-array v3, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 191
    .line 192
    sget-object v4, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->SHORT_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 193
    .line 194
    aput-object v4, v3, v2

    .line 195
    .line 196
    aput-object v0, v3, v1

    .line 197
    .line 198
    invoke-direct {p0, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 199
    .line 200
    .line 201
    return-object p0

    .line 202
    :cond_6
    const-class v0, [C

    .line 203
    .line 204
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-eqz v0, :cond_7

    .line 209
    .line 210
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 211
    .line 212
    invoke-static {}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->onZeroInteger()Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    new-array v3, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 217
    .line 218
    sget-object v4, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->CHARACTER_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 219
    .line 220
    aput-object v4, v3, v2

    .line 221
    .line 222
    aput-object v0, v3, v1

    .line 223
    .line 224
    invoke-direct {p0, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 225
    .line 226
    .line 227
    return-object p0

    .line 228
    :cond_7
    const-class v0, [I

    .line 229
    .line 230
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_8

    .line 235
    .line 236
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 237
    .line 238
    invoke-static {}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->onZeroInteger()Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    new-array v3, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 243
    .line 244
    sget-object v4, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->INTEGER_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 245
    .line 246
    aput-object v4, v3, v2

    .line 247
    .line 248
    aput-object v0, v3, v1

    .line 249
    .line 250
    invoke-direct {p0, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 251
    .line 252
    .line 253
    return-object p0

    .line 254
    :cond_8
    const-class v0, [J

    .line 255
    .line 256
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-eqz v0, :cond_9

    .line 261
    .line 262
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 263
    .line 264
    invoke-static {}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->onZeroInteger()Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    new-array v3, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 269
    .line 270
    sget-object v4, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->LONG_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 271
    .line 272
    aput-object v4, v3, v2

    .line 273
    .line 274
    aput-object v0, v3, v1

    .line 275
    .line 276
    invoke-direct {p0, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 277
    .line 278
    .line 279
    return-object p0

    .line 280
    :cond_9
    const-class v0, [F

    .line 281
    .line 282
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-eqz v0, :cond_a

    .line 287
    .line 288
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 289
    .line 290
    invoke-static {}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->onZeroInteger()Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    new-array v3, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 295
    .line 296
    sget-object v4, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->FLOAT_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 297
    .line 298
    aput-object v4, v3, v2

    .line 299
    .line 300
    aput-object v0, v3, v1

    .line 301
    .line 302
    invoke-direct {p0, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 303
    .line 304
    .line 305
    return-object p0

    .line 306
    :cond_a
    const-class v0, [D

    .line 307
    .line 308
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    if-eqz v0, :cond_b

    .line 313
    .line 314
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 315
    .line 316
    invoke-static {}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->onZeroInteger()Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    new-array v3, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 321
    .line 322
    sget-object v4, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->DOUBLE_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 323
    .line 324
    aput-object v4, v3, v2

    .line 325
    .line 326
    aput-object v0, v3, v1

    .line 327
    .line 328
    invoke-direct {p0, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 329
    .line 330
    .line 331
    return-object p0

    .line 332
    :cond_b
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 333
    .line 334
    .line 335
    move-result v0

    .line 336
    if-eqz v0, :cond_d

    .line 337
    .line 338
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 339
    .line 340
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->getComponentType()Lnet/bytebuddy/description/type/TypeDefinition;

    .line 341
    .line 342
    .line 343
    move-result-object p0

    .line 344
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 345
    .line 346
    .line 347
    move-result p0

    .line 348
    if-eqz p0, :cond_c

    .line 349
    .line 350
    sget-object p0, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->NESTED_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 351
    .line 352
    goto :goto_0

    .line 353
    :cond_c
    sget-object p0, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->REFERENCE_ARRAY:Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 354
    .line 355
    :goto_0
    invoke-static {}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->onZeroInteger()Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    .line 356
    .line 357
    .line 358
    move-result-object v4

    .line 359
    new-array v3, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 360
    .line 361
    aput-object p0, v3, v2

    .line 362
    .line 363
    aput-object v4, v3, v1

    .line 364
    .line 365
    invoke-direct {v0, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 366
    .line 367
    .line 368
    return-object v0

    .line 369
    :cond_d
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 370
    .line 371
    invoke-static {}, Lnet/bytebuddy/implementation/EqualsMethod;->access$100()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 372
    .line 373
    .line 374
    move-result-object v4

    .line 375
    invoke-static {v4}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 376
    .line 377
    .line 378
    move-result-object v4

    .line 379
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 380
    .line 381
    .line 382
    move-result-object p0

    .line 383
    invoke-interface {v4, p0}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;->virtual(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 384
    .line 385
    .line 386
    move-result-object p0

    .line 387
    invoke-static {}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->onZeroInteger()Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    new-array v3, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 392
    .line 393
    aput-object p0, v3, v2

    .line 394
    .line 395
    aput-object v4, v3, v1

    .line 396
    .line 397
    invoke-direct {v0, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 398
    .line 399
    .line 400
    return-object v0

    .line 401
    :cond_e
    :goto_1
    invoke-static {}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->onNonEqualInteger()Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    .line 402
    .line 403
    .line 404
    move-result-object p0

    .line 405
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->$VALUES:[Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/EqualsMethod$ValueComparator;

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
