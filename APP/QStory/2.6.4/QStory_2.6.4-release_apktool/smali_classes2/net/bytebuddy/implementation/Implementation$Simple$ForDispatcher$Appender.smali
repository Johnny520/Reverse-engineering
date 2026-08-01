.class public Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher$Appender;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Appender"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field private final implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

.field final synthetic this$0:Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher;Lnet/bytebuddy/implementation/Implementation$Target;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher$Appender;->this$0:Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher$Appender;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher$Appender;->this$0:Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher;

    .line 4
    .line 5
    invoke-static {v1}, Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher;->access$500(Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher;)Lnet/bytebuddy/implementation/Implementation$Simple$Dispatcher;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher$Appender;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 10
    .line 11
    invoke-interface {v1, v2, p3}, Lnet/bytebuddy/implementation/Implementation$Simple$Dispatcher;->apply(Lnet/bytebuddy/implementation/Implementation$Target;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher$Appender;->this$0:Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher;

    .line 28
    .line 29
    invoke-static {p0}, Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher;->access$600(Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher;)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    add-int/2addr p0, p2

    .line 34
    invoke-direct {v0, p1, p0}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 35
    .line 36
    .line 37
    return-object v0
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher$Appender;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher$Appender;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher$Appender;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher$Appender;->this$0:Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher$Appender;->this$0:Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

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
    iget-object v1, p0, Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher$Appender;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher$Appender;->this$0:Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher;

    .line 21
    .line 22
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    add-int/2addr p0, v1

    .line 27
    return p0
.end method
