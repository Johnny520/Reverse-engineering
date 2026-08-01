.class public final enum Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess$Putter;,
        Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess$Loader;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

.field public static final enum BYTE:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

.field public static final enum CHARACTER:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

.field public static final enum DOUBLE:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

.field public static final enum FLOAT:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

.field public static final enum INTEGER:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

.field public static final enum LONG:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

.field public static final enum REFERENCE:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

.field public static final enum SHORT:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;


# instance fields
.field private final loadOpcode:I

.field private final stackSize:Lnet/bytebuddy/implementation/bytecode/StackSize;

.field private final storeOpcode:I


# direct methods
.method static constructor <clinit>()V
    .locals 18

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 2
    .line 3
    sget-object v6, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 4
    .line 5
    const-string v1, "BYTE"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/16 v3, 0x33

    .line 9
    .line 10
    const/16 v4, 0x54

    .line 11
    .line 12
    move-object v5, v6

    .line 13
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;-><init>(Ljava/lang/String;IIILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->BYTE:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 17
    .line 18
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 19
    .line 20
    const/16 v4, 0x35

    .line 21
    .line 22
    const/16 v5, 0x56

    .line 23
    .line 24
    const-string v2, "SHORT"

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    invoke-direct/range {v1 .. v6}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;-><init>(Ljava/lang/String;IIILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 28
    .line 29
    .line 30
    move-object v7, v1

    .line 31
    sput-object v7, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->SHORT:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 32
    .line 33
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 34
    .line 35
    const/16 v4, 0x34

    .line 36
    .line 37
    const/16 v5, 0x55

    .line 38
    .line 39
    const-string v2, "CHARACTER"

    .line 40
    .line 41
    const/4 v3, 0x2

    .line 42
    invoke-direct/range {v1 .. v6}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;-><init>(Ljava/lang/String;IIILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 43
    .line 44
    .line 45
    move-object v8, v1

    .line 46
    sput-object v8, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->CHARACTER:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 47
    .line 48
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 49
    .line 50
    const/16 v4, 0x2e

    .line 51
    .line 52
    const/16 v5, 0x4f

    .line 53
    .line 54
    const-string v2, "INTEGER"

    .line 55
    .line 56
    const/4 v3, 0x3

    .line 57
    invoke-direct/range {v1 .. v6}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;-><init>(Ljava/lang/String;IIILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 58
    .line 59
    .line 60
    move-object v9, v1

    .line 61
    sput-object v9, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->INTEGER:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 62
    .line 63
    new-instance v4, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 64
    .line 65
    sget-object v15, Lnet/bytebuddy/implementation/bytecode/StackSize;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 66
    .line 67
    const-string v11, "LONG"

    .line 68
    .line 69
    const/4 v12, 0x4

    .line 70
    const/16 v13, 0x2f

    .line 71
    .line 72
    const/16 v14, 0x50

    .line 73
    .line 74
    move-object v10, v4

    .line 75
    invoke-direct/range {v10 .. v15}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;-><init>(Ljava/lang/String;IIILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 76
    .line 77
    .line 78
    move-object/from16 v16, v10

    .line 79
    .line 80
    sput-object v16, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->LONG:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 81
    .line 82
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 83
    .line 84
    const/16 v4, 0x30

    .line 85
    .line 86
    const/16 v5, 0x51

    .line 87
    .line 88
    const-string v2, "FLOAT"

    .line 89
    .line 90
    const/4 v3, 0x5

    .line 91
    invoke-direct/range {v1 .. v6}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;-><init>(Ljava/lang/String;IIILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 92
    .line 93
    .line 94
    move-object/from16 v17, v1

    .line 95
    .line 96
    sput-object v17, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->FLOAT:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 97
    .line 98
    new-instance v10, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 99
    .line 100
    const/16 v13, 0x31

    .line 101
    .line 102
    const/16 v14, 0x52

    .line 103
    .line 104
    const-string v11, "DOUBLE"

    .line 105
    .line 106
    const/4 v12, 0x6

    .line 107
    invoke-direct/range {v10 .. v15}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;-><init>(Ljava/lang/String;IIILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 108
    .line 109
    .line 110
    sput-object v10, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 111
    .line 112
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 113
    .line 114
    const/16 v4, 0x32

    .line 115
    .line 116
    const/16 v5, 0x53

    .line 117
    .line 118
    const-string v2, "REFERENCE"

    .line 119
    .line 120
    const/4 v3, 0x7

    .line 121
    invoke-direct/range {v1 .. v6}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;-><init>(Ljava/lang/String;IIILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 122
    .line 123
    .line 124
    sput-object v1, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 125
    .line 126
    move-object v2, v7

    .line 127
    move-object v7, v1

    .line 128
    move-object v1, v2

    .line 129
    move-object v2, v8

    .line 130
    move-object v3, v9

    .line 131
    move-object v6, v10

    .line 132
    move-object/from16 v4, v16

    .line 133
    .line 134
    move-object/from16 v5, v17

    .line 135
    .line 136
    filled-new-array/range {v0 .. v7}, [Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 141
    .line 142
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIILnet/bytebuddy/implementation/bytecode/StackSize;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lnet/bytebuddy/implementation/bytecode/StackSize;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->loadOpcode:I

    .line 5
    .line 6
    iput p4, p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->storeOpcode:I

    .line 7
    .line 8
    iput-object p5, p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->stackSize:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic access$000(Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;)I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->loadOpcode:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$100(Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;)Lnet/bytebuddy/implementation/bytecode/StackSize;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->stackSize:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$200(Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;)I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->storeOpcode:I

    .line 2
    .line 3
    return p0
.end method

.method public static of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;
    .locals 1

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 11
    .line 12
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_8

    .line 17
    .line 18
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 28
    .line 29
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->SHORT:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_2
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 39
    .line 40
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->CHARACTER:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_3
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->INTEGER:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_4
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_5

    .line 67
    .line 68
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->LONG:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 69
    .line 70
    return-object p0

    .line 71
    :cond_5
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 72
    .line 73
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_6

    .line 78
    .line 79
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->FLOAT:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_6
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 83
    .line 84
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_7

    .line 89
    .line 90
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_7
    const-string v0, "Not a legal array type: "

    .line 94
    .line 95
    invoke-static {p0, v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const/4 p0, 0x0

    .line 99
    return-object p0

    .line 100
    :cond_8
    :goto_0
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->BYTE:Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 101
    .line 102
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public forEach(Ljava/util/List;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            ">;)",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v1, 0x0

    .line 15
    move v2, v1

    .line 16
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 27
    .line 28
    new-instance v4, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 29
    .line 30
    add-int/lit8 v5, v2, 0x1

    .line 31
    .line 32
    invoke-static {v2}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->forValue(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    new-instance v6, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess$Loader;

    .line 37
    .line 38
    invoke-direct {v6, p0}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess$Loader;-><init>(Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;)V

    .line 39
    .line 40
    .line 41
    const/4 v7, 0x4

    .line 42
    new-array v7, v7, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 43
    .line 44
    sget-object v8, Lnet/bytebuddy/implementation/bytecode/Duplication;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Duplication;

    .line 45
    .line 46
    aput-object v8, v7, v1

    .line 47
    .line 48
    const/4 v8, 0x1

    .line 49
    aput-object v2, v7, v8

    .line 50
    .line 51
    const/4 v2, 0x2

    .line 52
    aput-object v6, v7, v2

    .line 53
    .line 54
    const/4 v2, 0x3

    .line 55
    aput-object v3, v7, v2

    .line 56
    .line 57
    invoke-direct {v4, v7}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move v2, v5

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 66
    .line 67
    invoke-direct {p0, v0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>(Ljava/util/List;)V

    .line 68
    .line 69
    .line 70
    return-object p0
.end method

.method public load()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess$Loader;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess$Loader;-><init>(Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public store()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess$Putter;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess$Putter;-><init>(Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
