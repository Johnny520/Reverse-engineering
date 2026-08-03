.class final enum Lnet/bytebuddy/asm/MemberSubstitution$Source$1;
.super Lnet/bytebuddy/asm/MemberSubstitution$Source;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Source;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Source;-><init>(Ljava/lang/String;ILnet/bytebuddy/asm/MemberSubstitution$1;)V

    return-void
.end method


# virtual methods
.method public argument(ILnet/bytebuddy/description/type/TypeList$Generic;Ljava/util/Map;Lnet/bytebuddy/description/ByteCodeElement$Member;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lnet/bytebuddy/description/type/TypeList$Generic;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;",
            "Lnet/bytebuddy/description/ByteCodeElement$Member;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ")",
            "Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p5

    invoke-interface {p4}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    sub-int/2addr p5, v0

    if-ge p1, p5, :cond_0

    new-instance p5, Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;

    invoke-interface {p4}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    add-int/2addr v0, p1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    invoke-interface {p4}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    move-result p4

    xor-int/lit8 p4, p4, 0x1

    add-int/2addr p1, p4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {p5, p2, p1}, Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;I)V

    goto :goto_0

    :cond_0
    const/4 p5, 0x0

    :goto_0
    return-object p5
.end method

.method public arguments(ZLnet/bytebuddy/description/type/TypeList$Generic;Ljava/util/Map;Lnet/bytebuddy/description/ByteCodeElement$Member;Lnet/bytebuddy/description/method/MethodDescription;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lnet/bytebuddy/description/type/TypeList$Generic;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;",
            "Lnet/bytebuddy/description/ByteCodeElement$Member;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ")",
            "Ljava/util/List<",
            "Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;",
            ">;"
        }
    .end annotation

    new-instance p5, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez p1, :cond_0

    invoke-interface {p4}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    move-result v3

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    sub-int/2addr v0, v3

    invoke-direct {p5, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p4}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    move-result p4

    if-nez p4, :cond_2

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v1, p1, :cond_3

    new-instance p1, Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p1, p4, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;I)V

    invoke-interface {p5, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return-object p5
.end method

.method public element(Lnet/bytebuddy/description/ByteCodeElement$Member;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/description/ByteCodeElement$Member;
    .locals 0

    return-object p1
.end method

.method public handle(Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;
    .locals 0

    return-object p1
.end method

.method public isRepresentable(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;Lnet/bytebuddy/description/ByteCodeElement$Member;Lnet/bytebuddy/description/method/MethodDescription;)Z
    .locals 0

    invoke-virtual {p1, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;->isRepresentable(Lnet/bytebuddy/description/ByteCodeElement$Member;)Z

    move-result p1

    return p1
.end method

.method public resolve(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;Lnet/bytebuddy/description/ByteCodeElement$Member;Lnet/bytebuddy/description/type/TypeList$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 0

    invoke-interface {p3}, Lnet/bytebuddy/description/type/TypeList$Generic;->asErasures()Lnet/bytebuddy/description/type/TypeList;

    move-result-object p3

    invoke-interface {p4}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p4

    invoke-virtual {p1, p2, p3, p4}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;->resolve(Lnet/bytebuddy/description/ByteCodeElement$Member;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p1

    return-object p1
.end method

.method public self(Lnet/bytebuddy/description/type/TypeList$Generic;Ljava/util/Map;Lnet/bytebuddy/description/ByteCodeElement$Member;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeList$Generic;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;",
            "Lnet/bytebuddy/description/ByteCodeElement$Member;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ")",
            "Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    invoke-interface {p3}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    move-result p3

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance p3, Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;

    const/4 p4, 0x0

    invoke-interface {p1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p2, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {p3, p1, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;I)V

    move-object p1, p3

    :goto_0
    return-object p1
.end method
