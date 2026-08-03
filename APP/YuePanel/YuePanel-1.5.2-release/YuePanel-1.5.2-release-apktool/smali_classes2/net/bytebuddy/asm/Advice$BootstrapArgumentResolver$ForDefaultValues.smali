.class public Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForDefaultValues"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues$Factory;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private final exit:Z


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iput-boolean p2, p0, Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues;->exit:Z

    return-void
.end method


# virtual methods
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
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues;->exit:Z

    check-cast p1, Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues;

    iget-boolean v3, p1, Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues;->exit:Z

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues;->exit:Z

    add-int/2addr v0, v1

    return v0
.end method

.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ")",
            "Ljava/util/List<",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x4

    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->isTypeInitializer()Z

    move-result v5

    if-eqz v5, :cond_0

    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v5}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v5

    invoke-interface {v5}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object v5

    iget-boolean v6, p0, Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues;->exit:Z

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v6}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object v6

    invoke-static {p1}, Lnet/bytebuddy/utility/JavaConstant$Simple;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object p1

    invoke-interface {p2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object p2

    new-array v4, v4, [Lnet/bytebuddy/utility/JavaConstant;

    aput-object v5, v4, v3

    aput-object v6, v4, v2

    aput-object p1, v4, v1

    aput-object p2, v4, v0

    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v5}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v5

    invoke-interface {v5}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object v5

    iget-boolean v6, p0, Lnet/bytebuddy/asm/Advice$BootstrapArgumentResolver$ForDefaultValues;->exit:Z

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v6}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object v6

    invoke-static {p1}, Lnet/bytebuddy/utility/JavaConstant$Simple;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object p1

    invoke-interface {p2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object v7

    invoke-interface {p2}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    move-result-object p2

    check-cast p2, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-static {p2}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->of(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    move-result-object p2

    const/4 v8, 0x5

    new-array v8, v8, [Lnet/bytebuddy/utility/JavaConstant;

    aput-object v5, v8, v3

    aput-object v6, v8, v2

    aput-object p1, v8, v1

    aput-object v7, v8, v0

    aput-object p2, v8, v4

    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
