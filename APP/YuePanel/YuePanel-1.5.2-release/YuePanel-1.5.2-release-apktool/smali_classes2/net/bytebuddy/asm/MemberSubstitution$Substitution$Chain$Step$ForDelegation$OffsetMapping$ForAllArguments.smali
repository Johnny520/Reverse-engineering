.class public Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForAllArguments"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments$Resolved;,
        Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments$Factory;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final includeSelf:Z

.field private final nullIfEmpty:Z

.field private final source:Lnet/bytebuddy/asm/MemberSubstitution$Source;

.field private final targetComponentType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

.field private final typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;
    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;Lnet/bytebuddy/asm/MemberSubstitution$Source;ZZ)V
    .locals 0
    .param p2    # Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;->targetComponentType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    iput-object p2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    iput-object p3, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;->source:Lnet/bytebuddy/asm/MemberSubstitution$Source;

    iput-boolean p4, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;->includeSelf:Z

    iput-boolean p5, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;->nullIfEmpty:Z

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
    iget-boolean v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;->includeSelf:Z

    check-cast p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;

    iget-boolean v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;->includeSelf:Z

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-boolean v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;->nullIfEmpty:Z

    iget-boolean v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;->nullIfEmpty:Z

    if-eq v2, v3, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    if-eqz v3, :cond_5

    if-eqz v2, :cond_6

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    return v1

    :cond_5
    if-eqz v2, :cond_7

    :cond_6
    return v1

    :cond_7
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;->source:Lnet/bytebuddy/asm/MemberSubstitution$Source;

    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;->source:Lnet/bytebuddy/asm/MemberSubstitution$Source;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    return v1

    :cond_8
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;->targetComponentType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    iget-object p1, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;->targetComponentType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v1

    :cond_9
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;->targetComponentType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;->source:Lnet/bytebuddy/asm/MemberSubstitution$Source;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;->includeSelf:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;->nullIfEmpty:Z

    add-int/2addr v0, v1

    return v0
.end method

.method public resolve(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Resolved;
    .locals 8

    new-instance p3, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments$Resolved;

    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;->targetComponentType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    iget-object v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    if-nez v0, :cond_0

    move-object v2, p2

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    iget-object v3, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;->source:Lnet/bytebuddy/asm/MemberSubstitution$Source;

    iget-boolean v4, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;->includeSelf:Z

    iget-boolean v5, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments;->nullIfEmpty:Z

    move-object v0, p3

    move-object v6, p1

    move-object v7, p4

    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments$Resolved;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;Lnet/bytebuddy/asm/MemberSubstitution$Source;ZZLnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/description/method/MethodDescription;)V

    return-object p3
.end method
