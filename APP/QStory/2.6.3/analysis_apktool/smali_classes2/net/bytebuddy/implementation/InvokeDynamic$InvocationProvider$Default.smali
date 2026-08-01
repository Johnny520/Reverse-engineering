.class public Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Default"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final argumentProviders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final nameProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider;

.field private final returnTypeProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider$ForInterceptedMethod;->INSTANCE:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider$ForInterceptedMethod;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider$ForInterceptedMethod;->INSTANCE:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider$ForInterceptedMethod;

    .line 4
    .line 5
    sget-object v2, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForInterceptedMethodInstanceAndParameters;->INSTANCE:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$ForInterceptedMethodInstanceAndParameters;

    .line 6
    .line 7
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {p0, v0, v1, v2}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;-><init>(Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider;Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider;",
            "Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;",
            ">;)V"
        }
    .end annotation

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->nameProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider;

    .line 17
    iput-object p2, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->returnTypeProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider;

    .line 18
    iput-object p3, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->argumentProviders:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public appendArgument(Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->nameProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->returnTypeProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider;

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->argumentProviders:Ljava/util/List;

    .line 8
    .line 9
    invoke-static {p0, p1}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, v1, v2, p0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;-><init>(Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider;Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public appendArguments(Ljava/util/List;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;",
            ">;)",
            "Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->nameProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->returnTypeProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider;

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->argumentProviders:Ljava/util/List;

    .line 8
    .line 9
    invoke-static {p0, p1}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, v1, v2, p0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;-><init>(Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider;Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->nameProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->nameProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->returnTypeProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->returnTypeProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    iget-object p0, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->argumentProviders:Ljava/util/List;

    .line 45
    .line 46
    iget-object p1, p1, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->argumentProviders:Ljava/util/List;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
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
    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->nameProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider;

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
    iget-object v0, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->returnTypeProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v1

    .line 27
    mul-int/lit8 v0, v0, 0x1f

    .line 28
    .line 29
    iget-object p0, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->argumentProviders:Ljava/util/List;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    add-int/2addr p0, v0

    .line 36
    return p0
.end method

.method public make(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->nameProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider;

    .line 4
    .line 5
    invoke-interface {v1, p1}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider;->resolve(Lnet/bytebuddy/description/method/MethodDescription;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->returnTypeProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider;

    .line 10
    .line 11
    invoke-interface {v2, p1}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider;->resolve(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object p0, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->argumentProviders:Ljava/util/List;

    .line 16
    .line 17
    invoke-direct {v0, v1, v2, p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Lnet/bytebuddy/description/method/MethodDescription;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public bridge synthetic make(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Target;
    .locals 0

    .line 21
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->make(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;

    move-result-object p0

    return-object p0
.end method

.method public prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->argumentProviders:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;

    .line 18
    .line 19
    invoke-interface {v0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;->prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-object p1
.end method

.method public withNameProvider(Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->returnTypeProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->argumentProviders:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {v0, p1, v1, p0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;-><init>(Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider;Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public withReturnTypeProvider(Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->nameProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->argumentProviders:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {v0, v1, p1, p0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;-><init>(Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider;Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public withoutArguments()Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->nameProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;->returnTypeProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider;

    .line 6
    .line 7
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 8
    .line 9
    invoke-direct {v0, v1, p0, v2}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;-><init>(Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$NameProvider;Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ReturnTypeProvider;Ljava/util/List;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
