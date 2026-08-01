.class public Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Default;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/attribute/AnnotationAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/attribute/AnnotationAppender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Default"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final target:Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Target;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Target;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Default;->target:Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Target;

    .line 5
    .line 6
    return-void
.end method

.method public static apply(Lnet/bytebuddy/jar/asm/AnnotationVisitor;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3
    .param p2    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visitArray(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p3}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDescription;->getComponentType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/4 v0, 0x0

    .line 20
    :goto_0
    if-ge v0, p2, :cond_0

    .line 21
    .line 22
    sget-object v1, Lnet/bytebuddy/implementation/attribute/AnnotationAppender;->NO_NAME:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {p3, v0}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {p0, p1, v1, v2}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Default;->apply(Lnet/bytebuddy/jar/asm/AnnotationVisitor;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p0}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visitEnd()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    invoke-interface {p1}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isAnnotation()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-interface {p1}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getDescriptor()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p0, p2, p1}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visitAnnotation(Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p3, Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 53
    .line 54
    sget-object p1, Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Default;->APPEND_DEFAULTS:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Default;

    .line 55
    .line 56
    invoke-static {p0, p3, p1}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Default;->handle(Lnet/bytebuddy/jar/asm/AnnotationVisitor;Lnet/bytebuddy/description/annotation/AnnotationDescription;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    invoke-interface {p1}, Lnet/bytebuddy/description/ModifierReviewable$OfEnumeration;->isEnum()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    invoke-interface {p1}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getDescriptor()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p3, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 71
    .line 72
    invoke-interface {p3}, Lnet/bytebuddy/description/enumeration/EnumerationDescription;->getValue()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    invoke-virtual {p0, p2, p1, p3}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visitEnum(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_3
    const-class v0, Ljava/lang/Class;

    .line 81
    .line 82
    invoke-interface {p1, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_4

    .line 87
    .line 88
    check-cast p3, Lnet/bytebuddy/description/type/TypeDescription;

    .line 89
    .line 90
    invoke-interface {p3}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getDescriptor()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-static {p1}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p0, p2, p1}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_4
    invoke-virtual {p0, p2, p3}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method private doAppend(Lnet/bytebuddy/description/annotation/AnnotationDescription;ZLnet/bytebuddy/implementation/attribute/AnnotationValueFilter;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Default;->target:Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Target;

    .line 2
    .line 3
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getAnnotationType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getDescriptor()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p0, v0, p2}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Target;->visit(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-static {p0, p1, p3}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Default;->handle(Lnet/bytebuddy/jar/asm/AnnotationVisitor;Lnet/bytebuddy/description/annotation/AnnotationDescription;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method private doAppend(Lnet/bytebuddy/description/annotation/AnnotationDescription;ZLnet/bytebuddy/implementation/attribute/AnnotationValueFilter;ILjava/lang/String;)V
    .locals 1

    .line 21
    iget-object p0, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Default;->target:Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Target;

    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getAnnotationType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    invoke-interface {v0}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getDescriptor()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0, p2, p4, p5}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Target;->visit(Ljava/lang/String;ZILjava/lang/String;)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 22
    invoke-static {p0, p1, p3}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Default;->handle(Lnet/bytebuddy/jar/asm/AnnotationVisitor;Lnet/bytebuddy/description/annotation/AnnotationDescription;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;)V

    :cond_0
    return-void
.end method

.method private static handle(Lnet/bytebuddy/jar/asm/AnnotationVisitor;Lnet/bytebuddy/description/annotation/AnnotationDescription;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;)V
    .locals 4

    .line 1
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getAnnotationType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 24
    .line 25
    invoke-interface {p2, p1, v1}, Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;->isRelevant(Lnet/bytebuddy/description/annotation/AnnotationDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-interface {v1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-interface {p1, v1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-interface {v1}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {p0, v2, v3, v1}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Default;->apply(Lnet/bytebuddy/jar/asm/AnnotationVisitor;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {p0}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visitEnd()V

    .line 56
    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public append(Lnet/bytebuddy/description/annotation/AnnotationDescription;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;
    .locals 2

    .line 60
    sget-object v0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$1;->$SwitchMap$java$lang$annotation$RetentionPolicy:[I

    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getRetention()Ljava/lang/annotation/RetentionPolicy;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 p2, 0x3

    if-ne v0, p2, :cond_0

    return-object p0

    .line 61
    :cond_0
    const-string p0, "Unexpected retention policy: "

    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getRetention()Ljava/lang/annotation/RetentionPolicy;

    move-result-object p1

    invoke-static {p1, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0

    :cond_1
    const/4 v0, 0x0

    .line 62
    invoke-direct {p0, p1, v0, p2}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Default;->doAppend(Lnet/bytebuddy/description/annotation/AnnotationDescription;ZLnet/bytebuddy/implementation/attribute/AnnotationValueFilter;)V

    return-object p0

    .line 63
    :cond_2
    invoke-direct {p0, p1, v1, p2}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Default;->doAppend(Lnet/bytebuddy/description/annotation/AnnotationDescription;ZLnet/bytebuddy/implementation/attribute/AnnotationValueFilter;)V

    return-object p0
.end method

.method public append(Lnet/bytebuddy/description/annotation/AnnotationDescription;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;ILjava/lang/String;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;
    .locals 9

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$1;->$SwitchMap$java$lang$annotation$RetentionPolicy:[I

    .line 2
    .line 3
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getRetention()Ljava/lang/annotation/RetentionPolicy;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    aget v0, v0, v1

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_2

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    const/4 p2, 0x3

    .line 20
    if-ne v0, p2, :cond_0

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    const-string p0, "Unexpected retention policy: "

    .line 24
    .line 25
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getRetention()Ljava/lang/annotation/RetentionPolicy;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0

    .line 34
    :cond_1
    const/4 v2, 0x0

    .line 35
    move-object v0, p0

    .line 36
    move-object v1, p1

    .line 37
    move-object v3, p2

    .line 38
    move v4, p3

    .line 39
    move-object v5, p4

    .line 40
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Default;->doAppend(Lnet/bytebuddy/description/annotation/AnnotationDescription;ZLnet/bytebuddy/implementation/attribute/AnnotationValueFilter;ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_2
    move-object v0, p0

    .line 45
    move-object v1, p1

    .line 46
    move-object v3, p2

    .line 47
    move v4, p3

    .line 48
    move-object v5, p4

    .line 49
    const/4 p0, 0x1

    .line 50
    move-object v6, v3

    .line 51
    move v7, v4

    .line 52
    move-object v8, v5

    .line 53
    move v5, p0

    .line 54
    move-object v3, v0

    .line 55
    move-object v4, v1

    .line 56
    invoke-direct/range {v3 .. v8}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Default;->doAppend(Lnet/bytebuddy/description/annotation/AnnotationDescription;ZLnet/bytebuddy/implementation/attribute/AnnotationValueFilter;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v0
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
    iget-object p0, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Default;->target:Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Target;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Default;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Default;->target:Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Target;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 1

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
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Default;->target:Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Target;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method
