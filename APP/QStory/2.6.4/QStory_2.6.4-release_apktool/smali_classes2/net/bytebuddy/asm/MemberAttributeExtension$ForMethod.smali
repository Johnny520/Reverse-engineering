.class public Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;
.super Lnet/bytebuddy/asm/MemberAttributeExtension;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberAttributeExtension;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForMethod"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod$AttributeAppendingMethodVisitor;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/asm/MemberAttributeExtension<",
        "Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;",
        ">;",
        "Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Default;->APPEND_DEFAULTS:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Default;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;-><init>(Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;)V
    .locals 1

    .line 7
    sget-object v0, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$NoOp;->INSTANCE:Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$NoOp;

    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;-><init>(Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/asm/MemberAttributeExtension;-><init>(Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public annotateMethod(Ljava/util/Collection;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;)",
            "Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit;-><init>(Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;->attribute(Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public annotateMethod(Ljava/util/List;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;"
        }
    .end annotation

    .line 16
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationList$ForLoadedAnnotations;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/annotation/AnnotationList$ForLoadedAnnotations;-><init>(Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;->annotateMethod(Ljava/util/Collection;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;

    move-result-object p0

    return-object p0
.end method

.method public varargs annotateMethod([Ljava/lang/annotation/Annotation;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;
    .locals 0

    .line 18
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;->annotateMethod(Ljava/util/List;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;

    move-result-object p0

    return-object p0
.end method

.method public varargs annotateMethod([Lnet/bytebuddy/description/annotation/AnnotationDescription;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;
    .locals 0

    .line 17
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;->annotateMethod(Ljava/util/Collection;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;

    move-result-object p0

    return-object p0
.end method

.method public annotateParameter(ILjava/util/Collection;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;)",
            "Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;"
        }
    .end annotation

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit;

    .line 4
    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit;-><init>(ILjava/util/List;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;->attribute(Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    const-string p0, "Parameter index cannot be negative: "

    .line 19
    .line 20
    invoke-static {p1, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method

.method public annotateParameter(ILjava/util/List;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;"
        }
    .end annotation

    .line 29
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationList$ForLoadedAnnotations;

    invoke-direct {v0, p2}, Lnet/bytebuddy/description/annotation/AnnotationList$ForLoadedAnnotations;-><init>(Ljava/util/List;)V

    invoke-virtual {p0, p1, v0}, Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;->annotateParameter(ILjava/util/Collection;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;

    move-result-object p0

    return-object p0
.end method

.method public varargs annotateParameter(I[Ljava/lang/annotation/Annotation;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;
    .locals 0

    .line 31
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;->annotateParameter(ILjava/util/List;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;

    move-result-object p0

    return-object p0
.end method

.method public varargs annotateParameter(I[Lnet/bytebuddy/description/annotation/AnnotationDescription;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;
    .locals 0

    .line 30
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;->annotateParameter(ILjava/util/Collection;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;

    move-result-object p0

    return-object p0
.end method

.method public attribute(Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;
    .locals 5

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/MemberAttributeExtension;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 4
    .line 5
    new-instance v2, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory$Compound;

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberAttributeExtension;->attributeAppenderFactory:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    new-array v3, v3, [Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    aput-object p0, v3, v4

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    aput-object p1, v3, p0

    .line 19
    .line 20
    invoke-direct {v2, v3}, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory$Compound;-><init>([Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod;-><init>(Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public on(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/asm/AsmVisitorWrapper;
    .locals 3
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
    new-instance v0, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    new-array v1, v1, [Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aput-object p0, v1, v2

    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;->invokable(Lnet/bytebuddy/matcher/ElementMatcher;[Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper;)Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredMethods;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public wrap(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/pool/TypePool;II)Lnet/bytebuddy/jar/asm/MethodVisitor;
    .locals 1

    .line 1
    move-object p4, p0

    .line 2
    new-instance p0, Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod$AttributeAppendingMethodVisitor;

    .line 3
    .line 4
    iget-object p5, p4, Lnet/bytebuddy/asm/MemberAttributeExtension;->attributeAppenderFactory:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p5, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;

    .line 7
    .line 8
    invoke-interface {p5, p1}, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;->make(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object p4, p4, Lnet/bytebuddy/asm/MemberAttributeExtension;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 13
    .line 14
    invoke-interface {p4, p2}, Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;->on(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;

    .line 15
    .line 16
    .line 17
    move-result-object p4

    .line 18
    const/4 p5, 0x0

    .line 19
    move-object v0, p3

    .line 20
    move-object p3, p1

    .line 21
    move-object p1, v0

    .line 22
    invoke-direct/range {p0 .. p5}, Lnet/bytebuddy/asm/MemberAttributeExtension$ForMethod$AttributeAppendingMethodVisitor;-><init>(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;Lnet/bytebuddy/asm/MemberAttributeExtension$1;)V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method
