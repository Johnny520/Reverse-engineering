.class public final enum Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;",
        ">;",
        "Lnet/bytebuddy/implementation/bytecode/StackManipulation;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

.field public static final enum DOUBLE:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

.field public static final enum FLOAT:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

.field public static final enum INTEGER:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

.field public static final enum LONG:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

.field public static final enum REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

.field public static final enum VOID:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;


# instance fields
.field private final returnOpcode:I

.field private final stackSize:Lnet/bytebuddy/implementation/bytecode/StackSize;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 4
    .line 5
    const-string v2, "INTEGER"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0xac

    .line 9
    .line 10
    invoke-direct {v0, v2, v3, v4, v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;-><init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->INTEGER:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 14
    .line 15
    move-object v2, v1

    .line 16
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 17
    .line 18
    sget-object v3, Lnet/bytebuddy/implementation/bytecode/StackSize;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 19
    .line 20
    const-string v4, "DOUBLE"

    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    const/16 v6, 0xaf

    .line 24
    .line 25
    invoke-direct {v1, v4, v5, v6, v3}, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;-><init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 26
    .line 27
    .line 28
    sput-object v1, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 29
    .line 30
    move-object v4, v2

    .line 31
    new-instance v2, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 32
    .line 33
    const/4 v5, 0x2

    .line 34
    const/16 v6, 0xae

    .line 35
    .line 36
    const-string v7, "FLOAT"

    .line 37
    .line 38
    invoke-direct {v2, v7, v5, v6, v4}, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;-><init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 39
    .line 40
    .line 41
    sput-object v2, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->FLOAT:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 42
    .line 43
    move-object v5, v3

    .line 44
    new-instance v3, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 45
    .line 46
    const/4 v6, 0x3

    .line 47
    const/16 v7, 0xad

    .line 48
    .line 49
    const-string v8, "LONG"

    .line 50
    .line 51
    invoke-direct {v3, v8, v6, v7, v5}, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;-><init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 52
    .line 53
    .line 54
    sput-object v3, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->LONG:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 55
    .line 56
    move-object v5, v4

    .line 57
    new-instance v4, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 58
    .line 59
    const/16 v6, 0xb1

    .line 60
    .line 61
    sget-object v7, Lnet/bytebuddy/implementation/bytecode/StackSize;->ZERO:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 62
    .line 63
    const-string v8, "VOID"

    .line 64
    .line 65
    const/4 v9, 0x4

    .line 66
    invoke-direct {v4, v8, v9, v6, v7}, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;-><init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 67
    .line 68
    .line 69
    sput-object v4, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->VOID:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 70
    .line 71
    move-object v6, v5

    .line 72
    new-instance v5, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 73
    .line 74
    const/4 v7, 0x5

    .line 75
    const/16 v8, 0xb0

    .line 76
    .line 77
    const-string v9, "REFERENCE"

    .line 78
    .line 79
    invoke-direct {v5, v9, v7, v8, v6}, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;-><init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 80
    .line 81
    .line 82
    sput-object v5, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 83
    .line 84
    filled-new-array/range {v0 .. v5}, [Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 89
    .line 90
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lnet/bytebuddy/implementation/bytecode/StackSize;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->returnOpcode:I

    .line 5
    .line 6
    iput-object p4, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->stackSize:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 7
    .line 8
    return-void
.end method

.method public static of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 8
    .line 9
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->LONG:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

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
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 30
    .line 31
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->FLOAT:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_2
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 41
    .line 42
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_3

    .line 47
    .line 48
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->VOID:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_3
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->INTEGER:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_4
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 55
    .line 56
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 0

    .line 1
    iget p2, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->returnOpcode:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->stackSize:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 7
    .line 8
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toDecreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public isValid()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
