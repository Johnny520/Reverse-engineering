.class final enum Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck$2;
.super Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/implementation/EqualsMethod$TypeCompatibilityCheck;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/EqualsMethod$1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 5

    .line 1
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 2
    .line 3
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {p1}, Lnet/bytebuddy/implementation/bytecode/assign/InstanceCheck;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {}, Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;->onZeroInteger()Lnet/bytebuddy/implementation/EqualsMethod$ConditionalReturn;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const/4 v3, 0x3

    .line 19
    new-array v3, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    aput-object v0, v3, v4

    .line 23
    .line 24
    aput-object p1, v3, v1

    .line 25
    .line 26
    const/4 p1, 0x2

    .line 27
    aput-object v2, v3, p1

    .line 28
    .line 29
    invoke-direct {p0, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 30
    .line 31
    .line 32
    return-object p0
.end method
