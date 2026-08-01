.class public Lnet/bytebuddy/asm/ModifierAdjustment;
.super Lnet/bytebuddy/asm/AsmVisitorWrapper$AbstractBase;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/ModifierAdjustment$ModifierAdjustingClassVisitor;,
        Lnet/bytebuddy/asm/ModifierAdjustment$Adjustment;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final fieldAdjustments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/asm/ModifierAdjustment$Adjustment<",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;>;"
        }
    .end annotation
.end field

.field private final methodAdjustments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/asm/ModifierAdjustment$Adjustment<",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;>;"
        }
    .end annotation
.end field

.field private final typeAdjustments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/asm/ModifierAdjustment$Adjustment<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {p0, v0, v0, v0}, Lnet/bytebuddy/asm/ModifierAdjustment;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lnet/bytebuddy/asm/ModifierAdjustment$Adjustment<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;>;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/asm/ModifierAdjustment$Adjustment<",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;>;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/asm/ModifierAdjustment$Adjustment<",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/asm/AsmVisitorWrapper$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/ModifierAdjustment;->typeAdjustments:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/ModifierAdjustment;->fieldAdjustments:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/ModifierAdjustment;->methodAdjustments:Ljava/util/List;

    .line 9
    .line 10
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
    iget-object v2, p0, Lnet/bytebuddy/asm/ModifierAdjustment;->typeAdjustments:Ljava/util/List;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/ModifierAdjustment;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/asm/ModifierAdjustment;->typeAdjustments:Ljava/util/List;

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
    iget-object v2, p0, Lnet/bytebuddy/asm/ModifierAdjustment;->fieldAdjustments:Ljava/util/List;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/asm/ModifierAdjustment;->fieldAdjustments:Ljava/util/List;

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
    iget-object p0, p0, Lnet/bytebuddy/asm/ModifierAdjustment;->methodAdjustments:Ljava/util/List;

    .line 45
    .line 46
    iget-object p1, p1, Lnet/bytebuddy/asm/ModifierAdjustment;->methodAdjustments:Ljava/util/List;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
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
    iget-object v2, p0, Lnet/bytebuddy/asm/ModifierAdjustment;->typeAdjustments:Ljava/util/List;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/util/List;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/asm/ModifierAdjustment;->fieldAdjustments:Ljava/util/List;

    .line 19
    .line 20
    invoke-static {v2, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/util/List;II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object p0, p0, Lnet/bytebuddy/asm/ModifierAdjustment;->methodAdjustments:Ljava/util/List;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    add-int/2addr p0, v0

    .line 31
    return p0
.end method

.method public withConstructorModifiers(Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;",
            ">;)",
            "Lnet/bytebuddy/asm/ModifierAdjustment;"
        }
    .end annotation

    .line 14
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lnet/bytebuddy/asm/ModifierAdjustment;->withConstructorModifiers(Lnet/bytebuddy/matcher/ElementMatcher;Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;

    move-result-object p0

    return-object p0
.end method

.method public withConstructorModifiers(Lnet/bytebuddy/matcher/ElementMatcher;Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;",
            ">;)",
            "Lnet/bytebuddy/asm/ModifierAdjustment;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isConstructor()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/asm/ModifierAdjustment;->withInvokableModifiers(Lnet/bytebuddy/matcher/ElementMatcher;Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public varargs withConstructorModifiers(Lnet/bytebuddy/matcher/ElementMatcher;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/asm/ModifierAdjustment;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;[",
            "Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;",
            ")",
            "Lnet/bytebuddy/asm/ModifierAdjustment;"
        }
    .end annotation

    .line 15
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/asm/ModifierAdjustment;->withConstructorModifiers(Lnet/bytebuddy/matcher/ElementMatcher;Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;

    move-result-object p0

    return-object p0
.end method

.method public varargs withConstructorModifiers([Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/asm/ModifierAdjustment;
    .locals 0

    .line 16
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/ModifierAdjustment;->withConstructorModifiers(Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;

    move-result-object p0

    return-object p0
.end method

.method public withFieldModifiers(Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;",
            ">;)",
            "Lnet/bytebuddy/asm/ModifierAdjustment;"
        }
    .end annotation

    .line 26
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lnet/bytebuddy/asm/ModifierAdjustment;->withFieldModifiers(Lnet/bytebuddy/matcher/ElementMatcher;Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;

    move-result-object p0

    return-object p0
.end method

.method public withFieldModifiers(Lnet/bytebuddy/matcher/ElementMatcher;Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;",
            ">;)",
            "Lnet/bytebuddy/asm/ModifierAdjustment;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/ModifierAdjustment;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/ModifierAdjustment;->typeAdjustments:Ljava/util/List;

    .line 4
    .line 5
    new-instance v2, Lnet/bytebuddy/asm/ModifierAdjustment$Adjustment;

    .line 6
    .line 7
    invoke-static {p2}, Lnet/bytebuddy/description/modifier/ModifierContributor$Resolver;->of(Ljava/util/Collection;)Lnet/bytebuddy/description/modifier/ModifierContributor$Resolver;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-direct {v2, p1, p2}, Lnet/bytebuddy/asm/ModifierAdjustment$Adjustment;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/description/modifier/ModifierContributor$Resolver;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lnet/bytebuddy/asm/ModifierAdjustment;->fieldAdjustments:Ljava/util/List;

    .line 15
    .line 16
    invoke-static {v2, p1}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p0, p0, Lnet/bytebuddy/asm/ModifierAdjustment;->methodAdjustments:Ljava/util/List;

    .line 21
    .line 22
    invoke-direct {v0, v1, p1, p0}, Lnet/bytebuddy/asm/ModifierAdjustment;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public varargs withFieldModifiers(Lnet/bytebuddy/matcher/ElementMatcher;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;)Lnet/bytebuddy/asm/ModifierAdjustment;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;[",
            "Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;",
            ")",
            "Lnet/bytebuddy/asm/ModifierAdjustment;"
        }
    .end annotation

    .line 27
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/asm/ModifierAdjustment;->withFieldModifiers(Lnet/bytebuddy/matcher/ElementMatcher;Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;

    move-result-object p0

    return-object p0
.end method

.method public varargs withFieldModifiers([Lnet/bytebuddy/description/modifier/ModifierContributor$ForField;)Lnet/bytebuddy/asm/ModifierAdjustment;
    .locals 0

    .line 28
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/ModifierAdjustment;->withFieldModifiers(Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;

    move-result-object p0

    return-object p0
.end method

.method public withInvokableModifiers(Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;",
            ">;)",
            "Lnet/bytebuddy/asm/ModifierAdjustment;"
        }
    .end annotation

    .line 26
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lnet/bytebuddy/asm/ModifierAdjustment;->withInvokableModifiers(Lnet/bytebuddy/matcher/ElementMatcher;Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;

    move-result-object p0

    return-object p0
.end method

.method public withInvokableModifiers(Lnet/bytebuddy/matcher/ElementMatcher;Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;",
            ">;)",
            "Lnet/bytebuddy/asm/ModifierAdjustment;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/ModifierAdjustment;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/ModifierAdjustment;->typeAdjustments:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/asm/ModifierAdjustment;->fieldAdjustments:Ljava/util/List;

    .line 6
    .line 7
    new-instance v3, Lnet/bytebuddy/asm/ModifierAdjustment$Adjustment;

    .line 8
    .line 9
    invoke-static {p2}, Lnet/bytebuddy/description/modifier/ModifierContributor$Resolver;->of(Ljava/util/Collection;)Lnet/bytebuddy/description/modifier/ModifierContributor$Resolver;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-direct {v3, p1, p2}, Lnet/bytebuddy/asm/ModifierAdjustment$Adjustment;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/description/modifier/ModifierContributor$Resolver;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lnet/bytebuddy/asm/ModifierAdjustment;->methodAdjustments:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {v3, p0}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-direct {v0, v1, v2, p0}, Lnet/bytebuddy/asm/ModifierAdjustment;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public varargs withInvokableModifiers(Lnet/bytebuddy/matcher/ElementMatcher;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/asm/ModifierAdjustment;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;[",
            "Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;",
            ")",
            "Lnet/bytebuddy/asm/ModifierAdjustment;"
        }
    .end annotation

    .line 27
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/asm/ModifierAdjustment;->withInvokableModifiers(Lnet/bytebuddy/matcher/ElementMatcher;Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;

    move-result-object p0

    return-object p0
.end method

.method public varargs withInvokableModifiers([Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/asm/ModifierAdjustment;
    .locals 0

    .line 28
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/ModifierAdjustment;->withInvokableModifiers(Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;

    move-result-object p0

    return-object p0
.end method

.method public withMethodModifiers(Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;",
            ">;)",
            "Lnet/bytebuddy/asm/ModifierAdjustment;"
        }
    .end annotation

    .line 14
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lnet/bytebuddy/asm/ModifierAdjustment;->withMethodModifiers(Lnet/bytebuddy/matcher/ElementMatcher;Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;

    move-result-object p0

    return-object p0
.end method

.method public withMethodModifiers(Lnet/bytebuddy/matcher/ElementMatcher;Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;",
            ">;)",
            "Lnet/bytebuddy/asm/ModifierAdjustment;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->isMethod()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lnet/bytebuddy/matcher/ElementMatcher$Junction;->and(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/asm/ModifierAdjustment;->withInvokableModifiers(Lnet/bytebuddy/matcher/ElementMatcher;Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public varargs withMethodModifiers(Lnet/bytebuddy/matcher/ElementMatcher;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/asm/ModifierAdjustment;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;[",
            "Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;",
            ")",
            "Lnet/bytebuddy/asm/ModifierAdjustment;"
        }
    .end annotation

    .line 15
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/asm/ModifierAdjustment;->withMethodModifiers(Lnet/bytebuddy/matcher/ElementMatcher;Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;

    move-result-object p0

    return-object p0
.end method

.method public varargs withMethodModifiers([Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/asm/ModifierAdjustment;
    .locals 0

    .line 16
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/ModifierAdjustment;->withMethodModifiers(Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;

    move-result-object p0

    return-object p0
.end method

.method public withTypeModifiers(Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;",
            ">;)",
            "Lnet/bytebuddy/asm/ModifierAdjustment;"
        }
    .end annotation

    .line 26
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lnet/bytebuddy/asm/ModifierAdjustment;->withTypeModifiers(Lnet/bytebuddy/matcher/ElementMatcher;Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;

    move-result-object p0

    return-object p0
.end method

.method public withTypeModifiers(Lnet/bytebuddy/matcher/ElementMatcher;Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;",
            ">;)",
            "Lnet/bytebuddy/asm/ModifierAdjustment;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/ModifierAdjustment;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/asm/ModifierAdjustment$Adjustment;

    .line 4
    .line 5
    invoke-static {p2}, Lnet/bytebuddy/description/modifier/ModifierContributor$Resolver;->of(Ljava/util/Collection;)Lnet/bytebuddy/description/modifier/ModifierContributor$Resolver;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-direct {v1, p1, p2}, Lnet/bytebuddy/asm/ModifierAdjustment$Adjustment;-><init>(Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/description/modifier/ModifierContributor$Resolver;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lnet/bytebuddy/asm/ModifierAdjustment;->typeAdjustments:Ljava/util/List;

    .line 13
    .line 14
    invoke-static {v1, p1}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object p2, p0, Lnet/bytebuddy/asm/ModifierAdjustment;->fieldAdjustments:Ljava/util/List;

    .line 19
    .line 20
    iget-object p0, p0, Lnet/bytebuddy/asm/ModifierAdjustment;->methodAdjustments:Ljava/util/List;

    .line 21
    .line 22
    invoke-direct {v0, p1, p2, p0}, Lnet/bytebuddy/asm/ModifierAdjustment;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public varargs withTypeModifiers(Lnet/bytebuddy/matcher/ElementMatcher;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;)Lnet/bytebuddy/asm/ModifierAdjustment;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;[",
            "Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;",
            ")",
            "Lnet/bytebuddy/asm/ModifierAdjustment;"
        }
    .end annotation

    .line 27
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/asm/ModifierAdjustment;->withTypeModifiers(Lnet/bytebuddy/matcher/ElementMatcher;Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;

    move-result-object p0

    return-object p0
.end method

.method public varargs withTypeModifiers([Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;)Lnet/bytebuddy/asm/ModifierAdjustment;
    .locals 0

    .line 28
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/ModifierAdjustment;->withTypeModifiers(Ljava/util/List;)Lnet/bytebuddy/asm/ModifierAdjustment;

    move-result-object p0

    return-object p0
.end method

.method public wrap(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/description/field/FieldList;Lnet/bytebuddy/description/method/MethodList;II)Lnet/bytebuddy/asm/ModifierAdjustment$ModifierAdjustingClassVisitor;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/jar/asm/ClassVisitor;",
            "Lnet/bytebuddy/implementation/Implementation$Context;",
            "Lnet/bytebuddy/pool/TypePool;",
            "Lnet/bytebuddy/description/field/FieldList<",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;",
            "Lnet/bytebuddy/description/method/MethodList<",
            "*>;II)",
            "Lnet/bytebuddy/asm/ModifierAdjustment$ModifierAdjustingClassVisitor;"
        }
    .end annotation

    .line 1
    move-object p3, p6

    .line 2
    new-instance p6, Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-direct {p6}, Ljava/util/HashMap;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-interface {p5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p4

    .line 11
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result p5

    .line 15
    if-eqz p5, :cond_0

    .line 16
    .line 17
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p5

    .line 21
    check-cast p5, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 22
    .line 23
    new-instance p7, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {p7}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-interface {p5}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p8

    .line 32
    invoke-virtual {p7, p8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-interface {p5}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getDescriptor()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p8

    .line 39
    invoke-virtual {p7, p8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p7

    .line 46
    invoke-virtual {p6, p7, p5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    new-instance p7, Ljava/util/HashMap;

    .line 51
    .line 52
    invoke-direct {p7}, Ljava/util/HashMap;-><init>()V

    .line 53
    .line 54
    .line 55
    new-instance p4, Lnet/bytebuddy/description/method/MethodDescription$Latent$TypeInitializer;

    .line 56
    .line 57
    invoke-direct {p4, p1}, Lnet/bytebuddy/description/method/MethodDescription$Latent$TypeInitializer;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p3, p4}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result p4

    .line 72
    if-eqz p4, :cond_1

    .line 73
    .line 74
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p4

    .line 78
    check-cast p4, Lnet/bytebuddy/description/method/MethodDescription;

    .line 79
    .line 80
    new-instance p5, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-interface {p4}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p8

    .line 89
    invoke-virtual {p5, p8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-interface {p4}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getDescriptor()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p8

    .line 96
    invoke-virtual {p5, p8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p5

    .line 103
    invoke-virtual {p7, p5, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_1
    new-instance p3, Lnet/bytebuddy/asm/ModifierAdjustment$ModifierAdjustingClassVisitor;

    .line 108
    .line 109
    move-object p5, p1

    .line 110
    move-object p1, p2

    .line 111
    iget-object p2, p0, Lnet/bytebuddy/asm/ModifierAdjustment;->typeAdjustments:Ljava/util/List;

    .line 112
    .line 113
    move-object p4, p0

    .line 114
    move-object p0, p3

    .line 115
    iget-object p3, p4, Lnet/bytebuddy/asm/ModifierAdjustment;->fieldAdjustments:Ljava/util/List;

    .line 116
    .line 117
    iget-object p4, p4, Lnet/bytebuddy/asm/ModifierAdjustment;->methodAdjustments:Ljava/util/List;

    .line 118
    .line 119
    invoke-direct/range {p0 .. p7}, Lnet/bytebuddy/asm/ModifierAdjustment$ModifierAdjustingClassVisitor;-><init>(Lnet/bytebuddy/jar/asm/ClassVisitor;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/Map;Ljava/util/Map;)V

    .line 120
    .line 121
    .line 122
    return-object p0
.end method

.method public bridge synthetic wrap(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/description/field/FieldList;Lnet/bytebuddy/description/method/MethodList;II)Lnet/bytebuddy/jar/asm/ClassVisitor;
    .locals 0

    .line 123
    invoke-virtual/range {p0 .. p8}, Lnet/bytebuddy/asm/ModifierAdjustment;->wrap(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/description/field/FieldList;Lnet/bytebuddy/description/method/MethodList;II)Lnet/bytebuddy/asm/ModifierAdjustment$ModifierAdjustingClassVisitor;

    move-result-object p0

    return-object p0
.end method
