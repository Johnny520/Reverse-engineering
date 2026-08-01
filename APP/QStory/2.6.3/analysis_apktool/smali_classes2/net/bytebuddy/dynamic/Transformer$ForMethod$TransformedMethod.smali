.class public Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;
.super Lnet/bytebuddy/description/method/MethodDescription$AbstractBase;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/Transformer$ForMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TransformedMethod"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$AttachmentVisitor;,
        Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameter;,
        Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameterList;
    }
.end annotation


# instance fields
.field private final declaringType:Lnet/bytebuddy/description/type/TypeDefinition;

.field private final instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

.field private final methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private final token:Lnet/bytebuddy/description/method/MethodDescription$Token;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/description/method/MethodDescription$Token;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/method/MethodDescription$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;->declaringType:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;->token:Lnet/bytebuddy/description/method/MethodDescription$Token;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic access$000(Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;)Lnet/bytebuddy/description/method/MethodDescription$Token;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;->token:Lnet/bytebuddy/description/method/MethodDescription$Token;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100(Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;)Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$200(Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;)Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public bridge synthetic asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;->asDefined()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public asDefined()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 0

    .line 6
    iget-object p0, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    return-object p0
.end method

.method public getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;->token:Lnet/bytebuddy/description/method/MethodDescription$Token;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/MethodDescription$Token;->getAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;
    .locals 0
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;->declaringType:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 2
    .line 3
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

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;->token:Lnet/bytebuddy/description/method/MethodDescription$Token;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/MethodDescription$Token;->getDefaultValue()Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getExceptionTypes()Lnet/bytebuddy/description/type/TypeList$Generic;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$Generic$ForDetachedTypes;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;->token:Lnet/bytebuddy/description/method/MethodDescription$Token;

    .line 4
    .line 5
    invoke-virtual {v1}, Lnet/bytebuddy/description/method/MethodDescription$Token;->getExceptionTypes()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$AttachmentVisitor;

    .line 10
    .line 11
    invoke-direct {v2, p0}, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$AttachmentVisitor;-><init>(Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/description/type/TypeList$Generic$ForDetachedTypes;-><init>(Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public getInternalName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;->token:Lnet/bytebuddy/description/method/MethodDescription$Token;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/MethodDescription$Token;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getModifiers()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;->token:Lnet/bytebuddy/description/method/MethodDescription$Token;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/MethodDescription$Token;->getModifiers()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getParameters()Lnet/bytebuddy/description/method/ParameterList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/method/ParameterList<",
            "*>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameterList;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameterList;-><init>(Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public getReceiverType()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;->token:Lnet/bytebuddy/description/method/MethodDescription$Token;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/bytebuddy/description/method/MethodDescription$Token;->getReceiverType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lnet/bytebuddy/description/type/TypeDescription$Generic;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v1, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$AttachmentVisitor;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$AttachmentVisitor;-><init>(Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 22
    .line 23
    return-object p0
.end method

.method public getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;->token:Lnet/bytebuddy/description/method/MethodDescription$Token;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/bytebuddy/description/method/MethodDescription$Token;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$AttachmentVisitor;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$AttachmentVisitor;-><init>(Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 17
    .line 18
    return-object p0
.end method

.method public getTypeVariables()Lnet/bytebuddy/description/type/TypeList$Generic;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$Generic$ForDetachedTypes$OfTypeVariables;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;->token:Lnet/bytebuddy/description/method/MethodDescription$Token;

    .line 4
    .line 5
    invoke-virtual {v1}, Lnet/bytebuddy/description/method/MethodDescription$Token;->getTypeVariableTokens()Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$AttachmentVisitor;

    .line 10
    .line 11
    invoke-direct {v2, p0}, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$AttachmentVisitor;-><init>(Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, p0, v1, v2}, Lnet/bytebuddy/description/type/TypeList$Generic$ForDetachedTypes$OfTypeVariables;-><init>(Lnet/bytebuddy/description/TypeVariableSource;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method
