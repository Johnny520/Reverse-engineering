.class public Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher$FieldPutInstruction;
.super Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher$AbstractFieldInstruction;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "FieldPutInstruction"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field final synthetic this$1:Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher$FieldPutInstruction;->this$1:Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher$AbstractFieldInstruction;-><init>(Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher;Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$1;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher$FieldPutInstruction;->this$1:Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher$FieldPutInstruction;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher$FieldPutInstruction;->this$1:Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher;->equals(Ljava/lang/Object;)Z

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

.method public getOpcode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher$FieldPutInstruction;->this$1:Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher;->this$0:Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;

    .line 4
    .line 5
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->access$400(Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher$FieldPutInstruction;->this$1:Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher;

    .line 12
    .line 13
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method

.method public resolveSize(Lnet/bytebuddy/implementation/bytecode/StackSize;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 2
    .line 3
    invoke-virtual {p1}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher$FieldPutInstruction;->this$1:Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher;

    .line 8
    .line 9
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$AccessDispatcher;->this$0:Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;

    .line 10
    .line 11
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->access$300(Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, p1

    .line 16
    mul-int/lit8 p0, p0, -0x1

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;-><init>(II)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method
