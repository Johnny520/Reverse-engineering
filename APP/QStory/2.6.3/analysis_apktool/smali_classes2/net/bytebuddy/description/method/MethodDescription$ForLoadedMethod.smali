.class public Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;
.super Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$ParameterAnnotationSource;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/method/MethodDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForLoadedMethod"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable<",
        "Ljava/lang/reflect/Method;",
        ">;",
        "Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$ParameterAnnotationSource;"
    }
.end annotation


# instance fields
.field private transient synthetic declaredAnnotations:Lnet/bytebuddy/description/annotation/AnnotationList;

.field private transient synthetic parameterAnnotations:[[Ljava/lang/annotation/Annotation;

.field private transient synthetic parameters:Lnet/bytebuddy/description/method/ParameterList;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;)V
    .locals 0

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
    iget-object v0, p0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;->declaredAnnotations:Lnet/bytebuddy/description/annotation/AnnotationList;

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
    check-cast v1, Ljava/lang/reflect/Method;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

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
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;->declaredAnnotations:Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    iput-object v0, p0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;->declaredAnnotations:Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 26
    .line 27
    return-object v0
.end method

.method public bridge synthetic getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;
    .locals 0
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 14
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

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
    check-cast p0, Ljava/lang/reflect/Method;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

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
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "**>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;->executable:Ljava/lang/reflect/AnnotatedElement;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/reflect/Method;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDefaultValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object p0, Lnet/bytebuddy/description/annotation/AnnotationValue;->UNDEFINED:Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;->executable:Ljava/lang/reflect/AnnotatedElement;

    .line 15
    .line 16
    check-cast p0, Ljava/lang/reflect/Method;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {v0, p0}, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->asValue(Ljava/lang/Object;Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public getDescriptor()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;->executable:Ljava/lang/reflect/AnnotatedElement;

    .line 2
    .line 3
    check-cast p0, Ljava/lang/reflect/Method;

    .line 4
    .line 5
    invoke-static {p0}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Ljava/lang/reflect/Method;)Ljava/lang/String;

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
    sget-boolean v0, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->RAW_TYPES:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$Generic$ForLoadedTypes;

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;->executable:Ljava/lang/reflect/AnnotatedElement;

    .line 8
    .line 9
    check-cast p0, Ljava/lang/reflect/Method;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getExceptionTypes()[Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/type/TypeList$Generic$ForLoadedTypes;-><init>([Ljava/lang/reflect/Type;)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$Generic$OfMethodExceptionTypes;

    .line 20
    .line 21
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;->executable:Ljava/lang/reflect/AnnotatedElement;

    .line 22
    .line 23
    check-cast p0, Ljava/lang/reflect/Method;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/type/TypeList$Generic$OfMethodExceptionTypes;-><init>(Ljava/lang/reflect/Method;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public getInternalName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;->executable:Ljava/lang/reflect/AnnotatedElement;

    .line 2
    .line 3
    check-cast p0, Ljava/lang/reflect/Method;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getLoadedMethod()Ljava/lang/reflect/Method;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;->executable:Ljava/lang/reflect/AnnotatedElement;

    .line 2
    .line 3
    check-cast p0, Ljava/lang/reflect/Method;

    .line 4
    .line 5
    return-object p0
.end method

.method public getModifiers()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;->executable:Ljava/lang/reflect/AnnotatedElement;

    .line 2
    .line 3
    check-cast p0, Ljava/lang/reflect/Method;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

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
    check-cast p0, Ljava/lang/reflect/Method;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

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
    iget-object v0, p0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;->parameterAnnotations:[[Ljava/lang/annotation/Annotation;

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
    check-cast v0, Ljava/lang/reflect/Method;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;->parameterAnnotations:[[Ljava/lang/annotation/Annotation;

    .line 18
    .line 19
    check-cast p0, [[Ljava/lang/annotation/Annotation;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    iput-object v0, p0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;->parameterAnnotations:[[Ljava/lang/annotation/Annotation;

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
    iget-object v0, p0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;->parameters:Lnet/bytebuddy/description/method/ParameterList;

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
    check-cast v0, Ljava/lang/reflect/Method;

    .line 10
    .line 11
    invoke-static {v0, p0}, Lnet/bytebuddy/description/method/ParameterList$ForLoadedExecutable;->of(Ljava/lang/reflect/Method;Lnet/bytebuddy/description/method/ParameterDescription$ForLoadedParameter$ParameterAnnotationSource;)Lnet/bytebuddy/description/method/ParameterList;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;->parameters:Lnet/bytebuddy/description/method/ParameterList;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_1
    iput-object v0, p0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;->parameters:Lnet/bytebuddy/description/method/ParameterList;

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
    .locals 1

    .line 1
    sget-boolean v0, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->RAW_TYPES:Z

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;->executable:Ljava/lang/reflect/AnnotatedElement;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Ljava/lang/reflect/Method;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$LazyProjection$ForLoadedReturnType;

    .line 19
    .line 20
    check-cast p0, Ljava/lang/reflect/Method;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$LazyProjection$ForLoadedReturnType;-><init>(Ljava/lang/reflect/Method;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public getTypeVariables()Lnet/bytebuddy/description/type/TypeList$Generic;
    .locals 1

    .line 1
    sget-boolean v0, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->RAW_TYPES:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance p0, Lnet/bytebuddy/description/type/TypeList$Generic$Empty;

    .line 6
    .line 7
    invoke-direct {p0}, Lnet/bytebuddy/description/type/TypeList$Generic$Empty;-><init>()V

    .line 8
    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;->executable:Ljava/lang/reflect/AnnotatedElement;

    .line 12
    .line 13
    check-cast p0, Ljava/lang/reflect/GenericDeclaration;

    .line 14
    .line 15
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeList$Generic$ForLoadedTypes$OfTypeVariables;->of(Ljava/lang/reflect/GenericDeclaration;)Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public isBridge()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;->executable:Ljava/lang/reflect/AnnotatedElement;

    .line 2
    .line 3
    check-cast p0, Ljava/lang/reflect/Method;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public isConstructor()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public isSynthetic()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;->executable:Ljava/lang/reflect/AnnotatedElement;

    .line 2
    .line 3
    check-cast p0, Ljava/lang/reflect/Method;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->isSynthetic()Z

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
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)Z"
        }
    .end annotation

    .line 27
    const/4 p0, 0x0

    return p0
.end method

.method public represents(Ljava/lang/reflect/Method;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase$ForLoadedExecutable;->executable:Ljava/lang/reflect/AnnotatedElement;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/reflect/Method;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Method;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

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
