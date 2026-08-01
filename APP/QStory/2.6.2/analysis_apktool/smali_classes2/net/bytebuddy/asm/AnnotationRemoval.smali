.class public Lnet/bytebuddy/asm/AnnotationRemoval;
.super Lnet/bytebuddy/asm/AsmVisitorWrapper$AbstractBase;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingMethodVisitor;,
        Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingFieldVisitor;,
        Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingClassVisitor;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final METHOD_ALL:I = -0x3

.field private static final METHOD_NONE:I = -0x4

.field private static final METHOD_ONLY:I = -0x2

.field private static final METHOD_PARAMETERS:I = -0x1


# instance fields
.field private final annotationMatcher:Lnet/bytebuddy/matcher/ElementMatcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;"
        }
    .end annotation
.end field

.field private final fieldMatcher:Lnet/bytebuddy/matcher/ElementMatcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;"
        }
    .end annotation
.end field

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

.field private final parameters:I

.field private final type:Z


# direct methods
.method public constructor <init>(ZLnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/asm/AsmVisitorWrapper$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->type:Z

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->fieldMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->methodMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->annotationMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 11
    .line 12
    iput p5, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->parameters:I

    .line 13
    .line 14
    return-void
.end method

.method public static strip(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/AnnotationRemoval;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;)",
            "Lnet/bytebuddy/asm/AnnotationRemoval;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/AnnotationRemoval;

    .line 2
    .line 3
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->any()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    const/4 v5, -0x3

    .line 12
    const/4 v1, 0x1

    .line 13
    move-object v4, p0

    .line 14
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/asm/AnnotationRemoval;-><init>(ZLnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;I)V

    .line 15
    .line 16
    .line 17
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
    iget-boolean v2, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->type:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/AnnotationRemoval;

    .line 23
    .line 24
    iget-boolean v3, p1, Lnet/bytebuddy/asm/AnnotationRemoval;->type:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget v2, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->parameters:I

    .line 30
    .line 31
    iget v3, p1, Lnet/bytebuddy/asm/AnnotationRemoval;->parameters:I

    .line 32
    .line 33
    if-eq v2, v3, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->fieldMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 37
    .line 38
    iget-object v3, p1, Lnet/bytebuddy/asm/AnnotationRemoval;->fieldMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_5

    .line 45
    .line 46
    return v1

    .line 47
    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->methodMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 48
    .line 49
    iget-object v3, p1, Lnet/bytebuddy/asm/AnnotationRemoval;->methodMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_6

    .line 56
    .line 57
    return v1

    .line 58
    :cond_6
    iget-object p0, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->annotationMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 59
    .line 60
    iget-object p1, p1, Lnet/bytebuddy/asm/AnnotationRemoval;->annotationMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-nez p0, :cond_7

    .line 67
    .line 68
    return v1

    .line 69
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
    iget-boolean v2, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->type:Z

    .line 13
    .line 14
    add-int/2addr v0, v2

    .line 15
    mul-int/2addr v0, v1

    .line 16
    iget-object v2, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->fieldMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(Lnet/bytebuddy/matcher/ElementMatcher;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->methodMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(Lnet/bytebuddy/matcher/ElementMatcher;II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->annotationMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(Lnet/bytebuddy/matcher/ElementMatcher;II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget p0, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->parameters:I

    .line 35
    .line 36
    add-int/2addr v0, p0

    .line 37
    return v0
.end method

.method public onConstructorParameter(Lnet/bytebuddy/matcher/ElementMatcher;I)Lnet/bytebuddy/asm/AsmVisitorWrapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;I)",
            "Lnet/bytebuddy/asm/AsmVisitorWrapper;"
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
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/asm/AnnotationRemoval;->onInvokableParameter(Lnet/bytebuddy/matcher/ElementMatcher;I)Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public onConstructorParameters(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/AsmVisitorWrapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;)",
            "Lnet/bytebuddy/asm/AsmVisitorWrapper;"
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
    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/AnnotationRemoval;->onInvokableParameters(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public onConstructors(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/AsmVisitorWrapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;)",
            "Lnet/bytebuddy/asm/AsmVisitorWrapper;"
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
    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/AnnotationRemoval;->onInvokables(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public onConstructorsAndParameters(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/AsmVisitorWrapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;)",
            "Lnet/bytebuddy/asm/AsmVisitorWrapper;"
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
    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/AnnotationRemoval;->onInvokablesAndParameters(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public onFields(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/AsmVisitorWrapper;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            ">;)",
            "Lnet/bytebuddy/asm/AsmVisitorWrapper;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/AnnotationRemoval;

    .line 2
    .line 3
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->none()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    iget-object v4, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->annotationMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 8
    .line 9
    const/4 v5, -0x4

    .line 10
    const/4 v1, 0x0

    .line 11
    move-object v2, p1

    .line 12
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/asm/AnnotationRemoval;-><init>(ZLnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;I)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public onInvokableParameter(Lnet/bytebuddy/matcher/ElementMatcher;I)Lnet/bytebuddy/asm/AsmVisitorWrapper;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;I)",
            "Lnet/bytebuddy/asm/AsmVisitorWrapper;"
        }
    .end annotation

    .line 1
    if-ltz p2, :cond_0

    .line 2
    .line 3
    new-instance v0, Lnet/bytebuddy/asm/AnnotationRemoval;

    .line 4
    .line 5
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->none()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v4, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->annotationMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    move-object v3, p1

    .line 13
    move v5, p2

    .line 14
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/asm/AnnotationRemoval;-><init>(ZLnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;I)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    move v5, p2

    .line 19
    const-string p0, "Parameter index cannot be negative: "

    .line 20
    .line 21
    invoke-static {v5, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method

.method public onInvokableParameters(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/AsmVisitorWrapper;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;)",
            "Lnet/bytebuddy/asm/AsmVisitorWrapper;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/AnnotationRemoval;

    .line 2
    .line 3
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->none()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget-object v4, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->annotationMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 8
    .line 9
    const/4 v5, -0x1

    .line 10
    const/4 v1, 0x0

    .line 11
    move-object v3, p1

    .line 12
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/asm/AnnotationRemoval;-><init>(ZLnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;I)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public onInvokables(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/AsmVisitorWrapper;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;)",
            "Lnet/bytebuddy/asm/AsmVisitorWrapper;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/AnnotationRemoval;

    .line 2
    .line 3
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->none()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget-object v4, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->annotationMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 8
    .line 9
    const/4 v5, -0x2

    .line 10
    const/4 v1, 0x0

    .line 11
    move-object v3, p1

    .line 12
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/asm/AnnotationRemoval;-><init>(ZLnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;I)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public onInvokablesAndParameters(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/AsmVisitorWrapper;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;)",
            "Lnet/bytebuddy/asm/AsmVisitorWrapper;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/AnnotationRemoval;

    .line 2
    .line 3
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->none()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget-object v4, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->annotationMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 8
    .line 9
    const/4 v5, -0x3

    .line 10
    const/4 v1, 0x0

    .line 11
    move-object v3, p1

    .line 12
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/asm/AnnotationRemoval;-><init>(ZLnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;I)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public onMethodParameter(Lnet/bytebuddy/matcher/ElementMatcher;I)Lnet/bytebuddy/asm/AsmVisitorWrapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;I)",
            "Lnet/bytebuddy/asm/AsmVisitorWrapper;"
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
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/asm/AnnotationRemoval;->onInvokableParameter(Lnet/bytebuddy/matcher/ElementMatcher;I)Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public onMethodParameters(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/AsmVisitorWrapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;)",
            "Lnet/bytebuddy/asm/AsmVisitorWrapper;"
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
    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/AnnotationRemoval;->onInvokableParameters(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public onMethods(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/AsmVisitorWrapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;)",
            "Lnet/bytebuddy/asm/AsmVisitorWrapper;"
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
    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/AnnotationRemoval;->onInvokables(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public onMethodsAndParameters(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/AsmVisitorWrapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;)",
            "Lnet/bytebuddy/asm/AsmVisitorWrapper;"
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
    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/AnnotationRemoval;->onInvokablesAndParameters(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public onType()Lnet/bytebuddy/asm/AsmVisitorWrapper;
    .locals 6

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/AnnotationRemoval;

    .line 2
    .line 3
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->none()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-static {}, Lnet/bytebuddy/matcher/ElementMatchers;->none()Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    iget-object v4, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->annotationMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 12
    .line 13
    const/4 v5, -0x4

    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/asm/AnnotationRemoval;-><init>(ZLnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;I)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public wrap(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/description/field/FieldList;Lnet/bytebuddy/description/method/MethodList;II)Lnet/bytebuddy/jar/asm/ClassVisitor;
    .locals 10
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
            "Lnet/bytebuddy/jar/asm/ClassVisitor;"
        }
    .end annotation

    .line 1
    new-instance v8, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-boolean p3, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->type:Z

    .line 7
    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result p4

    .line 22
    if-eqz p4, :cond_0

    .line 23
    .line 24
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p4

    .line 28
    check-cast p4, Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 29
    .line 30
    invoke-interface {p4}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getAnnotationType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {v0}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getDescriptor()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v8, v0, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance v6, Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-interface {p5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result p4

    .line 55
    if-eqz p4, :cond_1

    .line 56
    .line 57
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p4

    .line 61
    check-cast p4, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 62
    .line 63
    new-instance p5, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-interface {p4}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-interface {p4}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getDescriptor()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p5

    .line 86
    invoke-virtual {v6, p5, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    new-instance v7, Ljava/util/HashMap;

    .line 91
    .line 92
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 93
    .line 94
    .line 95
    new-instance p3, Lnet/bytebuddy/description/method/MethodDescription$Latent$TypeInitializer;

    .line 96
    .line 97
    invoke-direct {p3, p1}, Lnet/bytebuddy/description/method/MethodDescription$Latent$TypeInitializer;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 98
    .line 99
    .line 100
    move-object/from16 p1, p6

    .line 101
    .line 102
    invoke-static {p1, p3}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result p3

    .line 114
    if-eqz p3, :cond_2

    .line 115
    .line 116
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p3

    .line 120
    check-cast p3, Lnet/bytebuddy/description/method/MethodDescription;

    .line 121
    .line 122
    new-instance p4, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-interface {p3}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p5

    .line 131
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-interface {p3}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getDescriptor()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p5

    .line 138
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p4

    .line 145
    invoke-virtual {v7, p4, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_2
    new-instance v0, Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingClassVisitor;

    .line 150
    .line 151
    iget-object v2, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->fieldMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 152
    .line 153
    iget-object v3, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->methodMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 154
    .line 155
    iget-object v4, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->annotationMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 156
    .line 157
    iget v5, p0, Lnet/bytebuddy/asm/AnnotationRemoval;->parameters:I

    .line 158
    .line 159
    const/4 v9, 0x0

    .line 160
    move-object v1, p2

    .line 161
    invoke-direct/range {v0 .. v9}, Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingClassVisitor;-><init>(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;ILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lnet/bytebuddy/asm/AnnotationRemoval$1;)V

    .line 162
    .line 163
    .line 164
    return-object v0
.end method
