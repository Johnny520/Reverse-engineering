.class public Lnet/bytebuddy/implementation/bytecode/member/HandleInvocation;
.super Lnet/bytebuddy/implementation/bytecode/StackManipulation$AbstractBase;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final INVOKE_EXACT:Ljava/lang/String; = "invokeExact"

.field private static final METHOD_HANDLE_NAME:Ljava/lang/String; = "java/lang/invoke/MethodHandle"


# instance fields
.field private final methodType:Lnet/bytebuddy/utility/JavaConstant$MethodType;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/utility/JavaConstant$MethodType;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/bytecode/member/HandleInvocation;->methodType:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 6

    .line 1
    iget-object p2, p0, Lnet/bytebuddy/implementation/bytecode/member/HandleInvocation;->methodType:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 2
    .line 3
    invoke-virtual {p2}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getDescriptor()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v4

    .line 7
    const/4 v5, 0x0

    .line 8
    const/16 v1, 0xb6

    .line 9
    .line 10
    const-string v2, "java/lang/invoke/MethodHandle"

    .line 11
    .line 12
    const-string v3, "invokeExact"

    .line 13
    .line 14
    move-object v0, p1

    .line 15
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lnet/bytebuddy/implementation/bytecode/member/HandleInvocation;->methodType:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 19
    .line 20
    invoke-virtual {p1}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->getStackSize()Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/member/HandleInvocation;->methodType:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 33
    .line 34
    invoke-virtual {p0}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getParameterTypes()Lnet/bytebuddy/description/type/TypeList;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeList;->getStackSize()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    sub-int/2addr p1, p0

    .line 43
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 44
    .line 45
    const/4 p2, 0x0

    .line 46
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;-><init>(II)V

    .line 51
    .line 52
    .line 53
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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/member/HandleInvocation;->methodType:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/bytecode/member/HandleInvocation;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/implementation/bytecode/member/HandleInvocation;->methodType:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/member/HandleInvocation;->methodType:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 12
    .line 13
    invoke-virtual {p0}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method
