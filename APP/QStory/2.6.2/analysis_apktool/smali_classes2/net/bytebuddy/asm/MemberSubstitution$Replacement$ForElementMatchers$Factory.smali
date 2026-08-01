.class public Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Factory"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final fieldMatcher:Lnet/bytebuddy/matcher/ElementMatcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">;"
        }
    .end annotation
.end field

.field private final includeSuperCalls:Z

.field private final includeVirtualCalls:Z

.field private final matchFieldRead:Z

.field private final matchFieldWrite:Z

.field private final methodMatcher:Lnet/bytebuddy/matcher/ElementMatcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;"
        }
    .end annotation
.end field

.field private final substitutionFactory:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory<",
            "-",
            "Lnet/bytebuddy/asm/MemberSubstitution$Target$ForMember;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;ZZZZLnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;ZZZZ",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory<",
            "-",
            "Lnet/bytebuddy/asm/MemberSubstitution$Target$ForMember;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->fieldMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->methodMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 7
    .line 8
    iput-boolean p3, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->matchFieldRead:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->matchFieldWrite:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->includeVirtualCalls:Z

    .line 13
    .line 14
    iput-boolean p6, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->includeSuperCalls:Z

    .line 15
    .line 16
    iput-object p7, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->substitutionFactory:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;

    .line 17
    .line 18
    return-void
.end method

.method public static of(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;)Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/ByteCodeElement$Member;",
            ">;",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory<",
            "-",
            "Lnet/bytebuddy/asm/MemberSubstitution$Target$ForMember;",
            ">;)",
            "Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;

    .line 2
    .line 3
    const/4 v5, 0x1

    .line 4
    const/4 v6, 0x1

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x1

    .line 7
    move-object v2, p0

    .line 8
    move-object v1, p0

    .line 9
    move-object v7, p1

    .line 10
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;ZZZZLnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static ofField(Lnet/bytebuddy/matcher/ElementMatcher;ZZLnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;)Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">;ZZ",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory<",
            "-",
            "Lnet/bytebuddy/asm/MemberSubstitution$Target$ForMember;",
            ">;)",
            "Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;

    .line 2
    .line 3
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->none()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v6, 0x0

    .line 9
    move-object v1, p0

    .line 10
    move v3, p1

    .line 11
    move v4, p2

    .line 12
    move-object v7, p3

    .line 13
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;ZZZZLnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static ofMethod(Lnet/bytebuddy/matcher/ElementMatcher;ZZLnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;)Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;ZZ",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory<",
            "-",
            "Lnet/bytebuddy/asm/MemberSubstitution$Target$ForMember;",
            ">;)",
            "Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;

    .line 2
    .line 3
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->none()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    move-object v2, p0

    .line 10
    move v5, p1

    .line 11
    move v6, p2

    .line 12
    move-object v7, p3

    .line 13
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;ZZZZLnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;)V

    .line 14
    .line 15
    .line 16
    return-object v0
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
    iget-boolean v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->matchFieldRead:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;

    .line 23
    .line 24
    iget-boolean v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->matchFieldRead:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-boolean v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->matchFieldWrite:Z

    .line 30
    .line 31
    iget-boolean v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->matchFieldWrite:Z

    .line 32
    .line 33
    if-eq v2, v3, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
    :cond_4
    iget-boolean v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->includeVirtualCalls:Z

    .line 37
    .line 38
    iget-boolean v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->includeVirtualCalls:Z

    .line 39
    .line 40
    if-eq v2, v3, :cond_5

    .line 41
    .line 42
    return v1

    .line 43
    :cond_5
    iget-boolean v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->includeSuperCalls:Z

    .line 44
    .line 45
    iget-boolean v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->includeSuperCalls:Z

    .line 46
    .line 47
    if-eq v2, v3, :cond_6

    .line 48
    .line 49
    return v1

    .line 50
    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->fieldMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 51
    .line 52
    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->fieldMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 53
    .line 54
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-nez v2, :cond_7

    .line 59
    .line 60
    return v1

    .line 61
    :cond_7
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->methodMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 62
    .line 63
    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->methodMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 64
    .line 65
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-nez v2, :cond_8

    .line 70
    .line 71
    return v1

    .line 72
    :cond_8
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->substitutionFactory:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;

    .line 73
    .line 74
    iget-object p1, p1, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->substitutionFactory:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;

    .line 75
    .line 76
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-nez p0, :cond_9

    .line 81
    .line 82
    return v1

    .line 83
    :cond_9
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
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->fieldMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(Lnet/bytebuddy/matcher/ElementMatcher;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->methodMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 19
    .line 20
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(Lnet/bytebuddy/matcher/ElementMatcher;II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-boolean v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->matchFieldRead:Z

    .line 25
    .line 26
    add-int/2addr v0, v2

    .line 27
    mul-int/2addr v0, v1

    .line 28
    iget-boolean v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->matchFieldWrite:Z

    .line 29
    .line 30
    add-int/2addr v0, v2

    .line 31
    mul-int/2addr v0, v1

    .line 32
    iget-boolean v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->includeVirtualCalls:Z

    .line 33
    .line 34
    add-int/2addr v0, v2

    .line 35
    mul-int/2addr v0, v1

    .line 36
    iget-boolean v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->includeSuperCalls:Z

    .line 37
    .line 38
    add-int/2addr v0, v2

    .line 39
    mul-int/2addr v0, v1

    .line 40
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->substitutionFactory:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    add-int/2addr p0, v0

    .line 47
    return p0
.end method

.method public make(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/asm/MemberSubstitution$Replacement;
    .locals 8

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->fieldMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->methodMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 6
    .line 7
    iget-boolean v3, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->matchFieldRead:Z

    .line 8
    .line 9
    iget-boolean v4, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->matchFieldWrite:Z

    .line 10
    .line 11
    iget-boolean v5, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->includeVirtualCalls:Z

    .line 12
    .line 13
    iget-boolean v6, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->includeSuperCalls:Z

    .line 14
    .line 15
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers$Factory;->substitutionFactory:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;

    .line 16
    .line 17
    invoke-interface {p0, p1, p2, p3}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Factory;->make(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution;

    .line 18
    .line 19
    .line 20
    move-result-object v7

    .line 21
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;ZZZZLnet/bytebuddy/asm/MemberSubstitution$Substitution;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method
