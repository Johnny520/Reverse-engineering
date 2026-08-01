.class public Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/asm/MemberSubstitution$Replacement;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Replacement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForDynamicInvocation"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation$Factory;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final argumentsMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "-",
            "Ljava/util/List<",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;>;"
        }
    .end annotation
.end field

.field private final handleMatcher:Lnet/bytebuddy/matcher/ElementMatcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/utility/JavaConstant$MethodHandle;",
            ">;"
        }
    .end annotation
.end field

.field private final nameMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "-",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

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

.field private final typeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "-",
            "Lnet/bytebuddy/utility/JavaConstant$MethodType;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/matcher/ElementMatcher$Junction;Lnet/bytebuddy/asm/MemberSubstitution$Substitution;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/utility/JavaConstant$MethodHandle;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "-",
            "Ljava/lang/String;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "-",
            "Lnet/bytebuddy/utility/JavaConstant$MethodType;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher$Junction<",
            "-",
            "Ljava/util/List<",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;>;",
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
    iput-object p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;->handleMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;->nameMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;->typeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;->argumentsMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;->substitution:Lnet/bytebuddy/asm/MemberSubstitution$Substitution;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public bind(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/field/FieldDescription;Z)Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;
    .locals 0

    .line 45
    sget-object p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$Unresolved;->INSTANCE:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$Unresolved;

    return-object p0
.end method

.method public bind(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;)Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;
    .locals 0

    .line 44
    sget-object p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$Unresolved;->INSTANCE:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$Unresolved;

    return-object p0
.end method

.method public bind(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Lnet/bytebuddy/utility/JavaConstant$MethodType;Ljava/lang/String;Ljava/util/List;)Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            "Lnet/bytebuddy/utility/JavaConstant$MethodHandle;",
            "Lnet/bytebuddy/utility/JavaConstant$MethodType;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;)",
            "Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;->handleMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 2
    .line 3
    invoke-interface {p1, p3}, Lnet/bytebuddy/matcher/ElementMatcher;->matches(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;->nameMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 10
    .line 11
    invoke-interface {p1, p5}, Lnet/bytebuddy/matcher/ElementMatcher;->matches(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;->typeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 18
    .line 19
    invoke-interface {p1, p4}, Lnet/bytebuddy/matcher/ElementMatcher;->matches(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;->argumentsMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 26
    .line 27
    invoke-interface {p1, p6}, Lnet/bytebuddy/matcher/ElementMatcher;->matches(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    new-instance p1, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForDynamicInvocation;

    .line 34
    .line 35
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;->substitution:Lnet/bytebuddy/asm/MemberSubstitution$Substitution;

    .line 36
    .line 37
    invoke-direct {p1, p4, p5, p6, p0}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$ForDynamicInvocation;-><init>(Lnet/bytebuddy/utility/JavaConstant$MethodType;Ljava/lang/String;Ljava/util/List;Lnet/bytebuddy/asm/MemberSubstitution$Substitution;)V

    .line 38
    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_0
    sget-object p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$Unresolved;->INSTANCE:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding$Unresolved;

    .line 42
    .line 43
    return-object p0
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
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;->handleMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;->handleMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

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
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;->nameMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;->nameMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

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
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;->typeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;->typeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

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
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;->argumentsMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 56
    .line 57
    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;->argumentsMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_6

    .line 64
    .line 65
    return v1

    .line 66
    :cond_6
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;->substitution:Lnet/bytebuddy/asm/MemberSubstitution$Substitution;

    .line 67
    .line 68
    iget-object p1, p1, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;->substitution:Lnet/bytebuddy/asm/MemberSubstitution$Substitution;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-nez p0, :cond_7

    .line 75
    .line 76
    return v1

    .line 77
    :cond_7
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
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;->handleMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(Lnet/bytebuddy/matcher/ElementMatcher;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;->nameMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    add-int/2addr v2, v0

    .line 25
    mul-int/2addr v2, v1

    .line 26
    iget-object v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;->typeMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    add-int/2addr v0, v2

    .line 33
    mul-int/2addr v0, v1

    .line 34
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;->argumentsMatcher:Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v2, v0

    .line 41
    mul-int/2addr v2, v1

    .line 42
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;->substitution:Lnet/bytebuddy/asm/MemberSubstitution$Substitution;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    add-int/2addr p0, v2

    .line 49
    return p0
.end method
