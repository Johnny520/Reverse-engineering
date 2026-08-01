.class public Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameter;
.super Lnet/bytebuddy/description/method/ParameterDescription$AbstractBase;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TransformedParameter"
.end annotation


# instance fields
.field private final index:I

.field private final parameterToken:Lnet/bytebuddy/description/method/ParameterDescription$Token;

.field final synthetic this$0:Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;ILnet/bytebuddy/description/method/ParameterDescription$Token;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameter;->this$0:Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;

    .line 2
    .line 3
    invoke-direct {p0}, Lnet/bytebuddy/description/method/ParameterDescription$AbstractBase;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p2, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameter;->index:I

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameter;->parameterToken:Lnet/bytebuddy/description/method/ParameterDescription$Token;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public bridge synthetic asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;
    .locals 0

    .line 20
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameter;->asDefined()Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;

    move-result-object p0

    return-object p0
.end method

.method public asDefined()Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameter;->this$0:Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;->access$100(Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;)Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget p0, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameter;->index:I

    .line 12
    .line 13
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;

    .line 18
    .line 19
    return-object p0
.end method

.method public getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameter;->parameterToken:Lnet/bytebuddy/description/method/ParameterDescription$Token;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/ParameterDescription$Token;->getAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getDeclaringMethod()Lnet/bytebuddy/description/method/MethodDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameter;->this$0:Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;

    .line 2
    .line 3
    return-object p0
.end method

.method public getIndex()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameter;->index:I

    .line 2
    .line 3
    return p0
.end method

.method public getModifiers()I
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameter;->parameterToken:Lnet/bytebuddy/description/method/ParameterDescription$Token;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/bytebuddy/description/method/ParameterDescription$Token;->getModifiers()Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-super {p0}, Lnet/bytebuddy/description/method/ParameterDescription$AbstractBase;->getModifiers()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameter;->parameterToken:Lnet/bytebuddy/description/method/ParameterDescription$Token;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/bytebuddy/description/method/ParameterDescription$Token;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-super {p0}, Lnet/bytebuddy/description/method/ParameterDescription$AbstractBase;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    return-object v0
.end method

.method public getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameter;->parameterToken:Lnet/bytebuddy/description/method/ParameterDescription$Token;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/bytebuddy/description/method/ParameterDescription$Token;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$AttachmentVisitor;

    .line 8
    .line 9
    iget-object p0, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameter;->this$0:Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$AttachmentVisitor;-><init>(Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

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

.method public hasModifiers()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameter;->parameterToken:Lnet/bytebuddy/description/method/ParameterDescription$Token;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/ParameterDescription$Token;->getModifiers()Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public isNamed()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameter;->parameterToken:Lnet/bytebuddy/description/method/ParameterDescription$Token;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/ParameterDescription$Token;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method
