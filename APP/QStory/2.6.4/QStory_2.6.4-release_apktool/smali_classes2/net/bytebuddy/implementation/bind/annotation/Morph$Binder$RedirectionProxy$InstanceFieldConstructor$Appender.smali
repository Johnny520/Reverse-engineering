.class public Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$InstanceFieldConstructor$Appender;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$InstanceFieldConstructor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Appender"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/Implementation$Target;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "target"

    .line 13
    .line 14
    invoke-static {v0}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {p1, v0}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lnet/bytebuddy/description/field/FieldList;

    .line 23
    .line 24
    invoke-interface {p1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lnet/bytebuddy/description/field/FieldDescription;

    .line 29
    .line 30
    iput-object p1, p0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$InstanceFieldConstructor$Appender;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 6

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 2
    .line 3
    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$StaticFieldConstructor;->INSTANCE:Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$StaticFieldConstructor;

    .line 8
    .line 9
    invoke-static {v2}, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$StaticFieldConstructor;->access$000(Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$StaticFieldConstructor;)Lnet/bytebuddy/description/method/MethodDescription;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v2}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {p3}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->allArgumentsOf(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess$MethodLoading;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess$MethodLoading;->prependThisReference()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$InstanceFieldConstructor$Appender;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    .line 26
    .line 27
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-interface {p0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->write()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const/4 v4, 0x5

    .line 36
    new-array v4, v4, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    aput-object v1, v4, v5

    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    aput-object v2, v4, v1

    .line 43
    .line 44
    const/4 v1, 0x2

    .line 45
    aput-object v3, v4, v1

    .line 46
    .line 47
    const/4 v1, 0x3

    .line 48
    aput-object p0, v4, v1

    .line 49
    .line 50
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->VOID:Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;

    .line 51
    .line 52
    const/4 v1, 0x4

    .line 53
    aput-object p0, v4, v1

    .line 54
    .line 55
    invoke-direct {v0, v4}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    new-instance p1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 63
    .line 64
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    invoke-direct {p1, p0, p2}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 73
    .line 74
    .line 75
    return-object p1
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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$InstanceFieldConstructor$Appender;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$InstanceFieldConstructor$Appender;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$InstanceFieldConstructor$Appender;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/annotation/Morph$Binder$RedirectionProxy$InstanceFieldConstructor$Appender;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method
