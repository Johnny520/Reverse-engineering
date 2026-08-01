.class public Lnet/bytebuddy/description/method/MethodDescription$Token;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/description/ByteCodeElement$Token;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/method/MethodDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Token"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnet/bytebuddy/description/ByteCodeElement$Token<",
        "Lnet/bytebuddy/description/method/MethodDescription$Token;",
        ">;"
    }
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

.field private final defaultValue:Lnet/bytebuddy/description/annotation/AnnotationValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "**>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final exceptionTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;"
        }
    .end annotation
.end field

.field private transient synthetic hashCode:I

.field private final modifiers:I

.field private final name:Ljava/lang/String;

.field private final parameterTokens:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/method/ParameterDescription$Token;",
            ">;"
        }
    .end annotation
.end field

.field private final receiverType:Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final returnType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

.field private final typeVariableTokens:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeVariableToken;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 27
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v0

    const-string v1, "<init>"

    invoke-direct {p0, v1, p1, v0}, Lnet/bytebuddy/description/method/MethodDescription$Token;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/description/annotation/AnnotationValue;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V
    .locals 0
    .param p8    # Lnet/bytebuddy/description/annotation/AnnotationValue;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p9    # Lnet/bytebuddy/description/type/TypeDescription$Generic;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeVariableToken;",
            ">;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/method/ParameterDescription$Token;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "**>;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->name:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->modifiers:I

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->typeVariableTokens:Ljava/util/List;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->returnType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->parameterTokens:Ljava/util/List;

    .line 13
    .line 14
    iput-object p6, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->exceptionTypes:Ljava/util/List;

    .line 15
    .line 16
    iput-object p7, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->annotations:Ljava/util/List;

    .line 17
    .line 18
    iput-object p8, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->defaultValue:Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 19
    .line 20
    iput-object p9, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->receiverType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;)V
    .locals 1

    .line 23
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {p0, p1, p2, p3, v0}, Lnet/bytebuddy/description/method/MethodDescription$Token;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;)V"
        }
    .end annotation

    .line 24
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    new-instance v5, Lnet/bytebuddy/description/method/ParameterDescription$Token$TypeList;

    invoke-direct {v5, p4}, Lnet/bytebuddy/description/method/ParameterDescription$Token$TypeList;-><init>(Ljava/util/List;)V

    .line 25
    sget-object v8, Lnet/bytebuddy/description/annotation/AnnotationValue;->UNDEFINED:Lnet/bytebuddy/description/annotation/AnnotationValue;

    sget-object v9, Lnet/bytebuddy/description/type/TypeDescription$Generic;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-object v6, v3

    move-object v7, v3

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v4, p3

    .line 26
    invoke-direct/range {v0 .. v9}, Lnet/bytebuddy/description/method/MethodDescription$Token;-><init>(Ljava/lang/String;ILjava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/description/annotation/AnnotationValue;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/description/ByteCodeElement$Token;
    .locals 0

    .line 62
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/method/MethodDescription$Token;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/description/method/MethodDescription$Token;

    move-result-object p0

    return-object p0
.end method

.method public accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/description/method/MethodDescription$Token;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;)",
            "Lnet/bytebuddy/description/method/MethodDescription$Token;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$Token;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->name:Ljava/lang/String;

    .line 4
    .line 5
    iget v2, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->modifiers:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/MethodDescription$Token;->getTypeVariableTokens()Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v3, p1}, Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget-object v4, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->returnType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 16
    .line 17
    invoke-interface {v4, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    check-cast v4, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 22
    .line 23
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/MethodDescription$Token;->getParameterTokens()Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-virtual {v5, p1}, Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/MethodDescription$Token;->getExceptionTypes()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    invoke-interface {v6, p1}, Lnet/bytebuddy/description/type/TypeList$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    iget-object v7, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->annotations:Ljava/util/List;

    .line 40
    .line 41
    iget-object v8, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->defaultValue:Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 42
    .line 43
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->receiverType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 44
    .line 45
    if-nez p0, :cond_0

    .line 46
    .line 47
    sget-object p0, Lnet/bytebuddy/description/type/TypeDescription$Generic;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 48
    .line 49
    :goto_0
    move-object v9, p0

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    invoke-interface {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :goto_1
    invoke-direct/range {v0 .. v9}, Lnet/bytebuddy/description/method/MethodDescription$Token;-><init>(Ljava/lang/String;ILjava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/description/annotation/AnnotationValue;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 59
    .line 60
    .line 61
    return-object v0
.end method

.method public asSignatureToken(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Reducing;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->typeVariableTokens:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Reducing;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    new-instance p1, Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v1, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->parameterTokens:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->parameterTokens:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lnet/bytebuddy/description/method/ParameterDescription$Token;

    .line 36
    .line 37
    invoke-virtual {v2}, Lnet/bytebuddy/description/method/ParameterDescription$Token;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {v2, v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance v1, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 50
    .line 51
    iget-object v2, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->name:Ljava/lang/String;

    .line 52
    .line 53
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->returnType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 54
    .line 55
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Lnet/bytebuddy/description/type/TypeDescription;

    .line 60
    .line 61
    invoke-direct {v1, v2, p0, p1}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 62
    .line 63
    .line 64
    return-object v1
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
    if-eqz p1, :cond_4

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-eq v2, v3, :cond_1

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_1
    check-cast p1, Lnet/bytebuddy/description/method/MethodDescription$Token;

    .line 20
    .line 21
    iget v2, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->modifiers:I

    .line 22
    .line 23
    iget v3, p1, Lnet/bytebuddy/description/method/MethodDescription$Token;->modifiers:I

    .line 24
    .line 25
    if-ne v2, v3, :cond_4

    .line 26
    .line 27
    iget-object v2, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->name:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v3, p1, Lnet/bytebuddy/description/method/MethodDescription$Token;->name:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    iget-object v2, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->typeVariableTokens:Ljava/util/List;

    .line 38
    .line 39
    iget-object v3, p1, Lnet/bytebuddy/description/method/MethodDescription$Token;->typeVariableTokens:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v2, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_4

    .line 46
    .line 47
    iget-object v2, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->returnType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 48
    .line 49
    iget-object v3, p1, Lnet/bytebuddy/description/method/MethodDescription$Token;->returnType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_4

    .line 56
    .line 57
    iget-object v2, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->parameterTokens:Ljava/util/List;

    .line 58
    .line 59
    iget-object v3, p1, Lnet/bytebuddy/description/method/MethodDescription$Token;->parameterTokens:Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {v2, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_4

    .line 66
    .line 67
    iget-object v2, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->exceptionTypes:Ljava/util/List;

    .line 68
    .line 69
    iget-object v3, p1, Lnet/bytebuddy/description/method/MethodDescription$Token;->exceptionTypes:Ljava/util/List;

    .line 70
    .line 71
    invoke-interface {v2, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_4

    .line 76
    .line 77
    iget-object v2, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->annotations:Ljava/util/List;

    .line 78
    .line 79
    iget-object v3, p1, Lnet/bytebuddy/description/method/MethodDescription$Token;->annotations:Ljava/util/List;

    .line 80
    .line 81
    invoke-interface {v2, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_4

    .line 86
    .line 87
    iget-object v2, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->defaultValue:Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 88
    .line 89
    iget-object v3, p1, Lnet/bytebuddy/description/method/MethodDescription$Token;->defaultValue:Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 90
    .line 91
    if-eqz v2, :cond_2

    .line 92
    .line 93
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-eqz v2, :cond_4

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    if-nez v3, :cond_4

    .line 101
    .line 102
    :goto_0
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->receiverType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 103
    .line 104
    iget-object p1, p1, Lnet/bytebuddy/description/method/MethodDescription$Token;->receiverType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 105
    .line 106
    if-eqz p0, :cond_3

    .line 107
    .line 108
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    if-eqz p0, :cond_4

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_3
    if-nez p1, :cond_4

    .line 116
    .line 117
    :goto_1
    return v0

    .line 118
    :cond_4
    :goto_2
    return v1
.end method

.method public getAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationList$Explicit;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->annotations:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/annotation/AnnotationList$Explicit;-><init>(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-object v0
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
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->defaultValue:Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 2
    .line 3
    return-object p0
.end method

.method public getExceptionTypes()Lnet/bytebuddy/description/type/TypeList$Generic;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->exceptionTypes:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;-><init>(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public getModifiers()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->modifiers:I

    .line 2
    .line 3
    return p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getParameterTokens()Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList<",
            "Lnet/bytebuddy/description/method/ParameterDescription$Token;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->parameterTokens:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;-><init>(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public getReceiverType()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->receiverType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    return-object p0
.end method

.method public getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->returnType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTypeVariableTokens()Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList<",
            "Lnet/bytebuddy/description/type/TypeVariableToken;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->typeVariableTokens:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;-><init>(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public hashCode()I
    .locals 4
    .annotation runtime Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;
        value = "hashCode"
    .end annotation

    .line 1
    iget v0, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->hashCode:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->name:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v2, 0x1f

    .line 14
    .line 15
    mul-int/2addr v0, v2

    .line 16
    iget v3, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->modifiers:I

    .line 17
    .line 18
    add-int/2addr v0, v3

    .line 19
    mul-int/2addr v0, v2

    .line 20
    iget-object v3, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->typeVariableTokens:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v3}, Ljava/util/List;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    add-int/2addr v3, v0

    .line 27
    mul-int/2addr v3, v2

    .line 28
    iget-object v0, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->returnType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 29
    .line 30
    invoke-static {v0, v3, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(Lnet/bytebuddy/description/type/TypeDescription$Generic;II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v3, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->parameterTokens:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v3}, Ljava/util/List;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    add-int/2addr v3, v0

    .line 41
    mul-int/2addr v3, v2

    .line 42
    iget-object v0, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->exceptionTypes:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    add-int/2addr v0, v3

    .line 49
    mul-int/2addr v0, v2

    .line 50
    iget-object v3, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->annotations:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v3}, Ljava/util/List;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    add-int/2addr v3, v0

    .line 57
    mul-int/2addr v3, v2

    .line 58
    iget-object v0, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->defaultValue:Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 59
    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    move v0, v1

    .line 68
    :goto_0
    add-int/2addr v3, v0

    .line 69
    mul-int/2addr v3, v2

    .line 70
    iget-object v0, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->receiverType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 71
    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    :cond_2
    add-int/2addr v1, v3

    .line 79
    :goto_1
    if-nez v1, :cond_3

    .line 80
    .line 81
    iget p0, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->hashCode:I

    .line 82
    .line 83
    return p0

    .line 84
    :cond_3
    iput v1, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->hashCode:I

    .line 85
    .line 86
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "MethodDescription.Token{name=\'"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->name:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "\', modifiers="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->modifiers:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", typeVariableTokens="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->typeVariableTokens:Ljava/util/List;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", returnType="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->returnType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", parameterTokens="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->parameterTokens:Ljava/util/List;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", exceptionTypes="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->exceptionTypes:Ljava/util/List;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", annotations="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->annotations:Ljava/util/List;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", defaultValue="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->defaultValue:Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", receiverType="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object p0, p0, Lnet/bytebuddy/description/method/MethodDescription$Token;->receiverType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 89
    .line 90
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const/16 p0, 0x7d

    .line 94
    .line 95
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0
.end method
