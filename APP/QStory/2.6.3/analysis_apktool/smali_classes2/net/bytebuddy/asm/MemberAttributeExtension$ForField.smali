.class public Lnet/bytebuddy/asm/MemberAttributeExtension$ForField;
.super Lnet/bytebuddy/asm/MemberAttributeExtension;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredFields$FieldVisitorWrapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberAttributeExtension;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForField"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/MemberAttributeExtension$ForField$FieldAttributeVisitor;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/asm/MemberAttributeExtension<",
        "Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory;",
        ">;",
        "Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredFields$FieldVisitorWrapper;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Default;->APPEND_DEFAULTS:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Default;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/asm/MemberAttributeExtension$ForField;-><init>(Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;)V
    .locals 1

    .line 7
    sget-object v0, Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$NoOp;->INSTANCE:Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$NoOp;

    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/asm/MemberAttributeExtension$ForField;-><init>(Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/asm/MemberAttributeExtension;-><init>(Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public annotate(Ljava/util/Collection;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForField;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;)",
            "Lnet/bytebuddy/asm/MemberAttributeExtension$ForField;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Explicit;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Explicit;-><init>(Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberAttributeExtension$ForField;->attribute(Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForField;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public annotate(Ljava/util/List;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;)",
            "Lnet/bytebuddy/asm/MemberAttributeExtension$ForField;"
        }
    .end annotation

    .line 16
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationList$ForLoadedAnnotations;

    invoke-direct {v0, p1}, Lnet/bytebuddy/description/annotation/AnnotationList$ForLoadedAnnotations;-><init>(Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lnet/bytebuddy/asm/MemberAttributeExtension$ForField;->annotate(Ljava/util/Collection;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForField;

    move-result-object p0

    return-object p0
.end method

.method public varargs annotate([Ljava/lang/annotation/Annotation;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForField;
    .locals 0

    .line 18
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/MemberAttributeExtension$ForField;->annotate(Ljava/util/List;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForField;

    move-result-object p0

    return-object p0
.end method

.method public varargs annotate([Lnet/bytebuddy/description/annotation/AnnotationDescription;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForField;
    .locals 0

    .line 17
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/MemberAttributeExtension$ForField;->annotate(Ljava/util/Collection;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForField;

    move-result-object p0

    return-object p0
.end method

.method public attribute(Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory;)Lnet/bytebuddy/asm/MemberAttributeExtension$ForField;
    .locals 5

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberAttributeExtension$ForField;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/MemberAttributeExtension;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 4
    .line 5
    new-instance v2, Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory$Compound;

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberAttributeExtension;->attributeAppenderFactory:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory;

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    new-array v3, v3, [Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory;

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
    invoke-direct {v2, v3}, Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory$Compound;-><init>([Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/asm/MemberAttributeExtension$ForField;-><init>(Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory;)V

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
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;)",
            "Lnet/bytebuddy/asm/AsmVisitorWrapper;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredFields;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredFields;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    new-array v1, v1, [Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredFields$FieldVisitorWrapper;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aput-object p0, v1, v2

    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredFields;->field(Lnet/bytebuddy/matcher/ElementMatcher;[Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredFields$FieldVisitorWrapper;)Lnet/bytebuddy/asm/AsmVisitorWrapper$ForDeclaredFields;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public wrap(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;Lnet/bytebuddy/jar/asm/FieldVisitor;)Lnet/bytebuddy/jar/asm/FieldVisitor;
    .locals 6

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberAttributeExtension$ForField$FieldAttributeVisitor;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/MemberAttributeExtension;->attributeAppenderFactory:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory;

    .line 6
    .line 7
    invoke-interface {v1, p1}, Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory;->make(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberAttributeExtension;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 12
    .line 13
    invoke-interface {p0, p2}, Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;->on(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    const/4 v5, 0x0

    .line 18
    move-object v2, p2

    .line 19
    move-object v1, p3

    .line 20
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/asm/MemberAttributeExtension$ForField$FieldAttributeVisitor;-><init>(Lnet/bytebuddy/jar/asm/FieldVisitor;Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;Lnet/bytebuddy/asm/MemberAttributeExtension$1;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method
