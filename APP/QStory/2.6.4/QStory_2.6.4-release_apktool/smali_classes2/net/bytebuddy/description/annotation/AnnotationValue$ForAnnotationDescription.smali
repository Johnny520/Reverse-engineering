.class public Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription;
.super Lnet/bytebuddy/description/annotation/AnnotationValue$AbstractBase;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/annotation/AnnotationValue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForAnnotationDescription"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription$Loaded;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<U::",
        "Ljava/lang/annotation/Annotation;",
        ">",
        "Lnet/bytebuddy/description/annotation/AnnotationValue$AbstractBase<",
        "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
        "TU;>;"
    }
.end annotation


# instance fields
.field private final annotationDescription:Lnet/bytebuddy/description/annotation/AnnotationDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/annotation/AnnotationDescription;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription;->annotationDescription:Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 5
    .line 6
    return-void
.end method

.method public static of(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/Map;)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "**>;>;)",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            "TV;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationDescription$Latent;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription;-><init>(Lnet/bytebuddy/description/annotation/AnnotationDescription;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    if-eq p0, p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription;->annotationDescription:Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 8
    .line 9
    check-cast p1, Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 10
    .line 11
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 25
    return p0
.end method

.method public filter(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ")",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            "TU;>;"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription;->annotationDescription:Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 6
    .line 7
    invoke-interface {v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getAnnotationType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    new-instance p2, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMismatchedType;

    .line 19
    .line 20
    invoke-interface {p1}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    sget-object p0, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->CURRENT:Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

    .line 31
    .line 32
    sget-object v0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->ANNOTATION:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->toArrayErrorString(Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription;->annotationDescription:Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    :goto_0
    invoke-direct {p2, p1, p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMismatchedType;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object p2
.end method

.method public getSort()Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;
    .locals 0

    .line 1
    sget-object p0, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->ANNOTATION:Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;

    .line 2
    .line 3
    return-object p0
.end method

.method public getState()Lnet/bytebuddy/description/annotation/AnnotationValue$State;
    .locals 0

    .line 1
    sget-object p0, Lnet/bytebuddy/description/annotation/AnnotationValue$State;->RESOLVED:Lnet/bytebuddy/description/annotation/AnnotationValue$State;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription;->annotationDescription:Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public load(Ljava/lang/ClassLoader;)Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded;
    .locals 4
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Lnet/bytebuddy/description/annotation/AnnotationValue$Loaded<",
            "TU;>;"
        }
    .end annotation

    .line 1
    :try_start_0
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription$Loaded;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription;->annotationDescription:Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 4
    .line 5
    invoke-interface {v1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getAnnotationType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-interface {v2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-static {v2, v3, p1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {v1, p1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->prepare(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;->load()Ljava/lang/annotation/Annotation;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-direct {v0, p1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription$Loaded;-><init>(Ljava/lang/annotation/Annotation;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :catch_0
    move-exception p1

    .line 31
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMissingType$Loaded;

    .line 32
    .line 33
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription;->annotationDescription:Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 34
    .line 35
    invoke-interface {p0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getAnnotationType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMissingType$Loaded;-><init>(Ljava/lang/String;Ljava/lang/ClassNotFoundException;)V

    .line 44
    .line 45
    .line 46
    return-object v0
.end method

.method public bridge synthetic resolve()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription;->resolve()Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public resolve()Lnet/bytebuddy/description/annotation/AnnotationDescription;
    .locals 0

    .line 6
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription;->annotationDescription:Lnet/bytebuddy/description/annotation/AnnotationDescription;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription;->annotationDescription:Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
