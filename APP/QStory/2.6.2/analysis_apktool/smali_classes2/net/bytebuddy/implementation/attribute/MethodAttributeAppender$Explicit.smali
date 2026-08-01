.class public Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender;
.implements Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Explicit"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit$Target;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final annotations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;"
        }
    .end annotation
.end field

.field private final target:Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit$Target;


# direct methods
.method public constructor <init>(ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit$Target$OnMethodParameter;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit$Target$OnMethodParameter;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0, p2}, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit;-><init>(Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit$Target;Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;)V"
        }
    .end annotation

    .line 10
    sget-object v0, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit$Target$OnMethod;->INSTANCE:Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit$Target$OnMethod;

    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit;-><init>(Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit$Target;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit$Target;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit$Target;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;)V"
        }
    .end annotation

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit;->target:Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit$Target;

    .line 13
    iput-object p2, p0, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit;->annotations:Ljava/util/List;

    return-void
.end method

.method public static of(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;
    .locals 4

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory$Compound;

    .line 2
    .line 3
    invoke-static {p0}, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit;->ofMethodAnnotations(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {p0}, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit;->ofParameterAnnotations(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v2, 0x2

    .line 12
    new-array v2, v2, [Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    aput-object v1, v2, v3

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    aput-object p0, v2, v1

    .line 19
    .line 20
    invoke-direct {v0, v2}, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory$Compound;-><init>([Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public static ofMethodAnnotations(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit;-><init>(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static ofParameterAnnotations(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;
    .locals 4

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lnet/bytebuddy/description/method/ParameterDescription;

    .line 29
    .line 30
    new-instance v2, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit;

    .line 31
    .line 32
    invoke-interface {v1}, Lnet/bytebuddy/description/method/ParameterDescription;->getIndex()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-interface {v1}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-direct {v2, v3, v1}, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit;-><init>(ILjava/util/List;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance p0, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory$Compound;

    .line 48
    .line 49
    invoke-direct {p0, v0}, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory$Compound;-><init>(Ljava/util/List;)V

    .line 50
    .line 51
    .line 52
    return-object p0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;)V
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Default;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit;->target:Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit$Target;

    .line 4
    .line 5
    invoke-interface {v1, p1, p2}, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit$Target;->make(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Target;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {v0, p1}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Default;-><init>(Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Target;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit;->annotations:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 29
    .line 30
    invoke-interface {v0, p1, p3}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender;->append(Lnet/bytebuddy/description/annotation/AnnotationDescription;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-void
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit;->target:Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit$Target;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit;->target:Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit$Target;

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit;->annotations:Ljava/util/List;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit;->annotations:Ljava/util/List;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

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
    iget-object v1, p0, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit;->target:Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit$Target;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object p0, p0, Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Explicit;->annotations:Ljava/util/List;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    add-int/2addr p0, v1

    .line 27
    return p0
.end method

.method public make(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender;
    .locals 0

    .line 1
    return-object p0
.end method
