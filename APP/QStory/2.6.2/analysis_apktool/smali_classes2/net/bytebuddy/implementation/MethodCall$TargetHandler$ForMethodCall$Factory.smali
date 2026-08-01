.class public Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForMethodCall$Factory;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForMethodCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Factory"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final methodCall:Lnet/bytebuddy/implementation/MethodCall;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/MethodCall;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForMethodCall$Factory;->methodCall:Lnet/bytebuddy/implementation/MethodCall;

    .line 5
    .line 6
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
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForMethodCall$Factory;->methodCall:Lnet/bytebuddy/implementation/MethodCall;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForMethodCall$Factory;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForMethodCall$Factory;->methodCall:Lnet/bytebuddy/implementation/MethodCall;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/MethodCall;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForMethodCall$Factory;->methodCall:Lnet/bytebuddy/implementation/MethodCall;

    .line 12
    .line 13
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/MethodCall;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method

.method public make(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/MethodCall$TargetHandler;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForMethodCall;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/implementation/MethodCall$Appender;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForMethodCall$Factory;->methodCall:Lnet/bytebuddy/implementation/MethodCall;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v2, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;->IGNORING:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;

    .line 11
    .line 12
    invoke-direct {v1, p0, p1, v2}, Lnet/bytebuddy/implementation/MethodCall$Appender;-><init>(Lnet/bytebuddy/implementation/MethodCall;Lnet/bytebuddy/implementation/Implementation$Target;Lnet/bytebuddy/implementation/MethodCall$TerminationHandler;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForMethodCall;-><init>(Lnet/bytebuddy/implementation/MethodCall$Appender;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$ForMethodCall$Factory;->methodCall:Lnet/bytebuddy/implementation/MethodCall;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/MethodCall;->prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
