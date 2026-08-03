.class Lbsh/BshLambda$BshLambdaFromLambdaExpression;
.super Lbsh/BshLambda;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbsh/BshLambda;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BshLambdaFromLambdaExpression"
.end annotation


# instance fields
.field private final bodyNode:Lbsh/Node;

.field private final declaringNameSpace:Lbsh/NameSpace;

.field private final paramsModifiers:[Lbsh/Modifiers;

.field private final paramsNames:[Ljava/lang/String;

.field private final paramsTypes:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbsh/Node;Lbsh/NameSpace;[Lbsh/Modifiers;[Ljava/lang/Class;[Ljava/lang/String;Lbsh/Node;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbsh/Node;",
            "Lbsh/NameSpace;",
            "[",
            "Lbsh/Modifiers;",
            "[",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/String;",
            "Lbsh/Node;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lbsh/BshLambda;-><init>(Lbsh/Node;I)V

    .line 3
    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Lbsh/NameSpace;->toLambdaNameSpace()Lbsh/NameSpace;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    iput-object p1, p0, Lbsh/BshLambda$BshLambdaFromLambdaExpression;->declaringNameSpace:Lbsh/NameSpace;

    .line 14
    .line 15
    iput-object p3, p0, Lbsh/BshLambda$BshLambdaFromLambdaExpression;->paramsModifiers:[Lbsh/Modifiers;

    .line 16
    .line 17
    iput-object p4, p0, Lbsh/BshLambda$BshLambdaFromLambdaExpression;->paramsTypes:[Ljava/lang/Class;

    .line 18
    .line 19
    iput-object p5, p0, Lbsh/BshLambda$BshLambdaFromLambdaExpression;->paramsNames:[Ljava/lang/String;

    .line 20
    .line 21
    iput-object p6, p0, Lbsh/BshLambda$BshLambdaFromLambdaExpression;->bodyNode:Lbsh/Node;

    .line 22
    .line 23
    array-length p1, p3

    .line 24
    array-length p2, p4

    .line 25
    if-ne p1, p2, :cond_1

    .line 26
    .line 27
    array-length p1, p4

    .line 28
    array-length p2, p5

    .line 29
    if-ne p1, p2, :cond_1

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    const-string p1, "The length of \'paramsModifiers\', \'paramsTypes\' and \'paramsNames\' can\'t be different!"

    .line 33
    .line 34
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    throw p1
.end method

.method private initNameSpace([Ljava/lang/Object;)Lbsh/NameSpace;
    .locals 7

    .line 1
    new-instance v0, Lbsh/NameSpace;

    .line 2
    .line 3
    iget-object v1, p0, Lbsh/BshLambda$BshLambdaFromLambdaExpression;->declaringNameSpace:Lbsh/NameSpace;

    .line 4
    .line 5
    const-string v2, "LambdaExpression"

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    iget-object v3, p0, Lbsh/BshLambda$BshLambdaFromLambdaExpression;->paramsNames:[Ljava/lang/String;

    .line 13
    .line 14
    array-length v4, v3

    .line 15
    if-ge v2, v4, :cond_1

    .line 16
    .line 17
    iget-object v4, p0, Lbsh/BshLambda$BshLambdaFromLambdaExpression;->paramsTypes:[Ljava/lang/Class;

    .line 18
    .line 19
    aget-object v4, v4, v2

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    aget-object v3, v3, v2

    .line 24
    .line 25
    aget-object v5, p1, v2

    .line 26
    .line 27
    iget-object v6, p0, Lbsh/BshLambda$BshLambdaFromLambdaExpression;->paramsModifiers:[Lbsh/Modifiers;

    .line 28
    .line 29
    aget-object v6, v6, v2

    .line 30
    .line 31
    invoke-virtual {v0, v3, v4, v5, v6}, Lbsh/NameSpace;->setTypedVariable(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    aget-object v3, v3, v2

    .line 36
    .line 37
    aget-object v4, p1, v2

    .line 38
    .line 39
    invoke-virtual {v0, v3, v4, v1}, Lbsh/NameSpace;->setVariable(Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 40
    .line 41
    .line 42
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-object v0
.end method


# virtual methods
.method public final invokeImpl([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    iget-object v1, p0, Lbsh/BshLambda$BshLambdaFromLambdaExpression;->paramsTypes:[Ljava/lang/Class;

    .line 3
    .line 4
    array-length v1, v1

    .line 5
    if-ne v0, v1, :cond_2

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lbsh/BshLambda$BshLambdaFromLambdaExpression;->initNameSpace([Ljava/lang/Object;)Lbsh/NameSpace;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-instance v0, Lbsh/CallStack;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lbsh/CallStack;-><init>(Lbsh/NameSpace;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lbsh/Interpreter;

    .line 17
    .line 18
    invoke-direct {v1, p1}, Lbsh/Interpreter;-><init>(Lbsh/NameSpace;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lbsh/BshLambda$BshLambdaFromLambdaExpression;->bodyNode:Lbsh/Node;

    .line 22
    .line 23
    instance-of v2, p1, Lbsh/BSHBlock;

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-interface {p1, v0, v1}, Lbsh/Node;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    instance-of v0, p1, Lbsh/ReturnControl;

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    check-cast p1, Lbsh/ReturnControl;

    .line 36
    .line 37
    iget v0, p1, Lbsh/ReturnControl;->kind:I

    .line 38
    .line 39
    const/16 v1, 0x2f

    .line 40
    .line 41
    if-ne v0, v1, :cond_0

    .line 42
    .line 43
    iget-object p1, p1, Lbsh/ReturnControl;->value:Ljava/lang/Object;

    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_0
    const/4 p1, 0x0

    .line 47
    return-object p1

    .line 48
    :cond_1
    invoke-interface {p1, v0, v1}, Lbsh/Node;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :cond_2
    new-instance p1, Lbsh/UtilEvalError;

    .line 54
    .line 55
    const-string v0, "Wrong number of arguments!"

    .line 56
    .line 57
    invoke-direct {p1, v0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1
.end method

.method public isAssignable(Ljava/lang/reflect/Method;I)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lbsh/BshLambda$BshLambdaFromLambdaExpression;->paramsTypes:[Ljava/lang/Class;

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    array-length v2, p1

    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    :cond_0
    invoke-static {v0, p1, p2}, Lbsh/Types;->isSignatureAssignable([Ljava/lang/Class;[Ljava/lang/reflect/Type;I)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method
