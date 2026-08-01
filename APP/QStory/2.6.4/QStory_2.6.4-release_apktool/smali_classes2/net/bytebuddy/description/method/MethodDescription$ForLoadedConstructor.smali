.class public Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;
.super Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$ParameterAnnotationSource;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/method/MethodDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForLoadedConstructor"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable<",
        "Ljava/lang/reflect/Constructor<",
        "*>;>;",
        "Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$ParameterAnnotationSource;"
    }
.end annotation


# instance fields
.field private transient synthetic declaredAnnotations:Lnet/bytebuddy/description/annotation/AnnotationList;

.field private transient synthetic parameterAnnotations:[[Ljava/lang/annotation/Annotation;

.field private transient synthetic parameters:Lnet/bytebuddy/description/method/ParameterList;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Constructor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;-><init>(Ljava/lang/reflect/AnnotatedElement;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;
    .locals 2
    .annotation runtime Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;
        value = "declaredAnnotations"
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;->declaredAnnotations:Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationList$ForLoadedAnnotations;

    .line 8
    .line 9
    iget-object v1, p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;->executable:Ljava/lang/reflect/AnnotatedElement;

    .line 10
    .line 11
    check-cast v1, Ljava/lang/reflect/Constructor;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Lnet/bytebuddy/description/annotation/AnnotationList$ForLoadedAnnotations;-><init>([Ljava/lang/annotation/Annotation;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;->declaredAnnotations:Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    iput-object v0, p0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;->declaredAnnotations:Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 26
    .line 27
    return-object v0
.end method

.method public bridge synthetic getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;
    .locals 0
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 14
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p0

    return-object p0
.end method

.method public getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;->executable:Ljava/lang/reflect/AnnotatedElement;

    .line 2
    .line 3
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public getDefaultValue()Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "**>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation

    .line 1
    sget-object p0, Lnet/bytebuddy/description/annotation/AnnotationValue;->UNDEFINED:Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDescriptor()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;->executable:Ljava/lang/reflect/AnnotatedElement;

    .line 2
    .line 3
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 4
    .line 5
    invoke-static {p0}, Lnet/bytebuddy/jar/asm/Type;->getConstructorDescriptor(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getExceptionTypes()Lnet/bytebuddy/description/type/TypeList$Generic;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$Generic$OfConstructorExceptionTypes;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;->executable:Ljava/lang/reflect/AnnotatedElement;

    .line 4
    .line 5
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/type/TypeList$Generic$OfConstructorExceptionTypes;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public getInternalName()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "<init>"

    .line 2
    .line 3
    return-object p0
.end method

.method public getModifiers()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;->executable:Ljava/lang/reflect/AnnotatedElement;

    .line 2
    .line 3
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getModifiers()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;->executable:Ljava/lang/reflect/AnnotatedElement;

    .line 2
    .line 3
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getParameterAnnotations()[[Ljava/lang/annotation/Annotation;
    .locals 1
    .annotation runtime Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;
        value = "parameterAnnotations"
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;->parameterAnnotations:[[Ljava/lang/annotation/Annotation;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;->executable:Ljava/lang/reflect/AnnotatedElement;

    .line 8
    .line 9
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;->parameterAnnotations:[[Ljava/lang/annotation/Annotation;

    .line 18
    .line 19
    check-cast p0, [[Ljava/lang/annotation/Annotation;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    iput-object v0, p0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;->parameterAnnotations:[[Ljava/lang/annotation/Annotation;

    .line 23
    .line 24
    return-object v0
.end method

.method public getParameters()Lnet/bytebuddy/description/method/ParameterList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/method/ParameterList<",
            "Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;",
            ">;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;
        value = "parameters"
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;->parameters:Lnet/bytebuddy/description/method/ParameterList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;->executable:Ljava/lang/reflect/AnnotatedElement;

    .line 8
    .line 9
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 10
    .line 11
    invoke-static {v0, p0}, Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable;->of(Ljava/lang/reflect/Constructor;Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$ParameterAnnotationSource;)Lnet/bytebuddy/description/method/ParameterList;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;->parameters:Lnet/bytebuddy/description/method/ParameterList;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_1
    iput-object v0, p0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;->parameters:Lnet/bytebuddy/description/method/ParameterList;

    .line 21
    .line 22
    return-object v0
.end method

.method public bridge synthetic getReceiverType()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 0

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;->getReceiverType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 0

    .line 1
    sget-object p0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getTypeVariables()Lnet/bytebuddy/description/type/TypeList$Generic;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;->executable:Ljava/lang/reflect/AnnotatedElement;

    .line 2
    .line 3
    check-cast p0, Ljava/lang/reflect/GenericDeclaration;

    .line 4
    .line 5
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeList$Generic$ForLoadedTypes$OfTypeVariables;->of(Ljava/lang/reflect/GenericDeclaration;)Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public isConstructor()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public isSynthetic()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;->executable:Ljava/lang/reflect/AnnotatedElement;

    .line 2
    .line 3
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->isSynthetic()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public isTypeInitializer()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public represents(Ljava/lang/reflect/Constructor;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;->executable:Ljava/lang/reflect/AnnotatedElement;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Constructor;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lnet/bytebuddy/description/method/MethodDescription$AbstractBase;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0

    .line 25
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 26
    return p0
.end method

.method public represents(Ljava/lang/reflect/Method;)Z
    .locals 0

    .line 27
    const/4 p0, 0x0

    return p0
.end method
