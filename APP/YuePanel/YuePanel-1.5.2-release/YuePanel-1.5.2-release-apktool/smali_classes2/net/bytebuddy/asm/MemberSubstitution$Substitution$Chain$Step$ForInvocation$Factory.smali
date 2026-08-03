.class public Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForInvocation$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForInvocation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Factory"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

.field private final substitutions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Constructor;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)V"
        }
    .end annotation

    .line 2
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    invoke-direct {p0, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForInvocation$Factory;-><init>(Lnet/bytebuddy/description/method/MethodDescription;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Method;)V
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    invoke-direct {p0, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForInvocation$Factory;-><init>(Lnet/bytebuddy/description/method/MethodDescription;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/description/method/MethodDescription;)V
    .locals 1

    .line 3
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForInvocation$Factory;-><init>(Lnet/bytebuddy/description/method/MethodDescription;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/description/method/MethodDescription;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForInvocation$Factory;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForInvocation$Factory;->substitutions:Ljava/util/Map;

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
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForInvocation$Factory;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

    check-cast p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForInvocation$Factory;

    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForInvocation$Factory;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForInvocation$Factory;->substitutions:Ljava/util/Map;

    iget-object p1, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForInvocation$Factory;->substitutions:Ljava/util/Map;

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

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForInvocation$Factory;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForInvocation$Factory;->substitutions:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public make(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step;
    .locals 1

    new-instance p3, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForInvocation;

    iget-object p4, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForInvocation$Factory;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

    iget-object v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForInvocation$Factory;->substitutions:Ljava/util/Map;

    invoke-direct {p3, p4, v0, p1, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForInvocation;-><init>(Lnet/bytebuddy/description/method/MethodDescription;Ljava/util/Map;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    return-object p3
.end method
