.class Lbsh/BSHUnaryExpression;
.super Lbsh/SimpleNode;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lbsh/ParserConstants;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public kind:I

.field public postfix:Z


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
    iput-boolean p1, p0, Lbsh/BSHUnaryExpression;->postfix:Z

    .line 6
    .line 7
    return-void
.end method

.method private lhsUnaryOperation(Lbsh/LHS;Z)Ljava/lang/Object;
    .locals 3

    .line 1
    const-string v0, "lhsUnaryOperation"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lbsh/LHS;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v1, p0, Lbsh/BSHUnaryExpression;->kind:I

    .line 15
    .line 16
    invoke-direct {p0, v0, v1}, Lbsh/BSHUnaryExpression;->unaryOperation(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-boolean v2, p0, Lbsh/BSHUnaryExpression;->postfix:Z

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v0, v1

    .line 26
    :goto_0
    invoke-virtual {p1, v1, p2}, Lbsh/LHS;->assign(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method private unaryOperation(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 2

    .line 1
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    sget-object p1, Lbsh/Primitive;->TRUE:Lbsh/Primitive;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object p1, Lbsh/Primitive;->FALSE:Lbsh/Primitive;

    .line 17
    .line 18
    :cond_1
    :goto_0
    instance-of v0, p1, Lbsh/Primitive;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    check-cast p1, Lbsh/Primitive;

    .line 23
    .line 24
    invoke-static {p1, p2}, Lbsh/Operators;->unaryOperation(Lbsh/Primitive;I)Lbsh/Primitive;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :cond_2
    new-instance p1, Lbsh/UtilEvalError;

    .line 30
    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v1, "Unary operation "

    .line 34
    .line 35
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    sget-object v1, Lbsh/ParserConstants;->tokenImage:[Ljava/lang/String;

    .line 39
    .line 40
    aget-object p2, v1, p2

    .line 41
    .line 42
    const-string v1, " inappropriate for object"

    .line 43
    .line 44
    invoke-static {v0, p2, v1}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-direct {p1, p2}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1
.end method


# virtual methods
.method public eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    :try_start_0
    iget v1, p0, Lbsh/BSHUnaryExpression;->kind:I

    .line 7
    .line 8
    const/16 v2, 0x66

    .line 9
    .line 10
    if-eq v1, v2, :cond_1

    .line 11
    .line 12
    const/16 v2, 0x67

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {v0, p1, p2}, Lbsh/Node;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    iget v0, p0, Lbsh/BSHUnaryExpression;->kind:I

    .line 22
    .line 23
    invoke-direct {p0, p2, v0}, Lbsh/BSHUnaryExpression;->unaryOperation(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :catch_0
    move-exception p2

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    check-cast v0, Lbsh/BSHPrimaryExpression;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, Lbsh/BSHPrimaryExpression;->toLHS(Lbsh/CallStack;Lbsh/Interpreter;)Lbsh/LHS;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p2}, Lbsh/Interpreter;->getStrictJava()Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    invoke-direct {p0, v0, p2}, Lbsh/BSHUnaryExpression;->lhsUnaryOperation(Lbsh/LHS;Z)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    return-object p1

    .line 45
    :goto_1
    invoke-virtual {p2, p0, p1}, Lbsh/UtilEvalError;->toEvalError(Lbsh/Node;Lbsh/CallStack;)Lbsh/EvalError;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lbsh/SimpleNode;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ": "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    sget-object v1, Lbsh/ParserConstants;->tokenImage:[Ljava/lang/String;

    .line 19
    .line 20
    iget v2, p0, Lbsh/BSHUnaryExpression;->kind:I

    .line 21
    .line 22
    aget-object v1, v1, v2

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
.end method
