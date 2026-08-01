.class Lbsh/BSHLambdaExpression;
.super Lbsh/SimpleNode;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private body:Lbsh/飘花落叶言子世兰苏楪哲;

.field private initializedValues:Z

.field private paramsModifiers:[Lbsh/Modifiers;

.field private paramsNames:[Ljava/lang/String;

.field private paramsTypes:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field singleParamName:Ljava/lang/String;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbsh/SimpleNode;-><init>(I)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lbsh/BSHLambdaExpression;->initializedValues:Z

    .line 6
    .line 7
    return-void
.end method

.method private initValues(Lbsh/CallStack;Lbsh/Interpreter;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lbsh/BSHLambdaExpression;->initializedValues:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x2

    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, v3}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lbsh/BSHFormalParameters;

    .line 20
    .line 21
    invoke-virtual {v0, p1, p2}, Lbsh/BSHFormalParameters;->eval(Lbsh/CallStack;Lbsh/Interpreter;)[Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lbsh/BSHLambdaExpression;->paramsTypes:[Ljava/lang/Class;

    .line 26
    .line 27
    invoke-virtual {v0}, Lbsh/BSHFormalParameters;->getParamModifiers()[Lbsh/Modifiers;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lbsh/BSHLambdaExpression;->paramsModifiers:[Lbsh/Modifiers;

    .line 32
    .line 33
    invoke-virtual {v0}, Lbsh/BSHFormalParameters;->getParamNames()[Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lbsh/BSHLambdaExpression;->paramsNames:[Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p0, v2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, Lbsh/BSHLambdaExpression;->body:Lbsh/飘花落叶言子世兰苏楪哲;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 p1, 0x0

    .line 47
    filled-new-array {p1}, [Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    iput-object p2, p0, Lbsh/BSHLambdaExpression;->paramsTypes:[Ljava/lang/Class;

    .line 52
    .line 53
    filled-new-array {p1}, [Lbsh/Modifiers;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object p1, p0, Lbsh/BSHLambdaExpression;->paramsModifiers:[Lbsh/Modifiers;

    .line 58
    .line 59
    iget-object p1, p0, Lbsh/BSHLambdaExpression;->singleParamName:Ljava/lang/String;

    .line 60
    .line 61
    filled-new-array {p1}, [Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, Lbsh/BSHLambdaExpression;->paramsNames:[Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {p0, v3}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p1, p0, Lbsh/BSHLambdaExpression;->body:Lbsh/飘花落叶言子世兰苏楪哲;

    .line 72
    .line 73
    :goto_0
    iput-boolean v2, p0, Lbsh/BSHLambdaExpression;->initializedValues:Z

    .line 74
    .line 75
    return-void
.end method


# virtual methods
.method public eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-direct {p0, p1, p2}, Lbsh/BSHLambdaExpression;->initValues(Lbsh/CallStack;Lbsh/Interpreter;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    iget-object v3, p0, Lbsh/BSHLambdaExpression;->paramsModifiers:[Lbsh/Modifiers;

    .line 9
    .line 10
    iget-object v4, p0, Lbsh/BSHLambdaExpression;->paramsTypes:[Ljava/lang/Class;

    .line 11
    .line 12
    iget-object v5, p0, Lbsh/BSHLambdaExpression;->paramsNames:[Ljava/lang/String;

    .line 13
    .line 14
    iget-object v6, p0, Lbsh/BSHLambdaExpression;->body:Lbsh/飘花落叶言子世兰苏楪哲;

    .line 15
    .line 16
    sget-object p1, Lbsh/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰:Lcom/kongzue/dialogx/util/飘花落叶言子楪世兰哲苏;

    .line 17
    .line 18
    new-instance v0, Lbsh/飘花落叶言子楪苏兰世哲;

    .line 19
    .line 20
    move-object v1, p0

    .line 21
    invoke-direct/range {v0 .. v6}, Lbsh/飘花落叶言子楪苏兰世哲;-><init>(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/NameSpace;[Lbsh/Modifiers;[Ljava/lang/Class;[Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method
