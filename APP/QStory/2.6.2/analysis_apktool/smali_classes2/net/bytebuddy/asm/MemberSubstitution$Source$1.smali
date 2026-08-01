.class final enum Lnet/bytebuddy/asm/MemberSubstitution$Source$1;
.super Lnet/bytebuddy/asm/MemberSubstitution$Source;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Source;-><init>(Ljava/lang/String;ILnet/bytebuddy/asm/MemberSubstitution$1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public argument(ILnet/bytebuddy/description/type/TypeList$Generic;Ljava/util/Map;Lnet/bytebuddy/asm/MemberSubstitution$Target;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lnet/bytebuddy/description/type/TypeList$Generic;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;",
            "Lnet/bytebuddy/asm/MemberSubstitution$Target;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ")",
            "Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-interface {p4}, Lnet/bytebuddy/asm/MemberSubstitution$Target;->isStaticDispatch()Z

    .line 6
    .line 7
    .line 8
    move-result p5

    .line 9
    xor-int/lit8 p5, p5, 0x1

    .line 10
    .line 11
    sub-int/2addr p0, p5

    .line 12
    if-ge p1, p0, :cond_0

    .line 13
    .line 14
    new-instance p0, Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;

    .line 15
    .line 16
    invoke-interface {p4}, Lnet/bytebuddy/asm/MemberSubstitution$Target;->isStaticDispatch()Z

    .line 17
    .line 18
    .line 19
    move-result p5

    .line 20
    xor-int/lit8 p5, p5, 0x1

    .line 21
    .line 22
    add-int/2addr p5, p1

    .line 23
    invoke-interface {p2, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    check-cast p2, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 28
    .line 29
    invoke-interface {p4}, Lnet/bytebuddy/asm/MemberSubstitution$Target;->isStaticDispatch()Z

    .line 30
    .line 31
    .line 32
    move-result p4

    .line 33
    xor-int/lit8 p4, p4, 0x1

    .line 34
    .line 35
    add-int/2addr p1, p4

    .line 36
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-direct {p0, p2, p1}, Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;I)V

    .line 51
    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_0
    const/4 p0, 0x0

    .line 55
    return-object p0
.end method

.method public arguments(ZLnet/bytebuddy/description/type/TypeList$Generic;Ljava/util/Map;Lnet/bytebuddy/asm/MemberSubstitution$Target;Lnet/bytebuddy/description/method/MethodDescription;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lnet/bytebuddy/description/type/TypeList$Generic;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;",
            "Lnet/bytebuddy/asm/MemberSubstitution$Target;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ")",
            "Ljava/util/List<",
            "Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p5

    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    invoke-interface {p4}, Lnet/bytebuddy/asm/MemberSubstitution$Target;->isStaticDispatch()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    move v2, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v2, v0

    .line 20
    :goto_0
    sub-int/2addr p5, v2

    .line 21
    invoke-direct {p0, p5}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p4}, Lnet/bytebuddy/asm/MemberSubstitution$Target;->isStaticDispatch()Z

    .line 25
    .line 26
    .line 27
    move-result p4

    .line 28
    if-nez p4, :cond_2

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v0, v1

    .line 34
    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-ge v0, p1, :cond_3

    .line 39
    .line 40
    new-instance p1, Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;

    .line 41
    .line 42
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p4

    .line 46
    check-cast p4, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 47
    .line 48
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object p5

    .line 52
    invoke-interface {p3, p5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p5

    .line 56
    check-cast p5, Ljava/lang/Integer;

    .line 57
    .line 58
    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result p5

    .line 62
    invoke-direct {p1, p4, p5}, Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    add-int/lit8 v0, v0, 0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    return-object p0
.end method

.method public handle(Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;
    .locals 0

    .line 1
    return-object p1
.end method

.method public isRepresentable(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;Lnet/bytebuddy/asm/MemberSubstitution$Target;Lnet/bytebuddy/description/method/MethodDescription;)Z
    .locals 0

    .line 1
    instance-of p0, p2, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForMember;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    check-cast p2, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForMember;

    .line 6
    .line 7
    invoke-virtual {p2}, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForMember;->getMember()Lnet/bytebuddy/description/ByteCodeElement$Member;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p1, p0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;->isRepresentable(Lnet/bytebuddy/description/ByteCodeElement$Member;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public resolve(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;Lnet/bytebuddy/asm/MemberSubstitution$Target;Lnet/bytebuddy/description/type/TypeList$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 0

    .line 1
    check-cast p2, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForMember;

    .line 2
    .line 3
    invoke-virtual {p2}, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForMember;->getMember()Lnet/bytebuddy/description/ByteCodeElement$Member;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p3}, Lnet/bytebuddy/description/type/TypeList$Generic;->asErasures()Lnet/bytebuddy/description/type/TypeList;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-interface {p4}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-virtual {p1, p0, p2, p3}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;->resolve(Lnet/bytebuddy/description/ByteCodeElement$Member;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public self(Lnet/bytebuddy/description/type/TypeList$Generic;Ljava/util/Map;Lnet/bytebuddy/asm/MemberSubstitution$Target;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeList$Generic;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;",
            "Lnet/bytebuddy/asm/MemberSubstitution$Target;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ")",
            "Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-interface {p3}, Lnet/bytebuddy/asm/MemberSubstitution$Target;->isStaticDispatch()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance p0, Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;

    .line 10
    .line 11
    const/4 p3, 0x0

    .line 12
    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 17
    .line 18
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-interface {p2, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    check-cast p2, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;I)V

    .line 33
    .line 34
    .line 35
    return-object p0
.end method
