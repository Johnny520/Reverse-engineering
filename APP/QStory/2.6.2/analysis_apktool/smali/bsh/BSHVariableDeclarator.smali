.class Lbsh/BSHVariableDeclarator;
.super Lbsh/SimpleNode;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public dimensions:I

.field public name:Ljava/lang/String;


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
    iput p1, p0, Lbsh/BSHVariableDeclarator;->dimensions:I

    .line 6
    .line 7
    return-void
.end method

.method private getArrayDims(Lbsh/BSHType;)I
    .locals 0

    .line 1
    iget p0, p0, Lbsh/BSHVariableDeclarator;->dimensions:I

    .line 2
    .line 3
    if-lez p0, :cond_0

    .line 4
    .line 5
    return p0

    .line 6
    :cond_0
    invoke-virtual {p1}, Lbsh/BSHType;->getArrayDims()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-lez p0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Lbsh/BSHType;->getArrayDims()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_1
    const/4 p0, -0x1

    .line 18
    return p0
.end method


# virtual methods
.method public eval(Lbsh/BSHType;Lbsh/Modifiers;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "final"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p1}, Lbsh/BSHType;->getBaseType()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-static {p2}, Lbsh/Primitive;->isWrapperType(Ljava/lang/Class;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-virtual {p1}, Lbsh/BSHType;->getBaseType()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-static {p2}, Lbsh/Primitive;->getDefaultValue(Ljava/lang/Class;)Lbsh/Primitive;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :goto_0
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-lez p2, :cond_3

    .line 35
    .line 36
    const/4 p2, 0x0

    .line 37
    invoke-virtual {p0, p2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    instance-of v0, p2, Lbsh/BSHArrayInitializer;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    check-cast p2, Lbsh/BSHArrayInitializer;

    .line 46
    .line 47
    invoke-virtual {p1}, Lbsh/BSHType;->getBaseType()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-direct {p0, p1}, Lbsh/BSHVariableDeclarator;->getArrayDims(Lbsh/BSHType;)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-virtual {p2, v0, p1, p3, p4}, Lbsh/BSHArrayInitializer;->eval(Ljava/lang/Class;ILbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    invoke-interface {p2, p3, p4}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    :cond_3
    :goto_1
    sget-object p1, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 65
    .line 66
    if-eq v0, p1, :cond_4

    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_4
    new-instance p1, Lbsh/EvalException;

    .line 70
    .line 71
    const-string p2, "Void initializer."

    .line 72
    .line 73
    invoke-direct {p1, p2, p0, p3}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 74
    .line 75
    .line 76
    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

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
    iget-object p0, p0, Lbsh/BSHVariableDeclarator;->name:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method
