.class public final enum Lnet/bytebuddy/implementation/bytecode/ShiftLeft;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bytecode/ShiftLeft;",
        ">;",
        "Lnet/bytebuddy/implementation/bytecode/StackManipulation;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bytecode/ShiftLeft;

.field public static final enum INTEGER:Lnet/bytebuddy/implementation/bytecode/ShiftLeft;

.field public static final enum LONG:Lnet/bytebuddy/implementation/bytecode/ShiftLeft;


# instance fields
.field private final opcode:I

.field private final stackSize:Lnet/bytebuddy/implementation/bytecode/StackSize;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/ShiftLeft;

    .line 2
    .line 3
    const/16 v1, 0x78

    .line 4
    .line 5
    sget-object v2, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 6
    .line 7
    const-string v3, "INTEGER"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v3, v4, v1, v2}, Lnet/bytebuddy/implementation/bytecode/ShiftLeft;-><init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/ShiftLeft;->INTEGER:Lnet/bytebuddy/implementation/bytecode/ShiftLeft;

    .line 14
    .line 15
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/ShiftLeft;

    .line 16
    .line 17
    const/16 v2, 0x79

    .line 18
    .line 19
    sget-object v3, Lnet/bytebuddy/implementation/bytecode/StackSize;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 20
    .line 21
    const-string v4, "LONG"

    .line 22
    .line 23
    const/4 v5, 0x1

    .line 24
    invoke-direct {v1, v4, v5, v2, v3}, Lnet/bytebuddy/implementation/bytecode/ShiftLeft;-><init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 25
    .line 26
    .line 27
    sput-object v1, Lnet/bytebuddy/implementation/bytecode/ShiftLeft;->LONG:Lnet/bytebuddy/implementation/bytecode/ShiftLeft;

    .line 28
    .line 29
    filled-new-array {v0, v1}, [Lnet/bytebuddy/implementation/bytecode/ShiftLeft;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/ShiftLeft;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/ShiftLeft;

    .line 34
    .line 35
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
    iput p3, p0, Lnet/bytebuddy/implementation/bytecode/ShiftLeft;->opcode:I

    .line 5
    .line 6
    iput-object p4, p0, Lnet/bytebuddy/implementation/bytecode/ShiftLeft;->stackSize:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bytecode/ShiftLeft;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bytecode/ShiftLeft;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bytecode/ShiftLeft;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bytecode/ShiftLeft;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/ShiftLeft;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/ShiftLeft;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bytecode/ShiftLeft;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bytecode/ShiftLeft;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 0

    .line 1
    iget p2, p0, Lnet/bytebuddy/implementation/bytecode/ShiftLeft;->opcode:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/ShiftLeft;->stackSize:Lnet/bytebuddy/implementation/bytecode/StackSize;

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
