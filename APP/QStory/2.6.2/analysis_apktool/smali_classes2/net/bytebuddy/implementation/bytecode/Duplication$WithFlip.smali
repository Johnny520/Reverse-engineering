.class public final enum Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bytecode/Duplication;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "WithFlip"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;",
        ">;",
        "Lnet/bytebuddy/implementation/bytecode/StackManipulation;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;

.field public static final enum DOUBLE_DOUBLE:Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;

.field public static final enum DOUBLE_SINGLE:Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;

.field public static final enum SINGLE_DOUBLE:Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;

.field public static final enum SINGLE_SINGLE:Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;


# instance fields
.field private final opcode:I

.field private final stackSize:Lnet/bytebuddy/implementation/bytecode/StackSize;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 4
    .line 5
    const-string v2, "SINGLE_SINGLE"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0x5a

    .line 9
    .line 10
    invoke-direct {v0, v2, v3, v4, v1}, Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;-><init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;->SINGLE_SINGLE:Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;

    .line 14
    .line 15
    new-instance v2, Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    const/16 v4, 0x5b

    .line 19
    .line 20
    const-string v5, "SINGLE_DOUBLE"

    .line 21
    .line 22
    invoke-direct {v2, v5, v3, v4, v1}, Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;-><init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 23
    .line 24
    .line 25
    sput-object v2, Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;->SINGLE_DOUBLE:Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;

    .line 26
    .line 27
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;

    .line 28
    .line 29
    sget-object v3, Lnet/bytebuddy/implementation/bytecode/StackSize;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 30
    .line 31
    const-string v4, "DOUBLE_SINGLE"

    .line 32
    .line 33
    const/4 v5, 0x2

    .line 34
    const/16 v6, 0x5d

    .line 35
    .line 36
    invoke-direct {v1, v4, v5, v6, v3}, Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;-><init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 37
    .line 38
    .line 39
    sput-object v1, Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;->DOUBLE_SINGLE:Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;

    .line 40
    .line 41
    new-instance v4, Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;

    .line 42
    .line 43
    const/4 v5, 0x3

    .line 44
    const/16 v6, 0x5e

    .line 45
    .line 46
    const-string v7, "DOUBLE_DOUBLE"

    .line 47
    .line 48
    invoke-direct {v4, v7, v5, v6, v3}, Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;-><init>(Ljava/lang/String;IILnet/bytebuddy/implementation/bytecode/StackSize;)V

    .line 49
    .line 50
    .line 51
    sput-object v4, Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;->DOUBLE_DOUBLE:Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;

    .line 52
    .line 53
    filled-new-array {v0, v2, v1, v4}, [Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;

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
    iput p3, p0, Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;->opcode:I

    .line 5
    .line 6
    iput-object p4, p0, Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;->stackSize:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 0

    .line 1
    iget p2, p0, Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;->opcode:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;->stackSize:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 7
    .line 8
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toIncreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

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
