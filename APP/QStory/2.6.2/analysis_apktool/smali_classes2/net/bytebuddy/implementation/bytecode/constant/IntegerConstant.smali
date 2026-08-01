.class public final enum Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant$ConstantPool;,
        Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant$TwoBytePush;,
        Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant$SingleBytePush;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;",
        ">;",
        "Lnet/bytebuddy/implementation/bytecode/StackManipulation;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

.field public static final enum FIVE:Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

.field public static final enum FOUR:Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

.field public static final enum MINUS_ONE:Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

.field public static final enum ONE:Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

.field private static final SIZE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

.field public static final enum THREE:Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

.field public static final enum TWO:Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

.field public static final enum ZERO:Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;


# instance fields
.field private final opcode:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 2
    .line 3
    const-string v1, "MINUS_ONE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->MINUS_ONE:Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 11
    .line 12
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 13
    .line 14
    const-string v2, "ZERO"

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    const/4 v5, 0x3

    .line 18
    invoke-direct {v1, v2, v4, v5}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->ZERO:Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 22
    .line 23
    new-instance v2, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 24
    .line 25
    const-string v4, "ONE"

    .line 26
    .line 27
    const/4 v6, 0x4

    .line 28
    invoke-direct {v2, v4, v3, v6}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;-><init>(Ljava/lang/String;II)V

    .line 29
    .line 30
    .line 31
    sput-object v2, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->ONE:Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 32
    .line 33
    new-instance v3, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 34
    .line 35
    const-string v4, "TWO"

    .line 36
    .line 37
    const/4 v7, 0x5

    .line 38
    invoke-direct {v3, v4, v5, v7}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;-><init>(Ljava/lang/String;II)V

    .line 39
    .line 40
    .line 41
    sput-object v3, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->TWO:Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 42
    .line 43
    new-instance v4, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 44
    .line 45
    const-string v5, "THREE"

    .line 46
    .line 47
    const/4 v8, 0x6

    .line 48
    invoke-direct {v4, v5, v6, v8}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;-><init>(Ljava/lang/String;II)V

    .line 49
    .line 50
    .line 51
    sput-object v4, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->THREE:Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 52
    .line 53
    new-instance v5, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 54
    .line 55
    const-string v6, "FOUR"

    .line 56
    .line 57
    const/4 v9, 0x7

    .line 58
    invoke-direct {v5, v6, v7, v9}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;-><init>(Ljava/lang/String;II)V

    .line 59
    .line 60
    .line 61
    sput-object v5, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->FOUR:Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 62
    .line 63
    new-instance v6, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 64
    .line 65
    const-string v7, "FIVE"

    .line 66
    .line 67
    const/16 v9, 0x8

    .line 68
    .line 69
    invoke-direct {v6, v7, v8, v9}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;-><init>(Ljava/lang/String;II)V

    .line 70
    .line 71
    .line 72
    sput-object v6, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->FIVE:Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 73
    .line 74
    filled-new-array/range {v0 .. v6}, [Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 79
    .line 80
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/StackSize;->SINGLE:Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 81
    .line 82
    invoke-virtual {v0}, Lnet/bytebuddy/implementation/bytecode/StackSize;->toIncreasingSize()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->SIZE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 87
    .line 88
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
    iput p3, p0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->opcode:I

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic access$000()Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->SIZE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 2
    .line 3
    return-object v0
.end method

.method public static forValue(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const/16 v0, -0x80

    .line 5
    .line 6
    if-lt p0, v0, :cond_0

    .line 7
    .line 8
    const/16 v0, 0x7f

    .line 9
    .line 10
    if-gt p0, v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant$SingleBytePush;

    .line 13
    .line 14
    int-to-byte p0, p0

    .line 15
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant$SingleBytePush;-><init>(B)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    const/16 v0, -0x8000

    .line 20
    .line 21
    if-lt p0, v0, :cond_1

    .line 22
    .line 23
    const/16 v0, 0x7fff

    .line 24
    .line 25
    if-gt p0, v0, :cond_1

    .line 26
    .line 27
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant$TwoBytePush;

    .line 28
    .line 29
    int-to-short p0, p0

    .line 30
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant$TwoBytePush;-><init>(S)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant$ConstantPool;

    .line 35
    .line 36
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant$ConstantPool;-><init>(I)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_0
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->FIVE:Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_1
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->FOUR:Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_2
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->THREE:Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_3
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->TWO:Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_4
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->ONE:Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_5
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->ZERO:Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_6
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->MINUS_ONE:Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static forValue(Z)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 0

    if-eqz p0, :cond_0

    .line 61
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->ONE:Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    return-object p0

    :cond_0
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->ZERO:Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->opcode:I

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->SIZE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

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
