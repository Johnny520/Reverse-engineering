.class public abstract enum Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "ForValue"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;,
        Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$OfNonDefault;,
        Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$OfDefault;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

.field public static final enum BOOLEAN:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

.field public static final enum BYTE:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

.field public static final enum CHARACTER:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

.field public static final enum DOUBLE:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

.field public static final enum FLOAT:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

.field public static final enum INTEGER:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

.field public static final enum LONG:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

.field public static final enum REFERENCE:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

.field public static final enum SHORT:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;


# instance fields
.field private final arrayLoad:I

.field private final defaultJump:I

.field private final load:I

.field private final nonDefaultJump:I

.field private final requiredSize:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$1;

    .line 2
    .line 3
    const/16 v6, 0x99

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    const-string v1, "BOOLEAN"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/16 v3, 0x15

    .line 10
    .line 11
    const/16 v4, 0x33

    .line 12
    .line 13
    const/16 v5, 0x9a

    .line 14
    .line 15
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$1;-><init>(Ljava/lang/String;IIIIII)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->BOOLEAN:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 19
    .line 20
    new-instance v1, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$2;

    .line 21
    .line 22
    const/16 v7, 0x99

    .line 23
    .line 24
    const/4 v8, 0x0

    .line 25
    const-string v2, "BYTE"

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    const/16 v4, 0x15

    .line 29
    .line 30
    const/16 v5, 0x33

    .line 31
    .line 32
    const/16 v6, 0x9a

    .line 33
    .line 34
    invoke-direct/range {v1 .. v8}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$2;-><init>(Ljava/lang/String;IIIIII)V

    .line 35
    .line 36
    .line 37
    sput-object v1, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->BYTE:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 38
    .line 39
    new-instance v2, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$3;

    .line 40
    .line 41
    const/16 v8, 0x99

    .line 42
    .line 43
    const/4 v9, 0x0

    .line 44
    const-string v3, "SHORT"

    .line 45
    .line 46
    const/4 v4, 0x2

    .line 47
    const/16 v5, 0x15

    .line 48
    .line 49
    const/16 v6, 0x35

    .line 50
    .line 51
    const/16 v7, 0x9a

    .line 52
    .line 53
    invoke-direct/range {v2 .. v9}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$3;-><init>(Ljava/lang/String;IIIIII)V

    .line 54
    .line 55
    .line 56
    sput-object v2, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->SHORT:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 57
    .line 58
    new-instance v3, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$4;

    .line 59
    .line 60
    const/16 v9, 0x99

    .line 61
    .line 62
    const/4 v10, 0x0

    .line 63
    const-string v4, "CHARACTER"

    .line 64
    .line 65
    const/4 v5, 0x3

    .line 66
    const/16 v6, 0x15

    .line 67
    .line 68
    const/16 v7, 0x34

    .line 69
    .line 70
    const/16 v8, 0x9a

    .line 71
    .line 72
    invoke-direct/range {v3 .. v10}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$4;-><init>(Ljava/lang/String;IIIIII)V

    .line 73
    .line 74
    .line 75
    sput-object v3, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->CHARACTER:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 76
    .line 77
    new-instance v4, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$5;

    .line 78
    .line 79
    const/16 v10, 0x99

    .line 80
    .line 81
    const/4 v11, 0x0

    .line 82
    const-string v5, "INTEGER"

    .line 83
    .line 84
    const/4 v6, 0x4

    .line 85
    const/16 v7, 0x15

    .line 86
    .line 87
    const/16 v8, 0x2e

    .line 88
    .line 89
    const/16 v9, 0x9a

    .line 90
    .line 91
    invoke-direct/range {v4 .. v11}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$5;-><init>(Ljava/lang/String;IIIIII)V

    .line 92
    .line 93
    .line 94
    sput-object v4, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->INTEGER:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 95
    .line 96
    new-instance v5, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$6;

    .line 97
    .line 98
    const/16 v11, 0x99

    .line 99
    .line 100
    const/4 v12, 0x0

    .line 101
    const-string v6, "LONG"

    .line 102
    .line 103
    const/4 v7, 0x5

    .line 104
    const/16 v8, 0x16

    .line 105
    .line 106
    const/16 v9, 0x2f

    .line 107
    .line 108
    const/16 v10, 0x9a

    .line 109
    .line 110
    invoke-direct/range {v5 .. v12}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$6;-><init>(Ljava/lang/String;IIIIII)V

    .line 111
    .line 112
    .line 113
    sput-object v5, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->LONG:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 114
    .line 115
    new-instance v6, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$7;

    .line 116
    .line 117
    const/16 v12, 0x99

    .line 118
    .line 119
    const/4 v13, 0x2

    .line 120
    const-string v7, "FLOAT"

    .line 121
    .line 122
    const/4 v8, 0x6

    .line 123
    const/16 v9, 0x17

    .line 124
    .line 125
    const/16 v10, 0x30

    .line 126
    .line 127
    const/16 v11, 0x9a

    .line 128
    .line 129
    invoke-direct/range {v6 .. v13}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$7;-><init>(Ljava/lang/String;IIIIII)V

    .line 130
    .line 131
    .line 132
    sput-object v6, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->FLOAT:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 133
    .line 134
    new-instance v7, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$8;

    .line 135
    .line 136
    const/16 v13, 0x99

    .line 137
    .line 138
    const/4 v14, 0x4

    .line 139
    const-string v8, "DOUBLE"

    .line 140
    .line 141
    const/4 v9, 0x7

    .line 142
    const/16 v10, 0x18

    .line 143
    .line 144
    const/16 v11, 0x31

    .line 145
    .line 146
    const/16 v12, 0x9a

    .line 147
    .line 148
    invoke-direct/range {v7 .. v14}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$8;-><init>(Ljava/lang/String;IIIIII)V

    .line 149
    .line 150
    .line 151
    sput-object v7, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->DOUBLE:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 152
    .line 153
    new-instance v8, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$9;

    .line 154
    .line 155
    const/16 v14, 0xc6

    .line 156
    .line 157
    const/4 v15, 0x0

    .line 158
    const-string v9, "REFERENCE"

    .line 159
    .line 160
    const/16 v10, 0x8

    .line 161
    .line 162
    const/16 v11, 0x19

    .line 163
    .line 164
    const/16 v12, 0x32

    .line 165
    .line 166
    const/16 v13, 0xc7

    .line 167
    .line 168
    invoke-direct/range {v8 .. v15}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$9;-><init>(Ljava/lang/String;IIIIII)V

    .line 169
    .line 170
    .line 171
    sput-object v8, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->REFERENCE:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 172
    .line 173
    const/16 v9, 0x9

    .line 174
    .line 175
    new-array v9, v9, [Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 176
    .line 177
    const/4 v10, 0x0

    .line 178
    aput-object v0, v9, v10

    .line 179
    .line 180
    const/4 v0, 0x1

    .line 181
    aput-object v1, v9, v0

    .line 182
    .line 183
    const/4 v0, 0x2

    .line 184
    aput-object v2, v9, v0

    .line 185
    .line 186
    const/4 v0, 0x3

    .line 187
    aput-object v3, v9, v0

    .line 188
    .line 189
    const/4 v0, 0x4

    .line 190
    aput-object v4, v9, v0

    .line 191
    .line 192
    const/4 v0, 0x5

    .line 193
    aput-object v5, v9, v0

    .line 194
    .line 195
    const/4 v0, 0x6

    .line 196
    aput-object v6, v9, v0

    .line 197
    .line 198
    const/4 v0, 0x7

    .line 199
    aput-object v7, v9, v0

    .line 200
    .line 201
    const/16 v0, 0x8

    .line 202
    .line 203
    aput-object v8, v9, v0

    .line 204
    .line 205
    sput-object v9, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->$VALUES:[Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 206
    .line 207
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIIIII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIII)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->load:I

    .line 5
    .line 6
    iput p4, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->arrayLoad:I

    .line 7
    .line 8
    iput p5, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->defaultJump:I

    .line 9
    .line 10
    iput p6, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->nonDefaultJump:I

    .line 11
    .line 12
    iput p7, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->requiredSize:I

    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IIIIIILnet/bytebuddy/asm/Advice$1;)V
    .locals 0

    .line 15
    invoke-direct/range {p0 .. p7}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;-><init>(Ljava/lang/String;IIIIII)V

    return-void
