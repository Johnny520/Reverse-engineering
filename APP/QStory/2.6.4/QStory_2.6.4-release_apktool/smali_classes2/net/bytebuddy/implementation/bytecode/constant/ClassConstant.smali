.class public final enum Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant$ForReferenceType;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;",
        ">;",
        "Lnet/bytebuddy/implementation/bytecode/StackManipulation;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

.field public static final enum BOOLEAN:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

.field public static final enum BYTE:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

.field public static final enum CHARACTER:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

.field private static final CLASS_TYPE_INTERNAL_NAME:Ljava/lang/String; = "Ljava/lang/Class;"

.field public static final enum DOUBLE:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

.field public static final enum FLOAT:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

.field public static final enum INTEGER:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

.field public static final enum LONG:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

.field private static final PRIMITIVE_TYPE_FIELD:Ljava/lang/String; = "TYPE"

.field public static final enum SHORT:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

.field private static final SIZE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

.field public static final enum VOID:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;


# instance fields
.field private final fieldOwnerInternalName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-class v2, Ljava/lang/Void;

    .line 5
    .line 6
    const-string v3, "VOID"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->VOID:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 12
    .line 13
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const-class v3, Ljava/lang/Boolean;

    .line 17
    .line 18
    const-string v4, "BOOLEAN"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->BOOLEAN:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 24
    .line 25
    new-instance v2, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    const-class v4, Ljava/lang/Byte;

    .line 29
    .line 30
    const-string v5, "BYTE"

    .line 31
    .line 32
    invoke-direct {v2, v5, v3, v4}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->BYTE:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 36
    .line 37
    new-instance v3, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 38
    .line 39
    const/4 v4, 0x3

    .line 40
    const-class v5, Ljava/lang/Short;

    .line 41
    .line 42
    const-string v6, "SHORT"

    .line 43
    .line 44
    invoke-direct {v3, v6, v4, v5}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    .line 45
    .line 46
    .line 47
    sput-object v3, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->SHORT:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 48
    .line 49
    new-instance v4, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 50
    .line 51
    const/4 v5, 0x4

    .line 52
    const-class v6, Ljava/lang/Character;

    .line 53
    .line 54
    const-string v7, "CHARACTER"

    .line 55
    .line 56
    invoke-direct {v4, v7, v5, v6}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    .line 57
    .line 58
    .line 59
    sput-object v4, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->CHARACTER:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 60
    .line 61
    new-instance v5, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 62
    .line 63
    const/4 v6, 0x5

    .line 64
    const-class v7, Ljava/lang/Integer;

    .line 65
    .line 66
    const-string v8, "INTEGER"

    .line 67
    .line 68
    invoke-direct {v5, v8, v6, v7}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    .line 69
    .line 70
    .line 71
    sput-object v5, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->INTEGER:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 72
    .line 73
    new-instance v6, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 74
    .line 75
    const/4 v7, 0x6

    .line 76
    const-class v8, Ljava/lang/Long;

    .line 77
    .line 78
    const-string v9, "LONG"

    .line 79
    .line 80
    invoke-direct {v6, v9, v7, v8}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    .line 81
    .line 82
    .line 83
    sput-object v6, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->LONG:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 84
    .line 85
    new-instance v7, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 86
    .line 87
    const/4 v8, 0x7

    .line 88
    const-class v9, Ljava/lang/Float;

    .line 89
    .line 90
    const-string v10, "FLOAT"

    .line 91
    .line 92
    invoke-direct {v7, v10, v8, v9}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    .line 93
    .line 94
    .line 95
    sput-object v7, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->FLOAT:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 96
    .line 97
    new-instance v8, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 98
    .line 99
    const/16 v9, 0x8

    .line 100
    .line 101
    const-class v10, Ljava/lang/Double;

    .line 102
    .line 103
    const-string v11, "DOUBLE"

    .line 104
    .line 105
    invoke-direct {v8, v11, v9, v10}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    .line 106
    .line 107
    .line 108
    sput-object v8, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 109
    .line 110
    filled-new-array/range {v0 .. v8}, [Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 115
    .line 116
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 117
    .line 118
    invoke-virtual {v0}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toIncreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->SIZE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 123
    .line 124
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    invoke-static {p3}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->fieldOwnerInternalName:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic access$000()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->SIZE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 2
    .line 3
    return-object v0
.end method

.method public static of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
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
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant$ForReferenceType;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant$ForReferenceType;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->BOOLEAN:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_1
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 25
    .line 26
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->BYTE:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_2
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->SHORT:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_3
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 47
    .line 48
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->CHARACTER:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_4
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 58
    .line 59
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_5

    .line 64
    .line 65
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->INTEGER:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_5
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 69
    .line 70
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_6

    .line 75
    .line 76
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->LONG:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 77
    .line 78
    return-object p0

    .line 79
    :cond_6
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 80
    .line 81
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_7

    .line 86
    .line 87
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->FLOAT:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_7
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 91
    .line 92
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-eqz p0, :cond_8

    .line 97
    .line 98
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 99
    .line 100
    return-object p0

    .line 101
    :cond_8
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->VOID:Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 102
    .line 103
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 2

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->fieldOwnerInternalName:Ljava/lang/String;

    .line 2
    .line 3
    const-string p2, "TYPE"

    .line 4
    .line 5
    const-string v0, "Ljava/lang/Class;"

    .line 6
    .line 7
    const/16 v1, 0xb2

    .line 8
    .line 9
    invoke-virtual {p1, v1, p0, p2, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->SIZE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 13
    .line 14
    return-object p0
.end method

.method public isValid()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
