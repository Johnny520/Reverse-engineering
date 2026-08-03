.class Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Appender"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field private final instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

.field final synthetic this$0:Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;


# direct methods
.method private constructor <init>(Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;Lnet/bytebuddy/description/type/TypeDescription;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    return-void
.end method

.method public synthetic constructor <init>(Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/bind/annotation/Pipe$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;-><init>(Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;Lnet/bytebuddy/description/type/TypeDescription;)V

    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 12

    const/4 v0, 0x2

    const/4 v1, 0x1

    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnet/bytebuddy/description/field/FieldDescription;

    add-int/lit8 v7, v5, 0x1

    new-instance v8, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v9

    invoke-static {v6}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    move-result-object v6

    invoke-interface {v6}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->read()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v6

    new-array v10, v0, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    aput-object v9, v10, v4

    aput-object v6, v10, v1

    invoke-direct {v8, v10}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    aput-object v8, v3, v5

    move v5, v7

    goto :goto_0

    :cond_0
    new-instance v2, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    sget-object v5, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    invoke-virtual {v5, v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v5

    iget-object v6, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;

    invoke-static {v6}, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->access$500(Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    move-result-object v6

    const-class v7, Ljava/lang/Object;

    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v7

    iget-object v8, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;

    invoke-static {v8}, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->access$400(Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/description/method/MethodDescription;

    move-result-object v8

    invoke-interface {v8}, Lnet/bytebuddy/description/method/MethodDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;

    move-result-object v8

    invoke-interface {v8}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v8

    sget-object v9, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->DYNAMIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-interface {v6, v7, v8, v9}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v6

    new-instance v7, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-direct {v7, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    iget-object v3, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;

    invoke-static {v3}, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->access$400(Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/description/method/MethodDescription;

    move-result-object v3

    invoke-static {v3}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object v3

    iget-object v8, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;

    invoke-static {v8}, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->access$500(Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    move-result-object v8

    iget-object v10, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;

    invoke-static {v10}, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->access$400(Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/description/method/MethodDescription;

    move-result-object v10

    invoke-interface {v10}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v10

    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v11

    invoke-interface {v8, v10, v11, v9}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v8

    const/4 v9, 0x6

    new-array v9, v9, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    aput-object v5, v9, v4

    aput-object v6, v9, v1

    aput-object v7, v9, v0

    const/4 v0, 0x3

    aput-object v3, v9, v0

    const/4 v0, 0x4

    aput-object v8, v9, v0

    sget-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    const/4 v1, 0x5

    aput-object v0, v9, v1

    invoke-direct {v2, v9}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    invoke-virtual {v2, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    move-result-object p1

    new-instance p2, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    invoke-virtual {p1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    move-result p1

    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    move-result p3

    invoke-direct {p2, p1, p3}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    return-object p2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    check-cast p1, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;

    iget-object v3, p1, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;

    iget-object p1, p1, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;

    invoke-virtual {v2, p1}, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;

    invoke-virtual {v1}, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
