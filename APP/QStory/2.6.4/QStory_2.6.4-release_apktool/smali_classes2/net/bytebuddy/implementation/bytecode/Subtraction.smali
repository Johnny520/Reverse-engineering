.class public final enum Lnet/bytebuddy/implementation/bytecode/Subtraction;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bytecode/Subtraction;",
        ">;",
        "Lnet/bytebuddy/implementation/bytecode/StackManipulation;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bytecode/Subtraction;

.field public static final enum DOUBLE:Lnet/bytebuddy/implementation/bytecode/Subtraction;

.field public static final enum FLOAT:Lnet/bytebuddy/implementation/bytecode/Subtraction;

.field public static final enum INTEGER:Lnet/bytebuddy/implementation/bytecode/Subtraction;

.field public static final enum LONG:Lnet/bytebuddy/implementation/bytecode/Subtraction;


# instance fields
.field private final opcode:I

.field private final stackSize:Lnet/bytebuddy/implementation/bytecode/StackSize;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/Subtraction;

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
    const/16 v4, 0x64

    .line 9
    .line 10
    invoke-direct {v0, v2, v3, v4, v1}, Lnet/bytebuddy/implementation/bytecode/Subtraction;-><init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/Subtraction;->INTEGER:Lnet/bytebuddy/implementation/bytecode/Subtraction;

    .line 14
    .line 15
    new-instance v2, Lnet/bytebuddy/implementation/bytecode/Subtraction;

    .line 16
    .line 17
    sget-object v3, Lnet/bytebuddy/implementation/bytecode/StackSize;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 18
    .line 19
    const-string v4, "LONG"

    .line 20
    .line 21
    const/4 v5, 0x1

    .line 22
    const/16 v6, 0x65

    .line 23
    .line 24
    invoke-direct {v2, v4, v5, v6, v3}, Lnet/bytebuddy/implementation/bytecode/Subtraction;-><init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 25
    .line 26
    .line 27
    sput-object v2, Lnet/bytebuddy/implementation/bytecode/Subtraction;->LONG:Lnet/bytebuddy/implementation/bytecode/Subtraction;

    .line 28
    .line 29
    new-instance v4, Lnet/bytebuddy/implementation/bytecode/Subtraction;

    .line 30
    .line 31
    const/4 v5, 0x2

    .line 32
    const/16 v6, 0x66

    .line 33
    .line 34
    const-string v7, "FLOAT"

    .line 35
    .line 36
    invoke-direct {v4, v7, v5, v6, v1}, Lnet/bytebuddy/implementation/bytecode/Subtraction;-><init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 37
    .line 38
    .line 39
    sput-object v4, Lnet/bytebuddy/implementation/bytecode/Subtraction;->FLOAT:Lnet/bytebuddy/implementation/bytecode/Subtraction;

    .line 40
    .line 41
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/Subtraction;

    .line 42
    .line 43
    const/4 v5, 0x3

    .line 44
    const/16 v6, 0x67

    .line 45
    .line 46
    const-string v7, "DOUBLE"

    .line 47
    .line 48
    invoke-direct {v1, v7, v5, v6, v3}, Lnet/bytebuddy/implementation/bytecode/Subtraction;-><init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 49
    .line 50
    .line 51
    sput-object v1, Lnet/bytebuddy/implementation/bytecode/Subtraction;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/Subtraction;

    .line 52
    .line 53
    filled-new-array {v0, v2, v4, v1}, [Lnet/bytebuddy/implementation/bytecode/Subtraction;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/Subtraction;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/Subtraction;

    .line 58
    .line 59
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
    iput p3, p0, Lnet/bytebuddy/implementation/bytecode/Subtraction;->opcode:I

    .line 5
    .line 6
    iput-object p4, p0, Lnet/bytebuddy/implementation/bytecode/Subtraction;->stackSize:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bytecode/Subtraction;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bytecode/Subtraction;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bytecode/Subtraction;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bytecode/Subtraction;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/Subtraction;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/Subtraction;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bytecode/Subtraction;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bytecode/Subtraction;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 0

    .line 1
    iget p2, p0, Lnet/bytebuddy/implementation/bytecode/Subtraction;->opcode:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/Subtraction;->stackSize:Lnet/bytebuddy/implementation/bytecode/StackSize;

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
