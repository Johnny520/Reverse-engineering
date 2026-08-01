.class final enum Lnet/bytebuddy/implementation/bytecode/Duplication$3;
.super Lnet/bytebuddy/implementation/bytecode/Duplication;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bytecode/Duplication;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackSize;I)V
    .locals 6

    .line 1
    const/4 v5, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move v4, p4

    .line 7
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/implementation/bytecode/Duplication;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/bytecode/StackSize;ILnet/bytebuddy/implementation/bytecode/Duplication$1;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public flipOver(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 1
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/Duplication$4;->$SwitchMap$net$bytebuddy$implementation$bytecode$StackSize:[I

    .line 2
    .line 3
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->getStackSize()Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget p0, p0, v0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    if-eq p0, v0, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    if-ne p0, v0, :cond_0

    .line 18
    .line 19
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;->DOUBLE_DOUBLE:Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    const-string p0, "Cannot flip: "

    .line 23
    .line 24
    invoke-static {p1, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0

    .line 29
    :cond_1
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;->DOUBLE_SINGLE:Lnet/bytebuddy/implementation/bytecode/Duplication$WithFlip;

    .line 30
    .line 31
    return-object p0
.end method
