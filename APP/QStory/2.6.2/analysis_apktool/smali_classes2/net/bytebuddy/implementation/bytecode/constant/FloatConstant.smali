.class public final enum Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant$ConstantPool;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;",
        ">;",
        "Lnet/bytebuddy/implementation/bytecode/StackManipulation;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;

.field public static final enum ONE:Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;

.field private static final SIZE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

.field public static final enum TWO:Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;

.field public static final enum ZERO:Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;


# instance fields
.field private final opcode:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0xb

    .line 5
    .line 6
    const-string v3, "ZERO"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;->ZERO:Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;

    .line 12
    .line 13
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const/16 v3, 0xc

    .line 17
    .line 18
    const-string v4, "ONE"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;-><init>(Ljava/lang/String;II)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;->ONE:Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;

    .line 24
    .line 25
    new-instance v2, Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    const/16 v4, 0xd

    .line 29
    .line 30
    const-string v5, "TWO"

    .line 31
    .line 32
    invoke-direct {v2, v5, v3, v4}, Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;-><init>(Ljava/lang/String;II)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;->TWO:Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;

    .line 36
    .line 37
    filled-new-array {v0, v1, v2}, [Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;

    .line 42
    .line 43
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 44
    .line 45
    invoke-virtual {v0}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toIncreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;->SIZE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 50
    .line 51
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;->opcode:I

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic access$000()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;->SIZE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 2
    .line 3
    return-object v0
.end method

.method public static forValue(F)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p0, v0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;->ZERO:Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 10
    .line 11
    cmpl-float v0, p0, v0

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;->ONE:Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_1
    const/high16 v0, 0x40000000    # 2.0f

    .line 19
    .line 20
    cmpl-float v0, p0, v0

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;->TWO:Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_2
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant$ConstantPool;

    .line 28
    .line 29
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant$ConstantPool;-><init>(F)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;->opcode:I

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/FloatConstant;->SIZE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 7
    .line 8
    return-object p0
.end method

.method public isValid()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
