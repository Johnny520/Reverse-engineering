.class public Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Factory"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

.field private final steps:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory;",
            ">;"
        }
    .end annotation
.end field

.field private final typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/bytecode/assign/Assigner;",
            "Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iput-object p2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    iput-object p3, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;->steps:Ljava/util/List;

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
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    check-cast p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;

    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;->steps:Ljava/util/List;

    iget-object p1, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;->steps:Ljava/util/List;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v1

    :cond_5
    return v0
.end method

.method public executing(Ljava/util/List;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory;",
            ">;)",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;"
        }
    .end annotation

    .line 2
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    iget-object v3, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;->steps:Ljava/util/List;

    invoke-static {v3, p1}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;-><init>(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;Ljava/util/List;)V

    return-object v0
.end method

.method public varargs executing([Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;->executing(Ljava/util/List;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;->steps:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public make(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution;
    .locals 4

    iget-object p3, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;->steps:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_0

    sget-object p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Stubbing;->INSTANCE:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Stubbing;

    return-object p1

    :cond_0
    new-instance p3, Ljava/util/ArrayList;

    iget-object v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;->steps:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;->steps:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory;

    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v3, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-interface {v1, v2, v3, p1, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory;->make(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step;

    move-result-object v1

    invoke-interface {p3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain;

    iget-object p2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Factory;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-direct {p1, p2, v0, p3}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain;-><init>(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;Ljava/util/List;)V

    return-object p1
.end method
