.class public Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver$StreamWriting;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "StreamWriting"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final delegate:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

.field private final printStream:Ljava/io/PrintStream;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;Ljava/io/PrintStream;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver$StreamWriting;->delegate:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 7
    .line 8
    return-void
.end method

.method public static toSystemError()Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;
    .locals 1

    .line 9
    sget-object v0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver$Default;->INSTANCE:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver$Default;

    invoke-static {v0}, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver$StreamWriting;->toSystemError(Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;)Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    move-result-object v0

    return-object v0
.end method

.method public static toSystemError(Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;)Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver$StreamWriting;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver$StreamWriting;-><init>(Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;Ljava/io/PrintStream;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static toSystemOut()Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;
    .locals 1

    .line 9
    sget-object v0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver$Default;->INSTANCE:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver$Default;

    invoke-static {v0}, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver$StreamWriting;->toSystemOut(Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;)Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    move-result-object v0

    return-object v0
.end method

.method public static toSystemOut(Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;)Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver$StreamWriting;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver$StreamWriting;-><init>(Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;Ljava/io/PrintStream;)V

    .line 6
    .line 7
    .line 8
    return-object v0
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver$StreamWriting;->delegate:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver$StreamWriting;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver$StreamWriting;->delegate:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver$StreamWriting;->printStream:Ljava/io/PrintStream;

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
    iget-object v1, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver$StreamWriting;->delegate:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    add-int/2addr p0, v1

    .line 27
    return p0
.end method

.method public resolve(Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;Lnet/bytebuddy/description/method/MethodDescription;Ljava/util/List;)Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding;",
            ">;)",
            "Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver$StreamWriting;->delegate:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;->resolve(Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;Lnet/bytebuddy/description/method/MethodDescription;Ljava/util/List;)Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 8
    .line 9
    new-instance p3, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v0, "Binding "

    .line 12
    .line 13
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p2, " as delegation to "

    .line 20
    .line 21
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding;->getTarget()Lnet/bytebuddy/description/method/MethodDescription;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p0, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object p1
.end method
