.class public Lnet/bytebuddy/description/type/TypeDescription$Generic$OfParameterizedType$ForReifiedType;
.super Lnet/bytebuddy/description/type/TypeDescription$Generic$OfParameterizedType;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/type/TypeDescription$Generic$OfParameterizedType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForReifiedType"
.end annotation


# instance fields
.field private final parameterizedType:Lnet/bytebuddy/description/type/TypeDescription$Generic;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfParameterizedType;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfParameterizedType$ForReifiedType;->parameterizedType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public asErasure()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfParameterizedType$ForReifiedType;->parameterizedType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public bridge synthetic getComponentType()Lnet/bytebuddy/description/type/TypeDefinition;
    .locals 0

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfParameterizedType;->getComponentType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;
    .locals 0

    .line 1
    new-instance p0, Lnet/bytebuddy/description/annotation/AnnotationList$Empty;

    .line 2
    .line 3
    invoke-direct {p0}, Lnet/bytebuddy/description/annotation/AnnotationList$Empty;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/field/FieldList<",
            "Lnet/bytebuddy/description/field/FieldDescription$InGenericShape;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/description/field/FieldList$TypeSubstituting;

    .line 2
    .line 3
    invoke-super {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfParameterizedType;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$TypeErasing;->INSTANCE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$TypeErasing;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, v2}, Lnet/bytebuddy/description/field/FieldList$TypeSubstituting;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/method/MethodList<",
            "Lnet/bytebuddy/description/method/MethodDescription$InGenericShape;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/description/method/MethodList$TypeSubstituting;

    .line 2
    .line 3
    invoke-super {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfParameterizedType;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$TypeErasing;->INSTANCE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$TypeErasing;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, v2}, Lnet/bytebuddy/description/method/MethodList$TypeSubstituting;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public getInterfaces()Lnet/bytebuddy/description/type/TypeList$Generic;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$Generic$ForDetachedTypes$WithResolvedErasure;

    .line 2
    .line 3
    invoke-super {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfParameterizedType;->getInterfaces()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v1, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Reifying;->INHERITING:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Reifying;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/description/type/TypeList$Generic$ForDetachedTypes$WithResolvedErasure;-><init>(Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public getOwnerType()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfParameterizedType$ForReifiedType;->parameterizedType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getOwnerType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lnet/bytebuddy/description/type/TypeDescription$Generic;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Reifying;->INHERITING:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Reifying;

    .line 13
    .line 14
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 19
    .line 20
    return-object p0
.end method

.method public getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 2
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfParameterizedType;->getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lnet/bytebuddy/description/type/TypeDescription$Generic;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$LazyProjection$WithResolvedErasure;

    .line 11
    .line 12
    sget-object v1, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Reifying;->INHERITING:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Reifying;

    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$LazyProjection$WithResolvedErasure;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public getTypeArguments()Lnet/bytebuddy/description/type/TypeList$Generic;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$Generic$ForDetachedTypes;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfParameterizedType$ForReifiedType;->parameterizedType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 4
    .line 5
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getTypeArguments()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object v1, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$TypeErasing;->INSTANCE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$TypeErasing;

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/description/type/TypeList$Generic$ForDetachedTypes;-><init>(Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
