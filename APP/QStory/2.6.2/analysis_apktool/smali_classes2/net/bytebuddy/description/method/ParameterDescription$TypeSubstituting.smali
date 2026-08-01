.class public Lnet/bytebuddy/description/method/ParameterDescription$TypeSubstituting;
.super Lnet/bytebuddy/description/method/ParameterDescription$AbstractBase;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/description/method/ParameterDescription$InGenericShape;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/method/ParameterDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TypeSubstituting"
.end annotation


# instance fields
.field private final declaringMethod:Lnet/bytebuddy/description/method/MethodDescription$InGenericShape;

.field private final parameterDescription:Lnet/bytebuddy/description/method/ParameterDescription;

.field private final visitor:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/method/MethodDescription$InGenericShape;Lnet/bytebuddy/description/method/ParameterDescription;Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription$InGenericShape;",
            "Lnet/bytebuddy/description/method/ParameterDescription;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/method/ParameterDescription$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/method/ParameterDescription$TypeSubstituting;->declaringMethod:Lnet/bytebuddy/description/method/MethodDescription$InGenericShape;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/description/method/ParameterDescription$TypeSubstituting;->parameterDescription:Lnet/bytebuddy/description/method/ParameterDescription;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/description/method/ParameterDescription$TypeSubstituting;->visitor:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public bridge synthetic asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;
    .locals 0

    .line 10
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/ParameterDescription$TypeSubstituting;->asDefined()Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;

    move-result-object p0

    return-object p0
.end method

.method public asDefined()Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/method/ParameterDescription$TypeSubstituting;->parameterDescription:Lnet/bytebuddy/description/method/ParameterDescription;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;

    .line 8
    .line 9
    return-object p0
.end method

.method public getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/method/ParameterDescription$TypeSubstituting;->parameterDescription:Lnet/bytebuddy/description/method/ParameterDescription;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getDeclaringMethod()Lnet/bytebuddy/description/method/MethodDescription$InGenericShape;
    .locals 0

    .line 6
    iget-object p0, p0, Lnet/bytebuddy/description/method/ParameterDescription$TypeSubstituting;->declaringMethod:Lnet/bytebuddy/description/method/MethodDescription$InGenericShape;

    return-object p0
.end method

.method public bridge synthetic getDeclaringMethod()Lnet/bytebuddy/description/method/MethodDescription;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/ParameterDescription$TypeSubstituting;->getDeclaringMethod()Lnet/bytebuddy/description/method/MethodDescription$InGenericShape;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getIndex()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/method/ParameterDescription$TypeSubstituting;->parameterDescription:Lnet/bytebuddy/description/method/ParameterDescription;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/method/ParameterDescription;->getIndex()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getModifiers()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/method/ParameterDescription$TypeSubstituting;->parameterDescription:Lnet/bytebuddy/description/method/ParameterDescription;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/method/ParameterDescription$TypeSubstituting;->parameterDescription:Lnet/bytebuddy/description/method/ParameterDescription;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getOffset()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/method/ParameterDescription$TypeSubstituting;->parameterDescription:Lnet/bytebuddy/description/method/ParameterDescription;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/method/ParameterDescription;->getOffset()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/method/ParameterDescription$TypeSubstituting;->parameterDescription:Lnet/bytebuddy/description/method/ParameterDescription;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p0, p0, Lnet/bytebuddy/description/method/ParameterDescription$TypeSubstituting;->visitor:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;

    .line 8
    .line 9
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 14
    .line 15
    return-object p0
.end method

.method public hasModifiers()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/method/ParameterDescription$TypeSubstituting;->parameterDescription:Lnet/bytebuddy/description/method/ParameterDescription;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/method/ParameterDescription;->hasModifiers()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isNamed()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/method/ParameterDescription$TypeSubstituting;->parameterDescription:Lnet/bytebuddy/description/method/ParameterDescription;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement$WithOptionalName;->isNamed()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
