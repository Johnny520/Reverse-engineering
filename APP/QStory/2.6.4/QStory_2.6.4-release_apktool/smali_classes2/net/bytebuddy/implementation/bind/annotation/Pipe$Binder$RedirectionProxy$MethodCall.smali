.class public Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/implementation/Implementation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MethodCall"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

.field private final redirectedMethod:Lnet/bytebuddy/description/method/MethodDescription;


# direct methods
.method private constructor <init>(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->redirectedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bind/annotation/Pipe$1;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;-><init>(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;)V

    return-void
.end method

.method public static synthetic access$400(Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/description/method/MethodDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->redirectedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$500(Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;)Lnet/bytebuddy/implementation/bytecode/assign/Assigner;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->redirectedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 2
    .line 3
    invoke-interface {p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/ByteCodeElement;->isAccessibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;

    .line 15
    .line 16
    invoke-interface {p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {v0, p0, p1, v1}, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall$Appender;-><init>(Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/bind/annotation/Pipe$1;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->redirectedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 25
    .line 26
    const-string p1, " from outside of class via @Pipe proxy"

    .line 27
    .line 28
    const-string v0, "Cannot invoke "

    .line 29
    .line 30
    invoke-static {p0, v0, p1}, Landroidx/fragment/app/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-object v1
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->redirectedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->redirectedMethod:Lnet/bytebuddy/description/method/MethodDescription;

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    .locals 3

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
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->redirectedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Lnet/bytebuddy/description/method/MethodDescription;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/annotation/Pipe$Binder$RedirectionProxy$MethodCall;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v0

    .line 25
    return p0
.end method

.method public prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 1
    return-object p1
.end method
