.class public final enum Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;",
        ">;",
        "Lnet/bytebuddy/implementation/bytecode/StackManipulation;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

.field public static final enum DOUBLE:Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

.field public static final enum FLOAT:Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

.field public static final enum INTEGER:Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

.field public static final enum LONG:Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

.field public static final enum REFERENCE:Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

.field public static final enum VOID:Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;


# instance fields
.field private final stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->ZERO:Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 5
    .line 6
    const-string v3, "INTEGER"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;->INTEGER:Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

    .line 12
    .line 13
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    sget-object v3, Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;->ZERO:Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;

    .line 17
    .line 18
    const-string v4, "LONG"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;->LONG:Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

    .line 24
    .line 25
    new-instance v2, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    sget-object v4, Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;->ZERO:Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;

    .line 29
    .line 30
    const-string v5, "FLOAT"

    .line 31
    .line 32
    invoke-direct {v2, v5, v3, v4}, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;->FLOAT:Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

    .line 36
    .line 37
    new-instance v3, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

    .line 38
    .line 39
    const/4 v4, 0x3

    .line 40
    sget-object v5, Lnet/bytebuddy/implementation/bytecode/constant/DoubleConstant;->ZERO:Lnet/bytebuddy/implementation/bytecode/constant/DoubleConstant;

    .line 41
    .line 42
    const-string v6, "DOUBLE"

    .line 43
    .line 44
    invoke-direct {v3, v6, v4, v5}, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 45
    .line 46
    .line 47
    sput-object v3, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

    .line 48
    .line 49
    new-instance v4, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

    .line 50
    .line 51
    const/4 v5, 0x4

    .line 52
    sget-object v6, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;

    .line 53
    .line 54
    const-string v7, "VOID"

    .line 55
    .line 56
    invoke-direct {v4, v7, v5, v6}, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 57
    .line 58
    .line 59
    sput-object v4, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;->VOID:Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

    .line 60
    .line 61
    new-instance v5, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

    .line 62
    .line 63
    const/4 v6, 0x5

    .line 64
    sget-object v7, Lnet/bytebuddy/implementation/bytecode/constant/NullConstant;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/constant/NullConstant;

    .line 65
    .line 66
    const-string v8, "REFERENCE"

    .line 67
    .line 68
    invoke-direct {v5, v8, v6, v7}, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 69
    .line 70
    .line 71
    sput-object v5, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

    .line 72
    .line 73
    filled-new-array/range {v0 .. v5}, [Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

    .line 78
    .line 79
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackManipulation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 5
    .line 6
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
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;->LONG:Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

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
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

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
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;->FLOAT:Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

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
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;->VOID:Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_3
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;->INTEGER:Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_4
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

    .line 55
    .line 56
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public isValid()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
