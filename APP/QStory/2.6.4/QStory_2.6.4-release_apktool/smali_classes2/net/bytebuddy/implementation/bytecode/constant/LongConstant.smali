.class public final enum Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/bytecode/constant/LongConstant$ConstantPool;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;",
        ">;",
        "Lnet/bytebuddy/implementation/bytecode/StackManipulation;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;

.field public static final enum ONE:Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;

.field private static final SIZE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

.field public static final enum ZERO:Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;


# instance fields
.field private final opcode:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x9

    .line 5
    .line 6
    const-string v3, "ZERO"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;->ZERO:Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;

    .line 12
    .line 13
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const/16 v3, 0xa

    .line 17
    .line 18
    const-string v4, "ONE"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;-><init>(Ljava/lang/String;II)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;->ONE:Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;

    .line 24
    .line 25
    filled-new-array {v0, v1}, [Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;

    .line 30
    .line 31
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/StackSize;->DOUBLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 32
    .line 33
    invoke-virtual {v0}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toIncreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;->SIZE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 38
    .line 39
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
    iput p3, p0, Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;->opcode:I

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic access$000()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;->SIZE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 2
    .line 3
    return-object v0
.end method

.method public static forValue(J)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;->ZERO:Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-wide/16 v0, 0x1

    .line 11
    .line 12
    cmp-long v0, p0, v0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;->ONE:Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/constant/LongConstant$ConstantPool;

    .line 20
    .line 21
    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/implementation/bytecode/constant/LongConstant$ConstantPool;-><init>(J)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;->opcode:I

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/LongConstant;->SIZE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

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
