.class public Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump$BeforeInstruction;
.super Lnet/bytebuddy/implementation/bytecode/StackManipulation$AbstractBase;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "BeforeInstruction"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field final synthetic this$0:Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump$BeforeInstruction;->this$0:Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;

    .line 2
    .line 3
    invoke-direct {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$AbstractBase;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 2

    .line 1
    iget-object p2, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump$BeforeInstruction;->this$0:Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;

    .line 2
    .line 3
    invoke-static {p2}, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->access$300(Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;)Lnet/bytebuddy/description/method/MethodDescription;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    const/16 v0, 0x3a

    .line 12
    .line 13
    invoke-virtual {p1, v0, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump$BeforeInstruction;->this$0:Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;

    .line 17
    .line 18
    invoke-static {p2}, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->access$300(Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;)Lnet/bytebuddy/description/method/MethodDescription;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    add-int/lit8 p2, p2, 0x1

    .line 27
    .line 28
    invoke-virtual {p1, v0, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 29
    .line 30
    .line 31
    iget-object p2, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump$BeforeInstruction;->this$0:Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;

    .line 32
    .line 33
    invoke-static {p2}, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->access$300(Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;)Lnet/bytebuddy/description/method/MethodDescription;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    add-int/lit8 p2, p2, 0x1

    .line 42
    .line 43
    const/16 v0, 0x19

    .line 44
    .line 45
    invoke-virtual {p1, v0, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 46
    .line 47
    .line 48
    iget-object p2, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump$BeforeInstruction;->this$0:Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;

    .line 49
    .line 50
    invoke-static {p2}, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->access$300(Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;)Lnet/bytebuddy/description/method/MethodDescription;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    invoke-virtual {p1, v0, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 59
    .line 60
    .line 61
    iget-object p2, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump$BeforeInstruction;->this$0:Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;

    .line 62
    .line 63
    invoke-static {p2}, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->access$400(Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;)Lnet/bytebuddy/jar/asm/Label;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    const/16 v1, 0xc6

    .line 68
    .line 69
    invoke-virtual {p1, v1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 70
    .line 71
    .line 72
    iget-object p2, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump$BeforeInstruction;->this$0:Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;

    .line 73
    .line 74
    invoke-static {p2}, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->access$500(Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;)Lnet/bytebuddy/jar/asm/Label;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-virtual {p1, v1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 79
    .line 80
    .line 81
    iget-object p2, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump$BeforeInstruction;->this$0:Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;

    .line 82
    .line 83
    invoke-static {p2}, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->access$300(Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;)Lnet/bytebuddy/description/method/MethodDescription;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    add-int/lit8 p2, p2, 0x1

    .line 92
    .line 93
    invoke-virtual {p1, v0, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 94
    .line 95
    .line 96
    iget-object p0, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump$BeforeInstruction;->this$0:Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;

    .line 97
    .line 98
    invoke-static {p0}, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->access$300(Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;)Lnet/bytebuddy/description/method/MethodDescription;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    invoke-virtual {p1, v0, p0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 107
    .line 108
    .line 109
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->ZERO:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 110
    .line 111
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-object p0, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump$BeforeInstruction;->this$0:Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump$BeforeInstruction;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump$BeforeInstruction;->this$0:Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump$BeforeInstruction;->this$0:Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;

    .line 12
    .line 13
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/EqualsMethod$NullValueGuard$UsingJump;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method
