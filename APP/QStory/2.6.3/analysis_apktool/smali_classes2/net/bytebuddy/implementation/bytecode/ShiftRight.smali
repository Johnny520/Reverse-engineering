.class public final enum Lnet/bytebuddy/implementation/bytecode/ShiftRight;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/bytecode/ShiftRight$Unsigned;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bytecode/ShiftRight;",
        ">;",
        "Lnet/bytebuddy/implementation/bytecode/StackManipulation;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bytecode/ShiftRight;

.field public static final enum INTEGER:Lnet/bytebuddy/implementation/bytecode/ShiftRight;

.field public static final enum LONG:Lnet/bytebuddy/implementation/bytecode/ShiftRight;


# instance fields
.field private final opcode:I

.field private final stackSize:Lnet/bytebuddy/implementation/bytecode/StackSize;

.field private final unsigned:Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/ShiftRight;

    .line 2
    .line 3
    sget-object v4, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 4
    .line 5
    sget-object v5, Lnet/bytebuddy/implementation/bytecode/ShiftRight$Unsigned;->INTEGER:Lnet/bytebuddy/implementation/bytecode/ShiftRight$Unsigned;

    .line 6
    .line 7
    const-string v1, "INTEGER"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/16 v3, 0x7a

    .line 11
    .line 12
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/implementation/bytecode/ShiftRight;-><init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/ShiftRight;->INTEGER:Lnet/bytebuddy/implementation/bytecode/ShiftRight;

    .line 16
    .line 17
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/ShiftRight;

    .line 18
    .line 19
    sget-object v5, Lnet/bytebuddy/implementation/bytecode/StackSize;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 20
    .line 21
    sget-object v6, Lnet/bytebuddy/implementation/bytecode/ShiftRight$Unsigned;->LONG:Lnet/bytebuddy/implementation/bytecode/ShiftRight$Unsigned;

    .line 22
    .line 23
    const-string v2, "LONG"

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    const/16 v4, 0x7b

    .line 27
    .line 28
    invoke-direct/range {v1 .. v6}, Lnet/bytebuddy/implementation/bytecode/ShiftRight;-><init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 29
    .line 30
    .line 31
    sput-object v1, Lnet/bytebuddy/implementation/bytecode/ShiftRight;->LONG:Lnet/bytebuddy/implementation/bytecode/ShiftRight;

    .line 32
    .line 33
    filled-new-array {v0, v1}, [Lnet/bytebuddy/implementation/bytecode/ShiftRight;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/ShiftRight;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/ShiftRight;

    .line 38
    .line 39
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lnet/bytebuddy/implementation/bytecode/StackSize;",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lnet/bytebuddy/implementation/bytecode/ShiftRight;->opcode:I

    .line 5
    .line 6
    iput-object p4, p0, Lnet/bytebuddy/implementation/bytecode/ShiftRight;->stackSize:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 7
    .line 8
    iput-object p5, p0, Lnet/bytebuddy/implementation/bytecode/ShiftRight;->unsigned:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 9
    .line 10
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bytecode/ShiftRight;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bytecode/ShiftRight;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bytecode/ShiftRight;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bytecode/ShiftRight;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/ShiftRight;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/ShiftRight;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bytecode/ShiftRight;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bytecode/ShiftRight;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 0

    .line 1
    iget p2, p0, Lnet/bytebuddy/implementation/bytecode/ShiftRight;->opcode:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/ShiftRight;->stackSize:Lnet/bytebuddy/implementation/bytecode/StackSize;

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

.method public toUnsigned()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/ShiftRight;->unsigned:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 2
    .line 3
    return-object p0
.end method