.end method

.method public static synthetic access$3300(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;)I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->requiredSize:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$3400(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;)I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->load:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$3500(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;)I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->arrayLoad:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$3600(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;)I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->nonDefaultJump:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$3700(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;)I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->defaultJump:I

    .line 2
    .line 3
    return p0
.end method

.method public static of(Lnet/bytebuddy/description/type/TypeDefinition;IZ)Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler;
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
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->BOOLEAN:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    sget-object p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->BYTE:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    sget-object p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->SHORT:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 35
    .line 36
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    sget-object p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->CHARACTER:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 46
    .line 47
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    sget-object p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->INTEGER:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_4
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 57
    .line 58
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    sget-object p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->LONG:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_5
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 68
    .line 69
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_6

    .line 74
    .line 75
    sget-object p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->FLOAT:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_6
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 79
    .line 80
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_7

    .line 85
    .line 86
    sget-object p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->DOUBLE:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_7
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 90
    .line 91
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-nez p0, :cond_9

    .line 96
    .line 97
    sget-object p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->REFERENCE:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 98
    .line 99
    :goto_0
    if-eqz p2, :cond_8

    .line 100
    .line 101
    new-instance p2, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$OfNonDefault;

    .line 102
    .line 103
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-direct {p2, p0, p1}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$OfNonDefault;-><init>(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;I)V

    .line 107
    .line 108
    .line 109
    return-object p2

    .line 110
    :cond_8
    new-instance p2, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$OfDefault;

    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-direct {p2, p0, p1}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$OfDefault;-><init>(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;I)V

    .line 116
    .line 117
    .line 118
    return-object p2

    .line 119
    :cond_9
    const-string p0, "Cannot skip on default value for void return type"

    .line 120
    .line 121
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    const/4 p0, 0x0

    .line 125
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->$VALUES:[Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public abstract convertValue(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
.end method
