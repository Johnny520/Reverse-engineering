.class public Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentLoading;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step;
.implements Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForArgumentLoading"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final index:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentLoading;->index:I

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
    iget v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentLoading;->index:I

    check-cast p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentLoading;

    iget p1, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentLoading;->index:I

    if-eq v2, p1, :cond_3

    return v1

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentLoading;->index:I

    add-int/2addr v0, v1

    return v0
.end method

.method public make(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step;
    .locals 0

    return-object p0
.end method

.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/ByteCodeElement$Member;Lnet/bytebuddy/description/type/TypeList$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/Map;I)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Resolution;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/description/ByteCodeElement$Member;",
            "Lnet/bytebuddy/description/type/TypeList$Generic;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Lnet/bytebuddy/utility/JavaConstant$MethodHandle;",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;I)",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Resolution;"
        }
    .end annotation

    iget p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentLoading;->index:I

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p4

    if-ge p1, p4, :cond_0

    new-instance p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;

    new-instance p2, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-static {p7}, Lnet/bytebuddy/implementation/bytecode/Removal;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p4

    iget p5, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentLoading;->index:I

    invoke-interface {p3, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lnet/bytebuddy/description/type/TypeDefinition;

    invoke-static {p5}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    move-result-object p5

    iget p6, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentLoading;->index:I

    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p6

    invoke-interface {p8, p6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Ljava/lang/Integer;

    invoke-virtual {p6}, Ljava/lang/Integer;->intValue()I

    move-result p6

    invoke-virtual {p5, p6}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p5

    const/4 p6, 0x2

    new-array p6, p6, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    const/4 p7, 0x0

    aput-object p4, p6, p7

    const/4 p4, 0x1

    aput-object p5, p6, p4

    invoke-direct {p2, p6}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    iget p4, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentLoading;->index:I

    invoke-interface {p3, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    invoke-direct {p1, p2, p3}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " has not "

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentLoading;->index:I

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " arguments"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
