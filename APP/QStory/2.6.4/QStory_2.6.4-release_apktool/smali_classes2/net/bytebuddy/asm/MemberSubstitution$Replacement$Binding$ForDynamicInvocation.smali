.class public Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForDynamicInvocation;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForDynamicInvocation"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final arguments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;"
        }
    .end annotation
.end field

.field private final methodType:Lnet/bytebuddy/utility/JavaConstant$MethodType;

.field private final name:Ljava/lang/String;

.field private final substitution:Lnet/bytebuddy/asm/MemberSubstitution$Substitution;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution<",
            "-",
            "Lnet/bytebuddy/asm/MemberSubstitution$Target$ForDynamicInvocation;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/utility/JavaConstant$MethodType;Ljava/lang/String;Ljava/util/List;Lnet/bytebuddy/asm/MemberSubstitution$Substitution;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/utility/JavaConstant$MethodType;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution<",
            "-",
            "Lnet/bytebuddy/asm/MemberSubstitution$Target$ForDynamicInvocation;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForDynamicInvocation;->methodType:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForDynamicInvocation;->name:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForDynamicInvocation;->arguments:Ljava/util/List;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForDynamicInvocation;->substitution:Lnet/bytebuddy/asm/MemberSubstitution$Substitution;

    .line 11
    .line 12
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
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForDynamicInvocation;->name:Ljava/lang/String;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForDynamicInvocation;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForDynamicInvocation;->name:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForDynamicInvocation;->methodType:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForDynamicInvocation;->methodType:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForDynamicInvocation;->arguments:Ljava/util/List;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForDynamicInvocation;->arguments:Ljava/util/List;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForDynamicInvocation;->substitution:Lnet/bytebuddy/asm/MemberSubstitution$Substitution;

    .line 56
    .line 57
    iget-object p1, p1, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForDynamicInvocation;->substitution:Lnet/bytebuddy/asm/MemberSubstitution$Substitution;

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_6

    .line 64
    .line 65
    return v1

    .line 66
    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

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
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForDynamicInvocation;->methodType:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 13
    .line 14
    invoke-virtual {v2}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/2addr v2, v0

    .line 19
    mul-int/2addr v2, v1

    .line 20
    iget-object v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForDynamicInvocation;->name:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v2, v1, v0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForDynamicInvocation;->arguments:Ljava/util/List;

    .line 27
    .line 28
    invoke-static {v2, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/util/List;II)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForDynamicInvocation;->substitution:Lnet/bytebuddy/asm/MemberSubstitution$Substitution;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    add-int/2addr p0, v0

    .line 39
    return p0
.end method

.method public isBound()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public make(Lnet/bytebuddy/description/type/TypeList$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Lnet/bytebuddy/implementation/bytecode/StackManipulation;I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 7

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForDynamicInvocation;->substitution:Lnet/bytebuddy/asm/MemberSubstitution$Substitution;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForDynamicInvocation;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForDynamicInvocation;->methodType:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForDynamicInvocation;->name:Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForDynamicInvocation;->arguments:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v1, v2, v3, p0}, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForDynamicInvocation;-><init>(Lnet/bytebuddy/utility/JavaConstant$MethodType;Ljava/lang/String;Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    move-object v2, p1

    .line 15
    move-object v3, p2

    .line 16
    move-object v4, p3

    .line 17
    move-object v5, p4

    .line 18
    move v6, p5

    .line 19
    invoke-interface/range {v0 .. v6}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution;->resolve(Lnet/bytebuddy/asm/MemberSubstitution$Target;Lnet/bytebuddy/description/type/TypeList$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Lnet/bytebuddy/implementation/bytecode/StackManipulation;I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
